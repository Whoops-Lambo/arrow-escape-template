package com.inmobi.media;

import defpackage.az2;
import defpackage.dy;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;

/* JADX INFO: renamed from: com.inmobi.media.pf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4300pf extends ul2 implements zr0 {
    public C4300pf(dy dyVar) {
        super(2, dyVar);
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new C4300pf(dyVar);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return new C4300pf((dy) obj2).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        return Boolean.TRUE;
    }
}
