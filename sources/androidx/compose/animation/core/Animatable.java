package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.s71;
import defpackage.tb5;
import defpackage.ul2;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/Animatable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Animatable<T, V extends AnimationVector> {
    public final TwoWayConverter a;
    public final Object b;
    public final AnimationState c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;
    public final MutatorMutex f;
    public final SpringSpec g;
    public final AnimationVector h;
    public final AnimationVector i;
    public final AnimationVector j;
    public final AnimationVector k;

    public static final Object a(Animatable animatable, Object obj) {
        TwoWayConverter twoWayConverter = animatable.a;
        AnimationVector animationVector = animatable.k;
        AnimationVector animationVector2 = animatable.j;
        if (!s71.b(animationVector2, animatable.h) || !s71.b(animationVector, animatable.i)) {
            AnimationVector animationVector3 = (AnimationVector) twoWayConverter.getA().invoke(obj);
            int iB = animationVector3.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (animationVector3.a(i) < animationVector2.a(i) || animationVector3.a(i) > animationVector.a(i)) {
                    animationVector3.e(tb5.f(animationVector3.a(i), animationVector2.a(i), animationVector.a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return twoWayConverter.getB().invoke(animationVector3);
            }
        }
        return obj;
    }

    public static final void b(Animatable animatable) {
        AnimationState animationState = animatable.c;
        animationState.c.d();
        animationState.d = Long.MIN_VALUE;
        animatable.d.setValue(Boolean.FALSE);
    }

    public static Object d(Animatable animatable, Object obj, AnimationSpec animationSpec, Float f, wr0 wr0Var, dy dyVar, int i) {
        if ((i & 2) != 0) {
            animationSpec = animatable.g;
        }
        AnimationSpec animationSpec2 = animationSpec;
        Object objInvoke = f;
        if ((i & 4) != 0) {
            objInvoke = animatable.a.getB().invoke(animatable.c.c);
        }
        Object obj2 = objInvoke;
        if ((i & 8) != 0) {
            wr0Var = null;
        }
        return animatable.c(obj, animationSpec2, obj2, wr0Var, dyVar);
    }

    public final Object e() {
        return this.c.b.getA();
    }

    public final Object f(dy dyVar, Object obj) {
        Object objA = MutatorMutex.a(this.f, new Animatable$snapTo$2(this, obj, null), dyVar);
        return objA == dz.a ? objA : az2.a;
    }

    public final Object g(ul2 ul2Var) {
        Object objA = MutatorMutex.a(this.f, new Animatable$stop$2(this, null), ul2Var);
        return objA == dz.a ? objA : az2.a;
    }

    public Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2) {
        twoWayConverter.getClass();
        this.a = twoWayConverter;
        this.b = obj2;
        this.c = new AnimationState(twoWayConverter, obj, null, 60);
        this.d = SnapshotStateKt.c(Boolean.FALSE, StructuralEqualityPolicy.a);
        this.e = SnapshotStateKt.c(obj, StructuralEqualityPolicy.a);
        this.f = new MutatorMutex();
        this.g = new SpringSpec(obj2, 3);
        AnimationVector animationVector = (AnimationVector) twoWayConverter.getA().invoke(obj);
        int iB = animationVector.b();
        for (int i = 0; i < iB; i++) {
            animationVector.e(Float.NEGATIVE_INFINITY, i);
        }
        this.h = animationVector;
        AnimationVector animationVector2 = (AnimationVector) this.a.getA().invoke(obj);
        int iB2 = animationVector2.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            animationVector2.e(Float.POSITIVE_INFINITY, i2);
        }
        this.i = animationVector2;
        this.j = animationVector;
        this.k = animationVector2;
    }

    public final Object c(Object obj, AnimationSpec animationSpec, Object obj2, wr0 wr0Var, dy dyVar) {
        Object objE = e();
        animationSpec.getClass();
        TwoWayConverter twoWayConverter = this.a;
        twoWayConverter.getClass();
        return MutatorMutex.a(this.f, new Animatable$runAnimation$2(this, obj2, new TargetBasedAnimation(animationSpec, twoWayConverter, objE, obj, (AnimationVector) twoWayConverter.getA().invoke(obj2)), this.c.d, wr0Var, null), dyVar);
    }
}
