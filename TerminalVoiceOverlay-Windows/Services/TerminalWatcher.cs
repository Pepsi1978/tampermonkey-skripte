using System;
using System.Diagnostics;
using System.Windows;
using TerminalVoiceOverlay.NativeMethods;

namespace TerminalVoiceOverlay.Services
{
    public sealed class TerminalWatcher : IDisposable
    {
        private readonly string[] _terminalProcessNames;

        private Win32.WinEventDelegate? _winEventDelegate;
        private IntPtr _foregroundHookHandle;
        private IntPtr _minimizeHookHandle;
        private IntPtr _lastTerminalHwnd;

        public event Action<IntPtr>? TerminalActivated;
        public event Action? TerminalDeactivated;

        public IntPtr ActiveTerminalHwnd => _lastTerminalHwnd;

        public TerminalWatcher(string[]? processNames = null)
        {
            _terminalProcessNames = processNames ?? new[] { "WindowsTerminal", "pwsh", "powershell" };
        }

        public void Start()
        {
            // Must store delegate in a field to prevent GC
            _winEventDelegate = OnWinEvent;

            // Hook foreground changes
            _foregroundHookHandle = Win32.SetWinEventHook(
                Win32.EVENT_SYSTEM_FOREGROUND,
                Win32.EVENT_SYSTEM_FOREGROUND,
                IntPtr.Zero,
                _winEventDelegate,
                0, 0,
                Win32.WINEVENT_OUTOFCONTEXT | Win32.WINEVENT_SKIPOWNPROCESS);

            if (_foregroundHookHandle == IntPtr.Zero)
                Console.WriteLine("TerminalWatcher: SetWinEventHook (foreground) failed");

            // Hook minimize/restore events to detect terminal minimized/restored
            _minimizeHookHandle = Win32.SetWinEventHook(
                Win32.EVENT_SYSTEM_MINIMIZESTART,
                Win32.EVENT_SYSTEM_MINIMIZEEND,
                IntPtr.Zero,
                _winEventDelegate,
                0, 0,
                Win32.WINEVENT_OUTOFCONTEXT | Win32.WINEVENT_SKIPOWNPROCESS);

            if (_minimizeHookHandle == IntPtr.Zero)
                Console.WriteLine("TerminalWatcher: SetWinEventHook (minimize) failed");

            // Check initial state
            CheckForegroundWindow(Win32.GetForegroundWindow());
        }

        private void OnWinEvent(IntPtr hWinEventHook, uint eventType, IntPtr hwnd,
            int idObject, int idChild, uint dwEventThread, uint dwmsEventTime)
        {
            switch (eventType)
            {
                case Win32.EVENT_SYSTEM_FOREGROUND:
                    CheckForegroundWindow(hwnd);
                    break;

                case Win32.EVENT_SYSTEM_MINIMIZESTART:
                    // A window was minimized — if it's our terminal, hide the overlay
                    if (hwnd == _lastTerminalHwnd)
                    {
                        Console.WriteLine("TerminalWatcher: terminal minimized");
                        Application.Current?.Dispatcher.Invoke(() => TerminalDeactivated?.Invoke());
                    }
                    break;

                case Win32.EVENT_SYSTEM_MINIMIZEEND:
                    // A window was restored — if it's a terminal, show the overlay
                    if (IsTerminalWindow(hwnd))
                    {
                        _lastTerminalHwnd = hwnd;
                        Console.WriteLine("TerminalWatcher: terminal restored");
                        Application.Current?.Dispatcher.Invoke(() => TerminalActivated?.Invoke(hwnd));
                    }
                    break;
            }
        }

        private void CheckForegroundWindow(IntPtr hwnd)
        {
            if (hwnd == IntPtr.Zero) return;

            if (IsTerminalWindow(hwnd))
            {
                _lastTerminalHwnd = hwnd;
                Application.Current?.Dispatcher.Invoke(() => TerminalActivated?.Invoke(hwnd));
            }
            else
            {
                // KEY FIX: Only hide the overlay if the terminal window is gone or minimized.
                // If the terminal is still visible (just not foreground), keep the overlay visible.
                if (IsTerminalStillVisible())
                {
                    // Terminal is still visible on screen — keep overlay shown
                    Console.WriteLine("TerminalWatcher: foreground changed but terminal still visible — keeping overlay");
                    return;
                }

                Application.Current?.Dispatcher.Invoke(() => TerminalDeactivated?.Invoke());
            }
        }

        /// <summary>
        /// Checks if the last known terminal window is still visible and not minimized.
        /// </summary>
        private bool IsTerminalStillVisible()
        {
            if (_lastTerminalHwnd == IntPtr.Zero)
                return false;

            // Window must exist, be visible, and not be minimized
            return Win32.IsWindow(_lastTerminalHwnd)
                && Win32.IsWindowVisible(_lastTerminalHwnd)
                && !Win32.IsIconic(_lastTerminalHwnd);
        }

        private bool IsTerminalWindow(IntPtr hwnd)
        {
            Win32.GetWindowThreadProcessId(hwnd, out uint pid);
            if (pid == 0) return false;

            try
            {
                using var proc = Process.GetProcessById((int)pid);
                var name = proc.ProcessName;
                foreach (var target in _terminalProcessNames)
                {
                    if (name.Equals(target, StringComparison.OrdinalIgnoreCase))
                        return true;
                }
            }
            catch
            {
                // Process may have exited
            }

            return false;
        }

        public static Rect GetMonitorWorkArea(IntPtr hwnd)
        {
            var hMonitor = Win32.MonitorFromWindow(hwnd, Win32.MONITOR_DEFAULTTONEAREST);
            var mi = new Win32.MONITORINFO { cbSize = System.Runtime.InteropServices.Marshal.SizeOf<Win32.MONITORINFO>() };

            if (Win32.GetMonitorInfo(hMonitor, ref mi))
            {
                // Get DPI for scaling
                double dpiScale = 1.0;
                if (Win32.GetDpiForMonitor(hMonitor, 0, out uint dpiX, out _) == 0)
                {
                    dpiScale = dpiX / 96.0;
                }

                var work = mi.rcWork;
                return new Rect(
                    work.Left / dpiScale,
                    work.Top / dpiScale,
                    (work.Right - work.Left) / dpiScale,
                    (work.Bottom - work.Top) / dpiScale);
            }

            // Fallback
            return new Rect(0, 0, SystemParameters.PrimaryScreenWidth, SystemParameters.PrimaryScreenHeight);
        }

        public void Dispose()
        {
            if (_foregroundHookHandle != IntPtr.Zero)
            {
                Win32.UnhookWinEvent(_foregroundHookHandle);
                _foregroundHookHandle = IntPtr.Zero;
            }
            if (_minimizeHookHandle != IntPtr.Zero)
            {
                Win32.UnhookWinEvent(_minimizeHookHandle);
                _minimizeHookHandle = IntPtr.Zero;
            }
        }
    }
}
