package androidx.compose.animation.core;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "fraction"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class EasingFunctionsKt$EaseInOutElastic$1 implements Easing {
    @Override // androidx.compose.animation.core.Easing
    public final float a(float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (f == 1.0f) {
            return 1.0f;
        }
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f || f > 0.5f) {
            return ((float) ((Math.sin(((double) ((f * 20.0f) - 11.125f)) * 1.3962634015954636d) * ((double) ((float) Math.pow(2.0d, ((-20.0f) * f) + 10.0f)))) / 2.0d)) + 1.0f;
        }
        float f2 = f * 20.0f;
        return (float) ((-(Math.sin(((double) (f2 - 11.125f)) * 1.3962634015954636d) * ((double) ((float) Math.pow(2.0d, f2 - 10.0f))))) / 2.0d);
    }
}
