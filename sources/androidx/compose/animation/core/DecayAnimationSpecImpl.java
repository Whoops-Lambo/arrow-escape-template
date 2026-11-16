package androidx.compose.animation.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/DecayAnimationSpecImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/DecayAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class DecayAnimationSpecImpl<T> implements DecayAnimationSpec<T> {
    public final FloatDecayAnimationSpec a;

    public DecayAnimationSpecImpl(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.a = floatDecayAnimationSpec;
    }

    @Override // androidx.compose.animation.core.DecayAnimationSpec
    public final VectorizedDecayAnimationSpec a(TwoWayConverter twoWayConverter) {
        twoWayConverter.getClass();
        return new VectorizedFloatDecaySpec(this.a);
    }
}
