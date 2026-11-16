package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.n30;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/SpringSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {
    public final float a;
    public final float b;
    public final Object c;

    public final boolean equals(Object obj) {
        if (obj instanceof SpringSpec) {
            SpringSpec springSpec = (SpringSpec) obj;
            if (springSpec.a == this.a && springSpec.b == this.b && s71.b(springSpec.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + n30.b(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public SpringSpec(Object obj, float f) {
        this.a = 1.0f;
        this.b = f;
        this.c = obj;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        AnimationVector animationVector;
        twoWayConverter.getClass();
        Object obj = this.c;
        if (obj == null) {
            animationVector = null;
        } else {
            animationVector = (AnimationVector) twoWayConverter.getA().invoke(obj);
        }
        return new VectorizedSpringSpec(this.a, this.b, animationVector);
    }

    public /* synthetic */ SpringSpec(Object obj, int i) {
        this((i & 4) != 0 ? null : obj, 1500.0f);
    }
}
