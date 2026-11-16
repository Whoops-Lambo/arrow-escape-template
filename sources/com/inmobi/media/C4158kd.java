package com.inmobi.media;

import defpackage.az2;
import defpackage.dy;
import defpackage.ul2;
import defpackage.zr0;

/* JADX INFO: renamed from: com.inmobi.media.kd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4158kd extends ul2 implements zr0 {
    public int a;
    public final /* synthetic */ C4186ld b;
    public final /* synthetic */ Z6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4158kd(C4186ld c4186ld, Z6 z6, dy dyVar) {
        super(2, dyVar);
        this.b = c4186ld;
        this.c = z6;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new C4158kd(this.b, this.c, dyVar);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return new C4158kd(this.b, this.c, (dy) obj2).invokeSuspend(az2.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r0.a(r14, r13) == r4) goto L25;
     */
    @Override // defpackage.ph
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.a
            r1 = 0
            r2 = 2
            r3 = 1
            dz r4 = defpackage.dz.a
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.wz2.a0(r14)
            goto L75
        L11:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r13)
            return r1
        L17:
            defpackage.wz2.a0(r14)
            goto L64
        L1b:
            defpackage.wz2.a0(r14)
            com.inmobi.media.ld r14 = r13.b
            com.inmobi.media.Y6 r0 = r14.d
            com.inmobi.media.Z6 r5 = r13.c
            r0.getClass()
            r5.getClass()
            boolean r6 = r5 instanceof com.inmobi.media.C4110il
            if (r6 == 0) goto L3f
            com.inmobi.media.hl r7 = new com.inmobi.media.hl
            android.content.Context r8 = r0.a
            cz r9 = r0.b
            r10 = r5
            com.inmobi.media.il r10 = (com.inmobi.media.C4110il) r10
            lp1 r11 = r0.c
            com.inmobi.media.Z9 r12 = r0.d
            r7.<init>(r8, r9, r10, r11, r12)
            goto L53
        L3f:
            boolean r6 = r5 instanceof com.inmobi.media.Co
            if (r6 == 0) goto L7a
            com.inmobi.media.Bo r7 = new com.inmobi.media.Bo
            android.content.Context r8 = r0.a
            cz r9 = r0.b
            r10 = r5
            com.inmobi.media.Co r10 = (com.inmobi.media.Co) r10
            lp1 r11 = r0.c
            com.inmobi.media.Z9 r12 = r0.d
            r7.<init>(r8, r9, r10, r11, r12)
        L53:
            r14.b = r7
            com.inmobi.media.ld r14 = r13.b
            com.inmobi.media.G2 r14 = r14.b
            if (r14 == 0) goto L64
            r13.a = r3
            java.lang.Object r14 = r14.a(r13)
            if (r14 != r4) goto L64
            goto L74
        L64:
            com.inmobi.media.ld r14 = r13.b
            com.inmobi.media.G2 r0 = r14.b
            if (r0 == 0) goto L75
            com.inmobi.media.ads.nativeAd.MediaView r14 = r14.c
            r13.a = r2
            java.lang.Object r14 = r0.a(r14, r13)
            if (r14 != r4) goto L75
        L74:
            return r4
        L75:
            com.inmobi.media.ld r13 = r13.b
            com.inmobi.media.ads.nativeAd.MediaView r13 = r13.c
            return r13
        L7a:
            io.p071bidmachine.ads.networks.adaptiverendering.e.b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4158kd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
