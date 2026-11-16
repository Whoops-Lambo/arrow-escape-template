package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class cw1 {
    public static final cw1 a;
    public static final cw1 b;
    public static final cw1 c;
    public static final cw1 d;
    public static final cw1 e;
    public static final /* synthetic */ cw1[] f;

    static {
        cw1 cw1Var = new cw1("ACCEPT_ALL", 0);
        a = cw1Var;
        cw1 cw1Var2 = new cw1("DENY_ALL", 1);
        b = cw1Var2;
        cw1 cw1Var3 = new cw1("OK", 2);
        c = cw1Var3;
        cw1 cw1Var4 = new cw1("SAVE_SETTINGS", 3);
        d = cw1Var4;
        cw1 cw1Var5 = new cw1("MANAGE_SETTINGS", 4);
        e = cw1Var5;
        f = new cw1[]{cw1Var, cw1Var2, cw1Var3, cw1Var4, cw1Var5};
    }

    public static cw1 valueOf(String str) {
        return (cw1) Enum.valueOf(cw1.class, str);
    }

    public static cw1[] values() {
        return (cw1[]) f.clone();
    }
}
