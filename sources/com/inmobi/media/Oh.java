package com.inmobi.media;

import defpackage.c91;
import defpackage.cz;
import defpackage.np1;
import defpackage.qb5;
import defpackage.tb5;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Oh {
    public final InterfaceC3921bq a;
    public final np1 b;
    public final cz c;
    public final Qh d;
    public c91 e;
    public final AtomicBoolean f;

    public Oh(cz czVar, Qh qh, InterfaceC3921bq interfaceC3921bq) {
        czVar.getClass();
        qh.getClass();
        interfaceC3921bq.getClass();
        this.a = interfaceC3921bq;
        this.b = qb5.a(EnumC3893aq.HIDDEN);
        this.c = czVar;
        this.d = qh;
        this.f = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005d -> B:17:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(com.inmobi.media.Oh r8, defpackage.fy r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof com.inmobi.media.Mh
            if (r0 == 0) goto L16
            r0 = r9
            com.inmobi.media.Mh r0 = (com.inmobi.media.Mh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.c = r1
            goto L1b
        L16:
            com.inmobi.media.Mh r0 = new com.inmobi.media.Mh
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            goto L35
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r8)
            return r2
        L31:
            defpackage.wz2.a0(r9)
            goto L52
        L35:
            defpackage.wz2.a0(r9)
        L38:
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.f
            boolean r9 = r9.get()
            if (r9 != 0) goto L60
            ba0 r9 = defpackage.xc0.a
            cw0 r9 = defpackage.wg1.a
            com.inmobi.media.Nh r1 = new com.inmobi.media.Nh
            r1.<init>(r8, r2)
            r0.c = r4
            java.lang.Object r9 = defpackage.tb5.E(r9, r1, r0)
            if (r9 != r5) goto L52
            goto L5f
        L52:
            com.inmobi.media.Qh r9 = r8.d
            int r9 = r9.a
            long r6 = (long) r9
            r0.c = r3
            java.lang.Object r9 = defpackage.ns1.i(r6, r0)
            if (r9 != r5) goto L38
        L5f:
            return r5
        L60:
            az2 r8 = defpackage.az2.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Oh.a(com.inmobi.media.Oh, fy):java.lang.Object");
    }

    public final void a() {
        if (this.f.get() || this.e != null) {
            return;
        }
        this.e = tb5.t(this.c, null, null, new Lh(this, null), 3);
    }
}
