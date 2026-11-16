package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class pd1 {
    public static final pd1 a;
    public static final pd1 b;
    public static final pd1 c;
    public static final /* synthetic */ pd1[] d;

    static {
        pd1 pd1Var = new pd1("SYNCHRONIZED", 0);
        a = pd1Var;
        pd1 pd1Var2 = new pd1("PUBLICATION", 1);
        b = pd1Var2;
        pd1 pd1Var3 = new pd1("NONE", 2);
        c = pd1Var3;
        d = new pd1[]{pd1Var, pd1Var2, pd1Var3};
    }

    public static pd1 valueOf(String str) {
        return (pd1) Enum.valueOf(pd1.class, str);
    }

    public static pd1[] values() {
        return (pd1[]) d.clone();
    }
}
