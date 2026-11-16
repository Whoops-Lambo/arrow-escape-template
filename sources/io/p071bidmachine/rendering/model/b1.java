package io.p071bidmachine.rendering.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class b1 {
    public static final b1 a;
    public static final b1 b;
    public static final b1 c;
    public static final b1 d;
    public static final b1 e;
    public static final b1 f;
    public static final /* synthetic */ b1[] g;

    static {
        b1 b1Var = new b1("TOP_LEFT", 0);
        a = b1Var;
        b1 b1Var2 = new b1("TOP_CENTER", 1);
        b = b1Var2;
        b1 b1Var3 = new b1("TOP_RIGHT", 2);
        c = b1Var3;
        b1 b1Var4 = new b1("BOTTOM_LEFT", 3);
        d = b1Var4;
        b1 b1Var5 = new b1("BOTTOM_CENTER", 4);
        e = b1Var5;
        b1 b1Var6 = new b1("BOTTOM_RIGHT", 5);
        f = b1Var6;
        g = new b1[]{b1Var, b1Var2, b1Var3, b1Var4, b1Var5, b1Var6};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) g.clone();
    }
}
