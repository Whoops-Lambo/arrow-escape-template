package com.explorestack.protobuf;

import defpackage.n30;
import defpackage.pv1;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class m4 {
    public final Descriptors.Descriptor a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Descriptors.FieldDescriptor e;

    public m4(Descriptors.Descriptor descriptor, int i, String str, Class cls, Class cls2) {
        this.a = descriptor;
        Descriptors.OneofDescriptor oneofDescriptor = descriptor.getOneofs().get(i);
        if (oneofDescriptor.isSynthetic()) {
            this.b = null;
            this.c = null;
            this.e = oneofDescriptor.getFields().get(0);
        } else {
            this.b = y4.access$1000(cls, pv1.n("get", str, "Case"), new Class[0]);
            this.c = y4.access$1000(cls2, pv1.n("get", str, "Case"), new Class[0]);
            this.e = null;
        }
        this.d = y4.access$1000(cls2, n30.y("clear", str), new Class[0]);
    }
}
