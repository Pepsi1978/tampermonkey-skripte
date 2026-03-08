' watcher.vbs — Ueberwacht TerminalVoiceOverlay und startet es bei Bedarf neu
' Laeuft unsichtbar im Hintergrund (kein Console-Fenster)

Set WshShell = CreateObject("WScript.Shell")
Set fso = CreateObject("Scripting.FileSystemObject")

' Pfad zur .exe (im selben Ordner wie dieses Script)
scriptDir = fso.GetParentFolderName(WScript.ScriptFullName)
exePath = fso.BuildPath(scriptDir, "publish\TerminalVoiceOverlay.exe")

' Pruefen ob .exe existiert
If Not fso.FileExists(exePath) Then
    MsgBox "TerminalVoiceOverlay.exe nicht gefunden:" & vbCrLf & exePath, vbCritical, "Watcher Fehler"
    WScript.Quit 1
End If

' Endlosschleife: pruefen ob Prozess laeuft, sonst starten
Do While True
    If Not IsProcessRunning("TerminalVoiceOverlay.exe") Then
        ' Starten (0 = versteckt, False = nicht warten)
        WshShell.Run """" & exePath & """", 0, False
        WScript.Sleep 5000  ' 5 Sekunden warten nach Start
    End If
    WScript.Sleep 3000  ' Alle 3 Sekunden pruefen
Loop

Function IsProcessRunning(processName)
    IsProcessRunning = False
    Set objWMI = GetObject("winmgmts:\\.\root\cimv2")
    Set colProcesses = objWMI.ExecQuery("SELECT Name FROM Win32_Process WHERE Name='" & processName & "'")
    If colProcesses.Count > 0 Then
        IsProcessRunning = True
    End If
End Function
