package androidx.compose.animation.core;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class EasingKt {
    public static final CubicBezierEasing a = new CubicBezierEasing(0.4f, 0.2f);
    public static final CubicBezierEasing b = new CubicBezierEasing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f);
    public static final Easing c = null;

    public static final Easing a() {
        return EasingKt$LinearEasing$1.a;
    }
}
