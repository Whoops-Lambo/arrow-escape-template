package androidx.compose.foundation.shape;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/shape/PercentCornerSize;", "Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/ui/platform/InspectableValue;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final /* data */ class PercentCornerSize implements CornerSize, InspectableValue {
    public final float a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PercentCornerSize) && Float.valueOf(this.a).equals(Float.valueOf(((PercentCornerSize) obj).a));
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }

    public PercentCornerSize(float f) {
        this.a = f;
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f <= 100.0f) {
            return;
        }
        d.r("The percent should be in the range of [0, 100]");
        throw null;
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    public final float a(long j, Density density) {
        density.getClass();
        return (this.a / 100.0f) * Size.c(j);
    }
}
