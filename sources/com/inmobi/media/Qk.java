package com.inmobi.media;

import defpackage.az2;
import defpackage.cz;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.pp1;
import defpackage.s71;
import defpackage.tb5;
import defpackage.wz2;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Qk {
    public final cz a;
    public final Mutex b;

    public abstract Nk a();

    public abstract void a(Nk nk);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Vd vd, Nk nk, fy fyVar) {
        Pk pk;
        pp1 pp1Var;
        Mutex mutex;
        Nk nk2;
        if (fyVar instanceof Pk) {
            pk = (Pk) fyVar;
            int i = pk.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pk.f = i - Integer.MIN_VALUE;
            } else {
                pk = new Pk(this, fyVar);
            }
        } else {
            pk = new Pk(this, fyVar);
        }
        Object obj = pk.d;
        int i2 = pk.f;
        if (i2 == 0) {
            wz2.a0(obj);
            Mutex mutex2 = this.b;
            pk.a = vd;
            pk.b = nk;
            pk.c = mutex2;
            pk.f = 1;
            pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(pk);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                nk2 = vd;
                mutex = pp1Var;
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Mutex mutex3 = pk.c;
            nk = pk.b;
            Nk nk3 = pk.a;
            wz2.a0(obj);
            mutex = mutex3;
            nk2 = nk3;
        }
        try {
            nk2 = vd;
            mutex = pp1Var;
            b(nk2, nk);
            return az2.a;
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    public Qk(cz czVar) {
        czVar.getClass();
        this.a = czVar;
        this.b = new pp1();
    }

    public final void b(Nk nk, Nk nk2) {
        if (!s71.b(a(), nk2) || s71.b(a(), nk)) {
            return;
        }
        a().getClass();
        nk.getClass();
        a().c();
        a(nk);
        a().a();
    }

    public final void a(Nk nk, Nk nk2) {
        nk.getClass();
        nk2.getClass();
        tb5.t(this.a, null, null, new Ok(this, nk, nk2, null), 3);
    }
}
