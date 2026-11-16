package androidx.compose.material;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ProgressIndicatorKt {
    public static final CubicBezierEasing a = new CubicBezierEasing(0.2f, 0.8f);
    public static final CubicBezierEasing b = new CubicBezierEasing(0.4f, 1.0f);
    public static final CubicBezierEasing c = new CubicBezierEasing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.65f);
    public static final CubicBezierEasing d = new CubicBezierEasing(0.1f, 0.45f);
    public static final CubicBezierEasing e = new CubicBezierEasing(0.4f, 0.2f);

    public static final void a(DrawScope drawScope, float f, float f2, long j, float f3) {
        boolean z;
        float f4;
        float f5;
        float fD = Size.d(drawScope.i());
        float fB = Size.b(drawScope.i()) / 2.0f;
        if (drawScope.getLayoutDirection() == LayoutDirection.a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f;
        } else {
            f4 = 1.0f - f2;
        }
        float f6 = f4 * fD;
        if (z) {
            f5 = f2;
        } else {
            f5 = 1.0f - f;
        }
        drawScope.d0(j, OffsetKt.a(f6, fB), OffsetKt.a(f5 * fD, fB), f3, (496 & 16) != 0 ? 0 : 1);
    }
}
