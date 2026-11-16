package androidx.compose.ui.window;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/window/SecureFlagPolicy;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SecureFlagPolicy {
    public static final SecureFlagPolicy a;
    public static final /* synthetic */ SecureFlagPolicy[] b;

    static {
        SecureFlagPolicy secureFlagPolicy = new SecureFlagPolicy("Inherit", 0);
        a = secureFlagPolicy;
        b = new SecureFlagPolicy[]{secureFlagPolicy, new SecureFlagPolicy("SecureOn", 1), new SecureFlagPolicy("SecureOff", 2)};
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) b.clone();
    }
}
