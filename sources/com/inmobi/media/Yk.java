package com.inmobi.media;

import android.content.Context;
import android.webkit.URLUtil;
import defpackage.ba0;
import defpackage.tb5;
import defpackage.wg1;
import defpackage.xc0;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class Yk extends AbstractC4428u4 {
    public final Context a;
    public final Z9 b;
    public final String c;

    public Yk(Context context, Z9 z9) {
        context.getClass();
        this.a = context;
        this.b = z9;
        String string = UUID.randomUUID().toString();
        string.getClass();
        this.c = "Static-Companion-".concat(string);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (defpackage.tb5.E(r13, r6, r0) == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.Yk r12, java.lang.String r13, com.inmobi.media.C4250nl r14, defpackage.fy r15) {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof com.inmobi.media.Vk
            if (r0 == 0) goto L16
            r0 = r15
            com.inmobi.media.Vk r0 = (com.inmobi.media.Vk) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.e = r1
            goto L1b
        L16:
            com.inmobi.media.Vk r0 = new com.inmobi.media.Vk
            r0.<init>(r12, r15)
        L1b:
            java.lang.Object r15 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2e
            defpackage.wz2.a0(r15)
            goto L72
        L2e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r12)
            return r4
        L34:
            com.inmobi.media.nl r14 = r0.b
            java.lang.String r13 = r0.a
            defpackage.wz2.a0(r15)
        L3b:
            r9 = r13
            r7 = r14
            goto L57
        L3e:
            defpackage.wz2.a0(r15)
            ba0 r15 = defpackage.xc0.a
            cw0 r15 = defpackage.wg1.a
            com.inmobi.media.Xk r1 = new com.inmobi.media.Xk
            r1.<init>(r12, r4)
            r0.a = r13
            r0.b = r14
            r0.e = r3
            java.lang.Object r15 = defpackage.tb5.E(r15, r1, r0)
            if (r15 != r5) goto L3b
            goto L71
        L57:
            r10 = r15
            android.graphics.Bitmap$Config r10 = (android.graphics.Bitmap.Config) r10
            ba0 r13 = defpackage.xc0.a
            y80 r13 = defpackage.y80.c
            com.inmobi.media.Wk r6 = new com.inmobi.media.Wk
            r11 = 0
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r12 = defpackage.tb5.E(r13, r6, r0)
            if (r12 != r5) goto L72
        L71:
            return r5
        L72:
            az2 r12 = defpackage.az2.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Yk.a(com.inmobi.media.Yk, java.lang.String, com.inmobi.media.nl, fy):java.lang.Object");
    }

    public final Object a(Xj xj, C4149k4 c4149k4) throws C3936cd {
        if (URLUtil.isNetworkUrl(xj.a)) {
            ba0 ba0Var = xc0.a;
            return tb5.E(wg1.a, new Uk(this, xj, null), c4149k4);
        }
        throw new C3936cd("Companion Invalid Resource Error");
    }
}
