// ==UserScript==
// @name         Translate V.1.2.0
// @namespace    https://translate.google.com/
// @version      1.2.0
// @description  Speech-to-Text + Gemini-Diktat-Bereinigung (DE) auf Google Translate. Mic-Button unten rechts. Kein stilles Fallback. Mit Output-Preview. API-Key wird in Tampermonkey gespeichert.
// @match        https://translate.google.com/*
// @match        https://www.translate.google.com/*
// @match        https://translate.google.de/*
// @match        https://www.translate.google.de/*
// @run-at       document-idle
// @grant        GM_xmlhttpRequest
// @grant        GM.xmlHttpRequest
// @grant        GM_getValue
// @grant        GM_setValue
// @connect      generativelanguage.googleapis.com
// @connect      *.googleapis.com
// @connect      googleapis.com
// ==/UserScript==

(() => {
  "use strict";
        // ── CSS für Mikrofon-Button Animationen (mit Fehlerbehandlung) ──
    try {
      (function(){if(document.getElementById("stt-mic-css"))return;var s=document.createElement("style");s.id="stt-mic-css";s.textContent=".stt-mic-btn{display:flex!important;align-items:center!important;justify-content:center!important;padding:0!important;transition:background .25s,transform .15s,box-shadow .25s!important}.stt-mic-btn:active{transform:scale(.93)!important}.stt-mic-btn[data-state=idle]{background:#2563eb!important;color:#fff!important;border-color:#2563eb!important}.stt-mic-btn[data-state=idle]:hover{background:#1d4ed8!important;transform:scale(1.06)!important}.stt-mic-btn[data-state=listening]{background:#dc2626!important;color:#fff!important;border-color:#dc2626!important;animation:stt-pulse 1.4s ease-in-out infinite!important}.stt-mic-btn[data-state=working]{background:#d97706!important;color:#fff!important;border-color:#d97706!important}.stt-mic-btn[data-state=error]{background:#8b0000!important;color:#fff!important;border-color:#8b0000!important}@keyframes stt-pulse{0%,100%{box-shadow:0 0 0 0 rgba(220,38,38,.45)}50%{box-shadow:0 0 0 14px rgba(220,38,38,0)}}.stt-mic-btn[data-state=working] svg{animation:stt-spin .8s linear infinite}@keyframes stt-spin{to{transform:rotate(360deg)}}";try{(document.head||document.documentElement).appendChild(s);}catch(e){document.documentElement.appendChild(s);}})();
    } catch(e) { /* CSS-Animation nicht verfügbar, Buttons funktionieren trotzdem */ }


  // ============================================================
  // 🔑 API-Key
  // ============================================================
  // ⚠️ WICHTIG: API-Key NICHT öffentlich posten. Wenn der Key geleakt ist: rotieren.
  const GEMINI_API_KEY_DEFAULT = "hier".trim();
  const GEMINI_MODEL = "models/gemini-2.5-flash-lite";
  const API_KEY_STORAGE_KEY = "translateGeminiApiKey";

  // ============================================================
  // UI POSITION
  // ============================================================
  const UI_POS = { rightPx: 16, bottomPx: 16 };
  // Android/Edge Mobile-Erkennung (für angepasste Restart-Delays)
  const isMobileAndroid = /Android/i.test(navigator.userAgent);


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
    autoRestartBaseDelayMs: isMobileAndroid ? 800 : 250,
    autoRestartMaxDelayMs: isMobileAndroid ? 4000 : 2000,
    maxConsecutiveRestarts: 50, // Schutz gegen Endlosschleifen bei kaputter Audio-Session
    recentFinalMemory: 8
  };

  const SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;
  const supportedSpeech = !!SpeechRecognition;

  // ── Icons für Mikrofon-Button (textContent-safe für Trusted Types Seiten) ──
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
  try { if (document.body) document.body.appendChild(toast); } catch(e) {}

  let toastTimer = null;
  function showToast(msg, ms = 5500) {
    if (!toast.isConnected && document.body) { try { document.body.appendChild(toast); } catch(e) {} }
    clearTimeout(toastTimer);
    toast.textContent = msg;
    toast.style.display = "block";
    toastTimer = setTimeout(() => (toast.style.display = "none"), ms);
  }

  const sleep = (ms) => new Promise((r) => setTimeout(r, ms));

  // ============================================================
  // API-Key Storage (Tampermonkey)
  // ============================================================
  function readStoredApiKey() {
    try {
      if (typeof GM_getValue === "function") {
        return String(GM_getValue(API_KEY_STORAGE_KEY, "") || "").trim();
      }
    } catch {}

    try {
      return String(localStorage.getItem(API_KEY_STORAGE_KEY) || "").trim();
    } catch {}

    return "";
  }

  function writeStoredApiKey(key) {
    const cleanKey = String(key || "").trim();
    try {
      if (typeof GM_setValue === "function") {
        GM_setValue(API_KEY_STORAGE_KEY, cleanKey);
        return;
      }
    } catch {}

    try {
      localStorage.setItem(API_KEY_STORAGE_KEY, cleanKey);
    } catch {}
  }

  function getEffectiveApiKey() {
    return readStoredApiKey() || GEMINI_API_KEY_DEFAULT;
  }

  function requestApiKey() {
    const existing = readStoredApiKey();
    const input = prompt(
      "Bitte Gemini API-Key eingeben (wird in Tampermonkey gespeichert):",
      existing || ""
    );
    if (input === null) return "";
    const cleaned = String(input || "").trim();
    if (cleaned) {
      writeStoredApiKey(cleaned);
      showToast("✅ API-Key gespeichert.", 2600);
      return cleaned;
    }
    showToast("⚠️ API-Key leer. Vorgang abgebrochen.", 3200);
    return "";
  }

  // ============================================================
  // Prompt Finder (Fallback) – wir nutzen weiterhin das zuletzt fokussierte Feld
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

    // Android/Edge: Mindestl\u00e4nge 40 Zeichen.
    // Android splittet S\u00e4tze in mehrere isFinal-Ergebnisse – kurze W\u00f6rter
    // wie "funktioniert" (12 Zeichen) landen als eigenst\u00e4ndiges Ergebnis
    // und w\u00fcrden sonst f\u00e4lschlich als Duplikat eingestuft und verschluckt.
    const minLen = isMobileAndroid ? 40 : 12;
    if (snip.length < minLen) return false;

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

  // UI Button
  let micBtn = null;
  let clearBtn = null;

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

  function geminiGenerate(userPrompt, { temperature = 0.05, maxOutputTokens = 2048 } = {}) {
    let apiKey = getEffectiveApiKey();
    if (!apiKey || apiKey.toLowerCase().includes("key hier") || apiKey.toLowerCase().includes("hier")) {
      apiKey = requestApiKey();
    }

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

  // ---- Diktat-Bereinigung + Grammatik Prompt ----
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
  // UI Button (BOTTOM RIGHT)
  // ============================================================
  // ── Button IDs (Watchdog) ──
  const UI_IDS = { mic: "tm-translate-mic", clear: "tm-translate-clear" };

  function getOrCreateButton(id) {
    let b = document.getElementById(id);
    if (!b) { b = document.createElement("button"); b.id = id; }
    return b;
  }

  function setUiStyle(el, prop, value) {
    if (!el) return;
    el.style.setProperty(prop, value, "important");
  }

  function enforceUiButtonVisibility(button) {
    if (!button) return;
    setUiStyle(button, "display", "flex");
    setUiStyle(button, "align-items", "center");
    setUiStyle(button, "justify-content", "center");
    setUiStyle(button, "visibility", "visible");
    setUiStyle(button, "opacity", "1");
    setUiStyle(button, "pointer-events", "auto");
    setUiStyle(button, "appearance", "none");
    setUiStyle(button, "-webkit-appearance", "none");
    setUiStyle(button, "box-sizing", "border-box");
    setUiStyle(button, "padding", "0");
    setUiStyle(button, "margin", "0");
    setUiStyle(button, "overflow", "visible");
    setUiStyle(button, "line-height", "1");
    setUiStyle(button, "font-family", "Apple Color Emoji, Segoe UI Emoji, Noto Color Emoji, sans-serif");
    setUiStyle(button, "user-select", "none");
  }

  function styleRoundButton(b, rightOffsetPx = 0, bottomOffsetPx = 0) {
    b.type = "button";
    setUiStyle(b, "position", "fixed");
    setUiStyle(b, "z-index", "2147483647");
    setUiStyle(b, "width", "42px");
    setUiStyle(b, "height", "42px");
    setUiStyle(b, "border-radius", "50%");
    setUiStyle(b, "cursor", "pointer");
    setUiStyle(b, "border", "1px solid rgba(0,0,0,0.2)");
    setUiStyle(b, "background", "white");
    b.style.boxShadow = "0 6px 18px rgba(0,0,0,0.18)"; // kein !important – Animation muss box-shadow überschreiben können
    setUiStyle(b, "font-size", "18px");

    setUiStyle(b, "right", `${UI_POS.rightPx + rightOffsetPx}px`);
    setUiStyle(b, "bottom", `${UI_POS.bottomPx + bottomOffsetPx}px`);
    setUiStyle(b, "left", "auto");
    setUiStyle(b, "top", "auto");
    enforceUiButtonVisibility(b);
  }



  // ── Trusted-Types-sicheres SVG-Icon setzen ──────────────────────────────────
  function setSvgIcon(el, svgStr) {
    try {
      el.innerHTML = svgStr; // Funktioniert auf den meisten Seiten
    } catch(e) {
      // Trusted Types Fallback: SVG via DOMParser (kein innerHTML in aktuellem Dokument)
      try {
        el.textContent = "";
        const doc = new DOMParser().parseFromString(svgStr, "image/svg+xml");
        const node = doc.documentElement;
        if (node && node.tagName === "svg") el.appendChild(document.adoptNode(node));
      } catch(e2) {
        // Letzter Fallback: Emoji (immer sicher)
        el.textContent = svgStr.includes("M12 1a3") ? "🎙️"
                       : svgStr.includes("<rect") ? "⏹️"
                       : svgStr.includes("M12 2a10") ? "⏳" : "⚠️";
      }
    }
  }

  // ── Web Animations API (Fallback wenn CSS @keyframes nicht geladen) ─────────
  let _sttAnim = null;
  function _sttStartPulse(el) {
    _sttStopAnims();
    if (!el || !el.animate) return;
    try {
      _sttAnim = el.animate([
        { boxShadow: "0 0 0 0 rgba(220,38,38,0.45)" },
        { boxShadow: "0 0 0 14px rgba(220,38,38,0)" },
        { boxShadow: "0 0 0 0 rgba(220,38,38,0.45)" }
      ], { duration: 1400, iterations: Infinity, easing: "ease-in-out" });
    } catch(e) {}
  }
  function _sttStartSpin(el) {
    _sttStopAnims();
    // Nur das SVG-Kind drehen (wie CSS .stt-mic-btn[data-state=working] svg { animation: stt-spin })
    const target = (el && el.querySelector("svg")) || el;
    if (!target || !target.animate) return;
    try {
      _sttAnim = target.animate([
        { transform: "rotate(0deg)" },
        { transform: "rotate(360deg)" }
      ], { duration: 800, iterations: Infinity, easing: "linear" });
    } catch(e) {}
  }
  function _sttStopAnims() {
    if (_sttAnim) { try { _sttAnim.cancel(); } catch(e) {} _sttAnim = null; }
  }

  function setMicState(state, msg = "") {
      if (!micBtn) return;
      if (!micBtn.classList.contains("stt-mic-btn")) micBtn.classList.add("stt-mic-btn");
      _sttStopAnims(); // Laufende Animationen stoppen

      if (state === "listening") {
        setSvgIcon(micBtn, MIC_ICON.stop);
        micBtn.setAttribute("data-state", "listening");
        setUiStyle(micBtn, "background", "#dc2626");
        setUiStyle(micBtn, "color", "#fff");
        setUiStyle(micBtn, "border-color", "#dc2626");
        micBtn.title = "Spracheingabe läuft – klicken zum Stop";
        _sttStartPulse(micBtn); // Pulsierendes rotes Leuchten (wie CSS stt-pulse)
        return;
      }
      if (state === "working") {
        setSvgIcon(micBtn, MIC_ICON.spinner);
        micBtn.setAttribute("data-state", "working");
        setUiStyle(micBtn, "background", "#d97706");
        setUiStyle(micBtn, "color", "#fff");
        setUiStyle(micBtn, "border-color", "#d97706");
        micBtn.title = msg || "Bereinigung läuft…";
        _sttStartSpin(micBtn); // Spinner-SVG rotiert (wie CSS stt-spin)
        return;
      }
      if (state === "error") {
        setSvgIcon(micBtn, MIC_ICON.error);
        micBtn.setAttribute("data-state", "error");
        setUiStyle(micBtn, "background", "#8b0000");
        setUiStyle(micBtn, "color", "#fff");
        setUiStyle(micBtn, "border-color", "#8b0000");
        micBtn.title = msg || "Fehler";
        return;
      }
      // idle
      setSvgIcon(micBtn, MIC_ICON.mic);
      micBtn.setAttribute("data-state", "idle");
      setUiStyle(micBtn, "background", "#2563eb");
      setUiStyle(micBtn, "color", "#fff");
      setUiStyle(micBtn, "border-color", "#2563eb");
      micBtn.title = supportedSpeech ? "Spracheingabe (Start/Stop)" : "Speech API nicht verfügbar";
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
  let restartAlreadyScheduled = false;
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
      showToast("\u26a0\ufe0f Spracheingabe gestoppt (zu viele Neustarts).\nBitte erneut auf den Mikrofon-Button tippen.", 9000);
      setTimeout(() => setMicState("idle"), 4000);
      return;
    }

    clearTimeout(restartTimer);

    // BUG-FIX Android/Edge: onerror("no-speech") + onend feuern BEIDE scheduleAutoRestart
    // f\u00fcr dieselbe Session \u2192 restartCount w\u00fcrde doppelt erh\u00f6ht.
    // Das Flag verhindert das Doppel-Increment.
    if (!restartAlreadyScheduled) {
      restartCount++;
      restartAlreadyScheduled = true;
    }

    const base = CFG.autoRestartBaseDelayMs || 250;
    const max  = CFG.autoRestartMaxDelayMs  || 2000;
    const delay = Math.min(max, base + restartCount * 120);

    restartTimer = setTimeout(() => {
      restartAlreadyScheduled = false;
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
        setMicState("listening");
        return;
      }

      wantsRecording = false;
      stopRequested = false;
      setMicState("idle");
    };

    return r;
  }

  function tryStartRecognition(isRestart = false, reason = "") {
    if (!supportedSpeech) return;

    const t = getUserTargetEditable();
    if (!t) {
      showToast("\u26a0\ufe0f Kein fokussiertes Eingabefeld. Tipp: zuerst ins Ziel-Feld tippen.", 3500);
    } else {
      rememberEditable(t);
    }

    // BUG-FIX Android/Edge: veraltete Dedup-Listen beim Neustart leeren.
    // Verhindert, dass Phrasen aus vorigen Sessions f\u00e4lschlicherweise
    // als Duplikat eingestuft und verschluckt werden.
    if (isRestart) {
      recentFinalNorm = [];
    }

    try {
      rec = buildRecognitionInstance();
      rec.start();
      setMicState("listening");
      if (!isRestart) {
        showToast("\uD83C\uDF99\uFE0F Aufnahme l\u00e4uft\u2026 (Stop \u00fcber \u23F9\uFE0F)", 1500);
      } else {
        if (reason && reason !== "onend") showToast("\uD83C\uDF99\uFE0F Auto-Restart (" + reason + ") \u2026", 1200);
      }
    } catch (e) {
      console.warn("rec.start failed:", e);
      scheduleAutoRestart("start-failed");
    }
  }

  function startListening() {
    if (!supportedSpeech) return;

    wantsRecording = true;
    stopRequested = false;
    restartCount = 0;
    restartAlreadyScheduled = false;
    resetSpeechDedupeState();
    clearTimeout(restartTimer);

    tryStartRecognition(false, "");
  }

  function stopListening() {
    if (!supportedSpeech) return;

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
  function mountOrRepairUI() {
    if (!document.body) return;

    micBtn = getOrCreateButton(UI_IDS.mic);
    styleRoundButton(micBtn, 0, 0);
    if (!micBtn.getAttribute("data-state")) {
      setSvgIcon(micBtn, MIC_ICON.mic);
      micBtn.setAttribute("data-state", "idle");
      micBtn.classList.add("stt-mic-btn");
    }
    micBtn.title = "Spracheingabe (Start/Stop)";
    micBtn.onclick = toggleMic;
    micBtn.addEventListener("pointerdown", e => e.preventDefault(), true);
    micBtn.addEventListener("mousedown",   e => e.preventDefault(), true);
    if (!micBtn.isConnected) document.body.appendChild(micBtn);

    clearBtn = getOrCreateButton(UI_IDS.clear);
    styleRoundButton(clearBtn, 52, 0);
    clearBtn.textContent = clearBtn.textContent || "\u274C";
    setUiStyle(clearBtn, "color", "#c40000");
    clearBtn.title = "Sprechblase leeren";
    clearBtn.onclick = runClearPrompt;
    clearBtn.addEventListener("pointerdown", e => e.preventDefault(), true);
    clearBtn.addEventListener("mousedown",   e => e.preventDefault(), true);
    if (!clearBtn.isConnected) document.body.appendChild(clearBtn);

    setMicState("idle");
  }
  // ── UI Watchdog: Buttons nach SPA-Navigation wiederherstellen ──
  let ensureScheduled = false;
  function scheduleEnsureUI() {
    if (ensureScheduled) return;
    ensureScheduled = true;
    setTimeout(() => {
      ensureScheduled = false;
      try { mountOrRepairUI(); } catch (e) { console.warn("mountOrRepairUI error:", e); }
    }, 300);
  }

  function startUiWatchdog() {
    // MutationObserver: falls die SPA den DOM neu aufbaut
    try {
      const mo = new MutationObserver(() => {
        if (!document.getElementById("tm-translate-mic") ||
        !document.getElementById("tm-translate-clear"))
          scheduleEnsureUI();
      });
      mo.observe(document.documentElement, { childList: true, subtree: true });
    } catch (e) {}

    // History-Hooks: bei SPA-Navigation (pushState/replaceState)
    try {
      const _push    = history.pushState;
      const _replace = history.replaceState;
      history.pushState    = function () { const r = _push.apply(this, arguments);    scheduleEnsureUI(); return r; };
      history.replaceState = function () { const r = _replace.apply(this, arguments); scheduleEnsureUI(); return r; };
      window.addEventListener("popstate", scheduleEnsureUI, true);
    } catch (e) {}

    // Fallback-Interval (alle 3 s)
    setInterval(() => {
      if (!document.getElementById("tm-translate-mic") ||
        !document.getElementById("tm-translate-clear"))
        scheduleEnsureUI();
    }, 3000);
  }
function boot() {
    if (!supportedSpeech) {
      showToast("SpeechRecognition nicht verf\u00fcgbar (Chrome/Edge).", 7000);
    }

    if (!getEffectiveApiKey()) {
      showToast("\uD83D\uDD11 API-Key fehlt. Eingabe wird abgefragt\u2026", 3200);
      setTimeout(() => { if (!getEffectiveApiKey()) requestApiKey(); }, 800);
    }

    try { mountOrRepairUI(); } catch(e) { console.error("[STT-translate] mountOrRepairUI:", e); }
    try { startUiWatchdog(); } catch(e) { console.error("[STT-translate] startUiWatchdog:", e); }
    showToast("\u2705 Script aktiv. \uD83C\uDF99\uFE0F + \u274C unten rechts.\nTipp: erst ins Ziel-Eingabefeld klicken, dann \uD83C\uDF99\uFE0F.", 2800);
  }

  if (document.readyState === "loading") {
    document.addEventListener("DOMContentLoaded", () => setTimeout(boot, 500));
  } else {
    setTimeout(boot, 500);
  }
})();
