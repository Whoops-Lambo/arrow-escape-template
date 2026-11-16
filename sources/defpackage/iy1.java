package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class iy1 {
    public static final iy1 a;
    public static final iy1 b;
    public static final iy1 c;
    public static final iy1 d;
    public static final iy1 e;
    public static final /* synthetic */ iy1[] f;

    static {
        iy1 iy1Var = new iy1("SECOND_LAYER", 0);
        a = iy1Var;
        iy1 iy1Var2 = new iy1("FULL", 1);
        b = iy1Var2;
        iy1 iy1Var3 = new iy1("FULL_LIGHT", 2);
        iy1 iy1Var4 = new iy1("FULL_CMP", 3);
        iy1 iy1Var5 = new iy1("SHEET", 4);
        c = iy1Var5;
        iy1 iy1Var6 = new iy1("POPUP_CENTER", 5);
        d = iy1Var6;
        iy1 iy1Var7 = new iy1("POPUP_BOTTOM", 6);
        e = iy1Var7;
        f = new iy1[]{iy1Var, iy1Var2, iy1Var3, iy1Var4, iy1Var5, iy1Var6, iy1Var7};
    }

    public static iy1 valueOf(String str) {
        return (iy1) Enum.valueOf(iy1.class, str);
    }

    public static iy1[] values() {
        return (iy1[]) f.clone();
    }
}
