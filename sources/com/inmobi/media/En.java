package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class En {
    public static final En a = new En();

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[PHI: r14 r15
  0x0055: PHI (r14v7 int) = (r14v2 int), (r14v4 int), (r14v15 int) binds: [B:18:0x0046, B:33:0x00ab, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0055: PHI (r15v4 com.inmobi.media.Kf) = (r15v2 com.inmobi.media.Kf), (r15v3 com.inmobi.media.Kf), (r15v6 com.inmobi.media.Kf) binds: [B:18:0x0046, B:33:0x00ab, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ab -> B:19:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.lang.String r14, defpackage.fy r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.inmobi.media.Dn
            if (r0 == 0) goto L13
            r0 = r15
            com.inmobi.media.Dn r0 = (com.inmobi.media.Dn) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.inmobi.media.Dn r0 = new com.inmobi.media.Dn
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r13 = r0.c
            int r15 = r0.e
            r1 = 2
            r2 = 1
            dz r3 = defpackage.dz.a
            if (r15 == 0) goto L3d
            if (r15 == r2) goto L35
            if (r15 != r1) goto L2e
            int r14 = r0.a
            com.inmobi.media.Kf r15 = r0.b
            defpackage.wz2.a0(r13)
            goto L55
        L2e:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r13)
            r13 = 0
            return r13
        L35:
            int r14 = r0.a
            com.inmobi.media.Kf r15 = r0.b
            defpackage.wz2.a0(r13)
            goto L74
        L3d:
            defpackage.wz2.a0(r13)
            boolean r13 = com.inmobi.media.An.a(r14)
            if (r13 == 0) goto Lb6
            com.inmobi.media.Kf r4 = new com.inmobi.media.Kf
            r10 = 0
            r11 = 62
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r14 = 0
            r15 = r4
        L55:
            int r13 = r14 + 1
            r4 = 3
            if (r14 >= r4) goto Lae
            gd1 r14 = com.inmobi.media.If.c
            java.lang.Object r14 = r14.getValue()
            com.inmobi.media.ga r14 = (com.inmobi.media.C4044ga) r14
            r0.b = r15
            r0.a = r13
            r0.e = r2
            com.inmobi.media.Y4 r14 = r14.a
            java.lang.Object r14 = r14.a(r15, r0)
            if (r14 != r3) goto L71
            goto Lad
        L71:
            r12 = r14
            r14 = r13
            r13 = r12
        L74:
            com.inmobi.media.Of r13 = (com.inmobi.media.Of) r13
            boolean r4 = com.inmobi.media.AbstractC4391sn.a(r13)
            if (r4 == 0) goto L8c
            j71 r14 = com.inmobi.media.Tf.a
            r13.getClass()
            okio.ByteString r13 = r13.d()
            java.nio.charset.Charset r14 = defpackage.er.a
            java.lang.String r13 = r13.string(r14)
            return r13
        L8c:
            j71 r4 = com.inmobi.media.Tf.a
            r13.getClass()
            j71 r4 = com.inmobi.media.Tf.b
            int r5 = r4.a
            int r4 = r4.b
            int r13 = r13.c()
            if (r5 > r13) goto L9f
            if (r13 <= r4) goto Lae
        L9f:
            r0.b = r15
            r0.a = r14
            r0.e = r1
            r4 = 100
            java.lang.Object r13 = defpackage.ns1.i(r4, r0)
            if (r13 != r3) goto L55
        Lad:
            return r3
        Lae:
            com.inmobi.media.Fn r13 = new com.inmobi.media.Fn
            r14 = 1113(0x459, float:1.56E-42)
            r13.<init>(r14)
            throw r13
        Lb6:
            com.inmobi.media.Fn r13 = new com.inmobi.media.Fn
            r14 = 1114(0x45a, float:1.561E-42)
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.En.a(java.lang.String, fy):java.lang.Object");
    }
}
