package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.VelocityKt;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VelocityTracker {
    public final PointAtTime[] a;
    public int b;

    public final long a() {
        int i = this.b;
        PointAtTime[] pointAtTimeArr = this.a;
        PointAtTime pointAtTime = pointAtTimeArr[i];
        if (pointAtTime == null) {
            return VelocityKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ImpulseCalculator impulseCalculator = new ImpulseCalculator();
        ImpulseCalculator impulseCalculator2 = new ImpulseCalculator();
        int i2 = 0;
        do {
            i = (i + 1) % 20;
            PointAtTime pointAtTime2 = pointAtTimeArr[i];
            if (pointAtTime2 != null) {
                long j = pointAtTime2.a;
                long j2 = pointAtTime.b;
                long j3 = pointAtTime2.b;
                long j4 = j2 - j3;
                long jAbs = Math.abs(j3 - j2);
                if (j4 <= 100) {
                    if (jAbs > 40) {
                        impulseCalculator.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        impulseCalculator.b = Long.MAX_VALUE;
                        impulseCalculator.c = Float.NaN;
                        impulseCalculator.d = true;
                        impulseCalculator2.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        impulseCalculator2.b = Long.MAX_VALUE;
                        impulseCalculator2.c = Float.NaN;
                        impulseCalculator2.d = true;
                    }
                    long j5 = -j4;
                    impulseCalculator.a(j5, Offset.c(j));
                    impulseCalculator2.a(j5, Offset.d(j));
                    i2++;
                }
            }
            if (i == this.b) {
                break;
            }
        } while (i2 < 20);
        return i2 < 3 ? VelocityKt.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : VelocityKt.a(VelocityTrackerKt.a(impulseCalculator.a), VelocityTrackerKt.a(impulseCalculator2.a));
    }

    public VelocityTracker() {
        PointAtTime[] pointAtTimeArr = new PointAtTime[20];
        for (int i = 0; i < 20; i++) {
            pointAtTimeArr[i] = null;
        }
        this.a = pointAtTimeArr;
    }
}
