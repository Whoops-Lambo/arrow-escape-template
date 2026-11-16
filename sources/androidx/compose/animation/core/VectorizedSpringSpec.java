package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.eu;
import defpackage.i71;
import defpackage.j71;
import defpackage.tb5;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/VectorizedSpringSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VectorizedSpringSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public final /* synthetic */ VectorizedFloatAnimationSpec a;

    public VectorizedSpringSpec(final float f, final float f2, final AnimationVector animationVector) {
        this.a = new VectorizedFloatAnimationSpec(animationVector != null ? new Animations(f, f2, animationVector) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1
            public final ArrayList a;

            @Override // androidx.compose.animation.core.Animations
            public final FloatAnimationSpec get(int i) {
                return (FloatSpringSpec) this.a.get(i);
            }

            {
                j71 j71VarD = tb5.D(0, animationVector.b());
                ArrayList arrayList = new ArrayList(eu.f(j71VarD, 10));
                i71 it = j71VarD.iterator();
                while (it.d) {
                    arrayList.add(new FloatSpringSpec(f, f2, animationVector.a(it.nextInt())));
                }
                this.a = arrayList;
            }
        } : new Animations(f, f2) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2
            public final FloatSpringSpec a;

            @Override // androidx.compose.animation.core.Animations
            public final FloatAnimationSpec get(int i) {
                return this.a;
            }

            {
                this.a = new FloatSpringSpec(f, f2, 0.01f);
            }
        });
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public final boolean a() {
        this.a.getClass();
        return false;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        animationVector.getClass();
        animationVector2.getClass();
        animationVector3.getClass();
        return this.a.b(animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector d(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        animationVector.getClass();
        animationVector2.getClass();
        animationVector3.getClass();
        return this.a.d(animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector e(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        animationVector.getClass();
        animationVector2.getClass();
        animationVector3.getClass();
        return this.a.e(j, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        animationVector.getClass();
        animationVector2.getClass();
        animationVector3.getClass();
        return this.a.f(j, animationVector, animationVector2, animationVector3);
    }
}
