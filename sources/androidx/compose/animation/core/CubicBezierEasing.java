package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CubicBezierEasing implements Easing {
    public final float a;
    public final float b;

    @Override // androidx.compose.animation.core.Easing
    public final float a(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f >= 1.0f) {
            return f;
        }
        float f2 = 0.0f;
        float f3 = 1.0f;
        while (true) {
            float f4 = (f2 + f3) / 2.0f;
            float fB = b(this.a, this.b, f4);
            if (Math.abs(f - fB) < 0.001f) {
                return b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f4);
            }
            if (fB < f) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
    }

    public static float b(float f, float f2, float f3) {
        float f4 = 1.0f - f3;
        return (f3 * f3 * f3) + (3.0f * f2 * f4 * f3 * f3) + (f * 3.0f * f4 * f4 * f3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
        return this.a == cubicBezierEasing.a && this.b == cubicBezierEasing.b;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + n30.b(this.b, n30.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.hashCode(this.a) * 31, 31), 31);
    }

    public CubicBezierEasing(float f, float f2) {
        this.a = f;
        this.b = f2;
    }
}
