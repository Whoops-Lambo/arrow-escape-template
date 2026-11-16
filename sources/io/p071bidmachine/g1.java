package io.p071bidmachine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class g1 {
    public static final g1 a;
    public static final g1 b;
    public static final /* synthetic */ g1[] c;

    static {
        g1 g1Var = new g1("Idle", 0);
        a = g1Var;
        g1 g1Var2 = new g1("Busy", 1);
        b = g1Var2;
        c = new g1[]{g1Var, g1Var2};
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) c.clone();
    }
}
