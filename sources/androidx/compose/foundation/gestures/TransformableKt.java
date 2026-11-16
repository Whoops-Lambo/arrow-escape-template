package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TransformableKt {
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004a -> B:19:0x004f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, defpackage.ph r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.TransformableKt$awaitTwoDowns$1
            if (r1 == 0) goto L15
            r1 = r0
            androidx.compose.foundation.gestures.TransformableKt$awaitTwoDowns$1 r1 = (androidx.compose.foundation.gestures.TransformableKt$awaitTwoDowns$1) r1
            int r2 = r1.u
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.u = r2
            goto L1a
        L15:
            androidx.compose.foundation.gestures.TransformableKt$awaitTwoDowns$1 r1 = new androidx.compose.foundation.gestures.TransformableKt$awaitTwoDowns$1
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.t
            int r2 = r1.u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            m32 r2 = r1.s
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = r1.r
            defpackage.wz2.a0(r0)
            goto L4f
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r0)
            return r3
        L32:
            m32 r0 = defpackage.n30.d(r0)
            r2 = r0
            r0 = r17
        L39:
            r1.r = r0
            r1.s = r2
            r1.u = r4
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.b
            java.lang.Object r5 = r0.b0(r5, r1)
            dz r6 = defpackage.dz.a
            if (r5 != r6) goto L4a
            return r6
        L4a:
            r16 = r5
            r5 = r0
            r0 = r16
        L4f:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
            java.lang.Object r6 = r2.a
            r7 = 0
            if (r6 == 0) goto L58
            r6 = r4
            goto L59
        L58:
            r6 = r7
        L59:
            java.util.List r0 = r0.a
            int r8 = r0.size()
            r9 = r7
        L60:
            if (r9 >= r8) goto L98
            java.lang.Object r10 = r0.get(r9)
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            boolean r11 = androidx.compose.ui.input.pointer.PointerEventKt.b(r10)
            boolean r12 = androidx.compose.ui.input.pointer.PointerEventKt.d(r10)
            if (r12 == 0) goto L88
            long r12 = r10.a
            java.lang.Object r14 = r2.a
            if (r14 != 0) goto L7a
            r12 = r7
            goto L82
        L7a:
            androidx.compose.ui.input.pointer.PointerId r14 = (androidx.compose.ui.input.pointer.PointerId) r14
            long r14 = r14.a
            boolean r12 = androidx.compose.ui.input.pointer.PointerId.a(r14, r12)
        L82:
            if (r12 == 0) goto L88
            r2.a = r3
            int r6 = r6 + (-1)
        L88:
            if (r11 == 0) goto L95
            long r10 = r10.a
            androidx.compose.ui.input.pointer.PointerId r12 = new androidx.compose.ui.input.pointer.PointerId
            r12.<init>(r10)
            r2.a = r12
            int r6 = r6 + 1
        L95:
            int r9 = r9 + 1
            goto L60
        L98:
            if (r6 <= r4) goto L9b
            r7 = r4
        L9b:
            if (r7 == 0) goto La0
            az2 r0 = defpackage.az2.a
            return r0
        La0:
            r0 = r5
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, ph):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        if (r0.a(r12, r2) == r7) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.PointerInputScope r22, androidx.compose.runtime.MutableState r23, androidx.compose.runtime.MutableState r24, defpackage.fy r25) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.b(androidx.compose.ui.input.pointer.PointerInputScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, fy):java.lang.Object");
    }
}
