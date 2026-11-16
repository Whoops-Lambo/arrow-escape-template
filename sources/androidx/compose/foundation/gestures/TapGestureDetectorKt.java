package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.as0;
import defpackage.az2;
import defpackage.dz;
import defpackage.e52;
import defpackage.kc2;
import defpackage.ul2;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TapGestureDetectorKt {
    public static final as0 a = new TapGestureDetectorKt$NoPressGesture$1(3, null);

    public static Object b(AwaitPointerEventScope awaitPointerEventScope, e52 e52Var) {
        return c(awaitPointerEventScope, PointerEventPass.b, true, e52Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[LOOP:1: B:22:0x005e->B:26:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0060
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, defpackage.ph r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.s
            int r1 = r0.t
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = r0.r
            defpackage.wz2.a0(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.wz2.a0(r8)
        L31:
            r0.r = r7
            r0.t = r2
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.b
            java.lang.Object r8 = r7.b0(r8, r0)
            dz r1 = defpackage.dz.a
            if (r8 != r1) goto L40
            return r1
        L40:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            java.util.List r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            r6.a()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.util.List r8 = r8.a
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6e
            java.lang.Object r3 = r8.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.ui.input.pointer.PointerInputChange) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L6b
            goto L31
        L6b:
            int r4 = r4 + 1
            goto L5e
        L6e:
            az2 r7 = defpackage.az2.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, ph):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a A[LOOP:0: B:19:0x0053->B:26:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:18:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, androidx.compose.ui.input.pointer.PointerEventPass r9, boolean r10, defpackage.ph r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDownOnPass$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.u
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            boolean r8 = r0.t
            androidx.compose.ui.input.pointer.PointerEventPass r9 = r0.s
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = r0.r
            defpackage.wz2.a0(r11)
            r7 = r10
            r10 = r8
            r8 = r7
            goto L49
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r8)
            r8 = 0
            return r8
        L35:
            defpackage.wz2.a0(r11)
        L38:
            r0.r = r8
            r0.s = r9
            r0.t = r10
            r0.v = r2
            java.lang.Object r11 = r8.b0(r9, r0)
            dz r1 = defpackage.dz.a
            if (r11 != r1) goto L49
            return r1
        L49:
            androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
            java.util.List r1 = r11.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L53:
            if (r5 >= r3) goto L6d
            java.lang.Object r6 = r1.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            if (r10 == 0) goto L62
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.a(r6)
            goto L66
        L62:
            boolean r6 = androidx.compose.ui.input.pointer.PointerEventKt.b(r6)
        L66:
            if (r6 != 0) goto L6a
            r1 = r4
            goto L6e
        L6a:
            int r5 = r5 + 1
            goto L53
        L6d:
            r1 = r2
        L6e:
            if (r1 == 0) goto L38
            java.util.List r8 = r11.a
            java.lang.Object r8 = r8.get(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.c(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, boolean, ph):java.lang.Object");
    }

    public static final Object d(PointerInputScope pointerInputScope, as0 as0Var, wr0 wr0Var, ul2 ul2Var) {
        Object objB = ForEachGestureKt.b(pointerInputScope, new TapGestureDetectorKt$detectTapAndPress$2(new PressGestureScopeImpl(pointerInputScope), as0Var, wr0Var, null), ul2Var);
        return objB == dz.a ? objB : az2.a;
    }

    public static Object e(PointerInputScope pointerInputScope, as0 as0Var, wr0 wr0Var, ul2 ul2Var, int i) {
        if ((i & 4) != 0) {
            as0Var = a;
        }
        Object objJ = kc2.j(new TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, as0Var, null, null, wr0Var, null), ul2Var);
        return objJ == dz.a ? objJ : az2.a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae A[LOOP:1: B:21:0x0053->B:41:0x00ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0090 -> B:35:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object f(androidx.compose.ui.input.pointer.AwaitPointerEventScope r13, defpackage.ph r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.s
            int r1 = r0.t
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            dz r6 = defpackage.dz.a
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L34
            if (r1 != r3) goto L2e
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = r0.r
            defpackage.wz2.a0(r14)
            goto L93
        L2e:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r13)
            return r2
        L34:
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = r0.r
            defpackage.wz2.a0(r14)
            goto L4a
        L3a:
            defpackage.wz2.a0(r14)
        L3d:
            r0.r = r13
            r0.t = r5
            androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.ui.input.pointer.PointerEventPass.b
            java.lang.Object r14 = r13.b0(r14, r0)
            if (r14 != r6) goto L4a
            goto L92
        L4a:
            androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.ui.input.pointer.PointerEvent) r14
            java.util.List r14 = r14.a
            int r1 = r14.size()
            r7 = r4
        L53:
            if (r7 >= r1) goto Lb1
            java.lang.Object r8 = r14.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            boolean r8 = androidx.compose.ui.input.pointer.PointerEventKt.c(r8)
            if (r8 != 0) goto Lae
            int r1 = r14.size()
            r7 = r4
        L66:
            if (r7 >= r1) goto L86
            java.lang.Object r8 = r14.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            boolean r9 = r8.b()
            if (r9 != 0) goto Laa
            long r9 = r13.d()
            long r11 = r13.i0()
            boolean r8 = androidx.compose.ui.input.pointer.PointerEventKt.f(r8, r9, r11)
            if (r8 == 0) goto L83
            goto Laa
        L83:
            int r7 = r7 + 1
            goto L66
        L86:
            r0.r = r13
            r0.t = r3
            androidx.compose.ui.input.pointer.PointerEventPass r14 = androidx.compose.ui.input.pointer.PointerEventPass.c
            java.lang.Object r14 = r13.b0(r14, r0)
            if (r14 != r6) goto L93
        L92:
            return r6
        L93:
            androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.ui.input.pointer.PointerEvent) r14
            java.util.List r14 = r14.a
            int r1 = r14.size()
            r7 = r4
        L9c:
            if (r7 >= r1) goto L3d
            java.lang.Object r8 = r14.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            boolean r8 = r8.b()
            if (r8 == 0) goto Lab
        Laa:
            return r2
        Lab:
            int r7 = r7 + 1
            goto L9c
        Lae:
            int r7 = r7 + 1
            goto L53
        Lb1:
            java.lang.Object r13 = r14.get(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.f(androidx.compose.ui.input.pointer.AwaitPointerEventScope, ph):java.lang.Object");
    }
}
