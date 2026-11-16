package com.inmobi.media;

import defpackage.az2;
import defpackage.cz;
import defpackage.dy;
import defpackage.ul2;
import defpackage.w82;
import defpackage.zr0;

/* JADX INFO: renamed from: com.inmobi.media.gh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4051gh extends ul2 implements zr0 {
    public InterfaceC3884ah a;
    public int b;
    public final /* synthetic */ AbstractC4106ih c;
    public final /* synthetic */ Vg d;
    public final /* synthetic */ w82 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4051gh(AbstractC4106ih abstractC4106ih, Vg vg, w82 w82Var, dy dyVar) {
        super(2, dyVar);
        this.c = abstractC4106ih;
        this.d = vg;
        this.e = w82Var;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        return new C4051gh(this.c, this.d, this.e, dyVar);
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return ((C4051gh) create((cz) obj, (dy) obj2)).invokeSuspend(az2.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r0.a((com.inmobi.media.C3940ch) r7, r6) == r4) goto L21;
     */
    @Override // defpackage.ph
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.b
            r1 = 0
            r2 = 2
            r3 = 1
            dz r4 = defpackage.dz.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.wz2.a0(r7)     // Catch: java.lang.Throwable -> L11
            goto L40
        L11:
            r7 = move-exception
            goto L4a
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r6)
            return r1
        L19:
            com.inmobi.media.ah r0 = r6.a
            defpackage.wz2.a0(r7)     // Catch: java.lang.Throwable -> L11
            goto L33
        L1f:
            defpackage.wz2.a0(r7)
            com.inmobi.media.ih r7 = r6.c     // Catch: java.lang.Throwable -> L11
            com.inmobi.media.ah r0 = r7.b     // Catch: java.lang.Throwable -> L11
            com.inmobi.media.Vg r5 = r6.d     // Catch: java.lang.Throwable -> L11
            r6.a = r0     // Catch: java.lang.Throwable -> L11
            r6.b = r3     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = r7.a(r5, r6)     // Catch: java.lang.Throwable -> L11
            if (r7 != r4) goto L33
            goto L3f
        L33:
            com.inmobi.media.ch r7 = (com.inmobi.media.C3940ch) r7     // Catch: java.lang.Throwable -> L11
            r6.a = r1     // Catch: java.lang.Throwable -> L11
            r6.b = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = r0.a(r7, r6)     // Catch: java.lang.Throwable -> L11
            if (r7 != r4) goto L40
        L3f:
            return r4
        L40:
            w82 r6 = r6.e
            z82 r6 = (defpackage.z82) r6
            r6.c()
            az2 r6 = defpackage.az2.a
            return r6
        L4a:
            w82 r6 = r6.e
            z82 r6 = (defpackage.z82) r6
            r6.c()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4051gh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
