package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.i71;
import defpackage.s71;
import defpackage.tb5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public final Animations a;
    public AnimationVector b;
    public AnimationVector c;
    public AnimationVector d;

    public VectorizedFloatAnimationSpec(final FloatAnimationSpec floatAnimationSpec) {
        this.a = new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public final FloatAnimationSpec get(int i) {
                return floatAnimationSpec;
            }
        };
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        animationVector.getClass();
        animationVector2.getClass();
        animationVector3.getClass();
        i71 it = tb5.D(0, animationVector.b()).iterator();
        long jMax = 0;
        while (it.d) {
            int iNextInt = it.nextInt();
            jMax = Math.max(jMax, this.a.get(iNextInt).c(animationVector.a(iNextInt), animationVector2.a(iNextInt), animationVector3.a(iNextInt)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector d(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        animationVector.getClass();
        animationVector2.getClass();
        animationVector3.getClass();
        if (this.d == null) {
            this.d = animationVector3.c();
        }
        AnimationVector animationVector4 = this.d;
        if (animationVector4 != null) {
            int iB = animationVector4.b();
            int i = 0;
            while (true) {
                AnimationVector animationVector5 = this.d;
                if (i < iB) {
                    if (animationVector5 != null) {
                        animationVector5.e(this.a.get(i).d(animationVector.a(i), animationVector2.a(i), animationVector3.a(i)), i);
                        i++;
                    } else {
                        s71.D("endVelocityVector");
                        throw null;
                    }
                } else {
                    if (animationVector5 != null) {
                        return animationVector5;
                    }
                    s71.D("endVelocityVector");
                    throw null;
                }
            }
        } else {
            s71.D("endVelocityVector");
            throw null;
        }
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector e(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        animationVector.getClass();
        animationVector2.getClass();
        animationVector3.getClass();
        if (this.c == null) {
            this.c = animationVector3.c();
        }
        AnimationVector animationVector4 = this.c;
        if (animationVector4 != null) {
            int iB = animationVector4.b();
            int i = 0;
            while (true) {
                AnimationVector animationVector5 = this.c;
                if (i < iB) {
                    if (animationVector5 != null) {
                        animationVector5.e(this.a.get(i).b(j, animationVector.a(i), animationVector2.a(i), animationVector3.a(i)), i);
                        i++;
                    } else {
                        s71.D("velocityVector");
                        throw null;
                    }
                } else {
                    if (animationVector5 != null) {
                        return animationVector5;
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

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        animationVector.getClass();
        animationVector2.getClass();
        animationVector3.getClass();
        if (this.b == null) {
            this.b = animationVector.c();
        }
        AnimationVector animationVector4 = this.b;
        if (animationVector4 != null) {
            int iB = animationVector4.b();
            int i = 0;
            while (true) {
                AnimationVector animationVector5 = this.b;
                if (i < iB) {
                    if (animationVector5 != null) {
                        animationVector5.e(this.a.get(i).e(j, animationVector.a(i), animationVector2.a(i), animationVector3.a(i)), i);
                        i++;
                    } else {
                        s71.D("valueVector");
                        throw null;
                    }
                } else {
                    if (animationVector5 != null) {
                        return animationVector5;
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

    public VectorizedFloatAnimationSpec(Animations animations) {
        this.a = animations;
    }
}
