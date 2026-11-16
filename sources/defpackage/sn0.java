package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sn0 {
    public static final sn0 a;
    public static final sn0 b;
    public static final sn0 c;
    public static final /* synthetic */ sn0[] d;

    static {
        sn0 sn0Var = new sn0("BAD_CONFIG", 0);
        a = sn0Var;
        sn0 sn0Var2 = new sn0("UNAVAILABLE", 1);
        b = sn0Var2;
        sn0 sn0Var3 = new sn0("TOO_MANY_REQUESTS", 2);
        c = sn0Var3;
        d = new sn0[]{sn0Var, sn0Var2, sn0Var3};
    }

    public static sn0 valueOf(String str) {
        return (sn0) Enum.valueOf(sn0.class, str);
    }

    public static sn0[] values() {
        return (sn0[]) d.clone();
    }
}
