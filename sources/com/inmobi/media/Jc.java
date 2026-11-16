package com.inmobi.media;

import android.content.Context;
import defpackage.cz;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.wz2;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Jc {
    public final String a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final WeakReference f;
    public final AtomicBoolean g;

    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r7.a(r6, r0) == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r7 == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
    
        return r4;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a9 -> B:35:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.C4325qc r6, defpackage.fy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Ec
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Ec r0 = (com.inmobi.media.Ec) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.inmobi.media.Ec r0 = new com.inmobi.media.Ec
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            dz r4 = defpackage.dz.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2f
            java.lang.String r5 = r0.b
            java.util.Iterator r6 = r0.a
            defpackage.wz2.a0(r7)
            goto Lac
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r5)
            r5 = 0
            return r5
        L36:
            defpackage.wz2.a0(r7)
            goto L55
        L3a:
            defpackage.wz2.a0(r7)
            java.lang.String r7 = r6.a
            com.inmobi.media.Tc.a(r7)
            gd1 r7 = com.inmobi.media.AbstractC4544yc.a
            java.lang.Object r7 = r7.getValue()
            com.inmobi.media.xc r7 = (com.inmobi.media.C4517xc) r7
            java.lang.String r6 = r6.a
            r0.e = r3
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r4) goto L55
            goto Lab
        L55:
            java.lang.ref.WeakReference r5 = r5.f
            java.lang.Object r5 = r5.get()
            android.content.Context r5 = (android.content.Context) r5
            if (r5 == 0) goto Lb8
            cz r6 = com.inmobi.media.Sc.a
            java.lang.String r5 = com.inmobi.media.Rc.a(r5)
            r5.getClass()
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            boolean r5 = r6.exists()
            gg0 r7 = defpackage.gg0.a
            if (r5 == 0) goto L86
            boolean r5 = r6.isDirectory()
            if (r5 != 0) goto L7c
            goto L86
        L7c:
            java.lang.String[] r5 = r6.list()
            if (r5 == 0) goto L86
            java.util.List r7 = defpackage.n8.o0(r5)
        L86:
            java.util.Iterator r5 = r7.iterator()
            r6 = r5
        L8b:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto Lb8
            java.lang.Object r5 = r6.next()
            java.lang.String r5 = (java.lang.String) r5
            gd1 r7 = com.inmobi.media.AbstractC4544yc.a
            java.lang.Object r7 = r7.getValue()
            com.inmobi.media.xc r7 = (com.inmobi.media.C4517xc) r7
            r0.a = r6
            r0.b = r5
            r0.e = r2
            java.lang.Object r7 = r7.b(r5, r0)
            if (r7 != r4) goto Lac
        Lab:
            return r4
        Lac:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L8b
            com.inmobi.media.Tc.a(r5)
            goto L8b
        Lb8:
            az2 r5 = defpackage.az2.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jc.a(com.inmobi.media.qc, fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d A[PHI: r1 r2 r4 r5
  0x005d: PHI (r1v2 com.inmobi.media.qc) = (r1v5 com.inmobi.media.qc), (r1v13 com.inmobi.media.qc) binds: [B:47:0x00fd, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r2v2 com.inmobi.media.qc) = (r2v6 com.inmobi.media.qc), (r2v12 com.inmobi.media.qc) binds: [B:47:0x00fd, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r4v3 com.inmobi.media.Hc) = (r4v5 com.inmobi.media.Hc), (r4v2 com.inmobi.media.Hc) binds: [B:47:0x00fd, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r5v6 java.lang.String) = (r5v8 java.lang.String), (r5v23 java.lang.String) binds: [B:47:0x00fd, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0110 -> B:53:0x0117). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.String r26, com.inmobi.media.C4325qc r27, defpackage.fy r28) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jc.b(java.lang.String, com.inmobi.media.qc, fy):java.lang.Object");
    }

    public Jc(Context context, String str, long j, long j2, int i, int i2) {
        context.getClass();
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = i2;
        WeakReference weakReference = new WeakReference(context);
        this.f = weakReference;
        this.g = new AtomicBoolean(false);
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            cz czVar = Sc.a;
            Rc.a(new Ic(this, context2, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, C4325qc c4325qc, fy fyVar) {
        Gc gc;
        if (fyVar instanceof Gc) {
            gc = (Gc) fyVar;
            int i = gc.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gc.c = i - Integer.MIN_VALUE;
            } else {
                gc = new Gc(this, fyVar);
            }
        } else {
            gc = new Gc(this, fyVar);
        }
        Object obj = gc.a;
        int i2 = gc.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    wz2.a0(obj);
                    return obj;
                }
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
            C4044ga c4044ga = (C4044ga) If.h.getValue();
            str.getClass();
            c4325qc.getClass();
            Mf mf = new Mf(str, null, null, new C4403t7(c4325qc.a), null, 54);
            gc.c = 1;
            Object objA = c4044ga.a.a(mf, gc);
            dz dzVar = dz.a;
            return objA == dzVar ? dzVar : objA;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[LOOP:0: B:23:0x0064->B:32:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r8 == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r7, defpackage.fy r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.inmobi.media.Fc
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.Fc r0 = (com.inmobi.media.Fc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.inmobi.media.Fc r0 = new com.inmobi.media.Fc
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            az2 r2 = defpackage.az2.a
            r3 = 2
            r4 = 1
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L37
            if (r1 != r3) goto L30
            java.util.Iterator r7 = r0.b
            android.content.Context r1 = r0.a
            defpackage.wz2.a0(r8)
            goto L64
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r6)
            r6 = 0
            return r6
        L37:
            android.content.Context r7 = r0.a
            defpackage.wz2.a0(r8)
            goto L5c
        L3d:
            defpackage.wz2.a0(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.g
            boolean r8 = r8.get()
            if (r8 == 0) goto L49
            return r2
        L49:
            gd1 r8 = com.inmobi.media.AbstractC4544yc.a
            java.lang.Object r8 = r8.getValue()
            com.inmobi.media.xc r8 = (com.inmobi.media.C4517xc) r8
            r0.a = r7
            r0.e = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r5) goto L5c
            goto L7e
        L5c:
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r1 = r7
            r7 = r8
        L64:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L7f
            java.lang.Object r8 = r7.next()
            com.inmobi.media.qc r8 = (com.inmobi.media.C4325qc) r8
            java.lang.String r4 = r6.a
            r0.a = r1
            r0.b = r7
            r0.e = r3
            java.lang.Object r8 = r6.b(r4, r8, r0)
            if (r8 != r5) goto L64
        L7e:
            return r5
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Jc.a(android.content.Context, fy):java.lang.Object");
    }
}
