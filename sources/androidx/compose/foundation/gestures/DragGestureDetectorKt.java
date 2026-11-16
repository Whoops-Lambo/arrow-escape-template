package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.ViewConfiguration;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.ep0;
import defpackage.fq2;
import defpackage.fy;
import defpackage.m32;
import defpackage.n30;
import defpackage.sr0;
import defpackage.ul2;
import defpackage.wr0;
import defpackage.wz2;
import defpackage.zr0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DragGestureDetectorKt {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(PointerInputScope pointerInputScope, PointerInputChange pointerInputChange, fy fyVar) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        m32 m32Var;
        if (fyVar instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) fyVar;
            int i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.u = i - Integer.MIN_VALUE;
            } else {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(fyVar);
            }
        } else {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(fyVar);
        }
        Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.t;
        int i2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.u;
        if (i2 == 0) {
            m32 m32VarD = n30.d(obj);
            m32 m32Var2 = new m32();
            m32Var2.a = pointerInputChange;
            long jC = pointerInputScope.getViewConfiguration().c();
            try {
                DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(pointerInputScope, m32Var2, m32VarD, null);
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.r = pointerInputChange;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.s = m32VarD;
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.u = 1;
                Object objM = ep0.M(jC, dragGestureDetectorKt$awaitLongPressOrCancellation$2, dragGestureDetectorKt$awaitLongPressOrCancellation$1);
                dz dzVar = dz.a;
                if (objM == dzVar) {
                    return dzVar;
                }
                return null;
            } catch (fq2 unused) {
                m32Var = m32VarD;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m32Var = dragGestureDetectorKt$awaitLongPressOrCancellation$1.s;
            pointerInputChange = dragGestureDetectorKt$awaitLongPressOrCancellation$1.r;
            try {
                wz2.a0(obj);
                return null;
            } catch (fq2 unused2) {
            }
        }
        PointerInputChange pointerInputChange2 = (PointerInputChange) m32Var.a;
        return pointerInputChange2 == null ? pointerInputChange : pointerInputChange2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:23:0x0067->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EDGE_INSN: B:54:0x007f->B:29:0x007f BREAK  A[LOOP:0: B:23:0x0067->B:27:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.AwaitPointerEventScope r12, long r13, defpackage.fy r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitDragOrCancellation$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.t
            int r1 = r0.u
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2d
            l32 r12 = r0.s
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = r0.r
            defpackage.wz2.a0(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5d
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r12)
            return r3
        L33:
            defpackage.wz2.a0(r15)
            androidx.compose.ui.input.pointer.PointerEvent r15 = r12.q0()
            boolean r15 = j(r15, r13)
            if (r15 == 0) goto L42
            goto Lc2
        L42:
            l32 r15 = new l32
            r15.<init>()
            r15.a = r13
        L49:
            r0.r = r12
            r0.s = r15
            r0.u = r2
            androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.b
            java.lang.Object r13 = r12.b0(r13, r0)
            dz r14 = defpackage.dz.a
            if (r13 != r14) goto L5a
            return r14
        L5a:
            r11 = r15
            r15 = r13
            r13 = r11
        L5d:
            androidx.compose.ui.input.pointer.PointerEvent r15 = (androidx.compose.ui.input.pointer.PointerEvent) r15
            java.util.List r14 = r15.a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L67:
            if (r5 >= r1) goto L7e
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            long r7 = r7.a
            long r9 = r13.a
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.a(r7, r9)
            if (r7 == 0) goto L7b
            goto L7f
        L7b:
            int r5 = r5 + 1
            goto L67
        L7e:
            r6 = r3
        L7f:
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            if (r6 != 0) goto L85
            r6 = r3
            goto Lb9
        L85:
            boolean r14 = androidx.compose.ui.input.pointer.PointerEventKt.d(r6)
            if (r14 == 0) goto Lad
            java.util.List r14 = r15.a
            int r15 = r14.size()
        L91:
            if (r4 >= r15) goto La2
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L9f
            goto La3
        L9f:
            int r4 = r4 + 1
            goto L91
        La2:
            r1 = r3
        La3:
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            if (r1 != 0) goto La8
            goto Lb9
        La8:
            long r14 = r1.a
            r13.a = r14
            goto Lc3
        Lad:
            long r14 = androidx.compose.ui.input.pointer.PointerEventKt.g(r6, r2)
            long r4 = androidx.compose.ui.geometry.Offset.b
            boolean r14 = androidx.compose.ui.geometry.Offset.a(r14, r4)
            if (r14 != 0) goto Lc3
        Lb9:
            if (r6 == 0) goto Lc2
            boolean r12 = r6.b()
            if (r12 != 0) goto Lc2
            return r6
        Lc2:
            return r3
        Lc3:
            r15 = r13
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.b(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d6 A[LOOP:0: B:25:0x00be->B:29:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0 A[EDGE_INSN: B:66:0x00e0->B:31:0x00e0 BREAK  A[LOOP:0: B:25:0x00be->B:29:0x00d6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0115 -> B:50:0x011b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0152 -> B:58:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0170 -> B:51:0x011f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, defpackage.zr0 r23, defpackage.ph r24) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.c(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, zr0, ph):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d4 A[LOOP:0: B:26:0x00bb->B:30:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e3 A[EDGE_INSN: B:69:0x00e3->B:32:0x00e3 BREAK  A[LOOP:0: B:26:0x00bb->B:30:0x00d4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0118 -> B:51:0x0125). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0180 -> B:64:0x0182). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, defpackage.zr0 r24, defpackage.ph r25) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.d(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, zr0, ph):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d6 A[LOOP:0: B:25:0x00be->B:29:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0 A[EDGE_INSN: B:66:0x00e0->B:31:0x00e0 BREAK  A[LOOP:0: B:25:0x00be->B:29:0x00d6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0115 -> B:50:0x011b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0152 -> B:58:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0170 -> B:51:0x011f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, defpackage.zr0 r23, defpackage.ph r24) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.e(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, zr0, ph):java.lang.Object");
    }

    public static final Object f(PointerInputScope pointerInputScope, wr0 wr0Var, sr0 sr0Var, sr0 sr0Var2, zr0 zr0Var, dy dyVar) {
        Object objB = ForEachGestureKt.b(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$5(null, sr0Var2, sr0Var, wr0Var, zr0Var), dyVar);
        return objB == dz.a ? objB : az2.a;
    }

    public static final Object g(PointerInputScope pointerInputScope, wr0 wr0Var, sr0 sr0Var, sr0 sr0Var2, zr0 zr0Var, ul2 ul2Var) {
        Object objB = ForEachGestureKt.b(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(null, sr0Var2, sr0Var, wr0Var, zr0Var), ul2Var);
        return objB == dz.a ? objB : az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:18:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object h(androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, long r5, defpackage.wr0 r7, defpackage.ph r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.t
            int r1 = r0.u
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            wr0 r4 = r0.s
            wr0 r4 = (defpackage.wr0) r4
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = r0.r
            defpackage.wz2.a0(r8)
            r7 = r4
            r4 = r5
            goto L49
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r4)
            r4 = 0
            return r4
        L34:
            defpackage.wz2.a0(r8)
        L37:
            r0.r = r4
            r8 = r7
            wr0 r8 = (defpackage.wr0) r8
            r0.s = r8
            r0.u = r2
            java.lang.Object r8 = b(r4, r5, r0)
            dz r5 = defpackage.dz.a
            if (r8 != r5) goto L49
            return r5
        L49:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L50
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L50:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.d(r8)
            if (r5 == 0) goto L59
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L59:
            r7.invoke(r8)
            long r5 = r8.a
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.h(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, wr0, ph):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095 A[LOOP:0: B:25:0x007f->B:29:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0099 A[EDGE_INSN: B:63:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:25:0x007f->B:29:0x0095], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0073 -> B:24:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object i(androidx.compose.ui.input.pointer.AwaitPointerEventScope r16, long r17, defpackage.wr0 r19, defpackage.ph r20) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.i(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, wr0, ph):java.lang.Object");
    }

    public static final boolean j(PointerEvent pointerEvent, long j) {
        Object obj;
        List list = pointerEvent.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (PointerId.a(((PointerInputChange) obj).a, j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null && pointerInputChange.d) {
            z = true;
        }
        return true ^ z;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x0095 A[LOOP:0: B:25:0x007f->B:29:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0099 A[EDGE_INSN: B:63:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:25:0x007f->B:29:0x0095], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0073 -> B:24:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object l(androidx.compose.ui.input.pointer.AwaitPointerEventScope r16, long r17, defpackage.wr0 r19, defpackage.ph r20) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.l(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, wr0, ph):java.lang.Object");
    }

    public static final float k(ViewConfiguration viewConfiguration, int i) {
        viewConfiguration.getClass();
        if (i == 2) {
            return viewConfiguration.a() * a;
        }
        return viewConfiguration.a();
    }
}
