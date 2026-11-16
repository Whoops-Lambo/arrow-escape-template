package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.j32;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ScrollExtensionsKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(ScrollableState scrollableState, float f, AnimationSpec animationSpec, fy fyVar) {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        j32 j32Var;
        if (fyVar instanceof ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1) fyVar;
            int i = scrollExtensionsKt$animateScrollBy$1.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$1.t = i - Integer.MIN_VALUE;
            } else {
                scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(fyVar);
            }
        } else {
            scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(fyVar);
        }
        Object obj = scrollExtensionsKt$animateScrollBy$1.s;
        int i2 = scrollExtensionsKt$animateScrollBy$1.t;
        if (i2 == 0) {
            wz2.a0(obj);
            j32 j32Var2 = new j32();
            zr0 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(f, animationSpec, j32Var2, null);
            scrollExtensionsKt$animateScrollBy$1.r = j32Var2;
            scrollExtensionsKt$animateScrollBy$1.t = 1;
            Object objC = scrollableState.c(MutatePriority.a, scrollExtensionsKt$animateScrollBy$2, scrollExtensionsKt$animateScrollBy$1);
            Object obj2 = dz.a;
            if (objC == obj2) {
                return obj2;
            }
            j32Var = j32Var2;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j32Var = scrollExtensionsKt$animateScrollBy$1.r;
            wz2.a0(obj);
        }
        return new Float(j32Var.a);
    }
}
