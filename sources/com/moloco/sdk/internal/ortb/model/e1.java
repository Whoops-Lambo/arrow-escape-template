package com.moloco.sdk.internal.ortb.model;

import defpackage.eu;
import defpackage.f93;
import defpackage.gd1;
import defpackage.pd1;
import defpackage.z92;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@z92
public final class e1 {

    @NotNull
    public static final w.a Companion;
    public static final gd1 a;
    public static final e1 b;
    public static final e1 c;
    public static final e1 d;
    public static final e1 e;
    public static final e1 f;
    public static final /* synthetic */ e1[] g;

    static {
        e1 e1Var = new e1("Start", 0);
        b = e1Var;
        e1 e1Var2 = new e1("Center", 1);
        c = e1Var2;
        e1 e1Var3 = new e1("End", 2);
        d = e1Var3;
        e1 e1Var4 = new e1("Left", 3);
        e = e1Var4;
        e1 e1Var5 = new e1("Right", 4);
        f = e1Var5;
        g = new e1[]{e1Var, e1Var2, e1Var3, e1Var4, e1Var5};
        Companion = new w.a();
        a = eu.v(pd1.b, new f93(14));
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) g.clone();
    }
}
