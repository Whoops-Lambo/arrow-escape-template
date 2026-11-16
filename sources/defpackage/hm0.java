package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class hm0 {
    public static final hm0 a;
    public static final hm0 b;
    public static final hm0 c;
    public static final /* synthetic */ hm0[] d;

    static {
        hm0 hm0Var = new hm0("INT", 0);
        a = hm0Var;
        hm0 hm0Var2 = new hm0("BOOLEAN", 1);
        hm0 hm0Var3 = new hm0("BOOLEAN_ARRAY", 2);
        b = hm0Var3;
        hm0 hm0Var4 = new hm0("INT_ARRAY", 3);
        c = hm0Var4;
        d = new hm0[]{hm0Var, hm0Var2, hm0Var3, hm0Var4, new hm0("STRING", 4), new hm0("DATE", 5)};
    }

    public static hm0 valueOf(String str) {
        return (hm0) Enum.valueOf(hm0.class, str);
    }

    public static hm0[] values() {
        return (hm0[]) d.clone();
    }
}
