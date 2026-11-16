package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "Companion", "packedValue", "", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DpOffset {
    public static final long b;
    public static final /* synthetic */ int c = 0;
    public final long a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        DpKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        b = DpKt.a(Float.NaN, Float.NaN);
    }

    public static final float a(long j) {
        if (j != b) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        e32.i("DpOffset is unspecified");
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static final float b(long j) {
        if (j != b) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        e32.i("DpOffset is unspecified");
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static String c(long j) {
        if (j == b) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) Dp.b(a(j))) + ", " + ((Object) Dp.b(b(j))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DpOffset) {
            return this.a == ((DpOffset) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
