package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class z1 {
    public static y1 a(Object obj, Object obj2) {
        y1 y1Var = (y1) obj;
        y1 y1Var2 = (y1) obj2;
        if (y1Var2.isEmpty()) {
            return y1Var;
        }
        if (!y1Var.a) {
            y1Var = y1Var.isEmpty() ? new y1() : new y1(y1Var);
        }
        if (!y1Var.a) {
            defpackage.d.c();
            return null;
        }
        if (!y1Var2.isEmpty()) {
            y1Var.putAll(y1Var2);
        }
        return y1Var;
    }
}
