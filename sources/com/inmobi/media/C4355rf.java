package com.inmobi.media;

import defpackage.az2;
import defpackage.dy;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;

/* JADX INFO: renamed from: com.inmobi.media.rf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4355rf extends ul2 implements zr0 {
    public /* synthetic */ boolean a;

    public C4355rf(dy dyVar) {
        super(2, dyVar);
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        C4355rf c4355rf = new C4355rf(dyVar);
        c4355rf.a = ((Boolean) obj).booleanValue();
        return c4355rf;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        C4355rf c4355rf = new C4355rf((dy) obj2);
        c4355rf.a = bool.booleanValue();
        return c4355rf.invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        return Boolean.valueOf(this.a);
    }
}
