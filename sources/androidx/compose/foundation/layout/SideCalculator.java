package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bc\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator;", "", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
interface SideCalculator {
    public static final Companion a = Companion.a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator$Companion;", "", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static final SideCalculator$Companion$LeftSideCalculator$1 b = new SideCalculator$Companion$LeftSideCalculator$1();
        public static final SideCalculator$Companion$RightSideCalculator$1 c = new SideCalculator$Companion$RightSideCalculator$1();
        public static final SideCalculator$Companion$BottomSideCalculator$1 d = new SideCalculator$Companion$BottomSideCalculator$1();
    }

    long c(long j);

    float d(float f, float f2);

    Insets e(Insets insets, int i);

    int f(Insets insets);

    long g(long j, float f);

    default float a(float f, float f2) {
        float fD = d(f, f2);
        if (fD < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return fD;
    }

    default float b(float f, float f2) {
        float fD = d(f, f2);
        if (fD > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return fD;
    }
}
