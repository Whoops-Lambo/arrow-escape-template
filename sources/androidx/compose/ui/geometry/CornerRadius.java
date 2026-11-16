package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius;", "", "Companion", "packedValue", "", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CornerRadius {
    public static final long a = CornerRadiusKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius$Companion;", "", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        return obj instanceof CornerRadius;
    }

    public final int hashCode() {
        return Long.hashCode(0L);
    }

    public final String toString() {
        return d(0L);
    }

    public static String d(long j) {
        if (b(j) == c(j)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.a(b(j)) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.a(b(j)) + ", " + GeometryUtilsKt.a(c(j)) + ')';
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
