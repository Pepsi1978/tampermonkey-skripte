# Voice-Overlays: Windows-Performance

Stand: 07.09.2026, 12:26 Uhr. TVO 1.11.5, CVO 2.4.5.

## Ausgangspunkt

- Scope: Aufnahmeende bis Einfügen sowie allgemeine UI-Reaktion beider Windows-Overlays.
- Bestehende TVO-Logs: Beispiel 07.09., 11:21 Uhr, WAV nach 51 ms bereit, STT nach 764 ms abgeschlossen, Strg+V ungefähr nach 996 ms gesendet, kompletter Turn nach 1965 ms fertig. Ein gesendetes Strg+V beweist nicht den Renderzeitpunkt im Ziel.
- Netzlaufzeit ist der größte Anteil vor dem Einfügen. Die Wartezeit nach dem Paste schützt die Zwischenablage und ist nicht identisch mit Einfügelatenz.

## Änderungen

- Groq: doppelte PCM/RMS-Auswertung durch Wiederverwendung derselben Timeline ersetzt. Auch bei Retry und curl/.NET-Fallback wiederverwenden; Chunking behält eigene Timelines.
- curl: sofortiger Upload ohne vorgeschaltete Expect-Continue-Wartephase; stdout/stderr parallel lesen. Audiodaten, Modell, Filter und Fehlerpfade bleiben erhalten.
- Gemini Live: nach dem Einsammeln des Transkripts nur Close senden, statt unbegrenzt auf die Gegenstelle zu warten. Eigene 250-ms-Abbaufrist, bei Fehler Logging und Abort. Empfangsfristen unverändert.
- PromptBoard: SQLite-Laden einschließlich Farbmigration und eigener DbContexts auf Hintergrundthread. Vollständigen Snapshot auf dem Dispatcher übernehmen. Überlappende Refresh-Anforderungen zusammenführen, bei zwischenzeitlichem Refresh neu laden statt alten Snapshot anwenden. Geschlossene Fenster übernehmen keine Ergebnisse mehr.
- Beim Öffnen sichtbarer Boards genau einen Refresh auslösen. Verstecktes Solo-Board lädt weiterhin, Hotkey-Registry wird weiterhin aktualisiert.
- Kategorie-Klicks aktualisieren vorhandene Schaltflächen statt sämtliche Tabs, Menüs und Handler neu zu erzeugen. Kategorie-CRUD und Reorder behalten den vollständigen Aufbau. Always-on-Kategorieauswahl benötigt nur einen Durchlauf über die Prompts statt Kategorie-mal-Prompt-Suche.

## Bewusst Erhalten

Fokusprüfungen, Modifier-Behandlung, Clipboard-Wiederherstellung, Auto-Enter-Schutzpausen, sofortige Draft-Persistenz, Capture-Worker-Isolation, Archiv, Korrektur, Einstellungen, Wiederholungen und alle vier Whisper-Schutzschichten. Kein Modellwechsel, keine spekulativen Doppelanfragen, kein verfrühtes Einfügen ungeprüfter Teilergebnisse.

Die untersuchten macOS-Pendants verwenden keine WPF-/SQLite-Dispatcher- oder Windows-curl-Pipeline. In diesem Auftrag wurden die Windows-Installationen geändert; macOS wurde nicht gebaut oder installiert.

## Grenzen

Keine Funktionstests oder Benchmarks im Schnellmodus. Die Verbesserungen sind aus dem Code abgeleitet, keine gemessene End-to-End-Beschleunigung. Einstellungen-Dateizugriffe und vollständiger Promptzeilen-Neuaufbau bleiben mögliche spätere Optimierungen; keine Entwurfssicherung per Debounce abschwächen. Build und Installation erfolgen über `rebuild-overlay.ps1 Both` mit dessen eingebauten Deploy-Schutzmaßnahmen.
