package com.facebook.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class g0 {
    public static final g0 a;
    public static final g0 b;
    public static final g0 c;
    public static final g0 d;
    public static final /* synthetic */ g0[] e;

    static {
        g0 g0Var = new g0("NOT_LOADED", 0);
        a = g0Var;
        g0 g0Var2 = new g0("LOADING", 1);
        b = g0Var2;
        g0 g0Var3 = new g0("SUCCESS", 2);
        c = g0Var3;
        g0 g0Var4 = new g0("ERROR", 3);
        d = g0Var4;
        e = new g0[]{g0Var, g0Var2, g0Var3, g0Var4};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) e.clone();
    }
}
