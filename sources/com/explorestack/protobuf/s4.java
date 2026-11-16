package com.explorestack.protobuf;

import defpackage.n30;
import defpackage.pv1;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class s4 {
    public final Method a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;
    public final Method g;
    public final Method h;

    public s4(String str, Class cls, Class cls2, String str2, boolean z, boolean z2) {
        Method methodAccess$1000;
        Method methodAccess$1001;
        Method methodAccess$1002;
        Method methodAccess$1003 = y4.access$1000(cls, n30.y("get", str), new Class[0]);
        this.a = methodAccess$1003;
        this.b = y4.access$1000(cls2, n30.y("get", str), new Class[0]);
        this.c = y4.access$1000(cls2, n30.y("set", str), new Class[]{methodAccess$1003.getReturnType()});
        if (z2) {
            methodAccess$1000 = y4.access$1000(cls, n30.y("has", str), new Class[0]);
        } else {
            methodAccess$1000 = null;
        }
        this.d = methodAccess$1000;
        if (z2) {
            methodAccess$1001 = y4.access$1000(cls2, n30.y("has", str), new Class[0]);
        } else {
            methodAccess$1001 = null;
        }
        this.e = methodAccess$1001;
        this.f = y4.access$1000(cls2, n30.y("clear", str), new Class[0]);
        if (z) {
            methodAccess$1002 = y4.access$1000(cls, pv1.n("get", str2, "Case"), new Class[0]);
        } else {
            methodAccess$1002 = null;
        }
        this.g = methodAccess$1002;
        this.h = z ? y4.access$1000(cls2, pv1.n("get", str2, "Case"), new Class[0]) : null;
    }
}
