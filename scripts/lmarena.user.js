// ==UserScript==
// @name         Arena V.1.0.8
// @namespace    https://arena.ai/
// @version      1.0.8
// @description  Speech-to-Text + Gemini-Korrektur (DE) ohne stilles Fallback. Zeigt Output-Preview. Send-Button-Fix via React-Nudge.
// @match        https://arena.ai/*
// @match        https://web.arena.ai/*
// @match        https://chat.lmsys.org/*
// @match        https://arena.lmsys.org/*
// @updateURL    https://raw.githubusercontent.com/Pepsi1978/tampermonkey-skripte/main/scripts/lmarena.user.js
// @downloadURL  https://raw.githubusercontent.com/Pepsi1978/tampermonkey-skripte/main/scripts/lmarena.user.js
// @run-at       document-idle
// @grant        GM_getValue
// @grant        GM_setValue
// @grant        GM.getValue
// @grant        GM.setValue
// @grant        GM_xmlhttpRequest
// @grant        GM.xmlHttpRequest
// @connect      generativelanguage.googleapis.com
// @connect      *.googleapis.com
// @connect      googleapis.com
// ==/UserScript==

(() => {
  "use strict";
    // ── CSS für Mikrofon-Button Animationen ──
    (function(){if(document.getElementById("stt-mic-css"))return;var s=document.createElement("style");s.id="stt-mic-css";s.textContent=".stt-mic-btn{display:flex!important;align-items:center!important;justify-content:center!important;padding:0!important;transition:background .25s,transform .15s,box-shadow .25s!important}.stt-mic-btn:active{transform:scale(.93)!important}.stt-mic-btn[data-state=idle]{background:#2563eb!important;color:#fff!important;border-color:#2563eb!important}.stt-mic-btn[data-state=idle]:hover{background:#1d4ed8!important;transform:scale(1.06)!important}.stt-mic-btn[data-state=listening]{background:#dc2626!important;color:#fff!important;border-color:#dc2626!important;animation:stt-pulse 1.4s ease-in-out infinite!important}.stt-mic-btn[data-state=working]{background:#d97706!important;color:#fff!important;border-color:#d97706!important}.stt-mic-btn[data-state=error]{background:#8b0000!important;color:#fff!important;border-color:#8b0000!important}@keyframes stt-pulse{0%,100%{box-shadow:0 0 0 0 rgba(220,38,38,.45)}50%{box-shadow:0 0 0 14px rgba(220,38,38,0)}}.stt-mic-btn[data-state=working] svg{animation:stt-spin .8s linear infinite}@keyframes stt-spin{to{transform:rotate(360deg)}}";(document.head||document.documentElement).appendChild(s)})();


  // ============================================================
  // 🔑 API-Key wird einmalig abgefragt und in Tampermonkey gespeichert
  // ============================================================
  const GEMINI_MODEL = "models/gemini-2.5-flash-lite";
  const STORAGE_KEYS = {
    geminiApiKey: "arena.geminiApiKey"
  };

  // ============================================================
  // UI POSITION
  // ============================================================
  const UI_POS = { rightPx: 16, bottomPx: 16 };

  const CFG = {
    speechLang: "de-DE",
    interimResults: true,

    stopGraceMs: 260,
    debounceMsAfterStop: 120,
    minCharsForRewrite: 6,

    requestTimeoutMs: 120000, // 120s

    postPasteDelayMs: 80,
    reactNudgeDelayMs: 60,

    maxRetries: 4,
    retryWaitMs: 1200,

    previewChars: 140,

    // Diktat-Bereinigung / Grammatik
    grammarMaxOutputTokens: 8192,
    grammarChunkChars: 3500,
    grammarTruncationRatio: 0.85,

    // Cleanup-Charakter:
    dictationCleanupMode: "balanced",

    // Overlap-Prevention beim Live-Diktat
    overlapMaxChars: 80,

    // Lokale Vorfilter
    removeDisfluenciesLocally: true,
    collapseDuplicateWordsLocally: true,

    // 🔧 Speech Auto-Restart
    autoRestart: true,
    autoRestartBaseDelayMs: 250,
    autoRestartMaxDelayMs: 2000,
    maxConsecutiveRestarts: 50, // Schutz gegen Endlosschleifen bei kaputter Audio-Session
    recentFinalMemory: 8
  };

  // ============================================================
  // DOMÄNEN-FINDER TUNING
  // ============================================================
  const DOMAIN_CFG = {
    minDomains: 7,
    maxDomains: 10,

    temperature: 0.10,
    maxOutputTokens: 1024,
    repairMaxOutputTokens: 1024
  };

  const SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;
  const supportedSpeech = !!SpeechRecognition;

  // ── SVG-Icons für Mikrofon-Button (Stil: claude-code-spracheingabe) ──
  const MIC_ICON = {
    mic: '<svg viewBox="0 0 24 24" width="20" height="20" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="M12 1a3 3 0 0 0-3 3v8a3 3 0 0 0 6 0V4a3 3 0 0 0-3-3z"/><path d="M19 10v2a7 7 0 0 1-14 0v-2"/><line x1="12" y1="19" x2="12" y2="23"/><line x1="8" y1="23" x2="16" y2="23"/></svg>',
    stop: '<svg viewBox="0 0 24 24" width="20" height="20" fill="currentColor"><rect x="6" y="6" width="12" height="12" rx="2"/></svg>',
    spinner: '<svg viewBox="0 0 24 24" width="20" height="20" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round"><path d="M12 2a10 10 0 0 1 10 10"/></svg>',
    error: '<svg viewBox="0 0 24 24" width="20" height="20" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><circle cx="12" cy="12" r="10"/><line x1="12" y1="8" x2="12" y2="12"/><line x1="12" y1="16" x2="12.01" y2="16"/></svg>',
  };

  // ============================================================
  // Toast
  // ============================================================
  const toast = document.createElement("div");
  toast.style.position = "fixed";
  toast.style.bottom = "14px";
  toast.style.left = "14px";
  toast.style.zIndex = "9999999";
  toast.style.maxWidth = "760px";
  toast.style.padding = "10px 12px";
  toast.style.borderRadius = "10px";
  toast.style.font = "12px/1.35 system-ui, -apple-system, Segoe UI, Roboto, Arial";
  toast.style.boxShadow = "0 6px 24px rgba(0,0,0,0.18)";
  toast.style.background = "rgba(20,20,20,0.92)";
  toast.style.color = "white";
  toast.style.display = "none";
  toast.style.whiteSpace = "pre-wrap";
  document.body.appendChild(toast);

  let toastTimer = null;
  function showToast(msg, ms = 5500) {
    clearTimeout(toastTimer);
    toast.textContent = msg;
    toast.style.display = "block";
    toastTimer = setTimeout(() => (toast.style.display = "none"), ms);
  }

  const sleep = (ms) => new Promise((r) => setTimeout(r, ms));

  // ============================================================
  // Prompt Finder (Fallback)
  // ============================================================
  function isVisible(el) {
    if (!el) return false;
    const r = el.getBoundingClientRect();
    const style = window.getComputedStyle(el);
    return (
      r.width > 60 &&
      r.height > 20 &&
      r.bottom > 0 &&
      r.right > 0 &&
      style.visibility !== "hidden" &&
      style.display !== "none" &&
      style.opacity !== "0"
    );
  }

  function cleanText(s) {
    return String(s || "").replace(/[\u200B-\u200D\uFEFF]/g, "").trim();
  }


  function normalizeForSpeechDedupe(s) {
    return String(s || "")
      .toLowerCase()
      .replace(/[.,!?;:\-–—()\[\]{}"'„“”‚‘’`´]/g, " ")
      .replace(/\s+/g, " ")
      .trim();
  }

  function trimRepeatedPrefix(prev, current) {
    const p = cleanText(prev);
    const c = cleanText(current);
    if (!c) return "";
    if (!p) return c;

    if (c === p) return "";
    if (c.startsWith(p)) return cleanText(c.slice(p.length));

    const pNorm = normalizeForSpeechDedupe(p);
    const cNorm = normalizeForSpeechDedupe(c);
    if (!pNorm || !cNorm) return c;

    if (cNorm === pNorm) return "";
    return c;
  }

  function appearsAlreadyInTail(baseText, snippet) {
    const text = cleanText(baseText);
    const snip = cleanText(snippet);
    if (!text || !snip) return false;

    const tailLen = Math.max((CFG.overlapMaxChars || 80) * 4, snip.length * 3, 240);
    const tail = text.slice(-tailLen);

    const tailNorm = normalizeForSpeechDedupe(tail);
    const snippetNorm = normalizeForSpeechDedupe(snip);
    if (!tailNorm || !snippetNorm) return false;

    return tailNorm.includes(snippetNorm);
  }

  function isTextInput(el) {
    return el && (el.tagName === "TEXTAREA" || el.tagName === "INPUT");
  }

  function readPromptText(el) {
    if (!el) return "";

    el = resolveEditableTarget(el) || el;

    if (isTextInput(el)) {
      return cleanText(el.value || "");
    }

    // contenteditable bevorzugt ueber innerText lesen, damit Zeilenumbrueche erhalten bleiben.
    if (isContentEditableLike(el) || isRoleTextbox(el)) {
      return cleanText(el.innerText || el.textContent || "");
    }

    return cleanText(el.textContent || el.innerText || "");
  }

  function scoreCandidate(el) {
    const r = el.getBoundingClientRect();
    const area = Math.max(1, r.width * r.height);
    const vh = Math.max(1, window.innerHeight);
    const nearBottom = r.top > vh * 0.45 ? 1.6 : 1.0;

    const id = (el.id || "").toLowerCase();
    const dt = (el.getAttribute?.("data-testid") || "").toLowerCase();
    const aria = (el.getAttribute?.("aria-label") || "").toLowerCase();
    const placeholder = (el.getAttribute?.("placeholder") || "").toLowerCase();

    let bonus = 1.0;
    if (id.includes("prompt")) bonus *= 6;
    if (dt.includes("prompt")) bonus *= 6;
    if (aria.includes("message") || aria.includes("nachricht") || aria.includes("send a message")) bonus *= 2.0;
    if (placeholder.includes("message") || placeholder.includes("nachricht")) bonus *= 2.0;

    return area * nearBottom * bonus;
  }

  function findPrompt() {
    const direct = [
      document.querySelector("textarea#prompt-textarea"),
      document.querySelector("textarea[data-testid='prompt-textarea']"),
      document.querySelector("div#prompt-textarea[contenteditable='true']"),
      document.querySelector("div[data-testid='prompt-textarea'][contenteditable='true']"),
      document.querySelector("form textarea#prompt-textarea"),
      document.querySelector("form textarea[data-testid='prompt-textarea']"),
      document.querySelector("form [contenteditable='true']"),
      document.querySelector("[aria-label*='message' i][contenteditable='true']"),
      document.querySelector("[aria-label*='nachricht' i][contenteditable='true']")
    ].map(resolveEditableTarget).filter(Boolean).find((el) => isVisible(el) && isEditableTarget(el));

    if (direct) return direct;

    const seen = new Set();
    const candidates = [
      ...document.querySelectorAll("textarea"),
      ...document.querySelectorAll("input[type='text']"),
      ...document.querySelectorAll("input:not([type])"),
      ...document.querySelectorAll("[contenteditable='true']"),
      ...document.querySelectorAll("[contenteditable='']"),
      ...document.querySelectorAll("[contenteditable='plaintext-only']"),
      ...document.querySelectorAll("[data-lexical-editor='true']"),
      ...document.querySelectorAll("[role='textbox']")
    ].map(resolveEditableTarget)
      .filter((el) => {
        if (!el || seen.has(el)) return false;
        seen.add(el);
        return isVisible(el) && isEditableTarget(el);
      });

    if (!candidates.length) return null;

    candidates.sort((a, b) => scoreCandidate(b) - scoreCandidate(a));
    return candidates[0] || null;
  }

  // ============================================================
  // 🎯 Targeting: nutze das Feld, das der User fokussiert hat
  // ============================================================
  let lastUserEditable = null;

  // UI Buttons werden später initialisiert, hier schon deklariert:
  let micBtn = null;
  let clearBtn = null;
  let promptBtn = null;
  let promptBtn2 = null;

function isRoleTextbox(el) {
  return (el?.getAttribute?.("role") || "").toLowerCase() === "textbox";
}

function hasContentEditableEnabled(el) {
  const raw = el?.getAttribute?.("contenteditable");
  if (raw == null) return false;
  const ce = String(raw).toLowerCase();
  return ce === "" || ce === "true" || ce === "plaintext-only";
}

function isContentEditableLike(el) {
  if (!el) return false;
  return !!el.isContentEditable || hasContentEditableEnabled(el);
}

function isAriaReadonly(el) {
  return (el?.getAttribute?.("aria-readonly") || "").toLowerCase() === "true";
}

function isEditableTarget(el) {
  if (!el) return false;
  if (el === document.body || el === document.documentElement) return false;

  // niemals unsere eigenen UI-Buttons als Eingabefeld nehmen
  if ((typeof micBtn !== "undefined" && el === micBtn) || (typeof clearBtn !== "undefined" && el === clearBtn) || (typeof promptBtn !== "undefined" && el === promptBtn) || (typeof promptBtn2 !== "undefined" && el === promptBtn2) || (typeof memBtn !== "undefined" && el === memBtn)) return false;

  const tag = (el.tagName || "").toUpperCase();
  const ariaDisabled = (el.getAttribute?.("aria-disabled") || "").toLowerCase() === "true";

  if (tag === "TEXTAREA") {
    if (el.readOnly || el.disabled || ariaDisabled || isAriaReadonly(el)) return false;
    return true;
  }

  if (tag === "INPUT") {
    if (el.readOnly || el.disabled || ariaDisabled || isAriaReadonly(el)) return false;
    const type = (el.type || "text").toLowerCase();
    const ok = ["text", "search", "email", "url", "tel", "password"].includes(type);
    return ok;
  }

  if (isContentEditableLike(el)) return true;

  if (isRoleTextbox(el)) {
    const inner = el.querySelector?.("textarea, input[type='text'], input:not([type]), [contenteditable='true'], [contenteditable=''], [contenteditable='plaintext-only']");
    if (inner) return isEditableTarget(inner);
    return false;
  }

  return false;
}

function resolveEditableTarget(el) {
  if (!el || el.nodeType !== 1) return null;

  // Erst ein moegliches inneres, praeziseres Feld suchen, damit kein grosser Wrapper erwischt wird.
  const inner = el.querySelector?.("textarea, input[type='text'], input:not([type]), [contenteditable='true'], [contenteditable=''], [contenteditable='plaintext-only'], [data-lexical-editor='true'], [role='textbox']");
  if (inner && inner !== el) {
    const resolvedInner = resolveEditableTarget(inner);
    if (resolvedInner && isEditableTarget(resolvedInner)) return resolvedInner;
  }

  if (isTextInput(el) || isContentEditableLike(el)) return el;

  if (isRoleTextbox(el)) {
    const nested = el.querySelector?.("textarea, input[type='text'], input:not([type]), [contenteditable='true'], [contenteditable=''], [contenteditable='plaintext-only']");
    if (nested) {
      const resolvedNested = resolveEditableTarget(nested);
      if (resolvedNested && isEditableTarget(resolvedNested)) return resolvedNested;
    }
  }

  let parent = el.parentElement;
  let depth = 0;
  while (parent && depth < 5) {
    if (isTextInput(parent) || isContentEditableLike(parent)) return parent;
    parent = parent.parentElement;
    depth += 1;
  }

  return isEditableTarget(el) ? el : null;
}

function pickEditableFromEvent(e) {
  const path = typeof e.composedPath === "function" ? e.composedPath() : null;
  if (Array.isArray(path)) {
    for (const node of path) {
      if (!node || node.nodeType !== 1) continue;
      const resolved = resolveEditableTarget(node);
      if (resolved && isVisible(resolved) && isEditableTarget(resolved)) return resolved;
    }
  }

  const resolvedTarget = resolveEditableTarget(e.target);
  if (resolvedTarget && isVisible(resolvedTarget) && isEditableTarget(resolvedTarget)) return resolvedTarget;
  return null;
}

function rememberEditable(el) {
  const resolved = resolveEditableTarget(el);
  if (resolved && isVisible(resolved) && isEditableTarget(resolved)) lastUserEditable = resolved;
}

function getUserTargetEditable() {
  const active = resolveEditableTarget(document.activeElement);
  if (active && isVisible(active) && isEditableTarget(active)) return active;

  const remembered = resolveEditableTarget(lastUserEditable);
  if (remembered && isVisible(remembered) && isEditableTarget(remembered)) return remembered;

  const fallback = resolveEditableTarget(findPrompt());
  if (fallback && isVisible(fallback) && isEditableTarget(fallback)) return fallback;

  return null;
}

// Fokus/Click-Tracking (auch Shadow DOM)
document.addEventListener("focusin", (e) => rememberEditable(pickEditableFromEvent(e) || document.activeElement), true);
document.addEventListener("pointerdown", (e) => rememberEditable(pickEditableFromEvent(e)), true);
document.addEventListener("mousedown", (e) => rememberEditable(pickEditableFromEvent(e)), true);
document.addEventListener("click", (e) => rememberEditable(pickEditableFromEvent(e)), true);

  // ============================================================
  // React/Input Events
  // ============================================================
  function dispatchReactInput(el, inputType, data) {
    try { el.dispatchEvent(new InputEvent("beforeinput", { bubbles: true, cancelable: true, inputType, data })); } catch {}
    try { el.dispatchEvent(new InputEvent("input", { bubbles: true, inputType, data })); } catch {
      try { el.dispatchEvent(new Event("input", { bubbles: true })); } catch {}
    }
    try { el.dispatchEvent(new Event("change", { bubbles: true })); } catch {}
  }

  function dispatchKey(el, type, key) {
    try { el.dispatchEvent(new KeyboardEvent(type, { bubbles: true, cancelable: true, key })); } catch {}
  }

  async function reactNudge(el) {
    if (!el) return;
    el.focus();

    const current = readPromptText(el);
    dispatchReactInput(el, "insertReplacementText", current);

    await sleep(CFG.reactNudgeDelayMs);

    if (isTextInput(el)) {
      const v = el.value ?? "";
      const setter =
        Object.getOwnPropertyDescriptor(HTMLTextAreaElement.prototype, "value")?.set ||
        Object.getOwnPropertyDescriptor(HTMLInputElement.prototype, "value")?.set;

      const setNative = (val) => {
        if (setter && (el instanceof HTMLTextAreaElement || el instanceof HTMLInputElement)) setter.call(el, val);
        else el.value = val;
      };

      setNative(v + " ");
      dispatchReactInput(el, "insertText", " ");
      dispatchKey(el, "keydown", " ");
      dispatchKey(el, "keyup", " ");
      await sleep(25);

      setNative(v);
      dispatchReactInput(el, "deleteContentBackward", null);
      dispatchKey(el, "keydown", "Backspace");
      dispatchKey(el, "keyup", "Backspace");
      return;
    }

    try {
      document.execCommand("insertText", false, " ");
      dispatchReactInput(el, "insertText", " ");
      await sleep(20);
      document.execCommand("delete", false, null);
      dispatchReactInput(el, "deleteContentBackward", null);
    } catch {}
  }

  // ============================================================
  // Diktat: lokaler Vorfilter (Fülllaute/Doppler/Overlap)
  // ============================================================
  function removeDisfluencies(t) {
    return t.replace(/\b(ähm?|öhm?|hm+|hmm+|mhm+)\b/gi, "");
  }

  function collapseDuplicateWords(t) {
    try {
      return t.replace(/\b(\p{L}{2,})(?:\s+\1\b)+/giu, "$1");
    } catch {
      return t.replace(/\b([A-Za-zÄÖÜäöüß]{2,})(?:\s+\1\b)+/gi, "$1");
    }
  }

  function normalizeSpaces(t) {
    return String(t || "")
      .replace(/[ \t]+/g, " ")
      .replace(/\s+([,.;:!?])/g, "$1")
      .replace(/([,.;:!?])(\S)/g, "$1 $2")
      .trim();
  }

  function postProcessDictationSnippet(t) {
    let s = cleanText(t);
    if (!s) return "";
    if (CFG.removeDisfluenciesLocally) s = removeDisfluencies(s);
    if (CFG.collapseDuplicateWordsLocally) s = collapseDuplicateWords(s);
    s = normalizeSpaces(s);
    return s;
  }

  function longestOverlapSuffixPrefix(a, b, maxLen = 80) {
    const A = normalizeSpaces(cleanText(a));
    const B = normalizeSpaces(cleanText(b));
    const m = Math.min(maxLen, A.length, B.length);
    for (let len = m; len >= 12; len--) {
      const as = A.slice(-len).toLowerCase();
      const bs = B.slice(0, len).toLowerCase();
      if (as === bs) return len;
    }
    return 0;
  }

  function stripOverlap(curText, newText) {
    const ov = longestOverlapSuffixPrefix(curText, newText, CFG.overlapMaxChars || 80);
    if (!ov) return newText;
    return newText.slice(ov).trimStart();
  }

  // ============================================================
  // PASTE-APPLY
  // ============================================================
async function copyToClipboardFallback(text) {
  const ta = document.createElement("textarea");
  ta.value = text;
  ta.setAttribute("readonly", "true");
  ta.style.position = "fixed";
  ta.style.left = "-9999px";
  ta.style.top = "-9999px";
  document.body.appendChild(ta);
  ta.focus();
  ta.select();
  let ok = false;
  try { ok = document.execCommand("copy"); } catch {}
  document.body.removeChild(ta);
  return ok;
}

function normalizeForCompare(s) {
  return String(s || "")
    .replace(/[\u200B-\u200D\uFEFF]/g, "")
    .replace(/\r\n/g, "\n")
    .replace(/\r/g, "\n")
    .replace(/[ \t]+\n/g, "\n")
    .replace(/\n[ \t]+/g, "\n")
    .replace(/\u00A0/g, " ")
    .trim();
}

function setNativeValue(el, val) {
  const v = String(val ?? "");
  try {
    if (el instanceof HTMLTextAreaElement) {
      const setter = Object.getOwnPropertyDescriptor(HTMLTextAreaElement.prototype, "value")?.set;
      if (setter) setter.call(el, v);
      else el.value = v;
      return;
    }
    if (el instanceof HTMLInputElement) {
      const setter = Object.getOwnPropertyDescriptor(HTMLInputElement.prototype, "value")?.set;
      if (setter) setter.call(el, v);
      else el.value = v;
      return;
    }
    el.value = v;
  } catch {
    try { el.value = v; } catch {}
  }
}

function escapeHtml(s) {
  return String(s || "")
    .replace(/&/g, "&amp;")
    .replace(/</g, "&lt;")
    .replace(/>/g, "&gt;")
    .replace(/\"/g, "&quot;")
    .replace(/'/g, "&#039;");
}

function moveCaretToEnd(el) {
  try {
    el.focus();
    const sel = window.getSelection?.();
    if (!sel) return;
    const range = document.createRange();
    range.selectNodeContents(el);
    range.collapse(false);
    sel.removeAllRanges();
    sel.addRange(range);
  } catch {}
}

function setContentEditablePreserveNewlines(el, text) {
  if (!el) return;
  const html = escapeHtml(String(text ?? "")).replace(/\n/g, "<br>");

  try {
    el.focus();
    el.innerHTML = html;
    moveCaretToEnd(el);
  } catch {
    try { el.textContent = text; } catch {}
  }

  dispatchReactInput(el, "insertReplacementText", String(text ?? ""));
}

async function setViaPaste(el, text) {
  const target = String(text ?? "").replace(/\r\n/g, "\n").replace(/\r/g, "\n");
  el = resolveEditableTarget(el) || el;
  if (!el) return false;

  try { el.focus(); } catch {}

  if (isTextInput(el)) {
    setNativeValue(el, target);
    try { el.setSelectionRange(target.length, target.length); } catch {}
    dispatchReactInput(el, "insertReplacementText", target);
  } else {
    setContentEditablePreserveNewlines(el, target);
  }

  await sleep(CFG.postPasteDelayMs);
  await reactNudge(el);
  await sleep(40);

  const got = normalizeForCompare(readPromptText(el));
  const want = normalizeForCompare(target);
  if (got === want) return true;

  // Browser/Editor duerfen Whitespace leicht normalisieren.
  if (got.replace(/\s+/g, " ") === want.replace(/\s+/g, " ")) return true;

  // Letzter Versuch ueber Clipboard-Weg (falls Editor nur Paste verarbeitet).
  let pasted = false;
  try {
    if (navigator.clipboard?.writeText) {
      await navigator.clipboard.writeText(target);
      try { pasted = document.execCommand("paste"); } catch {}
    }
  } catch {}

  if (!pasted) {
    const okCopy = await copyToClipboardFallback(target);
    if (okCopy) {
      try { pasted = document.execCommand("paste"); } catch {}
    }
  }

  if (pasted) {
    await sleep(CFG.postPasteDelayMs);
    await reactNudge(el);
    await sleep(40);
  }

  const gotAfter = normalizeForCompare(readPromptText(el));
  if (gotAfter === want) return true;
  return gotAfter.replace(/\s+/g, " ") === want.replace(/\s+/g, " ");
}

  function insertText(el, text) {
    if (!el || !text) return;

    const cur = readPromptText(el);

    let add = postProcessDictationSnippet(text);
    add = stripOverlap(cur, add);
    add = normalizeSpaces(add);

    if (!add) return;

    const spacer = cur && !cur.endsWith(" ") && !cur.endsWith("\n") ? " " : "";
    const combined = cleanText(cur + spacer + add);

    if (isTextInput(el)) {
      const setter =
        Object.getOwnPropertyDescriptor(HTMLTextAreaElement.prototype, "value")?.set ||
        Object.getOwnPropertyDescriptor(HTMLInputElement.prototype, "value")?.set;
      if (setter && (el instanceof HTMLTextAreaElement || el instanceof HTMLInputElement)) setter.call(el, combined);
      else el.value = combined;

      el.focus();
      try { el.setSelectionRange(combined.length, combined.length); } catch {}
      dispatchReactInput(el, "insertText", add);
      return;
    }

    try {
      el.focus();
      document.execCommand("insertText", false, spacer + add);
      dispatchReactInput(el, "insertText", add);
    } catch {
      try { setContentEditablePreserveNewlines(el, combined); } catch {}
      dispatchReactInput(el, "insertReplacementText", combined);
    }
  }

  // ============================================================
  // Gemini Calls
  // ============================================================
  function gmRequest() {
    if (typeof GM !== "undefined" && typeof GM.xmlHttpRequest === "function") return GM.xmlHttpRequest;
    if (typeof GM_xmlhttpRequest === "function") return GM_xmlhttpRequest;
    return null;
  }

  function extractGeminiText(json) {
    const parts = json?.candidates?.[0]?.content?.parts;
    if (Array.isArray(parts)) {
      const out = parts.map(p => (p?.text ?? "")).join("").trim();
      if (out) return out;
    }
    const t = json?.candidates?.[0]?.text;
    if (typeof t === "string" && t.trim()) return t.trim();
    return "";
  }

  async function resolveGeminiApiKey() {
    let key = "";

    if (typeof GM_getValue === "function") {
      key = String(GM_getValue(STORAGE_KEYS.geminiApiKey, "") || "");
    } else if (typeof GM !== "undefined" && typeof GM.getValue === "function") {
      key = String((await GM.getValue(STORAGE_KEYS.geminiApiKey, "")) || "");
    }

    if (!key.trim()) {
      const entered = window.prompt("Bitte gib deinen Gemini API-Key ein (wird lokal in Tampermonkey gespeichert):");
      if (entered && entered.trim()) {
        key = entered.trim();
        if (typeof GM_setValue === "function") {
          GM_setValue(STORAGE_KEYS.geminiApiKey, key);
        } else if (typeof GM !== "undefined" && typeof GM.setValue === "function") {
          await GM.setValue(STORAGE_KEYS.geminiApiKey, key);
        }
      }
    }

    return key.trim();
  }

  async function geminiGenerate(userPrompt, { temperature = 0.05, maxOutputTokens = 2048 } = {}) {
    const apiKey = await resolveGeminiApiKey();
    if (!apiKey) {
      return Promise.reject("API-Key fehlt oder Eingabe abgebrochen.");
    }

    const url = `https://generativelanguage.googleapis.com/v1beta/${GEMINI_MODEL}:generateContent?key=${encodeURIComponent(apiKey)}`;

    const payload = {
      contents: [{ role: "user", parts: [{ text: userPrompt }] }],
      generationConfig: { temperature, maxOutputTokens }
    };

    const req = gmRequest();
    if (!req) return Promise.reject("GM Request API fehlt (Tampermonkey Grants).");

    const sleepLocal = (ms) => new Promise(r => setTimeout(r, ms));

    const attempt = (n) => new Promise((resolve, reject) => {
      req({
        method: "POST",
        url,
        headers: { "Content-Type": "application/json" },
        data: JSON.stringify(payload),
        timeout: CFG.requestTimeoutMs,

        onload: (r) => {
          const body = String(r.responseText || "");
          if (r.status !== 200) {
            let msg = body.slice(0, 800);
            try {
              const j = JSON.parse(body);
              const m = j?.error?.message || j?.message;
              if (m) msg = m;
            } catch {}
            reject(`HTTP ${r.status}: ${msg}`);
            return;
          }

          try {
            const j = JSON.parse(body);
            const out = extractGeminiText(j);
            if (!out) {
              reject("Gemini lieferte keinen Text (Parser fand keinen Output).");
              return;
            }
            resolve(out);
          } catch {
            reject("Antwort konnte nicht gelesen werden (JSON Parse).");
          }
        },

        onerror: () => reject(`Network (Status 0).\nURL: ${url}\nHinweise: @connect, Adblock/Privacy, VPN/Proxy, Firmen-Netz.`),
        ontimeout: () => reject("Timeout")
      });
    }).catch(async (err) => {
      const msg = String(err || "");
      const retryable = msg.includes("Network (Status 0)") || msg === "Timeout";
      if (retryable && n < CFG.maxRetries) {
        await sleepLocal(CFG.retryWaitMs * (n + 1));
        return attempt(n + 1);
      }
      throw err;
    });

    return attempt(0);
  }

  // ---- 1) Diktat-Bereinigung + Grammatik Prompt ----
  function buildGrammarPrompt(text) {
    const mode = (CFG.dictationCleanupMode || "balanced").toLowerCase();

    const modeRules =
      mode === "aggressive"
        ? `
- Entferne auch einzelne Wörter, die im Kontext sehr wahrscheinlich Fehlhörer sind und den Satz entgleisen lassen.
- Glätte Satzstruktur stärker, aber ohne neue Fakten hinzuzufügen.
`
        : mode === "conservative"
        ? `
- Entferne nur extrem offensichtliches Kauderwelsch (z.B. Wortfragmente, lautmalerische Silben, unverbundene Tokens).
- Wenn du unsicher bist, lass lieber stehen als zu viel zu löschen.
`
        : `
- Entferne offensichtliches Kauderwelsch zuverlässig, aber ohne den Text stilistisch umzuschreiben.
- Korrigiere offensichtliche Fehlhörer nur dann, wenn es genau eine sehr naheliegende Korrektur gibt.
`;

    return `
Du bist ein deutscher Diktat-Editor.

AUFGABE (in dieser Reihenfolge):
1) Bereinige Diktat-Artefakte: entferne Fülllaute (z.B. "äh", "ähm", "öhm", "hm", "mhm").
2) Entferne Doppler durch Stottern/ASR: doppelte Wörter oder kurze Wiederholungen (z.B. "ich ich", "das das", "und und").
3) Entferne eindeutig sinnlose Kauderwelsch-Tokens (Wortfragmente, unverbundene Einzelwörter, semantisch nicht anschließbare Einsprengsel).
4) Korrigiere Grammatik, Satzbau, Zeichensetzung und Groß-/Kleinschreibung.
5) Erkenne Satzgrenzen korrekt.

MODUS:
${modeRules.trim()}

WICHTIG (strikt):
- Keine neuen Informationen hinzufügen.
- Keine kreativen Ergänzungen, keine Vermutungen.
- Keine stilistische Umformulierung: Wortwahl und Struktur so nah wie möglich am Original halten.
- Wenn ein Wort falsch erkannt wirkt, aber nicht eindeutig reparierbar ist: entferne es lieber, statt zu raten.

REGEL:
Gib AUSSCHLIESSLICH den bereinigten Text zurück.
Keine Kommentare. Keine Erklärungen.

TEXT:
${text}
`.trim();
  }

  function geminiRewriteGrammar(text) {
    return geminiGenerate(buildGrammarPrompt(text), {
      temperature: 0.03,
      maxOutputTokens: CFG.grammarMaxOutputTokens || 8192
    });
  }

  function splitIntoChunksByParagraphs(text, maxChars) {
    const s = String(text || "");
    if (s.length <= maxChars) return [s];

    const paras = s.split(/\n{2,}/g);
    const chunks = [];
    let buf = "";

    const pushBuf = () => {
      if (buf.trim().length) chunks.push(buf);
      buf = "";
    };

    for (let p of paras) {
      p = p.trim();
      if (!p) continue;

      if (p.length > maxChars) {
        pushBuf();
        let start = 0;
        while (start < p.length) {
          let end = Math.min(start + maxChars, p.length);
          if (end < p.length) {
            const windowStart = Math.max(start, end - Math.floor(maxChars * 0.5));
            const slice = p.slice(windowStart, end);
            const lastDot = Math.max(
              slice.lastIndexOf("."),
              slice.lastIndexOf("!"),
              slice.lastIndexOf("?"),
              slice.lastIndexOf(";"),
              slice.lastIndexOf(":")
            );
            if (lastDot > -1) end = windowStart + lastDot + 1;
          }
          chunks.push(p.slice(start, end).trim());
          start = end;
        }
        continue;
      }

      const candidate = buf ? (buf + "\n\n" + p) : p;
      if (candidate.length > maxChars) {
        pushBuf();
        buf = p;
      } else {
        buf = candidate;
      }
    }

    pushBuf();
    return chunks.length ? chunks : [s];
  }

  async function geminiRewriteGrammarSmart(fullText, onProgress) {
    const input = String(fullText || "");
    if (!input.trim()) return input;

    const oneShot = await geminiRewriteGrammar(input);
    const ratio = oneShot.length / Math.max(1, input.length);
    if (ratio >= (CFG.grammarTruncationRatio || 0.85)) return oneShot;

    const chunks = splitIntoChunksByParagraphs(input, CFG.grammarChunkChars || 3500);
    const outParts = [];

    for (let i = 0; i < chunks.length; i++) {
      onProgress?.(i + 1, chunks.length);
      const fixed = await geminiRewriteGrammar(chunks[i]);
      outParts.push(fixed && fixed.trim().length ? fixed.trim() : chunks[i].trim());
    }

    return outParts.join("\n\n").trim();
  }

  // ============================================================
  // DOMÄNEN-EXTRAKTION (robust + Repair-Pass)
  // ============================================================
  function extractTaskOnly(maybePrompt) {
    const s = String(maybePrompt || "");
    const idx = s.search(/\nAufgabe:\s*/i);
    if (idx >= 0) {
      const after = s.slice(idx).replace(/^.*?\nAufgabe:\s*/i, "");
      const endIdx = after.search(/\n(Zielgruppe:|Kontext:|Format:|Ton:|Pflichtlogik:|Falls dir)\s*/i);
      const task = endIdx >= 0 ? after.slice(0, endIdx) : after;
      const t = cleanText(task);
      return t.length ? t : cleanText(maybePrompt);
    }
    const idx2 = s.search(/\nAUFGABE:\s*/i);
    if (idx2 >= 0) {
      const after = s.slice(idx2).replace(/^.*?\nAUFGABE:\s*/i, "");
      const endIdx = after.search(/\n(Zielgruppe:|Kontext:|Format:|Ton:|Pflichtlogik:|REGEL:)\s*/i);
      const task = endIdx >= 0 ? after.slice(0, endIdx) : after;
      const t = cleanText(task);
      return t.length ? t : cleanText(maybePrompt);
    }
    return cleanText(maybePrompt);
  }

  function normalizeDomain(x) {
    let s = cleanText(x);
    if (!s) return "";
    s = s.replace(/^[\[\(\{]+/g, "").replace(/[\]\)\}]+$/g, "");
    s = s.replace(/^["'`]+|["'`]+$/g, "");
    s = s.replace(/^\s*[-–—•\u2022]\s*/g, "");
    s = s.replace(/^\s*\d+[\.\)]\s*/g, "");
    s = s.replace(/^here is the json requested:\s*/i, "");
    s = s.replace(/^(topic_domains|method_domains)\s*:\s*/i, "");
    s = s.replace(/\.$/, "").trim();
    return s;
  }

  function isBannedGeneric(domain) {
    const d = domain.toLowerCase();
    if (d.includes("unterbereich")) return true;
    if (d.includes("fachgebiet")) return true;
    if (d.includes("domänenanalyse")) return true;
    if (d === "naturwissenschaften" || d === "informatik" || d === "ingenieurwissenschaften" || d === "sozialwissenschaften" || d === "rechtswissenschaften" || d === "wirtschaftswissenschaften") return true;
    if (d.length < 3) return true;
    return false;
  }

  function isMethodDomain(domain) {
    const d = domain.toLowerCase();
    return (
      d.includes("evidenz") ||
      d.includes("statistik") ||
      d.includes("studienmethod") ||
      d.includes("risiko") ||
      d.includes("trade-off") ||
      d.includes("ethik") ||
      d.includes("systemdenken") ||
      d.includes("anwendungsplanung") ||
      d.includes("evaluation") ||
      d.includes("methodik")
    );
  }

  function parseDomainsLoose(raw) {
    const s = String(raw || "").trim();
    if (!s) return [];

    let candidates = [];
    const quoted = [...s.matchAll(/"([^"]{2,160})"/g)].map(m => m[1]);
    if (quoted.length) candidates.push(...quoted);
    candidates.push(...s.replace(/[•\u2022]/g, " ").split(/[,;\n]/g));

    const out = [];
    const seen = new Set();

    for (const c of candidates) {
      const d = normalizeDomain(c);
      if (!d) continue;
      const key = d.toLowerCase();
      if (key === "topic_domains" || key === "method_domains") continue;
      if (key.includes("here is the json requested")) continue;
      if (isBannedGeneric(d)) continue;

      if (seen.has(key)) continue;
      seen.add(key);
      out.push(d);
    }

    return out;
  }

  function looksSuspiciousRaw(raw) {
    const s = String(raw || "").trim();
    if (!s) return true;
    if (/…|\.{3}|,\s*$/.test(s)) return true;
    if (s.length < 25) return true;
    if ((s.match(/,/g) || []).length < 3) return true;
    if (/\bErnähr\b|\bBiogen\b/i.test(s)) return true;
    return false;
  }

  function buildDomainsPrompt(taskText, minN = 7, maxN = 10) {
    return `
Du bist ein "Fachdomänen-Detektor".

Ziel:
Leite aus der Aufgabe die spezifischsten passenden Fachdomänen (wissenschaftliche Disziplinen / Teilgebiete) ab.

Regeln (wichtig):
- Ausgabe NUR als kommagetrennte Liste.
- KEIN JSON. KEINE Klammern. KEINE Anführungszeichen. KEINE Nummerierung. KEINE Bulletpoints. KEINE Sätze.
- Mindestens ${minN} und höchstens ${maxN} Einträge.
- Mindestens 5 Einträge müssen thematische Subdomänen (Themenkern) sein.
- Maximal 2 Einträge dürfen methodische Domänen sein (z.B. Evidenzbewertung, Statistik).
- Verwende spezifische Subdomänen statt Oberkategorien. Vermeide z.B. "Naturwissenschaften", "Informatik", "Recht", "Wirtschaft".
- Keine Abkürzungen/Abschneidungen: keine Wortstämme wie "Biogen", "Ernähr". Alles vollständig ausschreiben.

AUFGABE:
${taskText}
`.trim();
  }

  function buildDomainsRepairPrompt(taskText, rawList, minN = 7, maxN = 10) {
    return `
Du bekommst eine (möglicherweise abgeschnittene oder fehlerhafte) Domänenliste und sollst sie korrigieren.

Aufgabe:
- Ersetze Wortstämme/Abkürzungen durch vollständig ausgeschriebene Fachdomänen.
- Entferne generische Oberkategorien und ersetze sie durch spezifische Subdomänen zum Themenkern.
- Ergebnis: Mindestens ${minN}, höchstens ${maxN} Einträge.
- Mindestens 5 thematische Subdomänen, maximal 2 methodische Domänen.

Format-Regeln (strikt):
- Ausgabe NUR als kommagetrennte Liste.
- KEIN JSON. KEINE Klammern. KEINE Anführungszeichen. KEINE Nummerierung. KEINE Sätze.

AUFGABE:
${taskText}

ROH-LISTE (zu reparieren):
${rawList}
`.trim();
  }

  function buildDomainsPromptSecondPass(taskText, existingList, needN) {
    return `
Es fehlen noch Fachdomänen.

REGELN:
- Ausgabe NUR als kommagetrennte Liste.
- KEIN JSON. KEINE Klammern. KEINE Anführungszeichen. KEINE Nummerierung. KEINE Sätze.
- Liefere GENAU ${needN} zusätzliche Domänen.
- Wiederhole keine vorhandenen Domänen.
- Nur Domänen, die direkt zum Themenkern passen; höchstens 1 methodische Domäne.

VORHANDEN:
${existingList.join(", ")}

AUFGABE:
${taskText}
`.trim();
  }

  function pickFinalDomains(list, minN, maxN) {
    const topic = list.filter(d => !isMethodDomain(d));
    const method = list.filter(d => isMethodDomain(d));

    const final = [];
    const seen = new Set();

    const add = (x) => {
      const k = x.toLowerCase();
      if (seen.has(k)) return;
      seen.add(k);
      final.push(x);
    };

    for (const t of topic) {
      add(t);
      if (final.length >= maxN) break;
    }

    if (final.length < maxN) {
      let mCount = 0;
      for (const m of method) {
        if (mCount >= 2) break;
        add(m);
        mCount++;
        if (final.length >= maxN) break;
      }
    }

    if (final.length < minN) {
      for (const x of list) {
        add(x);
        if (final.length >= minN) break;
      }
    }

    return final.slice(0, maxN);
  }

  async function geminiExtractDomainsRobust(taskText) {
    const coreTask = extractTaskOnly(taskText);

    const raw1 = await geminiGenerate(
      buildDomainsPrompt(coreTask, DOMAIN_CFG.minDomains, DOMAIN_CFG.maxDomains),
      { temperature: DOMAIN_CFG.temperature, maxOutputTokens: DOMAIN_CFG.maxOutputTokens }
    );

    let list1 = parseDomainsLoose(raw1);
    const suspicious = looksSuspiciousRaw(raw1) || list1.length < DOMAIN_CFG.minDomains;

    let list = list1;

    if (suspicious) {
      const rawRepair = await geminiGenerate(
        buildDomainsRepairPrompt(coreTask, raw1, DOMAIN_CFG.minDomains, DOMAIN_CFG.maxDomains),
        { temperature: 0.05, maxOutputTokens: DOMAIN_CFG.repairMaxOutputTokens }
      );
      const repaired = parseDomainsLoose(rawRepair);
      if (repaired.length) list = repaired;
    }

    if (list.length < DOMAIN_CFG.minDomains) {
      const need = DOMAIN_CFG.minDomains - list.length;
      const raw2 = await geminiGenerate(
        buildDomainsPromptSecondPass(coreTask, list, need),
        { temperature: 0.08, maxOutputTokens: DOMAIN_CFG.maxOutputTokens }
      );
      const add = parseDomainsLoose(raw2);
      const seen = new Set(list.map(x => x.toLowerCase()));
      for (const a of add) {
        const k = a.toLowerCase();
        if (!seen.has(k) && !isBannedGeneric(a)) {
          list.push(a);
          seen.add(k);
        }
        if (list.length >= DOMAIN_CFG.maxDomains) break;
      }
    }

    list = pickFinalDomains(list, DOMAIN_CFG.minDomains, DOMAIN_CFG.maxDomains);
    if (list.length < 3) return ["Neurowissenschaften", "Zellbiologie", "Molekularbiologie"];
    return list;
  }

  // ============================================================
  // Final Prompt Builder (Frank)
  // ============================================================
  function buildFinalPrompt(taskText, domainsList) {
    const domains = domainsList.join(", ");
    return `
Rolle:
Du bist ein interdisziplinäres Forscherteam aus 50 der weltweit führenden Wissenschaftlerinnen und Wissenschaftlern,
spezialisiert auf ${domains}. Ihr arbeitet evidenzbasiert, kritisch, sehr ausführlich,
konsensorientiert und begründet Empfehlungen mit klarer Risiko-/Trade-off-Abwägung. Ihr betrachtet die Aufgabe aus allen möglichen verschiedenen Perspektiven. Leitet aus den möglichen, verschiedenen Perspektiven alle Domänen ab. Es sollen mindestens ${DOMAIN_CFG.minDomains} verschiedene Fachdomänen vom interdisziplinären Forscherteam bei der Beantwortung der Aufgabe berücksichtigt werden.

Aufgabe:
${taskText}
Falls dir etwas zur Aufgabe nicht klar ist frage nochmal den Benutzer. LMArena soll die Aufgabe nicht durch weitere Handlungsanweisungen erweitern! Die Aufgabe soll aus unterschiedlichsten wissenschaftlichen Perspektiven betrachtet werden, sodass ein
allumfassendes Bild für die Antwort einbezogen wird.

Zielgruppe:
Frank (Benutzer dieses Chats).

Kontext:
Nutze die über Frank gespeicherten Informationen und Erinnerungen (Bio, Ziele, Routinen, Besonderheiten, Projekte, usw.) als
primären Bezugsrahmen für diese Aufgabe. Keine zusätzlichen Kontextabfragen; verwende vorhandenes Wissen.

Format:
Strikte Ausgabestruktur „Einleitung – Hauptteil – Zusammenfassung“. Fachbegriffe sofort kurz erklären (in Klammern); Erläutere alle Zusammenhänge sämtlicher Faktoren sehr genau, damit Frank alle Zusammenhänge (wie, warum etwas so ist) genaustens versteht.
Abkürzungen bei erster Nennung ausschreiben; logisch, faktenbasiert, umfassend, nachvollziehbar. Benutze gegeben falls auch Symbole und Smylies, große Überschriften, Tabelle zu besseren optischen Gliederung.
Mindestwortanzahl: 2000, Maximale Wortanzalhl: 10000, Entscheidend ist, dass die Aufgabe/Frage sehr ausführlich erledigt/beantwortet wird.

Ton:
Wissenschaftlich-professionell, präzise, didaktisch klar, ausführlich, ohne metasprachliche Hinweise oder Floskeln, leicht verständlich.

Pflichtlogik:
Keine Abweichung bei Zielgruppe, Kontext, Format, Ton.
Domänen in der Rolle müssen sichtbar den inhaltlichen Kern der Aufgabe abdecken.
Aufgabe immer als Imperativ mit klarer Output-Erwartung formulieren.
`.trim();
  }

  // ============================================================
  // Final Prompt Builder (GENERAL / 12. Klasse)
  // ============================================================
  function buildFinalPromptGeneral(taskText, domainsList) {
    const domains = domainsList.join(", ");
    return `
Rolle:
Du bist ein interdisziplinäres Forscherteam aus 50 der weltweit führenden Wissenschaftlerinnen und Wissenschaftlern,
spezialisiert auf ${domains}. Ihr arbeitet evidenzbasiert, kritisch, sehr ausführlich,
konsensorientiert und begründet Empfehlungen mit klarer Risiko-/Trade-off-Abwägung. Ihr betrachtet die Aufgabe aus allen möglichen verschiedenen Perspektiven. Leitet aus den möglichen, verschiedenen Perspektiven alle Domänen ab. Es sollen mindestens ${DOMAIN_CFG.minDomains} verschiedene Fachdomänen vom interdisziplinären Forscherteam bei der Beantwortung der Aufgabe berücksichtigt werden.

Aufgabe:
${taskText}
Falls dir etwas zur Aufgabe nicht klar ist frage nochmal den Benutzer. LMArena soll die Aufgabe nicht durch weitere Handlungsanweisungen erweitern! Die Aufgabe soll aus unterschiedlichsten wissenschaftlichen Perspektiven betrachtet werden, sodass ein
allumfassendes Bild für die Antwort einbezogen wird.

Zielgruppe:
Geschrieben für jedermann; verständlich für Lernende etwa auf Niveau 12. Klasse Gymnasium.

Kontext:
Kein weiterer Kontext außer dem Inhalt der Aufgabe. Keine zusätzlichen Kontextabfragen.

Format:
Strikte Ausgabestruktur „Einleitung – Hauptteil – Zusammenfassung“.
Fachbegriffe sofort kurz erklären (in Klammern).
Abkürzungen bei erster Nennung ausschreiben.
Logisch, faktenbasiert, umfassend, nachvollziehbar.
Keine Stichpunkte; Tabellen nur, wenn sie die Verständlichkeit klar verbessern.
Mindestwortanzahl: 2000, Maximale Wortanzalhl: 10000, Entscheidend ist, dass die Aufgabe/Frage sehr ausführlich erledigt/beantwortet wird.

Ton:
Wissenschaftlich-professionell, klar und präzise; sehr ausführlich, didaktisch verständlich ohne Floskeln.
Keine metasprachlichen Hinweise oder stilistischen Selbstkommentare.

Pflichtlogik:
Zielgruppe, Kontext, Format und Ton dürfen niemals abweichen.
Domänen in der Rolle müssen den inhaltlichen Kern der Aufgabe sichtbar abdecken.
Die Aufgabe wird immer 1:1 übernommen, ohne Umformulierung oder Ergänzung.
`.trim();
  }

  // ============================================================
  // UI Buttons (BOTTOM RIGHT)
  // ============================================================
  function styleRoundButton(b, rightOffsetPx = 0, bottomOffsetPx = 0) {
    b.type = "button";
    b.style.position = "fixed";
    b.style.zIndex = "999999";
    b.style.width = "42px";
    b.style.height = "42px";
    b.style.borderRadius = "50%";
    b.style.cursor = "pointer";
    b.style.border = "1px solid rgba(0,0,0,0.2)";
    b.style.background = "white";
    b.style.boxShadow = "0 6px 18px rgba(0,0,0,0.18)";
    b.style.fontSize = "18px";

    b.style.right = `${UI_POS.rightPx + rightOffsetPx}px`;
    b.style.bottom = `${UI_POS.bottomPx + bottomOffsetPx}px`;
    b.style.left = "auto";
    b.style.top = "auto";
  }

  function setMicState(state, msg = "") {
    if (!micBtn) return;
    if (!micBtn.classList.contains("stt-mic-btn")) micBtn.classList.add("stt-mic-btn");

    if (state === "listening") {
      micBtn.innerHTML = MIC_ICON.stop;
      micBtn.setAttribute("data-state", "listening");
      micBtn.title = "Spracheingabe läuft – klicken zum Stop";
      return;
    }
    if (state === "working") {
      micBtn.innerHTML = MIC_ICON.spinner;
      micBtn.setAttribute("data-state", "working");
      micBtn.title = msg || "Bereinigung läuft…";
      return;
    }
    if (state === "error") {
      micBtn.innerHTML = MIC_ICON.error;
      micBtn.setAttribute("data-state", "error");
      micBtn.title = msg || "Fehler";
      return;
    }

    // idle
    micBtn.innerHTML = MIC_ICON.mic;
    micBtn.setAttribute("data-state", "idle");
    micBtn.title = supportedSpeech ? "Spracheingabe (Start/Stop)" : "Speech API nicht verfügbar";
  }

  function setPromptBtnState(state, msg = "") {
    if (!promptBtn) return;

    if (state === "working") {
      promptBtn.textContent = "⏳";
      promptBtn.style.background = "#444";
      promptBtn.style.color = "white";
      promptBtn.title = msg || "Prompt wird gebaut…";
      return;
    }
    if (state === "error") {
      promptBtn.textContent = "⚠️";
      promptBtn.style.background = "#8b0000";
      promptBtn.style.color = "white";
      promptBtn.title = msg || "Fehler";
      return;
    }

    promptBtn.textContent = "✨";
    promptBtn.style.background = "white";
    promptBtn.style.color = "black";
    promptBtn.title = "Prompt (für Frank) einbetten";
  }

  function setPromptBtn2State(state, msg = "") {
    if (!promptBtn2) return;

    if (state === "working") {
      promptBtn2.textContent = "⏳";
      promptBtn2.style.background = "#444";
      promptBtn2.style.color = "white";
      promptBtn2.title = msg || "Prompt wird gebaut…";
      return;
    }
    if (state === "error") {
      promptBtn2.textContent = "⚠️";
      promptBtn2.style.background = "#8b0000";
      promptBtn2.style.color = "white";
      promptBtn2.title = msg || "Fehler";
      return;
    }

    promptBtn2.textContent = "🪄";
    promptBtn2.style.background = "white";
    promptBtn2.style.color = "black";
    promptBtn2.title = "Prompt (allgemein / 12. Klasse) einbetten";
  }

  // ============================================================
  // Speech Flow (Auto-Restart bis User stoppt)
  // ============================================================
  let rec = null;

  // "WantsRecording" = User hat 🎙️ gedrückt und noch nicht ⏹️ gedrückt
  let wantsRecording = false;

  // stopRequested = User hat ⏹️ gedrückt und wir warten auf onend
  let stopRequested = false;

  let stopTimer = null;
  let runTicket = 0;

  let restartCount = 0;
  let restartTimer = null;
  let lastFinalTranscript = "";
  let recentFinalNorm = [];

  function resetRestartCounterOnGoodInput() {
    restartCount = 0;
  }

  function resetSpeechDedupeState() {
    lastFinalTranscript = "";
    recentFinalNorm = [];
  }

  function rememberFinalNorm(snippet) {
    const n = normalizeForSpeechDedupe(snippet);
    if (!n) return;
    recentFinalNorm.push(n);
    const maxKeep = CFG.recentFinalMemory || 8;
    if (recentFinalNorm.length > maxKeep) {
      recentFinalNorm = recentFinalNorm.slice(-maxKeep);
    }
  }

  function wasRecentlySeenFinal(snippet) {
    const n = normalizeForSpeechDedupe(snippet);
    if (!n) return false;
    return recentFinalNorm.includes(n);
  }

  function scheduleAutoRestart(reason = "") {
    if (!CFG.autoRestart) return;
    if (!wantsRecording) return;
    if (stopRequested) return;

    if (restartCount >= (CFG.maxConsecutiveRestarts || 50)) {
      wantsRecording = false;
      setMicState("error", "Auto-Restart abgebrochen (zu viele Restarts)");
      showToast("⚠️ SpeechRecognition startet zu oft neu (Audio/Browser-Problem). Aufnahme gestoppt.", 8000);
      return;
    }

    clearTimeout(restartTimer);

    const base = CFG.autoRestartBaseDelayMs || 250;
    const max = CFG.autoRestartMaxDelayMs || 2000;

    const delay = Math.min(max, base + restartCount * 120);
    restartCount++;

    restartTimer = setTimeout(() => {
      if (!wantsRecording || stopRequested) return;
      tryStartRecognition(true, reason);
    }, delay);
  }

  async function runGrammarRewrite() {
    const myTicket = ++runTicket;

    await sleep(CFG.stopGraceMs);

    const el = getUserTargetEditable();
    if (!el) {
      setMicState("error", "Eingabefeld nicht gefunden");
      showToast("❌ Eingabefeld nicht gefunden. Tipp: erst ins gewünschte Feld klicken.", 6500);
      setTimeout(() => setMicState("idle"), 2500);
      return;
    }

    const snap = readPromptText(el);
    if (snap.length < CFG.minCharsForRewrite) {
      setMicState("idle");
      showToast(`Text zu kurz (${snap.length}) – keine Bereinigung gestartet.`, 3000);
      return;
    }

    setMicState("working", "Gemini bereinigt…");
    showToast("Gemini-Bereinigung läuft…", 1600);

    clearTimeout(stopTimer);
    stopTimer = setTimeout(async () => {
      try {
        const fixedRaw = await geminiRewriteGrammarSmart(snap, (i, n) => {
          setMicState("working", `Gemini bereinigt… Teil ${i}/${n}`);
        });

        if (myTicket !== runTicket) return;

        const fixed = cleanText(fixedRaw);
        const preview = fixed.replace(/\s+/g, " ").slice(0, CFG.previewChars);
        showToast("🧠 Gemini Output (Vorschau):\n" + preview + (fixed.length > CFG.previewChars ? " …" : ""), 3500);

        if (!fixed || fixed.length < CFG.minCharsForRewrite) {
          setMicState("idle");
          showToast("Gemini hat keinen nutzbaren Text zurückgegeben.", 4500);
          return;
        }

        if (fixed === snap) {
          setMicState("idle");
          showToast("⚠️ Gemini hat exakt denselben Text zurückgegeben (keine Änderungen).", 5000);
          return;
        }

        const target = getUserTargetEditable() || el;
        const ok = await setViaPaste(target, fixed);
        if (!ok) {
          setMicState("error", "Eingabefeld hat Text nicht übernommen");
          showToast("❌ Eingabefeld hat den Gemini-Text nicht übernommen.", 6500);
          setTimeout(() => setMicState("idle"), 2500);
          return;
        }

        setMicState("idle");
        showToast("✅ Bereinigt & übernommen.", 1800);
      } catch (e) {
        const msg = String(e || "Unbekannter Fehler");
        console.warn("Gemini Fehler:", msg);
        setMicState("error", msg);
        showToast("❌ Gemini Fehler:\n" + msg, 10000);
        setTimeout(() => setMicState("idle"), 2500);
      }
    }, CFG.debounceMsAfterStop);
  }

  function buildRecognitionInstance() {
    const r = new SpeechRecognition();
    r.lang = CFG.speechLang;
    r.continuous = true;
    r.interimResults = CFG.interimResults;

    r.onresult = (e) => {
      resetRestartCounterOnGoodInput();
      const curP = getUserTargetEditable();
      if (curP) rememberEditable(curP);

      const target = curP || lastUserEditable || findPrompt();
      if (!target) return;

      for (let i = e.resultIndex; i < e.results.length; i++) {
        if (e.results[i].isFinal) {
          const raw = cleanText(e.results[i][0].transcript);
          if (!raw) continue;

          let t = trimRepeatedPrefix(lastFinalTranscript, raw);
          if (!t && raw) {
            lastFinalTranscript = raw;
            continue;
          }

          const currentText = readPromptText(target);
          if (wasRecentlySeenFinal(t) || appearsAlreadyInTail(currentText, t)) {
            lastFinalTranscript = raw;
            continue;
          }

          insertText(target, t);
          rememberFinalNorm(t);
          lastFinalTranscript = raw;
        }
      }
    };

    r.onerror = (e) => {
      const err = String(e?.error || "speech-error");
      console.warn("Speech error:", err);

      // Manche Fehler sind "normal" bei WebSpeech (no-speech / aborted) -> Auto-Restart
      const restartable = ["no-speech", "aborted", "network"].includes(err);

      // harte Fehler, bei denen ein Restart keinen Sinn hat
      const fatal = ["not-allowed", "service-not-allowed", "audio-capture"].includes(err);

      // rec wird typischerweise kurz danach onend feuern; wir reagieren aber schon hier
      if (fatal) {
        wantsRecording = false;
        stopRequested = false;
        try { r.stop(); } catch {}
        setMicState("error", err);
        showToast("❌ Speech Fehler: " + err + "\nHinweis: Mikrofon-Rechte, Gerät, oder Browser-Einstellungen prüfen.", 9000);
        return;
      }

      if (restartable && wantsRecording && !stopRequested) {
        showToast("ℹ️ Speech pausiert (" + err + ") – Auto-Restart…", 2500);
        scheduleAutoRestart(err);
        return;
      }

      // sonst: beenden
      wantsRecording = false;
      stopRequested = false;
      try { r.stop(); } catch {}
      setMicState("error", err);
      showToast("❌ Speech Fehler: " + err, 6500);
      setTimeout(() => setMicState("idle"), 2500);
    };

    r.onend = () => {
      rec = null;

      // User wollte stop
      if (stopRequested) {
        stopRequested = false;
        wantsRecording = false;
        runGrammarRewrite();
        return;
      }

      // User will weiter aufnehmen -> Auto-Restart
      if (wantsRecording && CFG.autoRestart) {
        scheduleAutoRestart("onend");
        setMicState("listening"); // UI bleibt "laufend"
        return;
      }

      // sonst: idle
      wantsRecording = false;
      stopRequested = false;
      setMicState("idle");
    };

    return r;
  }

  function tryStartRecognition(isRestart = false, reason = "") {
    if (!supportedSpeech) return;

    // Ziel-Feld prüfen: wenn keines, Warnung, aber trotzdem starten (vielleicht klickt User gleich)
    const t = getUserTargetEditable();
    if (!t) {
      showToast("⚠️ Kein fokussiertes Eingabefeld. Tipp: zuerst ins Ziel-Feld klicken.", 3500);
    } else {
      rememberEditable(t);
    }

    try {
      rec = buildRecognitionInstance();
      rec.start();
      setMicState("listening");
      if (!isRestart) {
        showToast("🎙️ Aufnahme läuft… (Stop über ⏹️)", 1500);
      } else {
        // leises Feedback, damit es nicht nervt
        if (reason && reason !== "onend") showToast("🎙️ Auto-Restart (" + reason + ") …", 1200);
      }
    } catch (e) {
      console.warn("rec.start failed:", e);
      // Start kann fehlschlagen, wenn zu schnell hintereinander
      scheduleAutoRestart("start-failed");
    }
  }

  function startListening() {
    if (!supportedSpeech) return;

    // User-Intention: läuft, bis User stoppt
    wantsRecording = true;
    stopRequested = false;
    restartCount = 0;
    clearTimeout(restartTimer);
    resetSpeechDedupeState();

    tryStartRecognition(false, "");
  }

  function stopListening() {
    if (!supportedSpeech) return;

    // User stoppt bewusst -> dann Grammar-Run nach onend
    stopRequested = true;
    wantsRecording = false;
    clearTimeout(restartTimer);

    setMicState("working", "Stop… dann Gemini…");
    try { rec?.stop(); } catch {}
  }

  function toggleMic() {
    if (!supportedSpeech) return;
    if (!wantsRecording && !stopRequested) startListening();
    else stopListening();
  }

  // ============================================================
  // Prompt Builder (Frank)
  // ============================================================
  async function runPromptBuilder() {
    const el = getUserTargetEditable();
    if (!el) {
      setPromptBtnState("error", "Eingabefeld nicht gefunden");
      showToast("❌ Eingabefeld nicht gefunden. Tipp: erst ins Ziel-Feld klicken.", 6500);
      setTimeout(() => setPromptBtnState("idle"), 2500);
      return;
    }

    const snap = readPromptText(el);
    if (snap.length < CFG.minCharsForRewrite) {
      setPromptBtnState("idle");
      showToast(`Text zu kurz (${snap.length}) – Prompt-Builder nicht gestartet.`, 3500);
      return;
    }

    try {
      setPromptBtnState("working", "Fachdomänen ableiten…");
      showToast("✨ Prompt-Builder: Fachdomänen ableiten…", 1400);

      const domains = await geminiExtractDomainsRobust(snap);

      setPromptBtnState("working", "Gerüst bauen…");
      const finalPrompt = buildFinalPrompt(snap, domains);

      const preview = finalPrompt.replace(/\s+/g, " ").slice(0, CFG.previewChars);
      showToast("🧱 Prompt-Builder (Vorschau):\n" + preview + (finalPrompt.length > CFG.previewChars ? " …" : ""), 3500);

      const target = getUserTargetEditable() || el;
      const ok = await setViaPaste(target, finalPrompt);
      if (!ok) {
        setPromptBtnState("error", "Eingabefeld hat Text nicht übernommen");
        showToast("❌ Eingabefeld hat den Builder-Prompt nicht übernommen.", 6500);
        setTimeout(() => setPromptBtnState("idle"), 2500);
        return;
      }

      setPromptBtnState("idle");
      showToast(`✅ Prompt (Frank) erstellt & übernommen. (Domänen: ${domains.length})`, 2200);
    } catch (e) {
      const msg = String(e || "Unbekannter Fehler");
      console.warn("Prompt-Builder Fehler:", msg);
      setPromptBtnState("error", msg);
      showToast("❌ Prompt-Builder Fehler:\n" + msg, 10000);
      setTimeout(() => setPromptBtnState("idle"), 2500);
    }
  }

  // ============================================================
  // Prompt Builder (GENERAL / 12. Klasse)
  // ============================================================
  async function runPromptBuilderGeneral() {
    const el = getUserTargetEditable();
    if (!el) {
      setPromptBtn2State("error", "Eingabefeld nicht gefunden");
      showToast("❌ Eingabefeld nicht gefunden. Tipp: erst ins Ziel-Feld klicken.", 6500);
      setTimeout(() => setPromptBtn2State("idle"), 2500);
      return;
    }

    const snap = readPromptText(el);
    if (snap.length < CFG.minCharsForRewrite) {
      setPromptBtn2State("idle");
      showToast(`Text zu kurz (${snap.length}) – Prompt-Builder nicht gestartet.`, 3500);
      return;
    }

    try {
      setPromptBtn2State("working", "Fachdomänen ableiten…");
      showToast("🪄 Prompt-Builder: Fachdomänen ableiten…", 1400);

      const domains = await geminiExtractDomainsRobust(snap);

      setPromptBtn2State("working", "Gerüst bauen…");
      const finalPrompt = buildFinalPromptGeneral(snap, domains);

      const preview = finalPrompt.replace(/\s+/g, " ").slice(0, CFG.previewChars);
      showToast("🧱 Prompt-Builder (Vorschau):\n" + preview + (finalPrompt.length > CFG.previewChars ? " …" : ""), 3500);

      const target = getUserTargetEditable() || el;
      const ok = await setViaPaste(target, finalPrompt);
      if (!ok) {
        setPromptBtn2State("error", "Eingabefeld hat Text nicht übernommen");
        showToast("❌ Eingabefeld hat den Builder-Prompt nicht übernommen.", 6500);
        setTimeout(() => setPromptBtn2State("idle"), 2500);
        return;
      }

      setPromptBtn2State("idle");
      showToast(`✅ Prompt (Allgemein/12. Klasse) erstellt & übernommen. (Domänen: ${domains.length})`, 2300);
    } catch (e) {
      const msg = String(e || "Unbekannter Fehler");
      console.warn("Prompt-Builder (General) Fehler:", msg);
      setPromptBtn2State("error", msg);
      showToast("❌ Prompt-Builder Fehler:\n" + msg, 10000);
      setTimeout(() => setPromptBtn2State("idle"), 2500);
    }
  }


  async function runClearPrompt() {
    const el = getUserTargetEditable();
    if (!el) {
      showToast("❌ Eingabefeld nicht gefunden. Tipp: erst ins Ziel-Feld klicken.", 4500);
      return;
    }

    const ok = await setViaPaste(el, "");
    if (!ok) {
      showToast("❌ Text konnte nicht gelöscht werden.", 4500);
      return;
    }

    showToast("🧹 Sprechblase geleert.", 1600);
  }

  // ============================================================
  // Boot
  // ============================================================
  function boot() {
    if (!supportedSpeech) {
      showToast("SpeechRecognition nicht verfügbar (Chrome/Edge).", 7000);
    }

    micBtn = document.createElement("button");
    styleRoundButton(micBtn, 0, 0);
    micBtn.innerHTML = MIC_ICON.mic; micBtn.setAttribute("data-state", "idle"); micBtn.classList.add("stt-mic-btn");
    micBtn.title = "Spracheingabe (Start/Stop)";
    micBtn.addEventListener("click", toggleMic);
    document.body.appendChild(micBtn);

    clearBtn = document.createElement("button");
    styleRoundButton(clearBtn, 52, 0);
    clearBtn.textContent = "❌";
    clearBtn.style.color = "#c40000";
    clearBtn.title = "Sprechblase leeren";
    clearBtn.addEventListener("click", runClearPrompt);
    document.body.appendChild(clearBtn);

    promptBtn = document.createElement("button");
    styleRoundButton(promptBtn, 0, 52);
    promptBtn.textContent = "✨";
    promptBtn.title = "Prompt (für Frank) einbetten";
    promptBtn.addEventListener("click", runPromptBuilder);
    document.body.appendChild(promptBtn);

    promptBtn2 = document.createElement("button");
    styleRoundButton(promptBtn2, 0, 104);
    promptBtn2.textContent = "🪄";
    promptBtn2.title = "Prompt (allgemein / 12. Klasse) einbetten";
    promptBtn2.addEventListener("click", runPromptBuilderGeneral);
    document.body.appendChild(promptBtn2);

    setMicState("idle");
    setPromptBtnState("idle");
    setPromptBtn2State("idle");
    showToast("✅ Script aktiv. 🎙️ + ❌ + ✨ + 🪄 unten rechts.\nTipp: erst ins Ziel-Eingabefeld klicken, dann 🎙️.", 2800);
  }

  boot();
})();
