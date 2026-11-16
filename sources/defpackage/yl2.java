package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yl2 {
    public static final yl2 a;
    public static final yl2 b;
    public static final yl2 c;
    public static final /* synthetic */ yl2[] d;

    static {
        yl2 yl2Var = new yl2("FORCE_NONE", 0);
        a = yl2Var;
        yl2 yl2Var2 = new yl2("FORCE_SQUARE", 1);
        b = yl2Var2;
        yl2 yl2Var3 = new yl2("FORCE_RECTANGLE", 2);
        c = yl2Var3;
        d = new yl2[]{yl2Var, yl2Var2, yl2Var3};
    }

    public static yl2 valueOf(String str) {
        return (yl2) Enum.valueOf(yl2.class, str);
    }

    public static yl2[] values() {
        return (yl2[]) d.clone();
    }
}
