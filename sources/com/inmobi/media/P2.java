package com.inmobi.media;

import defpackage.az2;
import defpackage.bp0;
import defpackage.c91;
import defpackage.cz;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.kp0;
import defpackage.mp0;
import defpackage.np1;
import defpackage.pp1;
import defpackage.tb5;
import defpackage.wz2;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class P2 implements InterfaceC3987e9 {
    public final cz a;
    public final Lp b;
    public final np1 c;
    public final Mutex d;
    public final AtomicBoolean e;
    public c91 f;
    public final Ff g;

    public abstract Pp c();

    public P2(cz czVar, Ip ip, Lp lp, np1 np1Var) {
        czVar.getClass();
        ip.getClass();
        lp.getClass();
        np1Var.getClass();
        this.a = czVar;
        this.b = lp;
        this.c = np1Var;
        this.d = new pp1();
        this.e = new AtomicBoolean(false);
        this.g = new Ff(czVar, ip);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(P2 p2, fy fyVar) {
        L2 l2;
        Mutex mutex;
        p2.getClass();
        if (fyVar instanceof L2) {
            l2 = (L2) fyVar;
            int i = l2.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l2.d = i - Integer.MIN_VALUE;
            } else {
                l2 = new L2(p2, fyVar);
            }
        } else {
            l2 = new L2(p2, fyVar);
        }
        Object obj = l2.b;
        int i2 = l2.d;
        if (i2 != 0) {
            if (i2 == 1) {
                mutex = l2.a;
                wz2.a0(obj);
            } else {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            wz2.a0(obj);
            Mutex mutex2 = p2.d;
            l2.a = mutex2;
            l2.d = 1;
            pp1 pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(l2);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
            mutex = pp1Var;
        }
        try {
            Pp ppC = p2.c();
            Oh oh = ppC.a;
            oh.f.set(true);
            AbstractC4097i7.a(oh.e);
            oh.e = null;
            AbstractC4097i7.a(ppC.d.a);
            ppC.d.a = null;
            AbstractC4097i7.a(ppC.e);
            ppC.e = null;
            p2.g.b();
            return az2.a;
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        ((defpackage.pp1) r0).g(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.inmobi.media.P2 r4, defpackage.fy r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.inmobi.media.M2
            if (r0 == 0) goto L16
            r0 = r5
            com.inmobi.media.M2 r0 = (com.inmobi.media.M2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            com.inmobi.media.M2 r0 = new com.inmobi.media.M2
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2b
            kotlinx.coroutines.sync.Mutex r0 = r0.a
            defpackage.wz2.a0(r5)
            goto L46
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r4)
            return r3
        L31:
            defpackage.wz2.a0(r5)
            kotlinx.coroutines.sync.Mutex r5 = r4.d
            r0.a = r5
            r0.d = r2
            pp1 r5 = (defpackage.pp1) r5
            java.lang.Object r0 = r5.e(r0)
            dz r1 = defpackage.dz.a
            if (r0 != r1) goto L45
            return r1
        L45:
            r0 = r5
        L46:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.e     // Catch: java.lang.Throwable -> L54
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L54
            com.inmobi.media.Ff r1 = r4.g
            if (r5 == 0) goto L56
            r1.a()     // Catch: java.lang.Throwable -> L54
            goto L59
        L54:
            r4 = move-exception
            goto L94
        L56:
            r1.b()     // Catch: java.lang.Throwable -> L54
        L59:
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.e     // Catch: java.lang.Throwable -> L54
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L71
            com.inmobi.media.Pp r4 = r4.c()     // Catch: java.lang.Throwable -> L54
            com.inmobi.media.Oh r4 = r4.a     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f     // Catch: java.lang.Throwable -> L54
            r1 = 0
            r5.set(r1)     // Catch: java.lang.Throwable -> L54
            r4.a()     // Catch: java.lang.Throwable -> L54
            goto L8c
        L71:
            com.inmobi.media.Pp r4 = r4.c()     // Catch: java.lang.Throwable -> L54
            com.inmobi.media.Oh r4 = r4.a     // Catch: java.lang.Throwable -> L54
            np1 r5 = r4.b     // Catch: java.lang.Throwable -> L54
            com.inmobi.media.aq r1 = com.inmobi.media.EnumC3893aq.HIDDEN     // Catch: java.lang.Throwable -> L54
            xi2 r5 = (defpackage.xi2) r5     // Catch: java.lang.Throwable -> L54
            r5.j(r1)     // Catch: java.lang.Throwable -> L54
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f     // Catch: java.lang.Throwable -> L54
            r5.set(r2)     // Catch: java.lang.Throwable -> L54
            c91 r5 = r4.e     // Catch: java.lang.Throwable -> L54
            com.inmobi.media.AbstractC4097i7.a(r5)     // Catch: java.lang.Throwable -> L54
            r4.e = r3     // Catch: java.lang.Throwable -> L54
        L8c:
            az2 r4 = defpackage.az2.a     // Catch: java.lang.Throwable -> L54
            pp1 r0 = (defpackage.pp1) r0
            r0.g(r3)
            return r4
        L94:
            pp1 r0 = (defpackage.pp1) r0
            r0.g(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.P2.b(com.inmobi.media.P2, fy):java.lang.Object");
    }

    @Override // com.inmobi.media.InterfaceC3987e9
    public final void a() {
        this.e.set(false);
        this.g.b();
        Pp ppC = c();
        Oh oh = ppC.a;
        oh.f.set(true);
        AbstractC4097i7.a(oh.e);
        oh.e = null;
        AbstractC4097i7.a(ppC.d.a);
        ppC.d.a = null;
        AbstractC4097i7.a(ppC.e);
        ppC.e = null;
        AbstractC4097i7.a(this.f);
        this.f = null;
    }

    @Override // com.inmobi.media.InterfaceC3987e9
    public final bp0 b() {
        if (this.f == null) {
            this.f = tb5.t(this.a, null, null, new K2(this.c, null, this), 3);
        }
        Pp ppC = c();
        if (ppC.e == null) {
            Oh oh = ppC.a;
            oh.a();
            ppC.e = tb5.t(ppC.b.a, null, null, new Np(oh.b, null, ppC), 3);
        }
        return new kp0(new mp0(new N2(this, null), ppC.c), new O2(this, null));
    }
}
