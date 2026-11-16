package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class dx1 {
    public static final dx1 a;
    public static final dx1 b;
    public static final dx1 c;
    public static final dx1 d;
    public static final /* synthetic */ dx1[] e;

    static {
        dx1 dx1Var = new dx1("ACCEPT_ALL", 0);
        a = dx1Var;
        dx1 dx1Var2 = new dx1("DENY_ALL", 1);
        b = dx1Var2;
        dx1 dx1Var3 = new dx1("GRANULAR", 2);
        c = dx1Var3;
        dx1 dx1Var4 = new dx1("NO_INTERACTION", 3);
        d = dx1Var4;
        e = new dx1[]{dx1Var, dx1Var2, dx1Var3, dx1Var4};
    }

    public static dx1 valueOf(String str) {
        return (dx1) Enum.valueOf(dx1.class, str);
    }

    public static dx1[] values() {
        return (dx1[]) e.clone();
    }
}
