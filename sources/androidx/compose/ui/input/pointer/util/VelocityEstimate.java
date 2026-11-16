package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import com.unity3d.services.UnityAdsConstants;
import defpackage.n30;
import defpackage.pv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final /* data */ class VelocityEstimate {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityEstimate$Companion;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VelocityEstimate) && Offset.a(0L, 0L) && Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).equals(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) && 0 == 0 && Offset.a(0L, 0L);
    }

    static {
        int i = Offset.e;
    }

    public final int hashCode() {
        int i = Offset.e;
        return Long.hashCode(0L) + pv1.d(n30.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Long.hashCode(0L) * 31, 31), 31, 0L);
    }

    public final String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + ((Object) Offset.h(0L)) + ", confidence=" + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + ", durationMillis=0, offset=" + ((Object) Offset.h(0L)) + ')';
    }
}
