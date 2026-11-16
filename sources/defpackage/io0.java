package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class io0 {
    public static final io0 a;
    public static final /* synthetic */ io0[] b;

    static {
        io0 io0Var = new io0("SHEET", 0);
        a = io0Var;
        b = new io0[]{io0Var, new io0("FULL", 1), new io0("POPUP_BOTTOM", 2), new io0("POPUP_CENTER", 3)};
    }

    public static io0 valueOf(String str) {
        return (io0) Enum.valueOf(io0.class, str);
    }

    public static io0[] values() {
        return (io0[]) b.clone();
    }
}
