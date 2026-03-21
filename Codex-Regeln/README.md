# Codex-Regeln

Diese Datei enthaelt die aktuell gueltigen Arbeitsregeln fuer Codex und dient als synchronisierbare Referenz im Haupt-Repo.

## Zugriffsmodus

- Codex soll in Terminal-Sessions immer Full Access verwenden.
- Bevorzugte Einstellungen sind `sandbox_mode = "danger-full-access"` und `approval_policy = "never"`.
- Codex soll nicht ohne ausdruecklichen Nutzerwunsch in einen restriktiveren Modus wechseln.
- Falls externe Systemrichtlinien oder Session-Vorgaben den Zugriff einschraenken, muss Codex das klar benennen statt Full Access einfach anzunehmen.

## Erlaubtes Arbeitsverzeichnis

- Codex darf nur in `C:\Users\barwa\Codex` arbeiten, ausser der Nutzer aendert das ausdruecklich.
- Andere lokale Kopien desselben Repos in anderen Verzeichnissen sind fuer Codex tabu.

## Verbotenes Verzeichnis

- Codex darf niemals in `C:\Users\barwa\proggs` arbeiten.
- `C:\Users\barwa\proggs` ist ausschliesslich fuer Cloud Code reserviert und darf von Codex nie geoeffnet, als `workdir` verwendet, bearbeitet oder anderweitig angebunden werden.
- Wenn gleiche oder aehnliche Dateien in beiden Verzeichnissen existieren, muss Codex immer `C:\Users\barwa\Codex` verwenden und niemals `C:\Users\barwa\proggs`.

## Bevorzugter Workflow

- Cloud-Code-Arbeit passiert zuerst in `C:\Users\barwa\proggs`.
- Danach werden die Aenderungen von dort nach GitHub hochgeladen.
- Erst dann soll Codex den neuesten Stand des Repos nach `C:\Users\barwa\Codex` holen und dort weiterarbeiten.
- `C:\Users\barwa\proggs` ist der geschuetzte Backup-/Quell-Workspace und darf von Codex auch dann nicht veraendert werden, wenn in `C:\Users\barwa\Codex` etwas kaputtgeht.

## Git-Regeln fuer Codex

- Nach abgeschlossenen Aufgaben in `C:\Users\barwa\Codex` soll Codex normalerweise ohne weitere Rueckfrage einen lokalen Git-Commit fuer die erledigten Aufgaben erstellen.
- Lokale Commits duerfen nur in `C:\Users\barwa\Codex` erfolgen.
- Lokale Commits sollen nur die aufgabenrelevanten Codex-Aenderungen enthalten, nicht fremde oder bereits vorhandene, nicht zur Aufgabe gehoerende Aenderungen, ausser der Nutzer verlangt das ausdruecklich.
- Codex darf lokal committen, aber niemals automatisch zu GitHub pushen.
- `git push` darf nur dann ausgefuehrt werden, wenn der Nutzer Codex ausdruecklich dazu auffordert.
- Vor einem moeglichen Push soll Codex Aenderungen bevorzugt lokal in `C:\Users\barwa\Codex` validieren.

## Antwort-Regel nach Commits

- Immer wenn Codex einen lokalen Git-Commit erstellt, muss die letzte Zeile der Chat-Antwort ausdruecklich sagen, dass committed wurde, zum Beispiel `Aenderungen committed.` oder `Alles committed.`
