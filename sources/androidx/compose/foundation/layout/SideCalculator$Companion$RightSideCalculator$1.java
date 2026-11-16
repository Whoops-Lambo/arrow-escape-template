package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SideCalculator$Companion$RightSideCalculator$1 implements SideCalculator {
    @Override // androidx.compose.foundation.layout.SideCalculator
    public final float d(float f, float f2) {
        return -f;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final long c(long j) {
        return androidx.compose.ui.geometry.OffsetKt.a(Offset.c(j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final Insets e(Insets insets, int i) {
        Insets insetsOf = Insets.of(insets.left, insets.top, i, insets.bottom);
        insetsOf.getClass();
        return insetsOf;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final int f(Insets insets) {
        return insets.right;
    }

    @Override // androidx.compose.foundation.layout.SideCalculator
    public final long g(long j, float f) {
        return VelocityKt.a(Velocity.a(j) + f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
