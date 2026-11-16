package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/OverscrollConfiguration;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OverscrollConfiguration {
    public final long a;
    public final PaddingValuesImpl b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (OverscrollConfiguration.class.equals(obj != null ? obj.getClass() : null)) {
            if (obj == null) {
                d.w("null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
                return false;
            }
            OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) obj;
            if (Color.c(this.a, overscrollConfiguration.a) && s71.b(this.b, overscrollConfiguration.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = Color.j;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) Color.i(this.a)) + ", drawPadding=" + this.b + ')';
    }

    public OverscrollConfiguration() {
        long jC = ColorKt.c(4284900966L);
        PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.a = jC;
        this.b = paddingValuesImpl;
    }
}
