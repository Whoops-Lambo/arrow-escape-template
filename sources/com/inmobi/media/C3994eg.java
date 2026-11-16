package com.inmobi.media;

import com.singular.sdk.internal.Constants;
import defpackage.az2;
import defpackage.c91;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.j71;
import defpackage.pp1;
import defpackage.tb5;
import defpackage.wz2;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.eg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C3994eg extends AbstractC4106ih {
    public final Mutex e;
    public c91 f;
    public c91 g;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(fy fyVar) {
        Wf wf;
        Mutex mutex;
        if (fyVar instanceof Wf) {
            wf = (Wf) fyVar;
            int i = wf.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wf.d = i - Integer.MIN_VALUE;
            } else {
                wf = new Wf(this, fyVar);
            }
        } else {
            wf = new Wf(this, fyVar);
        }
        Object obj = wf.b;
        int i2 = wf.d;
        if (i2 == 0) {
            wz2.a0(obj);
            Mutex mutex2 = this.e;
            wf.a = mutex2;
            wf.d = 1;
            pp1 pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(wf);
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
            mutex = wf.a;
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
            this.f = tb5.t(AbstractC4211ma.d, null, null, new Xf(this, null), 3);
            return az2Var;
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(fy fyVar) {
        Yf yf;
        Object objH;
        Object obj = az2.a;
        if (fyVar instanceof Yf) {
            yf = (Yf) fyVar;
            int i = yf.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yf.c = i - Integer.MIN_VALUE;
            } else {
                yf = new Yf(this, fyVar);
            }
        } else {
            yf = new Yf(this, fyVar);
        }
        Object objA = yf.a;
        Object obj2 = dz.a;
        int i2 = yf.c;
        if (i2 == 0) {
            wz2.a0(objA);
            if (!b()) {
                return obj;
            }
            Gh gh = this.a;
            yf.c = 1;
            objA = gh.a(Constants.NORMAL, yf);
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
            yf.c = 2;
            EnumC3912bh enumC3912bh = EnumC3912bh.STOPPED;
            if (this.d == EnumC3912bh.STARTED) {
                this.d = enumC3912bh;
                objH = h(yf);
                if (objH != obj2) {
                    objH = obj;
                }
            } else {
                objH = obj;
            }
            if (objH != obj2) {
                return obj;
            }
        } else {
            yf.c = 3;
            if (g(yf) != obj2) {
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
            boolean r0 = r8 instanceof com.inmobi.media.Zf
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.Zf r0 = (com.inmobi.media.Zf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            com.inmobi.media.Zf r0 = new com.inmobi.media.Zf
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
            defpackage.wz2.a0(r8)     // Catch: java.lang.Exception -> L60
            goto L69
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r7)
            return r2
        L31:
            defpackage.wz2.a0(r8)     // Catch: java.lang.Exception -> L60
            goto L57
        L35:
            defpackage.wz2.a0(r8)
            com.inmobi.media.core.config.models.AdConfig$PingsV2Config r8 = com.inmobi.media.AbstractC4106ih.a()     // Catch: java.lang.Exception -> L60
            com.inmobi.media.core.config.models.AdConfig$PingsV2Config$PingBatchSizeConfig r8 = r8.getMaxBatchSize()     // Catch: java.lang.Exception -> L60
            int r8 = r8.getNormal()     // Catch: java.lang.Exception -> L60
            if (r8 > 0) goto L47
            r8 = r4
        L47:
            cz r1 = com.inmobi.media.AbstractC4211ma.d     // Catch: java.lang.Exception -> L60
            com.inmobi.media.ag r6 = new com.inmobi.media.ag     // Catch: java.lang.Exception -> L60
            r6.<init>(r7, r8, r2)     // Catch: java.lang.Exception -> L60
            r0.c = r4     // Catch: java.lang.Exception -> L60
            java.lang.Object r8 = r7.a(r1, r8, r6, r0)     // Catch: java.lang.Exception -> L60
            if (r8 != r5) goto L57
            goto L5f
        L57:
            r0.c = r3     // Catch: java.lang.Exception -> L60
            java.lang.Object r7 = r7.e(r0)     // Catch: java.lang.Exception -> L60
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
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3994eg.f(fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(fy fyVar) {
        C3911bg c3911bg;
        Mutex mutex;
        if (fyVar instanceof C3911bg) {
            c3911bg = (C3911bg) fyVar;
            int i = c3911bg.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3911bg.d = i - Integer.MIN_VALUE;
            } else {
                c3911bg = new C3911bg(this, fyVar);
            }
        } else {
            c3911bg = new C3911bg(this, fyVar);
        }
        Object obj = c3911bg.b;
        int i2 = c3911bg.d;
        if (i2 == 0) {
            wz2.a0(obj);
            Mutex mutex2 = this.e;
            c3911bg.a = mutex2;
            c3911bg.d = 1;
            pp1 pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(c3911bg);
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
            mutex = c3911bg.a;
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
            int normal = AbstractC4106ih.a().getInterval().getNormal();
            j71 j71Var = Tf.a;
            long j = normal * 1000;
            if (j <= 0) {
                return az2Var;
            }
            this.g = tb5.t(AbstractC4211ma.d, null, null, new C3939cg(j, this, null), 3);
            return az2Var;
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(fy fyVar) {
        C3967dg c3967dg;
        Mutex mutex;
        if (fyVar instanceof C3967dg) {
            c3967dg = (C3967dg) fyVar;
            int i = c3967dg.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3967dg.d = i - Integer.MIN_VALUE;
            } else {
                c3967dg = new C3967dg(this, fyVar);
            }
        } else {
            c3967dg = new C3967dg(this, fyVar);
        }
        Object obj = c3967dg.b;
        int i2 = c3967dg.d;
        if (i2 == 0) {
            wz2.a0(obj);
            Mutex mutex2 = this.e;
            c3967dg.a = mutex2;
            c3967dg.d = 1;
            pp1 pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(c3967dg);
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
            mutex = c3967dg.a;
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
    public C3994eg(Gh gh, O5 o5, C4161kg c4161kg) {
        super(gh, o5, c4161kg);
        gh.getClass();
        o5.getClass();
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

    @Override // com.inmobi.media.AbstractC4106ih
    public final Object c(fy fyVar) {
        Object objD = d(fyVar);
        if (objD == dz.a) {
            return objD;
        }
        return az2.a;
    }
}
