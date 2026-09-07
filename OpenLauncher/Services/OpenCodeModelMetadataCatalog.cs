namespace OpenLauncher.Services;

public sealed record OpenCodeModelMetadata(string OpenRouterSlug, int ContextLength);

public static class OpenCodeModelMetadataCatalog
{
    private static readonly Dictionary<string, OpenCodeModelMetadata> ByProviderAndSlug = new(StringComparer.OrdinalIgnoreCase)
    {
        [Key("opencode", "gpt-5-nano")] = new("openai/gpt-5-nano", 400_000),
        [Key("opencode", "deepseek-v4-flash-free")] = new("deepseek/deepseek-v4-flash", 1_048_576),
        [Key("opencode", "mimo-v2.5-free")] = new("xiaomi/mimo-v2.5", 1_048_576),
        [Key("opencode", "nemotron-3-ultra-free")] = new("nvidia/nemotron-3-ultra-550b-a55b:free", 1_000_000),
        [Key("opencode", "north-mini-code-free")] = new("cohere/north-mini-code:free", 256_000),
    };

    public static OpenCodeModelMetadata? Find(string providerId, string slug) =>
        ByProviderAndSlug.TryGetValue(Key(providerId, slug), out var metadata) ? metadata : null;

    private static string Key(string providerId, string slug) => $"{providerId.Trim().ToLowerInvariant()}:{slug.Trim().ToLowerInvariant()}";
}
