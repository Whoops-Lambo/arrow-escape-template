package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.hg0;
import defpackage.n30;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class PaddingModifier extends InspectorValueInfo implements LayoutModifier {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;

    public final boolean equals(Object obj) {
        PaddingModifier paddingModifier = obj instanceof PaddingModifier ? (PaddingModifier) obj : null;
        return paddingModifier != null && Dp.a(this.b, paddingModifier.b) && Dp.a(this.c, paddingModifier.c) && Dp.a(this.d, paddingModifier.d) && Dp.a(this.e, paddingModifier.e) && this.f == paddingModifier.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + n30.b(this.e, n30.b(this.d, n30.b(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }

    public PaddingModifier(float f, float f2, float f3, float f4, wr0 wr0Var) {
        super(wr0Var);
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = true;
        if ((f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !Dp.a(f, Float.NaN)) || ((f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !Dp.a(f2, Float.NaN)) || ((f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !Dp.a(f3, Float.NaN)) || (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !Dp.a(f4, Float.NaN))))) {
            d.r("Padding must be non-negative");
            throw null;
        }
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public final MeasureResult s(MeasureScope measureScope, Measurable measurable, long j) {
        measureScope.getClass();
        measurable.getClass();
        int iMo1roundToPx0680j_4 = measureScope.mo1roundToPx0680j_4(this.d) + measureScope.mo1roundToPx0680j_4(this.b);
        int iMo1roundToPx0680j_5 = measureScope.mo1roundToPx0680j_4(this.e) + measureScope.mo1roundToPx0680j_4(this.c);
        Placeable placeableY = measurable.Y(ConstraintsKt.h(-iMo1roundToPx0680j_4, -iMo1roundToPx0680j_5, j));
        return measureScope.C(ConstraintsKt.f(placeableY.a + iMo1roundToPx0680j_4, j), ConstraintsKt.e(placeableY.b + iMo1roundToPx0680j_5, j), hg0.a, new PaddingModifier$measure$1(this, placeableY, measureScope));
    }
}
