package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import com.unity3d.services.UnityAdsConstants;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatDecaySpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {
    public final FloatDecayAnimationSpec a;
    public AnimationVector b;
    public AnimationVector c;
    public AnimationVector d;
    public final float e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getE() {
        return this.e;
    }

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.a = floatDecayAnimationSpec;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final AnimationVector a(long j, AnimationVector animationVector, AnimationVector animationVector2) {
        animationVector.getClass();
        animationVector2.getClass();
        if (this.c == null) {
            this.c = animationVector.c();
        }
        AnimationVector animationVector3 = this.c;
        if (animationVector3 != null) {
            int iB = animationVector3.b();
            int i = 0;
            while (true) {
                AnimationVector animationVector4 = this.c;
                if (i < iB) {
                    if (animationVector4 != null) {
                        animationVector4.e(this.a.c(j, animationVector2.a(i)), i);
                        i++;
                    } else {
                        s71.D("velocityVector");
                        throw null;
                    }
                } else {
                    if (animationVector4 != null) {
                        return animationVector4;
                    }
                    s71.D("velocityVector");
                    throw null;
                }
            }
        } else {
            s71.D("velocityVector");
            throw null;
        }
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final AnimationVector c(long j, AnimationVector animationVector, AnimationVector animationVector2) {
        animationVector.getClass();
        animationVector2.getClass();
        if (this.b == null) {
            this.b = animationVector.c();
        }
        AnimationVector animationVector3 = this.b;
        if (animationVector3 != null) {
            int iB = animationVector3.b();
            int i = 0;
            while (true) {
                AnimationVector animationVector4 = this.b;
                if (i < iB) {
                    if (animationVector4 != null) {
                        animationVector4.e(this.a.d(animationVector.a(i), animationVector2.a(i), j), i);
                        i++;
                    } else {
                        s71.D("valueVector");
                        throw null;
                    }
                } else {
                    if (animationVector4 != null) {
                        return animationVector4;
                    }
                    s71.D("valueVector");
                    throw null;
                }
            }
        } else {
            s71.D("valueVector");
            throw null;
        }
    }
}
