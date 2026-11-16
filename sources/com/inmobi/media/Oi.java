package com.inmobi.media;

import defpackage.az2;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.pp1;
import defpackage.s71;
import defpackage.sy;
import defpackage.wr0;
import defpackage.wz2;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Oi {
    public final Mutex a = new pp1();
    public WeakReference b = new WeakReference(null);
    public int c;

    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [az2] */
    public final Object a(C4010f4 c4010f4, fy fyVar) {
        Ni ni;
        wr0 wr0Var;
        if (fyVar instanceof Ni) {
            ni = (Ni) fyVar;
            int i = ni.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ni.d = i - Integer.MIN_VALUE;
            } else {
                ni = new Ni(this, fyVar);
            }
        } else {
            ni = new Ni(this, fyVar);
        }
        Object objInvoke = ni.b;
        int i2 = ni.d;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(objInvoke);
                ni.a = c4010f4;
                ni.d = 1;
                if (a((fy) ni) != dzVar) {
                }
                wr0Var = c4010f4;
                return dzVar;
            }
            if (i2 == 1) {
                wr0 wr0Var2 = (wr0) ni.a;
                wz2.a0(objInvoke);
                wr0Var = wr0Var2;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        Object obj = ni.a;
                        wz2.a0(objInvoke);
                        return obj;
                    }
                    if (i2 != 4) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) ni.a;
                    wz2.a0(objInvoke);
                    throw th;
                }
                wz2.a0(objInvoke);
            }
            ni.a = objInvoke;
            ni.d = 3;
            this = a(ni);
            if (this == dzVar) {
                return objInvoke;
            }
            wr0Var = c4010f4;
            return dzVar;
            wr0Var = c4010f4;
            ni.a = null;
            ni.d = 2;
            objInvoke = wr0Var.invoke(ni);
            if (objInvoke != dzVar) {
                ni.a = objInvoke;
                ni.d = 3;
                this = a(ni);
                if (this == dzVar) {
                    return objInvoke;
                }
            }
        } catch (Throwable th2) {
            ni.a = th2;
            ni.d = 4;
            if (this.a(ni) != dzVar) {
                throw th2;
            }
        }
        wr0Var = c4010f4;
        return dzVar;
    }

    public final az2 a(Ni ni) {
        sy context = ni.getContext();
        System.out.println(ni.getContext());
        if (s71.b(this.b.get(), context)) {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                this.b = new WeakReference(null);
                ((pp1) this.a).g(null);
            }
            return az2.a;
        }
        e32.i("ReentrantMutex is not locked by this coroutine.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fy fyVar) {
        Mi mi;
        sy syVar;
        if (fyVar instanceof Mi) {
            mi = (Mi) fyVar;
            int i = mi.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mi.d = i - Integer.MIN_VALUE;
            } else {
                mi = new Mi(this, fyVar);
            }
        } else {
            mi = new Mi(this, fyVar);
        }
        Object obj = mi.b;
        int i2 = mi.d;
        az2 az2Var = az2.a;
        if (i2 == 0) {
            wz2.a0(obj);
            sy context = mi.getContext();
            System.out.println(mi.getContext());
            if (s71.b(this.b.get(), context)) {
                this.c++;
                return az2Var;
            }
            Mutex mutex = this.a;
            mi.a = context;
            mi.d = 1;
            Object objE = ((pp1) mutex).e(mi);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
            syVar = context;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            syVar = mi.a;
            wz2.a0(obj);
        }
        this.b = new WeakReference(syVar);
        this.c = 1;
        return az2Var;
    }
}
