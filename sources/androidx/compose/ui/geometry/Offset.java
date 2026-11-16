package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "Companion", "packedValue", "", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Offset {
    public static final long b = OffsetKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public static final long c = OffsetKt.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final long d = OffsetKt.a(Float.NaN, Float.NaN);
    public static final /* synthetic */ int e = 0;
    public final long a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final float c(long j) {
        if (j != d) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        e32.i("Offset is unspecified");
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static final float d(long j) {
        if (j != d) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        e32.i("Offset is unspecified");
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Offset) {
            return this.a == ((Offset) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }

    public static final float b(long j) {
        return (float) Math.sqrt((d(j) * d(j)) + (c(j) * c(j)));
    }

    public static final long e(long j, long j2) {
        return OffsetKt.a(c(j) - c(j2), d(j) - d(j2));
    }

    public static final long f(long j, long j2) {
        return OffsetKt.a(c(j2) + c(j), d(j2) + d(j));
    }

    public static final long g(long j, float f) {
        return OffsetKt.a(c(j) * f, d(j) * f);
    }

    public static String h(long j) {
        if (OffsetKt.c(j)) {
            return "Offset(" + GeometryUtilsKt.a(c(j)) + ", " + GeometryUtilsKt.a(d(j)) + ')';
        }
        return "Offset.Unspecified";
    }
}
