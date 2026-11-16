package com.vungle.ads.internal.model;

import defpackage.rh1;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public enum o2 {
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_ID(0),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLE_ID(1),
    /* JADX INFO: Fake field, exist only in values array */
    LEGACY(2);

    public static final LinkedHashMap b;
    public final int a;

    static {
        o2[] o2VarArrValues = values();
        int iU = rh1.U(o2VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU < 16 ? 16 : iU);
        for (o2 o2Var : o2VarArrValues) {
            linkedHashMap.put(Integer.valueOf(o2Var.a), o2Var);
        }
        b = linkedHashMap;
    }

    o2(int i) {
        this.a = i;
    }
}
