package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import defpackage.as0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DragLogic;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DragLogic {
    public final as0 a;
    public final as0 b;
    public final MutableState c;
    public final MutableInteractionSource d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r1.a(r6, r0) == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r7.invoke(r8, r9, r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.cz r8, defpackage.fy r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragCancel$1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragLogic$processDragCancel$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragCancel$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.t
            int r1 = r0.v
            r2 = 2
            r3 = 1
            r4 = 0
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.wz2.a0(r9)
            goto L78
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r7)
            return r4
        L31:
            cz r8 = r0.s
            java.lang.Object r7 = r0.r
            androidx.compose.foundation.gestures.DragLogic r7 = (androidx.compose.foundation.gestures.DragLogic) r7
            defpackage.wz2.a0(r9)
            goto L5e
        L3b:
            defpackage.wz2.a0(r9)
            androidx.compose.runtime.MutableState r9 = r7.c
            java.lang.Object r9 = r9.getA()
            androidx.compose.foundation.interaction.DragInteraction$Start r9 = (androidx.compose.foundation.interaction.DragInteraction.Start) r9
            if (r9 == 0) goto L63
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.d
            if (r1 == 0) goto L5e
            androidx.compose.foundation.interaction.DragInteraction$Cancel r6 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r6.<init>(r9)
            r0.r = r7
            r0.s = r8
            r0.v = r3
            java.lang.Object r9 = r1.a(r6, r0)
            if (r9 != r5) goto L5e
            goto L77
        L5e:
            androidx.compose.runtime.MutableState r9 = r7.c
            r9.setValue(r4)
        L63:
            as0 r7 = r7.b
            java.lang.Float r9 = new java.lang.Float
            r1 = 0
            r9.<init>(r1)
            r0.r = r4
            r0.s = r4
            r0.v = r2
            java.lang.Object r7 = r7.invoke(r8, r9, r0)
            if (r7 != r5) goto L78
        L77:
            return r5
        L78:
            az2 r7 = defpackage.az2.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.a(cz, fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r8.invoke(r9, r1, r0) == r6) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.cz r9, androidx.compose.foundation.gestures.DragEvent.DragStarted r10, defpackage.fy r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.DragLogic$processDragStart$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragStart$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragLogic$processDragStart$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStart$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.v
            int r1 = r0.x
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            dz r6 = defpackage.dz.a
            if (r1 == 0) goto L4f
            if (r1 == r4) goto L43
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            defpackage.wz2.a0(r11)
            goto Lb7
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r8)
            return r5
        L35:
            androidx.compose.foundation.interaction.DragInteraction$Start r8 = r0.u
            androidx.compose.foundation.gestures.DragEvent$DragStarted r9 = r0.t
            cz r10 = r0.s
            java.lang.Object r1 = r0.r
            androidx.compose.foundation.gestures.DragLogic r1 = (androidx.compose.foundation.gestures.DragLogic) r1
            defpackage.wz2.a0(r11)
            goto L93
        L43:
            androidx.compose.foundation.gestures.DragEvent$DragStarted r10 = r0.t
            cz r9 = r0.s
            java.lang.Object r8 = r0.r
            androidx.compose.foundation.gestures.DragLogic r8 = (androidx.compose.foundation.gestures.DragLogic) r8
            defpackage.wz2.a0(r11)
            goto L74
        L4f:
            defpackage.wz2.a0(r11)
            androidx.compose.runtime.MutableState r11 = r8.c
            java.lang.Object r11 = r11.getA()
            androidx.compose.foundation.interaction.DragInteraction$Start r11 = (androidx.compose.foundation.interaction.DragInteraction.Start) r11
            if (r11 == 0) goto L74
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r8.d
            if (r1 == 0) goto L74
            androidx.compose.foundation.interaction.DragInteraction$Cancel r7 = new androidx.compose.foundation.interaction.DragInteraction$Cancel
            r7.<init>(r11)
            r0.r = r8
            r0.s = r9
            r0.t = r10
            r0.x = r4
            java.lang.Object r11 = r1.a(r7, r0)
            if (r11 != r6) goto L74
            goto Lb6
        L74:
            androidx.compose.foundation.interaction.DragInteraction$Start r11 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r11.<init>()
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r8.d
            if (r1 == 0) goto L98
            r0.r = r8
            r0.s = r9
            r0.t = r10
            r0.u = r11
            r0.x = r3
            java.lang.Object r1 = r1.a(r11, r0)
            if (r1 != r6) goto L8e
            goto Lb6
        L8e:
            r1 = r10
            r10 = r9
            r9 = r1
            r1 = r8
            r8 = r11
        L93:
            r11 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            r8 = r1
        L98:
            androidx.compose.runtime.MutableState r1 = r8.c
            r1.setValue(r11)
            as0 r8 = r8.a
            long r10 = r10.a
            androidx.compose.ui.geometry.Offset r1 = new androidx.compose.ui.geometry.Offset
            r1.<init>(r10)
            r0.r = r5
            r0.s = r5
            r0.t = r5
            r0.u = r5
            r0.x = r2
            java.lang.Object r8 = r8.invoke(r9, r1, r0)
            if (r8 != r6) goto Lb7
        Lb6:
            return r6
        Lb7:
            az2 r8 = defpackage.az2.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.b(cz, androidx.compose.foundation.gestures.DragEvent$DragStarted, fy):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r1.a(r6, r0) == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r7.invoke(r8, r10, r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.cz r8, androidx.compose.foundation.gestures.DragEvent.DragStopped r9, defpackage.fy r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = (androidx.compose.foundation.gestures.DragLogic$processDragStop$1) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragLogic$processDragStop$1 r0 = new androidx.compose.foundation.gestures.DragLogic$processDragStop$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.u
            int r1 = r0.w
            r2 = 2
            r3 = 1
            r4 = 0
            dz r5 = defpackage.dz.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.wz2.a0(r10)
            goto L7f
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r7)
            return r4
        L31:
            androidx.compose.foundation.gestures.DragEvent$DragStopped r9 = r0.t
            cz r8 = r0.s
            java.lang.Object r7 = r0.r
            androidx.compose.foundation.gestures.DragLogic r7 = (androidx.compose.foundation.gestures.DragLogic) r7
            defpackage.wz2.a0(r10)
            goto L62
        L3d:
            defpackage.wz2.a0(r10)
            androidx.compose.runtime.MutableState r10 = r7.c
            java.lang.Object r10 = r10.getA()
            androidx.compose.foundation.interaction.DragInteraction$Start r10 = (androidx.compose.foundation.interaction.DragInteraction.Start) r10
            if (r10 == 0) goto L67
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = r7.d
            if (r1 == 0) goto L62
            androidx.compose.foundation.interaction.DragInteraction$Stop r6 = new androidx.compose.foundation.interaction.DragInteraction$Stop
            r6.<init>(r10)
            r0.r = r7
            r0.s = r8
            r0.t = r9
            r0.w = r3
            java.lang.Object r10 = r1.a(r6, r0)
            if (r10 != r5) goto L62
            goto L7e
        L62:
            androidx.compose.runtime.MutableState r10 = r7.c
            r10.setValue(r4)
        L67:
            as0 r7 = r7.b
            float r9 = r9.a
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r9)
            r0.r = r4
            r0.s = r4
            r0.t = r4
            r0.w = r2
            java.lang.Object r7 = r7.invoke(r8, r10, r0)
            if (r7 != r5) goto L7f
        L7e:
            return r5
        L7f:
            az2 r7 = defpackage.az2.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragLogic.c(cz, androidx.compose.foundation.gestures.DragEvent$DragStopped, fy):java.lang.Object");
    }

    public DragLogic(as0 as0Var, as0 as0Var2, MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        mutableState.getClass();
        this.a = as0Var;
        this.b = as0Var2;
        this.c = mutableState;
        this.d = mutableInteractionSource;
    }
}
