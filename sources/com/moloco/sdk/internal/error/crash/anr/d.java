package com.moloco.sdk.internal.error.crash.anr;

import defpackage.kk2;
import defpackage.m32;
import defpackage.th1;
import defpackage.vh1;
import defpackage.w32;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static final w32 a = new w32("^\"(.+)\"(?: daemon)? prio=\\d+ tid=(\\d+) (\\S+)");
    public static final w32 b = new w32("^\\s+at\\s+([\\w.$]+)\\.([\\w$<>-]+)\\((.*)\\)\\s*$");
    public static final w32 c = new w32("^(.+):(-?\\d+)$");

    public static final void a(m32 m32Var, m32 m32Var2, ArrayList arrayList) {
        vh1 vh1Var = (vh1) m32Var.a;
        if (vh1Var != null) {
            String str = (String) ((th1) vh1Var.a()).get(1);
            Long lN = kk2.N((String) ((th1) vh1Var.a()).get(2));
            arrayList.add(new c(str, lN != null ? lN.longValue() : -1L, (String) ((th1) vh1Var.a()).get(3), (List) m32Var2.a));
        }
        m32Var.a = null;
        m32Var2.a = new ArrayList();
    }
}
