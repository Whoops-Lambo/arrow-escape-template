package com.inmobi.media;

import defpackage.az2;
import defpackage.dy;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Hl extends ul2 implements zr0 {
    public /* synthetic */ boolean a;

    public Hl(dy dyVar) {
        super(2, dyVar);
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        Hl hl = new Hl(dyVar);
        hl.a = ((Boolean) obj).booleanValue();
        return hl;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        Hl hl = new Hl((dy) obj2);
        hl.a = bool.booleanValue();
        return hl.invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        return Boolean.valueOf(this.a);
    }
}
