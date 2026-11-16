package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/FloatExponentialDecaySpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long a(float f) {
        return ((long) ((((float) Math.log(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT / Math.abs(f))) * 1000.0f) / UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float b(float f, float f2) {
        if (Math.abs(f2) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f;
        }
        double dLog = (Math.log(Math.abs(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT / f2)) / 0.0d) * 1000.0d;
        float f3 = f2 / UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return (f3 * ((float) Math.exp((0.0d * dLog) / 1000.0d))) + (f - f3);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float c(long j, float f) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float d(float f, float f2, long j) {
        float f3 = f2 / UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return (f3 * ((float) Math.exp((UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * (j / 1000000)) / 1000.0f))) + (f - f3);
    }
}
