package com.facebook;

import com.ironsource.C4887nc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class o0 {
    public static final o0 a;
    public static final o0 b;
    public static final /* synthetic */ o0[] c;

    static {
        o0 o0Var = new o0(C4887nc.a, 0);
        a = o0Var;
        o0 o0Var2 = new o0("POST", 1);
        b = o0Var2;
        c = new o0[]{o0Var, o0Var2, new o0("DELETE", 2)};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) c.clone();
    }
}
