package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cf2 {
    public static final cf2 a;
    public static final cf2 b;
    public static final /* synthetic */ cf2[] c;

    static {
        cf2 cf2Var = new cf2("GENERAL", 0);
        a = cf2Var;
        cf2 cf2Var2 = new cf2("FALLBACK", 1);
        b = cf2Var2;
        c = new cf2[]{cf2Var, cf2Var2};
    }

    public static cf2 valueOf(String str) {
        return (cf2) Enum.valueOf(cf2.class, str);
    }

    public static cf2[] values() {
        return (cf2[]) c.clone();
    }
}
