package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class he2 {
    public static final he2 a;
    public static final he2 b;
    public static final he2 c;
    public static final he2 d;
    public static final /* synthetic */ he2[] e;

    static {
        he2 he2Var = new he2("AUTOMATIC", 0);
        a = he2Var;
        he2 he2Var2 = new he2("NATIVE", 1);
        b = he2Var2;
        he2 he2Var3 = new he2("WEB", 2);
        c = he2Var3;
        he2 he2Var4 = new he2("FEED", 3);
        d = he2Var4;
        e = new he2[]{he2Var, he2Var2, he2Var3, he2Var4};
    }

    public static he2 valueOf(String str) {
        return (he2) Enum.valueOf(he2.class, str);
    }

    public static he2[] values() {
        return (he2[]) e.clone();
    }
}
