package com.moloco.sdk.acm.services;

import androidx.lifecycle.Lifecycle;
import defpackage.az2;
import defpackage.ba0;
import defpackage.cm2;
import defpackage.cw0;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.jc1;
import defpackage.ni;
import defpackage.tb5;
import defpackage.u12;
import defpackage.wg1;
import defpackage.wz2;
import defpackage.xc0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements a {
    public final Lifecycle a;
    public final ApplicationLifecycleObserver b;
    public final AtomicBoolean c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) throws Throwable {
        b bVar;
        if (fyVar instanceof b) {
            bVar = (b) fyVar;
            int i = bVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.t = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, fyVar);
            }
        } else {
            bVar = new b(this, fyVar);
        }
        Object obj = bVar.r;
        int i2 = bVar.t;
        dy dyVar = null;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                ba0 ba0Var = xc0.a;
                cw0 cw0Var = wg1.a.f;
                ni niVar = new ni(this, dyVar, 10);
                bVar.t = 1;
                Object objE = tb5.E(cw0Var, niVar, bVar);
                dz dzVar = dz.a;
                if (objE == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
        } catch (IllegalStateException e) {
            u12.h(bVar.getContext());
            cm2 cm2Var = d.a;
            d.g("ApplicationLifecycleObserver", 8, jc1.q(new StringBuilder("Unable to register lifecycle observer [process="), d.b, ']'), e);
        } catch (LinkageError e2) {
            u12.h(bVar.getContext());
            cm2 cm2Var2 = d.a;
            d.g("ApplicationLifecycleObserver", 8, jc1.q(new StringBuilder("Unable to register lifecycle observer [process="), d.b, ']'), e2);
        }
        return az2.a;
    }

    public c(Lifecycle lifecycle, ApplicationLifecycleObserver applicationLifecycleObserver) {
        lifecycle.getClass();
        this.a = lifecycle;
        this.b = applicationLifecycleObserver;
        this.c = new AtomicBoolean(false);
    }
}
