package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class BringIntoViewRequesterImpl implements BringIntoViewRequester {
    public final MutableVector a;

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r11 >= r13) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r5 != r7) goto L36;
     */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.compose.ui.geometry.Rect r12, defpackage.fy r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            int r1 = r0.x
            r2 = 0
            az2 r3 = defpackage.az2.a
            r4 = 1
            if (r1 == 0) goto L38
            if (r1 != r4) goto L32
            int r11 = r0.u
            int r12 = r0.t
            java.lang.Object[] r1 = r0.s
            androidx.compose.ui.geometry.Rect r5 = r0.r
            defpackage.wz2.a0(r13)
            r13 = r12
            r12 = r5
            goto L86
        L32:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r11)
            return r2
        L38:
            defpackage.wz2.a0(r13)
            androidx.compose.runtime.collection.MutableVector r11 = r11.a
            int r13 = r11.c
            if (r13 <= 0) goto L89
            java.lang.Object[] r11 = r11.a
            r1 = 0
            r10 = r1
            r1 = r11
            r11 = r10
        L47:
            r5 = r1[r11]
            androidx.compose.foundation.relocation.BringIntoViewRequesterModifier r5 = (androidx.compose.foundation.relocation.BringIntoViewRequesterModifier) r5
            r0.r = r12
            r0.s = r1
            r0.t = r13
            r0.u = r11
            r0.x = r4
            androidx.compose.ui.layout.LayoutCoordinates r6 = r5.c
            if (r6 == 0) goto L60
            boolean r7 = r6.s()
            if (r7 == 0) goto L60
            goto L61
        L60:
            r6 = r2
        L61:
            dz r7 = defpackage.dz.a
            if (r6 != 0) goto L67
        L65:
            r5 = r3
            goto L83
        L67:
            if (r12 != 0) goto L76
            long r8 = r6.d()
            long r8 = androidx.compose.ui.unit.IntSizeKt.b(r8)
            androidx.compose.ui.geometry.Rect r8 = androidx.compose.ui.geometry.SizeKt.c(r8)
            goto L77
        L76:
            r8 = r12
        L77:
            androidx.compose.foundation.relocation.BringIntoViewParent r9 = r5.b
            if (r9 != 0) goto L7d
            androidx.compose.foundation.relocation.BringIntoViewParent r9 = r5.a
        L7d:
            java.lang.Object r5 = r9.b(r8, r6, r0)
            if (r5 != r7) goto L65
        L83:
            if (r5 != r7) goto L86
            return r7
        L86:
            int r11 = r11 + r4
            if (r11 < r13) goto L47
        L89:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.a(androidx.compose.ui.geometry.Rect, fy):java.lang.Object");
    }

    public BringIntoViewRequesterImpl() {
        MutableVector mutableVector = new MutableVector();
        mutableVector.a = new BringIntoViewRequesterModifier[16];
        mutableVector.c = 0;
        this.a = mutableVector;
    }
}
