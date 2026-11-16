package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bn0 {
    public static final bn0 a;
    public static final bn0 b;
    public static final /* synthetic */ bn0[] c;

    static {
        bn0 bn0Var = new bn0("TOP_DOWN", 0);
        a = bn0Var;
        bn0 bn0Var2 = new bn0("BOTTOM_UP", 1);
        b = bn0Var2;
        c = new bn0[]{bn0Var, bn0Var2};
    }

    public static bn0 valueOf(String str) {
        return (bn0) Enum.valueOf(bn0.class, str);
    }

    public static bn0[] values() {
        return (bn0[]) c.clone();
    }
}
