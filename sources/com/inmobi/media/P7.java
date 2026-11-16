package com.inmobi.media;

import com.singular.sdk.internal.Constants;
import defpackage.az2;
import defpackage.c91;
import defpackage.cz;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.gd1;
import defpackage.j71;
import defpackage.pp1;
import defpackage.tb5;
import defpackage.wr0;
import defpackage.wz2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class P7 extends AbstractC4106ih {
    public static final AtomicBoolean h = new AtomicBoolean(false);
    public final Mutex e;
    public c91 f;
    public c91 g;

    @Override // com.inmobi.media.AbstractC4106ih
    public final Object c(fy fyVar) {
        if (h.compareAndSet(false, true)) {
            tb5.t(AbstractC4211ma.e, null, null, new N7(this, null), 3);
        }
        Object objD = d(fyVar);
        return objD == dz.a ? objD : az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(fy fyVar) {
        E7 e7;
        Mutex mutex;
        if (fyVar instanceof E7) {
            e7 = (E7) fyVar;
            int i = e7.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e7.d = i - Integer.MIN_VALUE;
            } else {
                e7 = new E7(this, fyVar);
            }
        } else {
            e7 = new E7(this, fyVar);
        }
        Object obj = e7.b;
        int i2 = e7.d;
        if (i2 == 0) {
            wz2.a0(obj);
            Mutex mutex2 = this.e;
            e7.a = mutex2;
            e7.d = 1;
            pp1 pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(e7);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
            mutex = pp1Var;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutex = e7.a;
            wz2.a0(obj);
        }
        try {
            c91 c91Var = this.g;
            if (c91Var != null) {
                c91Var.cancel(null);
            }
            this.g = null;
            c91 c91Var2 = this.f;
            az2 az2Var = az2.a;
            if (c91Var2 != null && c91Var2.isActive()) {
                return az2Var;
            }
            this.f = tb5.t(AbstractC4211ma.e, null, null, new F7(this, null), 3);
            return az2Var;
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(fy fyVar) {
        G7 g7;
        Object objI;
        Object obj = az2.a;
        if (fyVar instanceof G7) {
            g7 = (G7) fyVar;
            int i = g7.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g7.c = i - Integer.MIN_VALUE;
            } else {
                g7 = new G7(this, fyVar);
            }
        } else {
            g7 = new G7(this, fyVar);
        }
        Object objA = g7.a;
        Object obj2 = dz.a;
        int i2 = g7.c;
        if (i2 == 0) {
            wz2.a0(objA);
            if (!b()) {
                return obj;
            }
            Gh gh = this.a;
            g7.c = 1;
            objA = gh.a(Constants.HIGH, g7);
            if (objA != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                wz2.a0(objA);
                return obj;
            }
            if (i2 == 3) {
                wz2.a0(objA);
                return obj;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(objA);
        if (((Number) objA).intValue() == 0) {
            g7.c = 2;
            EnumC3912bh enumC3912bh = EnumC3912bh.STOPPED;
            if (this.d == EnumC3912bh.STARTED) {
                this.d = enumC3912bh;
                objI = i(g7);
                if (objI != obj2) {
                    objI = obj;
                }
            } else {
                objI = obj;
            }
            if (objI != obj2) {
                return obj;
            }
        } else {
            g7.c = 3;
            if (h(g7) != obj2) {
                return obj;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (e(r0) == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.fy r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.inmobi.media.H7
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.H7 r0 = (com.inmobi.media.H7) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            com.inmobi.media.H7 r0 = new com.inmobi.media.H7
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.wz2.a0(r8)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6c
            goto L69
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r7)
            return r2
        L31:
            defpackage.wz2.a0(r8)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6c
            goto L57
        L35:
            defpackage.wz2.a0(r8)
            com.inmobi.media.core.config.models.AdConfig$PingsV2Config r8 = com.inmobi.media.AbstractC4106ih.a()     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6c
            com.inmobi.media.core.config.models.AdConfig$PingsV2Config$PingBatchSizeConfig r8 = r8.getMaxBatchSize()     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6c
            int r8 = r8.getHigh()     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6c
            if (r8 > 0) goto L47
            r8 = r4
        L47:
            cz r1 = com.inmobi.media.AbstractC4211ma.e     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6c
            com.inmobi.media.I7 r6 = new com.inmobi.media.I7     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6c
            r6.<init>(r7, r8, r2)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6c
            r0.c = r4     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6c
            java.lang.Object r8 = r7.a(r1, r8, r6, r0)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6c
            if (r8 != r5) goto L57
            goto L5f
        L57:
            r0.c = r3     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6c
            java.lang.Object r7 = r7.e(r0)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6c
            if (r7 != r5) goto L69
        L5f:
            return r5
        L60:
            r7 = move-exception
            r7.getMessage()
            gd1 r8 = com.inmobi.media.Ba.a
            com.inmobi.media.U9.a(r7)
        L69:
            az2 r7 = defpackage.az2.a
            return r7
        L6c:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.P7.f(fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(fy fyVar) {
        J7 j7;
        if (fyVar instanceof J7) {
            j7 = (J7) fyVar;
            int i = j7.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j7.c = i - Integer.MIN_VALUE;
            } else {
                j7 = new J7(this, fyVar);
            }
        } else {
            j7 = new J7(this, fyVar);
        }
        Object obj = j7.a;
        int i2 = j7.c;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                int high = AbstractC4106ih.a().getMaxBatchSize().getHigh();
                int i3 = high <= 0 ? 1 : high;
                cz czVar = AbstractC4211ma.e;
                wr0 k7 = new K7(this, i3, jCurrentTimeMillis, null);
                j7.c = 1;
                Object objA = a(czVar, i3, k7, j7);
                Object obj2 = dz.a;
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            e2.getMessage();
            gd1 gd1Var = Ba.a;
            U9.a(e2);
        }
        return az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(fy fyVar) {
        L7 l7;
        Mutex mutex;
        if (fyVar instanceof L7) {
            l7 = (L7) fyVar;
            int i = l7.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l7.d = i - Integer.MIN_VALUE;
            } else {
                l7 = new L7(this, fyVar);
            }
        } else {
            l7 = new L7(this, fyVar);
        }
        Object obj = l7.b;
        int i2 = l7.d;
        if (i2 == 0) {
            wz2.a0(obj);
            Mutex mutex2 = this.e;
            l7.a = mutex2;
            l7.d = 1;
            pp1 pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(l7);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
            mutex = pp1Var;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutex = l7.a;
            wz2.a0(obj);
        }
        try {
            boolean zB = b();
            az2 az2Var = az2.a;
            if (!zB) {
                return az2Var;
            }
            c91 c91Var = this.g;
            if (c91Var != null && c91Var.isActive()) {
                return az2Var;
            }
            int high = AbstractC4106ih.a().getInterval().getHigh();
            j71 j71Var = Tf.a;
            long j = high * 1000;
            if (j <= 0) {
                return az2Var;
            }
            this.g = tb5.t(AbstractC4211ma.e, null, null, new M7(j, this, null), 3);
            return az2Var;
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(fy fyVar) {
        O7 o7;
        Mutex mutex;
        if (fyVar instanceof O7) {
            o7 = (O7) fyVar;
            int i = o7.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7.d = i - Integer.MIN_VALUE;
            } else {
                o7 = new O7(this, fyVar);
            }
        } else {
            o7 = new O7(this, fyVar);
        }
        Object obj = o7.b;
        int i2 = o7.d;
        if (i2 == 0) {
            wz2.a0(obj);
            Mutex mutex2 = this.e;
            o7.a = mutex2;
            o7.d = 1;
            pp1 pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(o7);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
            mutex = pp1Var;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutex = o7.a;
            wz2.a0(obj);
        }
        try {
            c91 c91Var = this.g;
            if (c91Var != null) {
                c91Var.cancel(null);
            }
            this.g = null;
            return az2.a;
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P7(Gh gh, C4210m9 c4210m9, C4161kg c4161kg) {
        super(gh, c4210m9, c4161kg);
        gh.getClass();
        c4210m9.getClass();
        c4161kg.getClass();
        this.e = new pp1();
    }

    @Override // com.inmobi.media.AbstractC4106ih
    public final Object b(fy fyVar) {
        Object objD = d(fyVar);
        if (objD == dz.a) {
            return objD;
        }
        return az2.a;
    }
}
