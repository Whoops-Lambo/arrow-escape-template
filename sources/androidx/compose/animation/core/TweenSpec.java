package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/TweenSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TweenSpec<T> implements DurationBasedAnimationSpec<T> {
    public final int a;
    public final int b;
    public final Easing c;

    public /* synthetic */ TweenSpec(int i, Easing easing, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? EasingKt.a : easing);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TweenSpec) {
            TweenSpec tweenSpec = (TweenSpec) obj;
            if (tweenSpec.a == this.a && tweenSpec.b == this.b && s71.b(tweenSpec.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        twoWayConverter.getClass();
        return new VectorizedTweenSpec(this.a, this.b, this.c);
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter) {
        twoWayConverter.getClass();
        return new VectorizedTweenSpec(this.a, this.b, this.c);
    }

    public TweenSpec(int i, int i2, Easing easing) {
        easing.getClass();
        this.a = i;
        this.b = i2;
        this.c = easing;
    }
}
