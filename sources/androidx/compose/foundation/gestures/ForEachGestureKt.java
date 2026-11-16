package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ForEachGestureKt {
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[LOOP:0: B:22:0x0064->B:26:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x004c A[EDGE_INSN: B:31:0x004c->B:18:0x004c BREAK  A[LOOP:0: B:22:0x0064->B:26:0x0071], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r6, defpackage.ph r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.s
            int r1 = r0.t
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L28
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = r0.r
            defpackage.wz2.a0(r7)
            goto L5b
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r6)
            r6 = 0
            return r6
        L2f:
            defpackage.wz2.a0(r7)
            r6.getClass()
            androidx.compose.ui.input.pointer.PointerEvent r7 = r6.q0()
            java.util.List r7 = r7.a
            int r1 = r7.size()
            r4 = r2
        L40:
            if (r4 >= r1) goto L77
            java.lang.Object r5 = r7.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L74
        L4c:
            r0.r = r6
            r0.t = r3
            androidx.compose.ui.input.pointer.PointerEventPass r7 = androidx.compose.ui.input.pointer.PointerEventPass.c
            java.lang.Object r7 = r6.b0(r7, r0)
            dz r1 = defpackage.dz.a
            if (r7 != r1) goto L5b
            return r1
        L5b:
            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
            java.util.List r7 = r7.a
            int r1 = r7.size()
            r4 = r2
        L64:
            if (r4 >= r1) goto L77
            java.lang.Object r5 = r7.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L71
            goto L4c
        L71:
            int r4 = r4 + 1
            goto L64
        L74:
            int r4 = r4 + 1
            goto L40
        L77:
            az2 r6 = defpackage.az2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, ph):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:51|27|(3:30|31|(0)(1:34))|46) */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r3 == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        r1 = r10;
        r10 = r12;
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r3 == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0049, code lost:
    
        if (r12 != r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0049, code lost:
    
        if (r12 != r4) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [sy] */
    /* JADX WARN: Type inference failed for: r10v12, types: [sy] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [sy] */
    /* JADX WARN: Type inference failed for: r10v3, types: [sy] */
    /* JADX WARN: Type inference failed for: r10v4, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v0, types: [zr0] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [zr0] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [zr0] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v9, types: [zr0] */
    /* JADX WARN: Type inference failed for: r12v14, types: [sy] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.PointerInputScope r10, defpackage.zr0 r11, defpackage.dy r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.u
            int r1 = r0.v
            r2 = 0
            az2 r3 = defpackage.az2.a
            dz r4 = defpackage.dz.a
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L5a
            if (r1 == r7) goto L4e
            if (r1 == r6) goto L3e
            if (r1 != r5) goto L38
            sy r10 = r0.t
            zr0 r11 = r0.s
            zr0 r11 = (defpackage.zr0) r11
            androidx.compose.ui.input.pointer.PointerInputScope r1 = r0.r
            defpackage.wz2.a0(r12)
            goto L49
        L38:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r10)
            return r2
        L3e:
            sy r10 = r0.t
            zr0 r11 = r0.s
            zr0 r11 = (defpackage.zr0) r11
            androidx.compose.ui.input.pointer.PointerInputScope r1 = r0.r
            defpackage.wz2.a0(r12)     // Catch: java.util.concurrent.CancellationException -> L4c
        L49:
            r12 = r10
            r10 = r1
            goto L61
        L4c:
            r12 = move-exception
            goto L9b
        L4e:
            sy r10 = r0.t
            zr0 r11 = r0.s
            zr0 r11 = (defpackage.zr0) r11
            androidx.compose.ui.input.pointer.PointerInputScope r1 = r0.r
            defpackage.wz2.a0(r12)     // Catch: java.util.concurrent.CancellationException -> L4c
            goto L7b
        L5a:
            defpackage.wz2.a0(r12)
            sy r12 = r0.getContext()
        L61:
            boolean r1 = defpackage.u12.l(r12)
            if (r1 == 0) goto Lbd
            r0.r = r10     // Catch: java.util.concurrent.CancellationException -> L96
            r1 = r11
            zr0 r1 = (defpackage.zr0) r1     // Catch: java.util.concurrent.CancellationException -> L96
            r0.s = r1     // Catch: java.util.concurrent.CancellationException -> L96
            r0.t = r12     // Catch: java.util.concurrent.CancellationException -> L96
            r0.v = r7     // Catch: java.util.concurrent.CancellationException -> L96
            java.lang.Object r1 = r11.invoke(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L96
            if (r1 != r4) goto L79
            goto Lbb
        L79:
            r1 = r10
            r10 = r12
        L7b:
            r0.r = r1     // Catch: java.util.concurrent.CancellationException -> L4c
            r12 = r11
            zr0 r12 = (defpackage.zr0) r12     // Catch: java.util.concurrent.CancellationException -> L4c
            r0.s = r12     // Catch: java.util.concurrent.CancellationException -> L4c
            r0.t = r10     // Catch: java.util.concurrent.CancellationException -> L4c
            r0.v = r6     // Catch: java.util.concurrent.CancellationException -> L4c
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r12 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2     // Catch: java.util.concurrent.CancellationException -> L4c
            r12.<init>(r6, r2)     // Catch: java.util.concurrent.CancellationException -> L4c
            java.lang.Object r12 = r1.z(r12, r0)     // Catch: java.util.concurrent.CancellationException -> L4c
            if (r12 != r4) goto L92
            goto L93
        L92:
            r12 = r3
        L93:
            if (r12 != r4) goto L49
            goto Lbb
        L96:
            r1 = move-exception
            r9 = r1
            r1 = r10
            r10 = r12
            r12 = r9
        L9b:
            boolean r8 = defpackage.u12.l(r10)
            if (r8 == 0) goto Lbc
            r0.r = r1
            r12 = r11
            zr0 r12 = (defpackage.zr0) r12
            r0.s = r12
            r0.t = r10
            r0.v = r5
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r12 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2
            r12.<init>(r6, r2)
            java.lang.Object r12 = r1.z(r12, r0)
            if (r12 != r4) goto Lb8
            goto Lb9
        Lb8:
            r12 = r3
        Lb9:
            if (r12 != r4) goto L49
        Lbb:
            return r4
        Lbc:
            throw r12
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.b(androidx.compose.ui.input.pointer.PointerInputScope, zr0, dy):java.lang.Object");
    }
}
