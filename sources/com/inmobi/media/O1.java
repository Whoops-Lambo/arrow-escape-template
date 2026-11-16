package com.inmobi.media;

import android.app.Activity;
import defpackage.az2;
import defpackage.dy;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class O1 extends ul2 implements zr0 {
    public final /* synthetic */ WeakReference a;
    public final /* synthetic */ P1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O1(WeakReference weakReference, P1 p1, dy dyVar) {
        super(2, dyVar);
        this.a = weakReference;
        this.b = p1;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new O1(this.a, this.b, dyVar);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return new O1(this.a, this.b, (dy) obj2).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        Activity activity = (Activity) this.a.get();
        if (activity != null) {
            return Boolean.valueOf(this.b.c.remove(activity));
        }
        return null;
    }
}
