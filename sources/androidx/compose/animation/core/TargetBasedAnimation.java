package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.jc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/TargetBasedAnimation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/Animation;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public final VectorizedAnimationSpec a;
    public final TwoWayConverter b;
    public final Object c;
    public final Object d;
    public final AnimationVector e;
    public final AnimationVector f;
    public final AnimationVector g;
    public final long h;
    public final AnimationVector i;

    @Override // androidx.compose.animation.core.Animation
    public final boolean a() {
        return this.a.a();
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getH() {
        return this.h;
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: d, reason: from getter */
    public final TwoWayConverter getB() {
        return this.b;
    }

    @Override // androidx.compose.animation.core.Animation
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Object getD() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetBasedAnimation: ");
        sb.append(this.c);
        sb.append(" -> ");
        sb.append(this.d);
        sb.append(",initial velocity: ");
        sb.append(this.g);
        sb.append(", duration: ");
        return jc1.m(this.h / 1000000, " ms", sb);
    }

    public TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector) {
        AnimationVector animationVectorC;
        animationSpec.getClass();
        twoWayConverter.getClass();
        VectorizedAnimationSpec vectorizedAnimationSpecA = animationSpec.a(twoWayConverter);
        vectorizedAnimationSpecA.getClass();
        this.a = vectorizedAnimationSpecA;
        this.b = twoWayConverter;
        this.c = obj;
        this.d = obj2;
        AnimationVector animationVector2 = (AnimationVector) twoWayConverter.getA().invoke(obj);
        this.e = animationVector2;
        AnimationVector animationVector3 = (AnimationVector) twoWayConverter.getA().invoke(obj2);
        this.f = animationVector3;
        if (animationVector != null) {
            animationVectorC = AnimationVectorsKt.a(animationVector);
        } else {
            AnimationVector animationVector4 = (AnimationVector) twoWayConverter.getA().invoke(obj);
            animationVector4.getClass();
            animationVectorC = animationVector4.c();
        }
        this.g = animationVectorC;
        this.h = vectorizedAnimationSpecA.b(animationVector2, animationVector3, animationVectorC);
        this.i = vectorizedAnimationSpecA.d(animationVector2, animationVector3, animationVectorC);
    }

    @Override // androidx.compose.animation.core.Animation
    public final Object e(long j) {
        if (!b(j)) {
            return this.b.getB().invoke(this.a.f(j, this.e, this.f, this.g));
        }
        return this.d;
    }

    @Override // androidx.compose.animation.core.Animation
    public final AnimationVector g(long j) {
        if (!b(j)) {
            return this.a.e(j, this.e, this.f, this.g);
        }
        return this.i;
    }
}
