from __future__ import annotations

import threading
import time
from pathlib import Path

import tkinter as tk
from tkinter import messagebox

from api_clients import improve_text_with_gemini, transcribe_with_grok
from audio_capture import AudioRecorder
from claude_window import clear_claude_input, insert_text_into_claude, is_claude_running
from config import Settings


class ClaudeOverlayApp:
    def __init__(self, settings: Settings) -> None:
        self.settings = settings
        self.settings.validate()

        self.recorder = AudioRecorder(
            sample_rate=self.settings.audio_sample_rate,
            channels=self.settings.audio_channels,
        )

        self.root = tk.Tk()
        self.root.title("Claude Overlay")
        self.root.attributes("-topmost", True)
        self.root.resizable(False, False)

        width = 180
        height = 90
        x = self.root.winfo_screenwidth() - width - 24
        y = 24
        self.root.geometry(f"{width}x{height}+{x}+{y}")

        frame = tk.Frame(self.root, padx=10, pady=10)
        frame.pack(fill="both", expand=True)

        self.mic_button = tk.Button(
            frame,
            text="Mic",
            width=8,
            command=self.toggle_recording,
            bg="#1f6feb",
            fg="white",
        )
        self.mic_button.grid(row=0, column=0, padx=(0, 8))

        self.clear_button = tk.Button(
            frame,
            text="X",
            width=4,
            command=self.clear_input,
            bg="#d73a49",
            fg="white",
        )
        self.clear_button.grid(row=0, column=1)

        self.status_var = tk.StringVar(value="Bereit")
        status_label = tk.Label(frame, textvariable=self.status_var, anchor="w")
        status_label.grid(row=1, column=0, columnspan=2, sticky="we", pady=(10, 0))

        self.root.protocol("WM_DELETE_WINDOW", self.close)
        self.root.after(1500, self.watch_claude_process)

    def set_status(self, text: str) -> None:
        self.status_var.set(text)

    def watch_claude_process(self) -> None:
        if not is_claude_running(self.settings):
            self.close()
            return
        self.root.after(1500, self.watch_claude_process)

    def toggle_recording(self) -> None:
        if not self.recorder.is_recording:
            try:
                self.recorder.start()
                self.mic_button.config(text="Stop", bg="#fb8500")
                self.set_status("Aufnahme läuft...")
            except Exception as exc:
                self.set_status("Aufnahme fehlgeschlagen")
                messagebox.showerror("Fehler", f"Aufnahme konnte nicht gestartet werden:\n{exc}")
            return

        try:
            audio_path = self.recorder.stop()
        except Exception as exc:
            self.mic_button.config(text="Mic", bg="#1f6feb")
            self.set_status("Aufnahmefehler")
            messagebox.showerror("Fehler", f"Aufnahme konnte nicht beendet werden:\n{exc}")
            return

        self.mic_button.config(text="Mic", bg="#1f6feb")
        self.set_status("Verarbeite Audio...")

        worker = threading.Thread(
            target=self.process_audio_pipeline,
            args=(audio_path,),
            daemon=True,
        )
        worker.start()

    def process_audio_pipeline(self, audio_path: Path) -> None:
        try:
            transcript = transcribe_with_grok(audio_path, self.settings)
            result = improve_text_with_gemini(transcript, self.settings)
            final_text = result["verbesserter_text"]
            insert_text_into_claude(final_text)
            self.root.after(0, lambda: self.set_status("Text eingefügt"))
        except Exception as exc:
            self.root.after(0, lambda: self.set_status("Fehler in Pipeline"))
            self.root.after(
                0,
                lambda: messagebox.showerror(
                    "Fehler",
                    f"Audio-Pipeline fehlgeschlagen:\n{exc}",
                ),
            )
        finally:
            try:
                audio_path.unlink(missing_ok=True)
            except Exception:
                pass

    def clear_input(self) -> None:
        try:
            clear_claude_input()
            self.set_status("Eingabefeld geleert")
        except Exception as exc:
            self.set_status("Löschen fehlgeschlagen")
            messagebox.showerror("Fehler", f"Eingabefeld konnte nicht geleert werden:\n{exc}")

    def close(self) -> None:
        if self.recorder.is_recording:
            try:
                self.recorder.stop()
            except Exception:
                pass
        self.root.destroy()

    def run(self) -> None:
        self.root.mainloop()


def main() -> None:
    settings = Settings.load()

    # Falls Claude nicht läuft, kurz warten und sauber beenden.
    if not is_claude_running(settings):
        time.sleep(0.8)
        return

    app = ClaudeOverlayApp(settings)
    app.run()


if __name__ == "__main__":
    main()
