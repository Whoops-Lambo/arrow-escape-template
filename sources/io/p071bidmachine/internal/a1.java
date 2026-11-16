package io.p071bidmachine.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 {
    public static final a1 a;
    public static final a1 b;
    public static final a1 c;
    public static final /* synthetic */ a1[] d;

    static {
        a1 a1Var = new a1("SUPPRESS", 0);
        a = a1Var;
        a1 a1Var2 = new a1("MASK", 1);
        b = a1Var2;
        a1 a1Var3 = new a1("PASS", 2);
        c = a1Var3;
        d = new a1[]{a1Var, a1Var2, a1Var3};
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) d.clone();
    }
}
