package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class BoxWithConstraintsKt {
    public static final void a(Modifier modifier, Alignment alignment, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        ComposerImpl composerImplT = composer.t(1781813501);
        if ((i & 14) == 0) {
            if (composerImplT.l(modifier)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 432;
        if ((i & 7168) == 0) {
            if (composerImplT.l(composableLambdaImpl)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i5 |= i3;
        }
        if ((i5 & 5851) == 1170 && composerImplT.b()) {
            composerImplT.h();
        } else {
            alignment = Alignment.Companion.a;
            MeasurePolicy measurePolicyC = BoxKt.c(alignment, false, composerImplT);
            composerImplT.B(511388516);
            boolean zL = composerImplT.l(composableLambdaImpl) | composerImplT.l(measurePolicyC);
            Object objB0 = composerImplT.b0();
            if (zL || objB0 == Composer.Companion.a) {
                objB0 = new BoxWithConstraintsKt$BoxWithConstraints$1$1(measurePolicyC, composableLambdaImpl, i5);
                composerImplT.C0(objB0);
            }
            composerImplT.R(false);
            SubcomposeLayoutKt.a(modifier, (zr0) objB0, composerImplT, i5 & 14, 0);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new BoxWithConstraintsKt$BoxWithConstraints$2(modifier, alignment, composableLambdaImpl, i);
    }
}
