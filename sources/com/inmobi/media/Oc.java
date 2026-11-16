package com.inmobi.media;

import defpackage.az2;
import defpackage.dy;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Oc extends ul2 implements zr0 {
    public final /* synthetic */ Runnable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oc(Runnable runnable, dy dyVar) {
        super(2, dyVar);
        this.a = runnable;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new Oc(this.a, dyVar);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return new Oc(this.a, (dy) obj2).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        this.a.run();
        return az2.a;
    }
}
