package com.google.android.recaptcha.internal;

import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class zzbg extends ul2 implements zr0 {
    public zzbg(dy dyVar) {
        super(2, dyVar);
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new zzbg(dyVar);
    }

    @Override // defpackage.zr0
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbg) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        Thread.currentThread().setPriority(8);
        return az2.a;
    }
}
