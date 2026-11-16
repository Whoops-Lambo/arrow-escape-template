package io.p071bidmachine.rendering.internal.meanbackground;

import android.view.View;
import defpackage.sr0;
import defpackage.wr0;
import io.p071bidmachine.util.taskmanager.b;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class o extends b {
    public final long b;
    public final i c;
    public final y d;
    public final sr0 e;
    public final wr0 f;
    public final WeakReference g;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r14 == r2) goto L30;
     */
    @Override // io.p071bidmachine.util.taskmanager.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.sy r14, defpackage.fy r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof io.p071bidmachine.rendering.internal.meanbackground.m
            if (r0 == 0) goto L13
            r0 = r15
            io.bidmachine.rendering.internal.meanbackground.m r0 = (io.p071bidmachine.rendering.internal.meanbackground.m) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            io.bidmachine.rendering.internal.meanbackground.m r0 = new io.bidmachine.rendering.internal.meanbackground.m
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.t
            int r1 = r0.v
            dz r2 = defpackage.dz.a
            az2 r3 = defpackage.az2.a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3d
            if (r1 == r6) goto L35
            if (r1 != r5) goto L2f
            io.bidmachine.rendering.internal.meanbackground.o r13 = r0.r
            defpackage.wz2.a0(r15)
            goto L93
        L2f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r13)
            return r4
        L35:
            sy r14 = r0.s
            io.bidmachine.rendering.internal.meanbackground.o r13 = r0.r
            defpackage.wz2.a0(r15)
            goto L5d
        L3d:
            defpackage.wz2.a0(r15)
            r0.r = r13
            r0.s = r14
            r0.v = r6
            io.bidmachine.rendering.internal.meanbackground.n r7 = new io.bidmachine.rendering.internal.meanbackground.n
            r12 = 0
            long r8 = r13.b
            r10 = r13
            r11 = r14
            r7.<init>(r8, r10, r11, r12)
            java.lang.String r13 = "Mean background extraction"
            io.bidmachine.rendering.internal.meanbackground.y r14 = r10.d
            java.lang.Object r15 = r14.a(r13, r7, r0)
            if (r15 != r2) goto L5b
            goto L92
        L5b:
            r13 = r10
            r14 = r11
        L5d:
            io.bidmachine.rendering.internal.meanbackground.h r15 = (io.p071bidmachine.rendering.internal.meanbackground.h) r15
            if (r15 == 0) goto L93
            java.lang.Object r1 = r15.a
            android.graphics.Bitmap r15 = r15.b
            r0.r = r13
            r0.s = r4
            r0.v = r5
            r13.getClass()
            if (r15 == 0) goto L73
            r15.recycle()     // Catch: java.lang.Throwable -> L73
        L73:
            io.bidmachine.rendering.internal.y r15 = io.p071bidmachine.rendering.internal.y.e
            cm2 r15 = r15.b
            java.lang.Object r15 = r15.getValue()
            uy r15 = (defpackage.uy) r15
            sy r14 = r14.plus(r15)
            hh r15 = new hh
            r5 = 29
            r15.<init>(r1, r13, r4, r5)
            java.lang.Object r14 = defpackage.tb5.E(r14, r15, r0)
            if (r14 != r2) goto L8f
            goto L90
        L8f:
            r14 = r3
        L90:
            if (r14 != r2) goto L93
        L92:
            return r2
        L93:
            r13.a(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.p071bidmachine.rendering.internal.meanbackground.o.c(sy, fy):java.lang.Object");
    }

    public o(View view, i iVar, y yVar, sr0 sr0Var, wr0 wr0Var) {
        view.getClass();
        yVar.getClass();
        this.b = 1000L;
        this.c = iVar;
        this.d = yVar;
        this.e = sr0Var;
        this.f = wr0Var;
        this.g = new WeakReference(view);
    }
}
