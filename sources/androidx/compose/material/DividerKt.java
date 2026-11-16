package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DividerKt {
    public static final void a(float f, int i, long j, Composer composer, Modifier modifier) {
        int i2;
        float a;
        int i3;
        int i4;
        int i5;
        ComposerImpl composerImplT = composer.t(-1249392198);
        if ((i & 14) == 0) {
            if (composerImplT.l(modifier)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (composerImplT.q(j)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (composerImplT.n(f)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if (((i2 | 3072) & 5851) == 1170 && composerImplT.b()) {
            composerImplT.h();
        } else {
            composerImplT.r0();
            if ((i & 1) != 0 && !composerImplT.X()) {
                composerImplT.h();
            }
            composerImplT.S();
            composerImplT.B(1228914189);
            if (Dp.a(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                a = 1.0f / ((Density) composerImplT.v(CompositionLocalsKt.e)).getA();
            } else {
                a = f;
            }
            composerImplT.R(false);
            BoxKt.a(BackgroundKt.b(SizeKt.f(modifier.N(Modifier.Companion.a).N(SizeKt.a), a), j, RectangleShapeKt.a), composerImplT, 0);
        }
        RecomposeScopeImpl recomposeScopeImplT = composerImplT.T();
        if (recomposeScopeImplT == null) {
            return;
        }
        recomposeScopeImplT.d = new DividerKt$Divider$1(modifier, j, f, i);
    }
}
