' ============================================================
' Startet Claude Desktop + Voice Overlay zusammen.
' Benutze dieses Skript (oder die Desktop-Verknüpfung)
' anstatt des normalen Claude-Icons.
' ============================================================

Set WshShell = CreateObject("WScript.Shell")
Set FSO = CreateObject("Scripting.FileSystemObject")

' Pfade
Dim ScriptDir
ScriptDir = FSO.GetParentFolderName(WScript.ScriptFullName) & "\"
Dim VenvPython
VenvPython = ScriptDir & "venv\Scripts\pythonw.exe"
Dim OverlayScript
OverlayScript = ScriptDir & "voice_overlay_windows.py"

' Claude Desktop finden (typische Installationspfade)
Dim ClaudePath
ClaudePath = ""

Dim Paths(2)
Paths(0) = WshShell.ExpandEnvironmentStrings("%LOCALAPPDATA%") & "\Programs\claude\Claude.exe"
Paths(1) = WshShell.ExpandEnvironmentStrings("%PROGRAMFILES%") & "\Claude\Claude.exe"
Paths(2) = WshShell.ExpandEnvironmentStrings("%LOCALAPPDATA%") & "\claude\Claude.exe"

Dim i
For i = 0 To UBound(Paths)
    If FSO.FileExists(Paths(i)) Then
        ClaudePath = Paths(i)
        Exit For
    End If
Next

' Claude starten
If ClaudePath <> "" Then
    WshShell.Run """" & ClaudePath & """", 1, False
Else
    ' Fallback: Versuche Claude über Start-Menü / PATH zu öffnen
    On Error Resume Next
    WshShell.Run "claude", 1, False
    If Err.Number <> 0 Then
        MsgBox "Claude Desktop nicht gefunden!" & vbCrLf & vbCrLf & _
               "Bitte installiere Claude Desktop oder passe den Pfad in start_claude.vbs an.", _
               vbExclamation, "Claude Voice Overlay"
        WScript.Quit 1
    End If
    On Error GoTo 0
End If

' Kurz warten bis Claude startet
WScript.Sleep 2000

' Voice Overlay starten (ohne sichtbares Konsolenfenster)
If FSO.FileExists(VenvPython) And FSO.FileExists(OverlayScript) Then
    WshShell.CurrentDirectory = ScriptDir
    WshShell.Run """" & VenvPython & """ """ & OverlayScript & """", 0, False
Else
    MsgBox "Voice Overlay nicht bereit!" & vbCrLf & vbCrLf & _
           "Bitte zuerst install_launcher.bat ausführen.", _
           vbExclamation, "Claude Voice Overlay"
End If
