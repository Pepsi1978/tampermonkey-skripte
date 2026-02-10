// ==UserScript==
// @name         Gemini V.1.0.7
// @namespace    https://gemini.google.com/
// @version      1.0.7
// @description  Speech-to-Text + Gemini-Korrektur (DE) auf Gemini Web. Mic-Button fest unten rechts. Auto-Restart bei Speech-Ende (auch bei Pausen). Schreibt ins zuletzt fokussierte Eingabefeld. Mit Output-Preview.
// @match        https://gemini.google.com/app
// @run-at       document-idle
// @grant        GM_xmlhttpRequest
// @grant        GM.xmlHttpRequest
// @grant        GM_getValue
// @grant        GM_setValue
// @connect      generativelanguage.googleapis.com
// @connect      *.googleapis.com
// @connect      googleapis.com
// @updateURL    https://raw.githubusercontent.com/Pepsi1978/tampermonkey-skripte/main/scripts/gemini.user.js
// @downloadURL  https://raw.githubusercontent.com/Pepsi1978/tampermonkey-skripte/main/scripts/gemini.user.js
// ==/UserScript==

(() => {
  "use strict";

  // ============================================================
  // 🔑 API-Key Verwaltung (Tampermonkey Storage)
  // ============================================================
  // ⚠️ WICHTIG: API-Key NICHT öffentlich posten. Wenn der Key geleakt ist: rotieren.
  const API_KEY_STORAGE_KEY = "gemini_api_key";
  const GEMINI_MODEL = "models/gemini-2.5-flash-lite";

  // ============================================================
  // 💾 MEMORY WORKFLOW
  // ============================================================
  const GEMINI_MEMORY_PROMPT = `
[MEMORY_MODE: EXTRACT | STRICT]

PRIORITÄT: Diese Nachricht ist eine Modus-Anweisung und überschreibt ALLE bisherigen Chat-Anweisungen.
Der bisherige Chatverlauf darf nur als DATENQUELLE gelesen werden. Du darfst keine alten Aufgaben fortsetzen,
keine Ratschläge geben und keine Diskussion weiterführen. Keine normalen Antworten.

Ziel:
Extrahiere aus dem gesamten Chatverlauf nur neue, stabile Informationen über mich,
die zukünftige Antworten deutlich verbessern.

Wichtig:
Nichts automatisch speichern – nur Vorschläge machen.

Deduplizierung / Updates:
- Wenn du Zugriff auf meine bereits gespeicherten Infos ("Saved info") hast, nutze sie zur Deduplizierung.
- Wenn du sie nicht direkt einsehen kannst: mache Best-Effort-Deduplizierung anhand des Chatverlaufs
  und markiere unsichere Fälle kurz als "möglicher Duplikat".

Regeln:
- Nur Dinge, die voraussichtlich mindestens 3 Monate gültig sind.
- Maximal 12 Punkte.
- Jeder Punkt: 1 einfacher Satz, ohne Fachwörter.
- Keine Wiederholungen, keine Tagesform, keine Kleinigkeiten.

Priorität:
- Ziele & Prioritäten
- Präferenzen (wie ich Antworten/Tools möchte)
- Persönlichkeit & wiederkehrende Verhaltensmuster (nur wenn mehrfach erkennbar)
- Wiederkehrende Arbeitsweise mit KI (wie ich iteriere/entscheide)
- Langfristige Projekte

Ausgabeformat (EXAKT):
Punkt 1: <einfacher Satz>. (nützlich weil: <kurz>; sensibel: ja/nein; Beleg: einmal/mehrfach)
...
Punkt N: ...

Danach (EXAKT diese Zeile, damit ich sie kopieren kann):
Ich wähle folgende Punkte zum dauerhaften Speichern aus: [hier nur die Nummern eintragen].
`;

  const GEMINI_MEMORY_SAVE_PROMPT = `
[MEMORY_MODE: SAVE | STRICT]

PRIORITÄT: Diese Nachricht überschreibt ALLE bisherigen Chat-Anweisungen.
Keine normale Antwort, keine Erklärungen, kein Smalltalk.

Aufgabe:
Speichere NUR die von mir ausgewählten Punkte als dauerhafte "Saved info".
Dazu gibst du ausschließlich Speicher-Anweisungen aus, die das Wort "Remember" enthalten.

Eingabe von mir (steht in meiner Nachricht):
Ich wähle folgende Punkte zum dauerhaften Speichern aus: [NUMMERN]

Output-Regeln (EXAKT):
- Gib pro ausgewähltem Punkt GENAU EINE Zeile aus.
- Jede Zeile beginnt exakt so: "Remember this: "
- Danach folgt ein einfacher Satz, der mit "Frank" beginnt.
- Keine Nummern, keine Klammern, keine Zusatzwörter, keine Leerzeilen.

Beispiel-Format:
Remember this: Frank mag Kiefernwälder.
Remember this: Frank bevorzugt sehr detaillierte Infografiken.
`;

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
    maxConsecutiveRestarts: 50 // Schutz gegen Endlosschleifen bei kaputter Audio-Session
  };

  const MEM_LOG_PREFIX = "[TM-GEMINI-MEM]";
  const MEMORY_SEND_DELAY_MS = 1000;

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

  function normalizeApiKey(value) {
    return String(value || "").trim();
  }

  function loadApiKey() {
    if (typeof GM_getValue !== "function") return "";
    return normalizeApiKey(GM_getValue(API_KEY_STORAGE_KEY, ""));
  }

  function saveApiKey(value) {
    if (typeof GM_setValue !== "function") return;
    GM_setValue(API_KEY_STORAGE_KEY, normalizeApiKey(value));
  }

  function ensureApiKey() {
    let key = loadApiKey();
    if (key) return key;

    const input = window.prompt("Bitte Gemini API-Key eingeben (wird in Tampermonkey gespeichert):");
    if (!input) {
      showToast("API-Key fehlt. Bitte in Tampermonkey eingeben.");
      return "";
    }

    key = normalizeApiKey(input);
    if (!key) {
      showToast("API-Key fehlt oder leer.");
      return "";
    }

    saveApiKey(key);
    showToast("API-Key gespeichert.");
    return key;
  }

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

  function isTextInput(el) {
    return el && (el.tagName === "TEXTAREA" || el.tagName === "INPUT");
  }

  function readPromptText(el) {
    if (!el) return "";
    let v = "";
    if (isTextInput(el)) v = el.value || "";
    if (!v) v = el.textContent || "";
    if (!v) v = el.innerText || "";
    return cleanText(v);
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
      document.querySelector("form textarea[data-testid='prompt-textarea']")
    ].filter(Boolean).find(isVisible);

    if (direct) return direct;

    const candidates = [
      ...document.querySelectorAll("textarea"),
      ...document.querySelectorAll("input[type='text']"),
      ...document.querySelectorAll("input:not([type])"),
      ...document.querySelectorAll("[contenteditable='true']"),
      ...document.querySelectorAll("[role='textbox']")
    ].filter(isVisible);

    if (!candidates.length) return null;

    candidates.sort((a, b) => scoreCandidate(b) - scoreCandidate(a));

    const top = candidates[0];
    const inner = top.querySelector?.("[contenteditable='true']");
    return inner && isVisible(inner) ? inner : top;
  }

  function findComposer() {
    return findPrompt();
  }

  async function setComposerText(text) {
    const composer = findComposer();
    if (!composer) return false;
    const ok = await setViaPaste(composer, text);
    return ok;
  }

  function findSendButton() {
    const selectors = [
      "button[aria-label*='Send']",
      "button[aria-label*='Senden']",
      "button[data-testid*='send']",
      "button[mattooltip*='Send']",
      "button[mattooltip*='Senden']",
      "button[aria-label*='Run']",
      "button[aria-label*='Ausführen']"
    ];

    for (const selector of selectors) {
      const btn = document.querySelector(selector);
      if (btn && isVisible(btn)) return btn;
    }

    const btns = [...document.querySelectorAll("button")].filter(isVisible);
    return btns.find((btn) => {
      const txt = cleanText(btn.textContent || "").toLowerCase();
      const aria = (btn.getAttribute("aria-label") || "").toLowerCase();
      const title = (btn.getAttribute("title") || "").toLowerCase();
      return /send|senden|run|ausführen/.test(`${txt} ${aria} ${title}`);
    }) || null;
  }

  function clickSend() {
    const btn = findSendButton();
    if (!btn || btn.disabled || btn.getAttribute("aria-disabled") === "true") return false;
    btn.click();
    return true;
  }

  function getAssistantMessageNodes() {
    const selectors = [
      "message-content.model-response-text",
      "model-response",
      "div[data-message-author-role='model']",
      "div[data-response-id]"
    ];

    for (const selector of selectors) {
      const nodes = [...document.querySelectorAll(selector)].filter((el) => cleanText(el.textContent).length > 0);
      if (nodes.length) return nodes;
    }
    return [];
  }

  function getLastAssistantText() {
    const nodes = getAssistantMessageNodes();
    if (!nodes.length) return "";
    return cleanText(nodes[nodes.length - 1].innerText || nodes[nodes.length - 1].textContent || "");
  }

  async function waitForAssistantTurnComplete(timeoutMs = 120000) {
    const start = Date.now();
    let stableSince = Date.now();
    let lastText = getLastAssistantText();

    while (Date.now() - start < timeoutMs) {
      const stopVisible = [...document.querySelectorAll("button")]
        .filter(isVisible)
        .some((btn) => /stop generating|stop|stopp/i.test(`${btn.getAttribute("aria-label") || ""} ${btn.textContent || ""}`));

      const sendBtn = findSendButton();
      const sendReady = !!sendBtn && !sendBtn.disabled && sendBtn.getAttribute("aria-disabled") !== "true";
      const curText = getLastAssistantText();

      if (curText !== lastText) {
        lastText = curText;
        stableSince = Date.now();
      }

      if (!stopVisible && sendReady && curText && Date.now() - stableSince > 900) {
        return true;
      }

      await sleep(350);
    }

    return false;
  }

  function findNewChatButton() {
    const selectors = [
      "button[aria-label*='New chat']",
      "button[aria-label*='Neuer Chat']",
      "a[aria-label*='New chat']",
      "a[aria-label*='Neuer Chat']",
      "button[data-testid*='new-chat']"
    ];

    for (const selector of selectors) {
      const btn = document.querySelector(selector);
      if (btn && isVisible(btn)) return btn;
    }

    const candidates = [...document.querySelectorAll("button, a")].filter(isVisible);
    return candidates.find((el) => /new\s*chat|neuer\s*chat/i.test(cleanText(el.textContent) + " " + (el.getAttribute("aria-label") || ""))) || null;
  }

  async function tryStartNewChat() {
    const btn = findNewChatButton();
    if (!btn) {
      console.log(MEM_LOG_PREFIX, "Neuer-Chat-Button nicht gefunden, nutze Strict-Fallback im aktuellen Chat.");
      return false;
    }

    btn.click();
    const start = Date.now();
    while (Date.now() - start < 7000) {
      const composer = findComposer();
      if (composer && !cleanText(readPromptText(composer))) {
        await sleep(150);
        return true;
      }
      await sleep(250);
    }

    console.log(MEM_LOG_PREFIX, "Neuer Chat konnte nicht sicher bestätigt werden, nutze Strict-Fallback.");
    return false;
  }

  async function sendMessageThroughComposer(text) {
    const okSet = await setComposerText(text);
    if (!okSet) return false;
    await sleep(120);
    const sent = clickSend();
    return sent;
  }

  function parseRememberLines(text) {
    return String(text || "")
      .split(/\r?\n/)
      .map((line) => line.trim())
      .filter((line) => /^Remember this: /u.test(line));
  }

  function normalizeSelectionNumbers(raw) {
    return String(raw || "")
      .split(",")
      .map((x) => x.trim())
      .filter((x) => /^\d+$/u.test(x))
      .join(",");
  }

  // ============================================================
  // 🎯 Targeting: nutze das Feld, das der User fokussiert hat
  // ============================================================
  let lastUserEditable = null;

  // UI Buttons werden später initialisiert, hier schon deklariert:
  let micBtn = null;
  let memExtractBtn = null;
  let memSaveBtn = null;
  let memSelectionInput = null;
  let promptBtn = null;
  let promptBtn2 = null;

  const memoryState = {
    phase: "IDLE",
    lastAssistantMessageCount: 0
  };

  function isEditableTarget(el) {
    if (!el) return false;
    if (el === document.body || el === document.documentElement) return false;

    // niemals unsere eigenen UI-Buttons als Eingabefeld nehmen
    if (el === micBtn || el === memExtractBtn || el === memSaveBtn || el === memSelectionInput || el === promptBtn || el === promptBtn2) return false;

    const tag = (el.tagName || "").toUpperCase();
    const ariaDisabled = (el.getAttribute?.("aria-disabled") || "").toLowerCase() === "true";

    if (tag === "TEXTAREA") {
      if (el.readOnly || el.disabled || ariaDisabled) return false;
      return true;
    }

    if (tag === "INPUT") {
      if (el.readOnly || el.disabled || ariaDisabled) return false;
      const type = (el.type || "text").toLowerCase();
      const ok = ["text", "search", "email", "url", "tel", "password"].includes(type);
      return ok;
    }

    if (el.isContentEditable) return true;
    const ce = (el.getAttribute?.("contenteditable") || "").toLowerCase();
    if (ce === "true" || ce === "") return true;

    const role = (el.getAttribute?.("role") || "").toLowerCase();
    if (role === "textbox") return true;

    return false;
  }

  function pickEditableFromEvent(e) {
    const path = typeof e.composedPath === "function" ? e.composedPath() : null;
    if (Array.isArray(path)) {
      for (const node of path) {
        if (node && node.nodeType === 1 && isEditableTarget(node) && isVisible(node)) return node;
      }
    }
    const t = e.target;
    if (isEditableTarget(t) && isVisible(t)) return t;
    return null;
  }

  function rememberEditable(el) {
    if (isEditableTarget(el) && isVisible(el)) lastUserEditable = el;
  }

  function getUserTargetEditable() {
    const active = document.activeElement;
    if (isEditableTarget(active) && isVisible(active)) return active;
    if (isEditableTarget(lastUserEditable) && isVisible(lastUserEditable)) return lastUserEditable;
    return findPrompt(); // Fallback
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

  async function setViaPaste(el, text) {
    const target = cleanText(text);
    if (!el) return false;

    el.focus();
    try { document.execCommand("selectAll", false, null); } catch {}

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

    if (!pasted) {
      dispatchReactInput(el, "insertFromPaste", target);
      pasted = true;
    }

    await sleep(CFG.postPasteDelayMs);

    if (cleanText(readPromptText(el)) !== target) {
      if (isTextInput(el)) {
        const setter =
          Object.getOwnPropertyDescriptor(HTMLTextAreaElement.prototype, "value")?.set ||
          Object.getOwnPropertyDescriptor(HTMLInputElement.prototype, "value")?.set;
        if (setter && (el instanceof HTMLTextAreaElement || el instanceof HTMLInputElement)) setter.call(el, target);
        else el.value = target;
        dispatchReactInput(el, "insertReplacementText", target);
      } else {
        try { el.textContent = target; } catch {}
        dispatchReactInput(el, "insertReplacementText", target);
      }
    }

    await reactNudge(el);
    await sleep(40);

    return cleanText(readPromptText(el)) === target;
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
      try { el.textContent = combined; } catch {}
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
    const apiKey = ensureApiKey();
    if (!apiKey) return Promise.reject("API-Key fehlt oder wurde nicht gesetzt.");

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
Du bist ein interdisziplinäres Forscherteam aus den 5 weltweit führenden Wissenschaftlerinnen und Wissenschaftlern,
spezialisiert auf ${domains}. Ihr arbeitet evidenzbasiert, kritisch, sehr ausführlich,
konsensorientiert, erklärt alle Zusammenhänge ganz genau und begründet Empfehlungen ausführlich. Ihr betrachtet die Aufgabe aus allen möglichen verschiedenen Perspektiven. Leitet aus den möglichen, verschiedenen Perspektiven alle relevanten Domänen ab. Es sollen mindestens ${DOMAIN_CFG.minDomains} verschiedene Fachdomänen vom interdisziplinären Forscherteam bei der Beantwortung der Aufgabe berücksichtigt werden.

Aufgabe:
${taskText}
Falls dir etwas zur Aufgabe nicht klar ist, frage nochmal den Benutzer. Gemini soll die Aufgabe nicht durch weitere Handlungsanweisungen erweitern! Die Aufgabe soll aus unterschiedlichsten wissenschaftlichen Perspektiven betrachtet werden, sodass ein
allumfassendes Bild für die Antwort einbezogen wird.

Zielgruppe:
Frank (Benutzer dieses Chats).

Kontext:
Nutze die über Frank gespeicherten Informationen und Erinnerungen (Bio, Ziele, Routinen, Besonderheiten, Projekte, usw.) als
primären Bezugsrahmen für diese Aufgabe. Keine zusätzlichen Kontextabfragen; verwende vorhandenes Wissen.

Format:
Strikte Ausgabestruktur „Einleitung – Hauptteil – Zusammenfassung“. Fachbegriffe sofort kurz erklären (in Klammern); Erläutere alle Zusammenhänge sämtlicher Faktoren sehr genau, damit Frank alle Zusammenhänge (wie, warum etwas so ist) genaustens versteht.
Abkürzungen bei erster Nennung ausschreiben; logisch, faktenbasiert, umfassend, nachvollziehbar. Benutze gegeben falls auch Symbole und Smilies, große Überschriften, Tabelle zu besseren optischen Gliederung.
Mindestwortanzahl: 2000, Maximale Wortanzalhl: 10000, Entscheidend ist, dass die Aufgabe/Frage sehr ausführlich erledigt/beantwortet wird.

Ton:
Wissenschaftlich-professionell, präzise, didaktisch klar, ausführlich, ohne metasprachliche Hinweise oder Floskeln, leicht verständlich.

Pflichtlogik:
Keine Abweichung bei Zielgruppe, Kontext, Format, Ton.
`.trim();
  }

  // ============================================================
  // Final Prompt Builder (GENERAL / 12. Klasse)
  // ============================================================
  function buildFinalPromptGeneral(taskText, domainsList) {
    const domains = domainsList.join(", ");
    return `
Rolle:
Du bist ein interdisziplinäres Forscherteam aus den 5 weltweit führenden Wissenschaftlerinnen und Wissenschaftlern,
spezialisiert auf ${domains}. Ihr arbeitet evidenzbasiert, kritisch, sehr ausführlich,
konsensorientiert, erklärt alle Zusammenhänge ganz genau und begründet Empfehlungen ausführlich. Ihr betrachtet die Aufgabe aus allen möglichen verschiedenen Perspektiven. Leitet aus den möglichen, verschiedenen Perspektiven alle relevanten Domänen ab. Es sollen mindestens ${DOMAIN_CFG.minDomains} verschiedene Fachdomänen vom interdisziplinären Forscherteam bei der Beantwortung der Aufgabe berücksichtigt werden.

Aufgabe:
${taskText}
Falls dir etwas zur Aufgabe nicht klar ist frage nochmal den Benutzer. Gemini soll die Aufgabe nicht durch weitere Handlungsanweisungen erweitern! Die Aufgabe soll aus unterschiedlichsten wissenschaftlichen Perspektiven betrachtet werden, sodass ein
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

    if (state === "listening") {
      micBtn.textContent = "⏹️";
      micBtn.style.background = "#111";
      micBtn.style.color = "white";
      micBtn.title = "Spracheingabe läuft – klicken zum Stop";
      return;
    }
    if (state === "working") {
      micBtn.textContent = "⏳";
      micBtn.style.background = "#444";
      micBtn.style.color = "white";
      micBtn.title = msg || "Gemini bereinigt…";
      return;
    }
    if (state === "error") {
      micBtn.textContent = "⚠️";
      micBtn.style.background = "#8b0000";
      micBtn.style.color = "white";
      micBtn.title = msg || "Fehler";
      return;
    }

    micBtn.textContent = "🎙️";
    micBtn.style.background = "white";
    micBtn.style.color = "black";
    micBtn.title = supportedSpeech ? "Spracheingabe (Start/Stop)" : "Speech API nicht verfügbar";
  }

  function setMemExtractBtnState(state, msg = "") {
    if (!memExtractBtn) return;

    if (state === "working") {
      memExtractBtn.textContent = "⏳ Memory extrahieren";
      memExtractBtn.style.background = "#444";
      memExtractBtn.style.color = "white";
      memExtractBtn.title = msg || "Memory-Extraktion läuft…";
      return;
    }
    if (state === "error") {
      memExtractBtn.textContent = "⚠️ Memory extrahieren";
      memExtractBtn.style.background = "#8b0000";
      memExtractBtn.style.color = "white";
      memExtractBtn.title = msg || "Fehler";
      return;
    }

    memExtractBtn.textContent = "🧠 Memory extrahieren";
    memExtractBtn.style.background = "white";
    memExtractBtn.style.color = "black";
    memExtractBtn.title = "Memory extrahieren";
  }

  function setMemSaveBtnState(state, msg = "") {
    if (!memSaveBtn) return;

    if (state === "working") {
      memSaveBtn.textContent = "⏳ Ausgewählte speichern";
      memSaveBtn.style.background = "#444";
      memSaveBtn.style.color = "white";
      memSaveBtn.title = msg || "Memory speichern läuft…";
      return;
    }
    if (state === "error") {
      memSaveBtn.textContent = "⚠️ Ausgewählte speichern";
      memSaveBtn.style.background = "#8b0000";
      memSaveBtn.style.color = "white";
      memSaveBtn.title = msg || "Fehler";
      return;
    }

    memSaveBtn.textContent = "💾 Ausgewählte speichern";
    memSaveBtn.style.background = "white";
    memSaveBtn.style.color = "black";
    memSaveBtn.title = "Ausgewählte speichern";
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

  function resetRestartCounterOnGoodInput() {
    restartCount = 0;
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
          showToast("❌ Eingabefeld hat den Text nicht übernommen.", 6500);
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
          const t = cleanText(e.results[i][0].transcript);
          if (t) insertText(target, t);
        }
      }
    };

    r.onerror = (e) => {
      const err = String(e?.error || "speech-error");
      console.warn("Speech error:", err);

      const restartable = ["no-speech", "aborted", "network"].includes(err);
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

      if (stopRequested) {
        stopRequested = false;
        wantsRecording = false;
        runGrammarRewrite();
        return;
      }

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
        if (reason && reason !== "onend") showToast("🎙️ Auto-Restart (" + reason + ") …", 1200);
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

  // ============================================================
  // Memory Workflow
  // ============================================================
  function setMemoryPhase(nextPhase) {
    memoryState.phase = nextPhase;
    console.log(MEM_LOG_PREFIX, "Phase:", nextPhase);
  }

  async function runMemoryExtract() {
    try {
      setMemoryPhase("EXTRACTING");
      setMemExtractBtnState("working", "Memory-Extraktion läuft…");

      const newChatStarted = await tryStartNewChat();
      console.log(MEM_LOG_PREFIX, "Neuer Chat für Extraktion:", newChatStarted ? "ja" : "nein (Fallback)");

      const sent = await sendMessageThroughComposer(GEMINI_MEMORY_PROMPT);
      if (!sent) throw new Error("Senden der Extraktionsanweisung fehlgeschlagen.");

      showToast("✅ Memory-Extraktion gestartet.", 1800);
      setMemoryPhase("WAITING_FOR_SELECTION");
      setMemExtractBtnState("idle");
    } catch (e) {
      const msg = String(e || "Unbekannter Fehler");
      console.log(MEM_LOG_PREFIX, "Extraktion fehlgeschlagen:", msg);
      setMemExtractBtnState("error", msg);
      showToast("❌ Memory-Extraktion fehlgeschlagen:\n" + msg, 8500);
      setMemoryPhase("IDLE");
      setTimeout(() => setMemExtractBtnState("idle"), 2500);
    }
  }

  async function runMemorySave() {
    const normalized = normalizeSelectionNumbers(memSelectionInput?.value || "");
    if (!normalized) {
      setMemSaveBtnState("error", "Ungültige Nummern");
      showToast("❌ Bitte Nummern im Format 1,3,7 eingeben.", 4500);
      setTimeout(() => setMemSaveBtnState("idle"), 2500);
      return;
    }

    try {
      setMemoryPhase("SAVING");
      setMemSaveBtnState("working", "Save-Prompt senden…");

      const saveInstruction = `${GEMINI_MEMORY_SAVE_PROMPT}
Ich wähle folgende Punkte zum dauerhaften Speichern aus: [${normalized}]`;
      const sent = await sendMessageThroughComposer(saveInstruction);
      if (!sent) throw new Error("Save-Prompt konnte nicht gesendet werden.");

      console.log(MEM_LOG_PREFIX, "Save-Prompt gesendet mit Nummern:", normalized);
      const complete = await waitForAssistantTurnComplete();
      if (!complete) {
        console.log(MEM_LOG_PREFIX, "Timeout beim Warten auf Assistant-Antwort; versuche letzte Antwort trotzdem auszulesen.");
      }

      const assistantText = getLastAssistantText();
      const rememberLines = parseRememberLines(assistantText);
      if (!rememberLines.length) {
        throw new Error("Keine gültigen 'Remember this:'-Zeilen gefunden.");
      }

      setMemoryPhase("SENDING_REMEMBER_LINES");
      console.log(MEM_LOG_PREFIX, `Sende ${rememberLines.length} Remember-Zeilen einzeln.`);

      for (const line of rememberLines) {
        const lineSent = await sendMessageThroughComposer(line);
        if (!lineSent) throw new Error("Remember-Zeile konnte nicht gesendet werden.");
        await waitForAssistantTurnComplete();
        await sleep(MEMORY_SEND_DELAY_MS);
      }

      setMemoryPhase("DONE");
      setMemSaveBtnState("idle");
      showToast(`✅ ${rememberLines.length} Remember-Zeile(n) einzeln gesendet.`, 2600);
      setMemoryPhase("IDLE");
    } catch (e) {
      const msg = String(e || "Unbekannter Fehler");
      console.log(MEM_LOG_PREFIX, "Speichern fehlgeschlagen:", msg);
      setMemSaveBtnState("error", msg);
      showToast("❌ Memory-Speichern fehlgeschlagen:\n" + msg, 9000);
      setMemoryPhase("IDLE");
      setTimeout(() => setMemSaveBtnState("idle"), 2500);
    }
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
        showToast("❌ Eingabefeld hat den Text nicht übernommen.", 6500);
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
        showToast("❌ Eingabefeld hat den Text nicht übernommen.", 6500);
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

  // ============================================================
  // Boot
  // ============================================================
  function boot() {
    if (!supportedSpeech) {
      showToast("SpeechRecognition nicht verfügbar (Chrome/Edge).", 7000);
    }

    micBtn = document.createElement("button");
    styleRoundButton(micBtn, 0, 0);
    micBtn.textContent = "🎙️";
    micBtn.title = "Spracheingabe (Start/Stop)";
    micBtn.addEventListener("click", toggleMic);
    document.body.appendChild(micBtn);

    memExtractBtn = document.createElement("button");
    styleRoundButton(memExtractBtn, 52, 0);
    memExtractBtn.style.width = "168px";
    memExtractBtn.style.height = "42px";
    memExtractBtn.style.borderRadius = "21px";
    memExtractBtn.style.fontSize = "13px";
    memExtractBtn.style.fontWeight = "600";
    memExtractBtn.textContent = "🧠 Memory extrahieren";
    memExtractBtn.title = "Memory extrahieren";
    memExtractBtn.addEventListener("click", runMemoryExtract);
    document.body.appendChild(memExtractBtn);

    memSelectionInput = document.createElement("input");
    memSelectionInput.type = "text";
    memSelectionInput.placeholder = "Nummern speichern (z. B. 1,3,7)";
    memSelectionInput.title = "Nummern speichern (z. B. 1,3,7)";
    memSelectionInput.style.position = "fixed";
    memSelectionInput.style.zIndex = "999999";
    memSelectionInput.style.right = `${UI_POS.rightPx + 526}px`;
    memSelectionInput.style.bottom = `${UI_POS.bottomPx + 2}px`;
    memSelectionInput.style.width = "220px";
    memSelectionInput.style.height = "34px";
    memSelectionInput.style.padding = "6px 10px";
    memSelectionInput.style.borderRadius = "8px";
    memSelectionInput.style.border = "1px solid rgba(0,0,0,0.25)";
    memSelectionInput.style.boxShadow = "0 4px 12px rgba(0,0,0,0.12)";
    memSelectionInput.style.font = "12px/1.2 system-ui, -apple-system, Segoe UI, Roboto, Arial";
    memSelectionInput.style.background = "white";
    document.body.appendChild(memSelectionInput);

    memSaveBtn = document.createElement("button");
    styleRoundButton(memSaveBtn, 336, 0);
    memSaveBtn.style.width = "190px";
    memSaveBtn.style.height = "42px";
    memSaveBtn.style.borderRadius = "21px";
    memSaveBtn.style.fontSize = "13px";
    memSaveBtn.style.fontWeight = "600";
    memSaveBtn.textContent = "💾 Ausgewählte speichern";
    memSaveBtn.title = "Ausgewählte speichern";
    memSaveBtn.addEventListener("click", runMemorySave);
    document.body.appendChild(memSaveBtn);

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
    setMemExtractBtnState("idle");
    setMemSaveBtnState("idle");
    setPromptBtnState("idle");
    setPromptBtn2State("idle");
    showToast("✅ Script aktiv. 🎙️ + 🧠 + 💾 + ✨ + 🪄 unten rechts.", 2800);
  }

  boot();
})();
