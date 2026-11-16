package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class x72 {
    public static final x72 a;
    public static final x72 b;
    public static final /* synthetic */ x72[] c;

    static {
        x72 x72Var = new x72("LINK", 0);
        a = x72Var;
        x72 x72Var2 = new x72("BUTTON", 1);
        b = x72Var2;
        c = new x72[]{x72Var, x72Var2, new x72("MORE_LINK_BUTTON", 2)};
    }

    public static x72 valueOf(String str) {
        return (x72) Enum.valueOf(x72.class, str);
    }

    public static x72[] values() {
        return (x72[]) c.clone();
    }
}
