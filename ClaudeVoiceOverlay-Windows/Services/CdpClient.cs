using System;
using System.Net.Http;
using System.Net.WebSockets;
using System.Text;
using System.Text.Json;
using System.Threading;
using System.Threading.Tasks;

namespace ClaudeVoiceOverlay.Services
{
    /// <summary>
    /// Chrome DevTools Protocol client for reliable text injection into Electron apps.
    /// Connects via WebSocket to Chromium's debugging endpoint and uses Input.insertText
    /// which bypasses the unreliable Win32 keyboard simulation entirely.
    /// </summary>
    public sealed class CdpClient : IDisposable
    {
        private static readonly int[] ScanPorts = { 9222, 9223, 9224, 9225, 9226, 9227, 9228, 9229 };
        private static readonly HttpClient Http = new() { Timeout = TimeSpan.FromSeconds(2) };

        private ClientWebSocket? _ws;
        private int _messageId;
        private int _activePort;
        private string? _wsUrl;

        public bool IsConnected => _ws?.State == WebSocketState.Open;
        public int ActivePort => _activePort;

        /// <summary>
        /// Scans common CDP ports and connects to the first available Electron app.
        /// </summary>
        public async Task<bool> TryConnectAsync()
        {
            // If already connected, verify connection is still alive
            if (IsConnected)
            {
                try
                {
                    await SendCommandAsync("Runtime.evaluate", @"{""expression"":""1""}");
                    return true;
                }
                catch
                {
                    Disconnect();
                }
            }

            foreach (var port in ScanPorts)
            {
                try
                {
                    var json = await Http.GetStringAsync($"http://localhost:{port}/json/list");
                    using var doc = JsonDocument.Parse(json);
                    var targets = doc.RootElement;

                    // Find the first "page" target (the main app window)
                    foreach (var target in targets.EnumerateArray())
                    {
                        if (target.TryGetProperty("type", out var type) &&
                            type.GetString() == "page" &&
                            target.TryGetProperty("webSocketDebuggerUrl", out var wsUrlProp))
                        {
                            var wsUrl = wsUrlProp.GetString();
                            if (string.IsNullOrEmpty(wsUrl)) continue;

                            _ws = new ClientWebSocket();
                            await _ws.ConnectAsync(new Uri(wsUrl), CancellationToken.None);
                            _activePort = port;
                            _wsUrl = wsUrl;
                            Console.WriteLine($"CdpClient: Connected to CDP on port {port}");
                            return true;
                        }
                    }
                }
                catch
                {
                    // Port not available or not a CDP endpoint — try next
                }
            }

            Console.WriteLine("CdpClient: No CDP endpoint found on ports 9222-9229");
            return false;
        }

        /// <summary>
        /// Inserts text directly into the focused input field via CDP Input.insertText.
        /// This bypasses clipboard and keyboard simulation entirely.
        /// </summary>
        public async Task<bool> InsertTextAsync(string text)
        {
            if (!IsConnected) return false;

            try
            {
                var escapedText = JsonSerializer.Serialize(text);
                // Remove surrounding quotes since we embed it in a JSON template
                escapedText = escapedText.Substring(1, escapedText.Length - 2);

                await SendCommandAsync("Input.insertText", $@"{{""text"":""{escapedText}""}}");
                Console.WriteLine($"CdpClient: Inserted {text.Length} chars via CDP");
                return true;
            }
            catch (Exception ex)
            {
                Console.WriteLine($"CdpClient: InsertText failed: {ex.Message}");
                Disconnect();
                return false;
            }
        }

        /// <summary>
        /// Sends Enter key via CDP Input.dispatchKeyEvent.
        /// </summary>
        public async Task<bool> SendEnterAsync()
        {
            if (!IsConnected) return false;

            try
            {
                await SendCommandAsync("Input.dispatchKeyEvent", @"{""type"":""keyDown"",""key"":""Enter"",""code"":""Enter"",""windowsVirtualKeyCode"":13}");
                await SendCommandAsync("Input.dispatchKeyEvent", @"{""type"":""keyUp"",""key"":""Enter"",""code"":""Enter"",""windowsVirtualKeyCode"":13}");
                Console.WriteLine("CdpClient: Sent Enter via CDP");
                return true;
            }
            catch (Exception ex)
            {
                Console.WriteLine($"CdpClient: SendEnter failed: {ex.Message}");
                Disconnect();
                return false;
            }
        }

        /// <summary>
        /// Clears the input field by selecting all text (Ctrl+A) and deleting it via CDP.
        /// </summary>
        public async Task<bool> ClearInputAsync()
        {
            if (!IsConnected) return false;

            try
            {
                // Select all text in the focused input
                await SendCommandAsync("Input.dispatchKeyEvent",
                    @"{""type"":""keyDown"",""key"":""a"",""code"":""KeyA"",""windowsVirtualKeyCode"":65,""modifiers"":2}");
                await SendCommandAsync("Input.dispatchKeyEvent",
                    @"{""type"":""keyUp"",""key"":""a"",""code"":""KeyA"",""windowsVirtualKeyCode"":65,""modifiers"":2}");

                // Delete selected text
                await SendCommandAsync("Input.dispatchKeyEvent",
                    @"{""type"":""keyDown"",""key"":""Backspace"",""code"":""Backspace"",""windowsVirtualKeyCode"":8}");
                await SendCommandAsync("Input.dispatchKeyEvent",
                    @"{""type"":""keyUp"",""key"":""Backspace"",""code"":""Backspace"",""windowsVirtualKeyCode"":8}");

                Console.WriteLine("CdpClient: Cleared input via CDP");
                return true;
            }
            catch (Exception ex)
            {
                Console.WriteLine($"CdpClient: ClearInput failed: {ex.Message}");
                Disconnect();
                return false;
            }
        }

        private async Task SendCommandAsync(string method, string paramsJson)
        {
            if (_ws == null || _ws.State != WebSocketState.Open)
                throw new InvalidOperationException("WebSocket not connected");

            var id = Interlocked.Increment(ref _messageId);
            var message = $@"{{""id"":{id},""method"":""{method}"",""params"":{paramsJson}}}";
            var bytes = Encoding.UTF8.GetBytes(message);

            await _ws.SendAsync(bytes, WebSocketMessageType.Text, true, CancellationToken.None);

            // Read response (we don't need to parse it, just drain it)
            var buffer = new byte[4096];
            var cts = new CancellationTokenSource(TimeSpan.FromSeconds(5));
            await _ws.ReceiveAsync(buffer, cts.Token);
        }

        private void Disconnect()
        {
            try
            {
                _ws?.CloseAsync(WebSocketCloseStatus.NormalClosure, "done", CancellationToken.None)
                    .GetAwaiter().GetResult();
            }
            catch { /* ignore */ }

            _ws?.Dispose();
            _ws = null;
            _activePort = 0;
            _wsUrl = null;
        }

        public void Dispose()
        {
            Disconnect();
        }
    }
}
