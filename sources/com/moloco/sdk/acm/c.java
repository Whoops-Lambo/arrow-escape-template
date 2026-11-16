package com.moloco.sdk.acm;

import com.facebook.login.p;
import defpackage.az2;
import defpackage.ba0;
import defpackage.cm2;
import defpackage.dn;
import defpackage.dy;
import defpackage.dz;
import defpackage.fy;
import defpackage.i9;
import defpackage.kc2;
import defpackage.pp1;
import defpackage.s71;
import defpackage.tb5;
import defpackage.vq0;
import defpackage.xc0;
import defpackage.y80;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public static p b;
    public static com.moloco.sdk.acm.services.c c;
    public static k d;
    public static j e;
    public static final dn g;
    public static final AtomicReference h;
    public static final CopyOnWriteArrayList i;
    public static final CopyOnWriteArrayList j;
    public static vq0 k;
    public static final c a = new c();
    public static final pp1 f = new pp1();

    static {
        ba0 ba0Var = xc0.a;
        g = kc2.a(y80.c.plus(tb5.a()));
        h = new AtomicReference(l.c);
        i = new CopyOnWriteArrayList();
        j = new CopyOnWriteArrayList();
    }

    public static void a(e eVar) {
        if (h.get() != l.a) {
            j.add(eVar);
            cm2 cm2Var = com.moloco.sdk.acm.services.d.a;
            com.moloco.sdk.acm.services.d.b("AndroidClientMetrics", "Moloco Client Metrics not initialized");
        } else {
            tb5.t(g, null, null, new i9(eVar, (dy) null, 6), 3);
        }
    }

    public static Object d(j jVar, fy fyVar) {
        String str = jVar.a;
        k kVar = d;
        if (kVar == null) {
            s71.D("opsConfig");
            throw null;
        }
        kVar.b = str;
        long jLongValue = jVar.b.longValue();
        k kVar2 = d;
        if (kVar2 == null) {
            s71.D("opsConfig");
            throw null;
        }
        kVar2.c = jLongValue;
        vq0 vq0Var = k;
        if (vq0Var != null) {
            Object objE = vq0Var.e(fyVar);
            return objE == dz.a ? objE : az2.a;
        }
        s71.D("requestScheduler");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r7.e(r0) == r6) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.moloco.sdk.acm.j r8, defpackage.dy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.moloco.sdk.acm.b
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.acm.b r0 = (com.moloco.sdk.acm.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            com.moloco.sdk.acm.b r0 = new com.moloco.sdk.acm.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.t
            int r9 = r0.v
            az2 r1 = defpackage.az2.a
            r2 = 2
            r3 = 1
            r4 = 0
            if (r9 == 0) goto L3b
            if (r9 == r3) goto L31
            if (r9 != r2) goto L2b
            defpackage.wz2.a0(r7)
            return r1
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r7)
            return r4
        L31:
            pp1 r8 = r0.s
            com.moloco.sdk.acm.j r9 = r0.r
            defpackage.wz2.a0(r7)
            r7 = r8
            r8 = r9
            goto L64
        L3b:
            defpackage.wz2.a0(r7)
            java.util.concurrent.atomic.AtomicReference r7 = com.moloco.sdk.acm.c.h
            java.lang.Object r7 = r7.get()
            com.moloco.sdk.acm.l r9 = com.moloco.sdk.acm.l.a
            java.lang.String r5 = "AndroidClientMetrics"
            dz r6 = defpackage.dz.a
            if (r7 == r9) goto L6f
            cm2 r7 = com.moloco.sdk.acm.services.d.a
            java.lang.String r7 = "ACM updateConfig called when the SDK was not initialized. Initialize the SDK first."
            r9 = 12
            com.moloco.sdk.acm.services.d.g(r5, r9, r7, r4)
            r0.r = r8
            pp1 r7 = com.moloco.sdk.acm.c.f
            r0.s = r7
            r0.v = r3
            java.lang.Object r9 = r7.e(r0)
            if (r9 != r6) goto L64
            goto L7e
        L64:
            com.moloco.sdk.acm.c.e = r8     // Catch: java.lang.Throwable -> L6a
            r7.g(r4)
            return r1
        L6a:
            r8 = move-exception
            r7.g(r4)
            throw r8
        L6f:
            cm2 r7 = com.moloco.sdk.acm.services.d.a
            java.lang.String r7 = "ACM update called. ACM initialized already, proceeding with update"
            com.moloco.sdk.acm.services.d.h(r5, r7)
            r0.v = r2
            java.lang.Object r7 = d(r8, r0)
            if (r7 != r6) goto L7f
        L7e:
            return r6
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.c.c(com.moloco.sdk.acm.j, dy):java.lang.Object");
    }

    public static void b(i iVar) {
        iVar.getClass();
        if (iVar.b == 0) {
            iVar.b = System.currentTimeMillis() - ((AtomicLong) iVar.a.b).get();
        }
        if (h.get() != l.a) {
            i.add(iVar);
            cm2 cm2Var = com.moloco.sdk.acm.services.d.a;
            com.moloco.sdk.acm.services.d.b("AndroidClientMetrics", "Moloco Client Metrics not initialized");
        } else {
            tb5.t(g, null, null, new i9(iVar, (dy) null, 7), 3);
        }
    }
}
