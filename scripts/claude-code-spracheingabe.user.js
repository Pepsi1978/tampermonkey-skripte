// ==UserScript==
// @name         Claude Code - Spracheingabe mit Autokorrektur V.1.1.1
// @namespace    claude-code-speech-input
// @version      1.1.1
// @description  Spracheingabe mit automatischer Rechtschreib- und Grammatikkorrektur für Claude Code. Funktioniert auf Chrome (Windows/Mac) und Edge (Android).
// @author       Assistant
// @match        https://claude.ai/code
// @match        https://claude.ai/code/*
// @grant        GM_xmlhttpRequest
// @grant        GM_addStyle
// @grant        GM_getValue
// @grant        GM_setValue
// @connect      api.languagetool.org
// @run-at       document-idle
// @noframes
// ==/UserScript==

(function () {
    'use strict';

    // ============================================================
    //  KONFIGURATION
    // ============================================================
    const LANGUAGETOOL_URL = 'https://api.languagetool.org/v2/check';
    const CORRECTION_TIMEOUT = 10000;
    const CORRECTABLE_WINDOW = 120000; // 2 Minuten
    const BUTTON_SIZE = 50;
    const DEBOUNCE_MS = 400;

    const LANGUAGES = [
        { code: 'de-DE', label: 'Deutsch', lt: 'de-DE' },
        { code: 'en-US', label: 'English (US)', lt: 'en-US' },
        { code: 'en-GB', label: 'English (UK)', lt: 'en-GB' },
        { code: 'fr-FR', label: 'Français', lt: 'fr' },
        { code: 'es-ES', label: 'Español', lt: 'es' },
        { code: 'it-IT', label: 'Italiano', lt: 'it' },
        { code: 'pt-BR', label: 'Português', lt: 'pt-BR' },
    ];

    // Selektoren für das Eingabefeld (Fallback, nur wenn kein Feld fokussiert)
    const INPUT_SELECTORS = [
        'div.ProseMirror[contenteditable="true"]',
        '[contenteditable="true"][role="textbox"]',
        '[contenteditable="true"][data-placeholder]',
        '[contenteditable="true"][aria-label]',
        'textarea[placeholder]',
        'textarea',
        'div[contenteditable="true"]',
        '[role="textbox"]',
        'input[type="text"]',
        'input:not([type="hidden"]):not([type="submit"]):not([type="button"]):not([type="checkbox"]):not([type="radio"])',
    ];

    // ============================================================
    //  HILFSFUNKTIONEN (GM_* Fallbacks)
    // ============================================================
    const store = {
        get(key, fallback) {
            try { return GM_getValue(key, fallback); }
            catch { try { const v = localStorage.getItem('stt_' + key); return v !== null ? JSON.parse(v) : fallback; } catch { return fallback; } }
        },
        set(key, val) {
            try { GM_setValue(key, val); }
            catch { try { localStorage.setItem('stt_' + key, JSON.stringify(val)); } catch { /* ignore */ } }
        },
    };

    function addCSS(css) {
        try { GM_addStyle(css); }
        catch {
            const s = document.createElement('style');
            s.textContent = css;
            (document.head || document.documentElement).appendChild(s);
        }
    }

    function ltRequest(data) {
        return new Promise((resolve, reject) => {
            try {
                GM_xmlhttpRequest({
                    method: 'POST',
                    url: LANGUAGETOOL_URL,
                    headers: { 'Content-Type': 'application/x-www-form-urlencoded', Accept: 'application/json' },
                    data,
                    timeout: CORRECTION_TIMEOUT,
                    onload: (r) => resolve(r.responseText),
                    onerror: (e) => reject(e),
                    ontimeout: () => reject(new Error('timeout')),
                });
            } catch {
                // Fallback: fetch (funktioniert wenn CORS erlaubt)
                fetch(LANGUAGETOOL_URL, {
                    method: 'POST',
                    headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
                    body: data,
                    signal: AbortSignal.timeout(CORRECTION_TIMEOUT),
                })
                    .then((r) => r.text())
                    .then(resolve)
                    .catch(reject);
            }
        });
    }

    // ============================================================
    //  ZUSTAND (State Machine)
    // ============================================================
    //
    //  IDLE  ──click──▶  RECORDING  ──click──▶  PROCESSING
    //    ▲                                          │
    //    │                                          ▼
    //    │                                     CORRECTABLE ──click──▶ PROCESSING
    //    │                                          │                     │
    //    ◀──────────── timeout (2 Min.) ────────────┘                     │
    //    ◀────────────────────────────────────────────────────────────────┘
    //
    let currentState = 'IDLE';
    let recognition = null;
    let finalTranscript = '';
    let interimTranscript = '';
    let textBeforeRecording = '';
    let correctableTimer = null;
    let lastClickTime = 0;
    let currentLang = store.get('language', 'de-DE');

    // Zuletzt fokussiertes Eingabefeld (vom Nutzer angeklickt)
    let lastFocusedInput = null;

    // UI-Referenzen
    let micBtn = null;
    let statusEl = null;
    let langMenu = null;

    // ============================================================
    //  SVG-ICONS
    // ============================================================
    const ICON = {
        mic: `<svg viewBox="0 0 24 24" width="24" height="24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
            <path d="M12 1a3 3 0 0 0-3 3v8a3 3 0 0 0 6 0V4a3 3 0 0 0-3-3z"/>
            <path d="M19 10v2a7 7 0 0 1-14 0v-2"/>
            <line x1="12" y1="19" x2="12" y2="23"/><line x1="8" y1="23" x2="16" y2="23"/>
        </svg>`,
        stop: `<svg viewBox="0 0 24 24" width="24" height="24" fill="currentColor">
            <rect x="6" y="6" width="12" height="12" rx="2"/>
        </svg>`,
        correct: `<svg viewBox="0 0 24 24" width="24" height="24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
            <path d="M12 20h9"/><path d="M16.5 3.5a2.121 2.121 0 0 1 3 3L7 19l-4 1 1-4L16.5 3.5z"/>
        </svg>`,
        spinner: `<svg viewBox="0 0 24 24" width="24" height="24" fill="none" stroke="currentColor" stroke-width="2.5" stroke-linecap="round">
            <path d="M12 2a10 10 0 0 1 10 10"/>
        </svg>`,
    };

    // ============================================================
    //  CSS
    // ============================================================
    addCSS(`
        /* ---------- Mikrofon-Button ---------- */
        #stt-btn {
            position: fixed;
            bottom: 90px;
            right: 24px;
            width: ${BUTTON_SIZE}px;
            height: ${BUTTON_SIZE}px;
            border-radius: 50%;
            border: none;
            cursor: pointer;
            z-index: 2147483647;
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 0;
            outline: none;
            box-shadow: 0 2px 12px rgba(0,0,0,0.35);
            transition: background 0.25s, transform 0.15s, box-shadow 0.25s;
            -webkit-tap-highlight-color: transparent;
            touch-action: manipulation;
            user-select: none;
        }
        #stt-btn:active { transform: scale(0.93); }

        /* Zustände */
        #stt-btn[data-state="IDLE"]        { background: #2563eb; color: #fff; }
        #stt-btn[data-state="IDLE"]:hover   { background: #1d4ed8; transform: scale(1.06); }
        #stt-btn[data-state="RECORDING"]    { background: #dc2626; color: #fff; animation: stt-pulse 1.4s ease-in-out infinite; }
        #stt-btn[data-state="CORRECTABLE"]  { background: #16a34a; color: #fff; }
        #stt-btn[data-state="CORRECTABLE"]:hover { background: #15803d; transform: scale(1.06); }
        #stt-btn[data-state="PROCESSING"]   { background: #d97706; color: #fff; pointer-events: none; opacity: 0.9; }

        @keyframes stt-pulse {
            0%,100% { box-shadow: 0 0 0 0 rgba(220,38,38,0.45); }
            50%     { box-shadow: 0 0 0 14px rgba(220,38,38,0); }
        }
        #stt-btn[data-state="PROCESSING"] svg { animation: stt-spin 0.8s linear infinite; }
        @keyframes stt-spin { to { transform: rotate(360deg); } }

        /* ---------- Status-Anzeige ---------- */
        #stt-status {
            position: fixed;
            bottom: ${90 + BUTTON_SIZE + 10}px;
            right: 24px;
            max-width: 280px;
            padding: 7px 16px;
            border-radius: 20px;
            font: 13px/1.4 -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif;
            z-index: 2147483647;
            pointer-events: none;
            opacity: 0;
            transition: opacity 0.3s;
            word-break: break-word;
        }
        #stt-status.visible { opacity: 1; }
        #stt-status.t-recording  { background: #fef2f2; color: #b91c1c; border: 1px solid #fecaca; }
        #stt-status.t-processing { background: #fffbeb; color: #b45309; border: 1px solid #fde68a; }
        #stt-status.t-success    { background: #f0fdf4; color: #15803d; border: 1px solid #bbf7d0; }
        #stt-status.t-error      { background: #fef2f2; color: #b91c1c; border: 1px solid #fecaca; }
        #stt-status.t-info       { background: #eff6ff; color: #1d4ed8; border: 1px solid #bfdbfe; }

        /* ---------- Sprachmenü ---------- */
        #stt-lang-menu {
            position: fixed;
            bottom: ${90 + BUTTON_SIZE + 10}px;
            right: 24px;
            background: #1e1e2e;
            border: 1px solid #444;
            border-radius: 12px;
            z-index: 2147483647;
            overflow: hidden;
            display: none;
            box-shadow: 0 8px 30px rgba(0,0,0,0.5);
        }
        #stt-lang-menu.open { display: block; }
        .stt-lang-opt {
            padding: 11px 22px;
            color: #e2e8f0;
            cursor: pointer;
            font: 14px/1.3 -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif;
            border-bottom: 1px solid #333;
            transition: background 0.12s;
        }
        .stt-lang-opt:last-child { border-bottom: none; }
        .stt-lang-opt:hover { background: #334155; }
        .stt-lang-opt.active { background: #2563eb; color: #fff; }

        /* ---------- Drag-Handle ---------- */
        #stt-btn.dragging { opacity: 0.7; transition: none; }

        /* ---------- Mobil ---------- */
        @media (max-width: 768px) {
            #stt-btn { width: 46px; height: 46px; bottom: 80px; right: 16px; }
            #stt-status { bottom: ${80 + 46 + 8}px; right: 16px; font-size: 12px; }
            #stt-lang-menu { bottom: ${80 + 46 + 8}px; right: 16px; }
        }
    `);

    // ============================================================
    //  UI ERSTELLEN
    // ============================================================
    function createUI() {
        // Button
        micBtn = document.createElement('button');
        micBtn.id = 'stt-btn';
        micBtn.setAttribute('data-state', 'IDLE');
        micBtn.title = 'Spracheingabe (Rechtsklick = Sprache wählen)';
        micBtn.innerHTML = ICON.mic;
        document.body.appendChild(micBtn);

        // Status
        statusEl = document.createElement('div');
        statusEl.id = 'stt-status';
        document.body.appendChild(statusEl);

        // Sprachmenü
        langMenu = document.createElement('div');
        langMenu.id = 'stt-lang-menu';
        LANGUAGES.forEach((l) => {
            const opt = document.createElement('div');
            opt.className = 'stt-lang-opt' + (l.code === currentLang ? ' active' : '');
            opt.textContent = l.label;
            opt.dataset.code = l.code;
            opt.addEventListener('click', () => selectLanguage(l.code));
            langMenu.appendChild(opt);
        });
        document.body.appendChild(langMenu);

        // Gespeicherte Position wiederherstellen
        const pos = store.get('btnPos', null);
        if (pos) {
            micBtn.style.bottom = pos.bottom;
            micBtn.style.right = pos.right;
            statusEl.style.bottom = (parseInt(pos.bottom) + BUTTON_SIZE + 10) + 'px';
            statusEl.style.right = pos.right;
            langMenu.style.bottom = (parseInt(pos.bottom) + BUTTON_SIZE + 10) + 'px';
            langMenu.style.right = pos.right;
        }

        // Verhindert, dass der Button den Fokus vom Eingabefeld klaut
        micBtn.addEventListener('mousedown', (e) => {
            e.preventDefault();
        });

        // Events
        micBtn.addEventListener('click', onBtnClick);
        micBtn.addEventListener('contextmenu', onBtnContext);
        document.addEventListener('click', (e) => {
            if (!langMenu.contains(e.target) && e.target !== micBtn) {
                langMenu.classList.remove('open');
            }
        });

        // Drag & Drop
        setupDrag();

        // Tastenkürzel: Strg+Shift+M
        document.addEventListener('keydown', (e) => {
            if (e.ctrlKey && e.shiftKey && e.code === 'KeyM') {
                e.preventDefault();
                onBtnClick(e);
            }
        });
    }

    // ============================================================
    //  DRAG & DROP (Button verschiebbar)
    // ============================================================
    function setupDrag() {
        let isDragging = false;
        let startX, startY, startRight, startBottom;

        function onDown(e) {
            const touch = e.touches ? e.touches[0] : e;
            startX = touch.clientX;
            startY = touch.clientY;
            startRight = parseInt(getComputedStyle(micBtn).right);
            startBottom = parseInt(getComputedStyle(micBtn).bottom);
            isDragging = false;

            const onMove = (ev) => {
                const t = ev.touches ? ev.touches[0] : ev;
                const dx = t.clientX - startX;
                const dy = t.clientY - startY;
                if (!isDragging && Math.abs(dx) + Math.abs(dy) < 8) return;
                isDragging = true;
                ev.preventDefault();
                micBtn.classList.add('dragging');
                const newRight = Math.max(8, startRight - dx);
                const newBottom = Math.max(8, startBottom - dy);
                micBtn.style.right = newRight + 'px';
                micBtn.style.bottom = newBottom + 'px';
                statusEl.style.right = newRight + 'px';
                statusEl.style.bottom = (newBottom + BUTTON_SIZE + 10) + 'px';
                langMenu.style.right = newRight + 'px';
                langMenu.style.bottom = (newBottom + BUTTON_SIZE + 10) + 'px';
            };

            const onUp = () => {
                document.removeEventListener('mousemove', onMove);
                document.removeEventListener('mouseup', onUp);
                document.removeEventListener('touchmove', onMove);
                document.removeEventListener('touchend', onUp);
                micBtn.classList.remove('dragging');
                if (isDragging) {
                    store.set('btnPos', { bottom: micBtn.style.bottom, right: micBtn.style.right });
                }
            };

            document.addEventListener('mousemove', onMove, { passive: false });
            document.addEventListener('mouseup', onUp);
            document.addEventListener('touchmove', onMove, { passive: false });
            document.addEventListener('touchend', onUp);
        }

        micBtn.addEventListener('mousedown', onDown);
        micBtn.addEventListener('touchstart', onDown, { passive: true });
    }

    // ============================================================
    //  STATUS-ANZEIGE
    // ============================================================
    let statusTimer = null;

    function showStatus(text, type, duration) {
        if (!statusEl) return;
        clearTimeout(statusTimer);
        statusEl.textContent = text;
        statusEl.className = 'visible t-' + type;
        if (duration && duration > 0) {
            statusTimer = setTimeout(() => { statusEl.classList.remove('visible'); }, duration);
        }
    }

    function hideStatus() {
        if (statusEl) { clearTimeout(statusTimer); statusEl.classList.remove('visible'); }
    }

    // ============================================================
    //  SPRACHAUSWAHL
    // ============================================================
    function selectLanguage(code) {
        currentLang = code;
        store.set('language', code);
        langMenu.querySelectorAll('.stt-lang-opt').forEach((el) => {
            el.classList.toggle('active', el.dataset.code === code);
        });
        langMenu.classList.remove('open');
        const name = LANGUAGES.find((l) => l.code === code)?.label || code;
        showStatus('Sprache: ' + name, 'info', 2500);
    }

    // ============================================================
    //  ZUSTANDSWECHSEL
    // ============================================================
    function setState(s) {
        currentState = s;
        if (!micBtn) return;
        micBtn.setAttribute('data-state', s);
        switch (s) {
            case 'IDLE':
                micBtn.innerHTML = ICON.mic;
                micBtn.title = 'Spracheingabe starten (Rechtsklick = Sprache)';
                break;
            case 'RECORDING':
                micBtn.innerHTML = ICON.stop;
                micBtn.title = 'Aufnahme stoppen und Text einfügen';
                break;
            case 'CORRECTABLE':
                micBtn.innerHTML = ICON.correct;
                micBtn.title = 'Text jetzt korrigieren (Rechtschreibung/Grammatik)';
                break;
            case 'PROCESSING':
                micBtn.innerHTML = ICON.spinner;
                micBtn.title = 'Korrektur läuft …';
                break;
        }
    }

    // ============================================================
    //  EINGABEFELD FINDEN & TEXT LESEN/SCHREIBEN
    // ============================================================

    /**
     * Prüft, ob ein Element ein beschreibbares Eingabefeld ist.
     */
    function isEditableElement(el) {
        if (!el || el.nodeType !== 1) return false;
        // Unser eigener Button/UI ignorieren
        if (el.id === 'stt-btn' || el.id === 'stt-status' || el.id === 'stt-lang-menu') return false;
        if (el.closest('#stt-btn, #stt-status, #stt-lang-menu')) return false;
        // Contenteditable
        if (el.isContentEditable) return true;
        // Textarea
        if (el.tagName === 'TEXTAREA') return true;
        // Input (text-artig)
        if (el.tagName === 'INPUT') {
            const t = (el.type || 'text').toLowerCase();
            return ['text', 'search', 'url', 'email', 'tel', 'number'].includes(t);
        }
        return false;
    }

    /**
     * Prüft, ob ein Element sichtbar und interagierbar ist.
     */
    function isVisibleAndUsable(el) {
        if (!el) return false;
        if (!el.isConnected) return false;
        if (el.offsetParent === null && getComputedStyle(el).position !== 'fixed') return false;
        const rect = el.getBoundingClientRect();
        if (rect.width < 10 || rect.height < 10) return false;
        return true;
    }

    /**
     * Focus-Tracking: Merkt sich das zuletzt angeklickte/fokussierte Eingabefeld.
     */
    function setupFocusTracking() {
        // focusin bubbelt (im Gegensatz zu focus)
        document.addEventListener('focusin', (e) => {
            const el = e.target;
            if (isEditableElement(el)) {
                lastFocusedInput = el;
            }
        }, true);

        // Zusätzlich: Klick-Tracking für Fälle, in denen focusin nicht feuert
        document.addEventListener('mousedown', (e) => {
            const el = e.target;
            // Auch Parent-Elemente prüfen (z.B. Klick in ein Kind eines contenteditable)
            const editable = el.isContentEditable
                ? (el.closest('[contenteditable="true"]') || el)
                : el;
            if (isEditableElement(editable)) {
                lastFocusedInput = editable;
            }
        }, true);
    }

    /**
     * Findet das aktive Eingabefeld.
     * Priorität:
     *   1. Zuletzt vom Nutzer fokussiertes/angeklicktes Feld (lastFocusedInput)
     *   2. document.activeElement, falls editierbar
     *   3. Fallback: erstes sichtbares Eingabefeld per Selektor
     */
    function findInput() {
        // 1. Vom Nutzer zuletzt angeklicktes Feld
        if (lastFocusedInput && isVisibleAndUsable(lastFocusedInput) && isEditableElement(lastFocusedInput)) {
            return lastFocusedInput;
        }

        // 2. Aktuell fokussiertes Element
        const active = document.activeElement;
        if (active && isEditableElement(active) && isVisibleAndUsable(active)) {
            lastFocusedInput = active;
            return active;
        }

        // 2b. Bei Shadow-DOM oder iframes: activeElement könnte ein Container sein
        if (active && active.shadowRoot) {
            const shadowActive = active.shadowRoot.activeElement;
            if (shadowActive && isEditableElement(shadowActive)) {
                lastFocusedInput = shadowActive;
                return shadowActive;
            }
        }

        // 3. Fallback: Selektoren durchgehen
        for (const sel of INPUT_SELECTORS) {
            const els = document.querySelectorAll(sel);
            for (const el of els) {
                if (isVisibleAndUsable(el)) {
                    return el;
                }
            }
        }

        return null;
    }

    function readText(el) {
        if (!el) return '';
        if (el.tagName === 'TEXTAREA' || el.tagName === 'INPUT') return el.value || '';
        return el.innerText || el.textContent || '';
    }

    /**
     * Text in ein React-/ProseMirror-Eingabefeld schreiben.
     * @param {HTMLElement} el - Ziel-Element
     * @param {string} text - Neuer Text
     * @param {boolean} replace - true = alles ersetzen, false = anhängen
     * @returns {boolean} Erfolg
     */
    function writeText(el, text, replace) {
        if (!el) return false;
        el.focus();

        // ── Contenteditable / ProseMirror ──
        if (el.isContentEditable) {
            return writeContentEditable(el, text, replace);
        }

        // ── Textarea ──
        if (el.tagName === 'TEXTAREA') {
            return writeTextarea(el, text, replace);
        }

        // ── Input ──
        if (el.tagName === 'INPUT') {
            return writeInputField(el, text, replace);
        }

        return false;
    }

    function writeContentEditable(el, text, replace) {
        el.focus();
        const sel = window.getSelection();
        const range = document.createRange();

        if (replace) {
            // Alles auswählen
            range.selectNodeContents(el);
            sel.removeAllRanges();
            sel.addRange(range);
        } else {
            // Cursor ans Ende setzen
            range.selectNodeContents(el);
            range.collapse(false);
            sel.removeAllRanges();
            sel.addRange(range);
        }

        // Methode 1: execCommand (funktioniert mit ProseMirror)
        let ok = false;
        try {
            ok = document.execCommand('insertText', false, text);
        } catch { /* ignore */ }

        if (!ok) {
            // Methode 2: Clipboard-Paste simulieren
            try {
                const dt = new DataTransfer();
                dt.setData('text/plain', text);
                const pe = new ClipboardEvent('paste', { clipboardData: dt, bubbles: true, cancelable: true });
                el.dispatchEvent(pe);
                ok = true;
            } catch { /* ignore */ }
        }

        if (!ok) {
            // Methode 3: DOM direkt setzen (letzter Ausweg)
            if (replace) {
                el.textContent = text;
            } else {
                el.textContent += text;
            }
        }

        // Events auslösen damit React/Frameworks den Wert erkennen
        el.dispatchEvent(new Event('input', { bubbles: true }));
        el.dispatchEvent(new Event('change', { bubbles: true }));
        return true;
    }

    function writeTextarea(el, text, replace) {
        el.focus();
        const proto = Object.getOwnPropertyDescriptor(HTMLTextAreaElement.prototype, 'value');

        if (proto && proto.set) {
            if (replace) {
                proto.set.call(el, text);
            } else {
                const cur = el.value;
                const pos = el.selectionEnd ?? cur.length;
                const sep = cur.length > 0 && !cur.endsWith(' ') && !text.startsWith(' ') ? ' ' : '';
                proto.set.call(el, cur.substring(0, pos) + sep + text + cur.substring(pos));
                el.selectionStart = el.selectionEnd = pos + sep.length + text.length;
            }
        } else {
            el.value = replace ? text : el.value + ' ' + text;
        }

        // React benötigt diese Events
        el.dispatchEvent(new Event('input', { bubbles: true }));
        el.dispatchEvent(new Event('change', { bubbles: true }));

        // Zusätzlicher React 16/17/18-Trick
        const tracker = el._valueTracker;
        if (tracker) { tracker.setValue(''); }
        el.dispatchEvent(new Event('input', { bubbles: true }));

        return true;
    }

    function writeInputField(el, text, replace) {
        el.focus();
        const proto = Object.getOwnPropertyDescriptor(HTMLInputElement.prototype, 'value');

        if (proto && proto.set) {
            proto.set.call(el, replace ? text : el.value + ' ' + text);
        } else {
            el.value = replace ? text : el.value + ' ' + text;
        }

        el.dispatchEvent(new Event('input', { bubbles: true }));
        el.dispatchEvent(new Event('change', { bubbles: true }));
        return true;
    }

    // ============================================================
    //  SPRACHERKENNUNG (Web Speech API)
    // ============================================================
    function createRecognition() {
        const SR = window.SpeechRecognition || window.webkitSpeechRecognition;
        if (!SR) {
            showStatus('Spracherkennung nicht verfügbar!', 'error', 5000);
            return null;
        }

        const rec = new SR();
        rec.lang = currentLang;
        rec.continuous = true;
        rec.interimResults = true;
        rec.maxAlternatives = 1;

        rec.onresult = (ev) => {
            let interim = '';
            for (let i = ev.resultIndex; i < ev.results.length; i++) {
                const t = ev.results[i][0].transcript;
                if (ev.results[i].isFinal) {
                    finalTranscript += (finalTranscript ? ' ' : '') + t;
                } else {
                    interim += t;
                }
            }
            interimTranscript = interim;

            // Live-Vorschau im Eingabefeld
            const preview = (textBeforeRecording ? textBeforeRecording + ' ' : '') +
                finalTranscript +
                (interimTranscript ? ' ' + interimTranscript : '');
            const el = findInput();
            if (el) writeText(el, preview.trim(), true);

            // Kurztext im Status
            const display = (finalTranscript + ' ' + interimTranscript).trim();
            showStatus(display.length > 60 ? '…' + display.slice(-60) : display, 'recording', 0);
        };

        rec.onerror = (ev) => {
            if (ev.error === 'no-speech') {
                showStatus('Keine Sprache erkannt – bitte sprechen.', 'info', 3000);
                return;
            }
            if (ev.error === 'aborted') return;
            if (ev.error === 'not-allowed') {
                showStatus('Mikrofon-Zugriff verweigert! Bitte Berechtigung erteilen.', 'error', 6000);
                setState('IDLE');
                return;
            }
            showStatus('Fehler: ' + ev.error, 'error', 4000);
        };

        rec.onend = () => {
            // Auto-Neustart bei laufender Aufnahme (wird auf Android/mobil oft beendet)
            if (currentState === 'RECORDING') {
                try {
                    rec.lang = currentLang;
                    rec.start();
                } catch {
                    stopAndInsert();
                }
            }
        };

        return rec;
    }

    // ============================================================
    //  TEXTKORREKTUR (LanguageTool API)
    // ============================================================
    function basicCleanup(text) {
        // Mehrfach-Leerzeichen normalisieren
        text = text.replace(/\s+/g, ' ').trim();
        // Erster Buchstabe groß
        if (text.length > 0) text = text[0].toUpperCase() + text.slice(1);
        // Nach Satzzeichen großschreiben
        text = text.replace(/([.!?])\s+([a-zäöüß])/gi, (_, p, c) => p + ' ' + c.toUpperCase());
        // Punkt am Ende wenn kein Satzzeichen
        if (text.length > 2 && !/[.!?:;,\-–]$/.test(text)) text += '.';
        return text;
    }

    function applyMatches(text, matches) {
        if (!matches || matches.length === 0) return text;
        // Rückwärts anwenden damit Offsets stimmen
        const sorted = [...matches]
            .filter((m) => m.replacements && m.replacements.length > 0)
            .sort((a, b) => b.offset - a.offset);
        let out = text;
        for (const m of sorted) {
            out = out.substring(0, m.offset) + m.replacements[0].value + out.substring(m.offset + m.length);
        }
        return out;
    }

    async function correctViaAPI(text) {
        const ltLang = LANGUAGES.find((l) => l.code === currentLang)?.lt || 'auto';
        const cleaned = basicCleanup(text);
        try {
            const body = 'text=' + encodeURIComponent(cleaned) + '&language=' + encodeURIComponent(ltLang) + '&enabledOnly=false';
            const raw = await ltRequest(body);
            const json = JSON.parse(raw);
            return applyMatches(cleaned, json.matches);
        } catch (e) {
            console.warn('[STT] LanguageTool-Fehler:', e);
            return cleaned; // Fallback: nur Basic-Cleanup
        }
    }

    // ============================================================
    //  AUFNAHME-STEUERUNG
    // ============================================================
    function startRecording() {
        const el = findInput();
        if (!el) {
            showStatus('Bitte zuerst in ein Eingabefeld klicken!', 'error', 4000);
            return;
        }

        textBeforeRecording = readText(el).trim();
        finalTranscript = '';
        interimTranscript = '';

        recognition = createRecognition();
        if (!recognition) return;

        try {
            recognition.start();
            setState('RECORDING');
            showStatus('Aufnahme läuft … Sprich jetzt.', 'recording', 0);
        } catch (e) {
            showStatus('Fehler: ' + e.message, 'error', 4000);
        }
    }

    async function stopAndInsert() {
        // Aufnahme beenden
        if (recognition) {
            try { recognition.onend = null; recognition.stop(); } catch { /* ok */ }
            recognition = null;
        }

        const raw = finalTranscript.trim();
        if (!raw) {
            showStatus('Kein Text erkannt.', 'info', 3000);
            setState('IDLE');
            return;
        }

        // Rohtext einfügen (sofort sichtbar)
        const el = findInput();
        const fullRaw = (textBeforeRecording ? textBeforeRecording + ' ' : '') + raw;
        if (el) writeText(el, fullRaw.trim(), true);

        showStatus('Text eingefügt. Klicke erneut zum Korrigieren.', 'success', 4000);

        // In CORRECTABLE-Modus wechseln
        setState('CORRECTABLE');
        clearTimeout(correctableTimer);
        correctableTimer = setTimeout(() => {
            if (currentState === 'CORRECTABLE') {
                setState('IDLE');
                hideStatus();
            }
        }, CORRECTABLE_WINDOW);
    }

    async function correctExistingText() {
        clearTimeout(correctableTimer);
        setState('PROCESSING');
        showStatus('Rechtschreibkorrektur läuft …', 'processing', 0);

        const el = findInput();
        if (!el) {
            showStatus('Bitte zuerst in ein Eingabefeld klicken!', 'error', 4000);
            setState('IDLE');
            return;
        }

        const currentText = readText(el).trim();
        if (!currentText) {
            showStatus('Kein Text zum Korrigieren.', 'info', 3000);
            setState('IDLE');
            return;
        }

        try {
            const corrected = await correctViaAPI(currentText);

            // Eingabefeld fokussieren und kurz warten
            el.focus();
            await sleep(120);

            const ok = writeText(el, corrected, true);

            if (ok) {
                if (corrected !== currentText) {
                    showStatus('Korrektur angewendet!', 'success', 3000);
                } else {
                    showStatus('Keine Fehler gefunden.', 'success', 3000);
                }
            } else {
                // Fallback: Zwischenablage
                try {
                    await navigator.clipboard.writeText(corrected);
                    showStatus('Text in Zwischenablage kopiert (Einfügen mit Strg+V).', 'info', 5000);
                } catch {
                    showStatus('Fehler beim Einfügen.', 'error', 4000);
                }
            }
        } catch (e) {
            showStatus('Korrekturfehler: ' + e.message, 'error', 4000);
        }

        setState('IDLE');
    }

    function sleep(ms) { return new Promise((r) => setTimeout(r, ms)); }

    // ============================================================
    //  EVENT-HANDLER
    // ============================================================
    function onBtnClick(e) {
        e.preventDefault();
        e.stopPropagation();

        // Drag-Klick ignorieren
        if (micBtn.classList.contains('dragging')) return;

        // Debounce
        const now = Date.now();
        if (now - lastClickTime < DEBOUNCE_MS) return;
        lastClickTime = now;

        switch (currentState) {
            case 'IDLE':
                startRecording();
                break;
            case 'RECORDING':
                stopAndInsert();
                break;
            case 'CORRECTABLE':
                correctExistingText();
                break;
            case 'PROCESSING':
                // Nichts tun
                break;
        }
    }

    function onBtnContext(e) {
        e.preventDefault();
        e.stopPropagation();
        langMenu.classList.toggle('open');
    }

    // ============================================================
    //  INITIALISIERUNG
    // ============================================================
    function init() {
        // Focus-Tracking sofort starten (auch bevor UI gerendert ist)
        setupFocusTracking();

        // Kurz warten, damit die Seite fertig gerendert ist (SPA)
        const delay = document.readyState === 'complete' ? 800 : 2000;
        setTimeout(() => {
            createUI();
            setState('IDLE');
            console.log('[STT] Claude Code Spracheingabe initialisiert (v1.1.0)');
        }, delay);
    }

    init();
})();
