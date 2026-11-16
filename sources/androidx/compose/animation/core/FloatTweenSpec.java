package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.unity3d.services.UnityAdsConstants;
import defpackage.tb5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FloatTweenSpec implements FloatAnimationSpec {
    public final int a;
    public final int b;
    public final Easing c;

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final long c(float f, float f2, float f3) {
        return ((long) (this.b + this.a)) * 1000000;
    }

    public FloatTweenSpec(int i, int i2, Easing easing) {
        easing.getClass();
        this.a = i;
        this.b = i2;
        this.c = easing;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float b(long j, float f, float f2, float f3) {
        long jI = tb5.i((j / 1000000) - ((long) this.b), 0L, this.a);
        if (jI < 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (jI == 0) {
            return f3;
        }
        return (e(jI * 1000000, f, f2, f3) - e((jI - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float e(long j, float f, float f2, float f3) {
        float f4;
        long j2 = (j / 1000000) - ((long) this.b);
        int i = this.a;
        long jI = tb5.i(j2, 0L, i);
        if (i == 0) {
            f4 = 1.0f;
        } else {
            f4 = jI / i;
        }
        float fA = this.c.a(tb5.f(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        TwoWayConverter twoWayConverter = VectorConvertersKt.a;
        return (f2 * fA) + ((1.0f - fA) * f);
    }
}
