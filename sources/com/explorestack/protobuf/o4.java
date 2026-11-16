package com.explorestack.protobuf;

import defpackage.n30;
import defpackage.pv1;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class o4 {
    public final Method a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;
    public final Method g;
    public final Method h;
    public final Method i;

    public o4(String str, Class cls, Class cls2) {
        this.a = y4.access$1000(cls, pv1.n("get", str, "List"), new Class[0]);
        this.b = y4.access$1000(cls2, pv1.n("get", str, "List"), new Class[0]);
        String strY = n30.y("get", str);
        Class cls3 = Integer.TYPE;
        Method methodAccess$1000 = y4.access$1000(cls, strY, new Class[]{cls3});
        this.c = methodAccess$1000;
        this.d = y4.access$1000(cls2, n30.y("get", str), new Class[]{cls3});
        Class<?> returnType = methodAccess$1000.getReturnType();
        this.e = y4.access$1000(cls2, n30.y("set", str), new Class[]{cls3, returnType});
        this.f = y4.access$1000(cls2, n30.y(com.safedk.android.analytics.brandsafety.m.l, str), new Class[]{returnType});
        this.g = y4.access$1000(cls, pv1.n("get", str, "Count"), new Class[0]);
        this.h = y4.access$1000(cls2, pv1.n("get", str, "Count"), new Class[0]);
        this.i = y4.access$1000(cls2, n30.y("clear", str), new Class[0]);
    }
}
