package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.unity3d.services.UnityAdsConstants;
import defpackage.n30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/AnimationVector3D;", "Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AnimationVector3D extends AnimationVector {
    public float a;
    public float b;
    public float c;

    @Override // androidx.compose.animation.core.AnimationVector
    public final int b() {
        return 3;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void d() {
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return i != 2 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.c;
        }
        return this.b;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final AnimationVector c() {
        AnimationVector3D animationVector3D = new AnimationVector3D();
        animationVector3D.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        animationVector3D.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        animationVector3D.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return animationVector3D;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnimationVector3D)) {
            return false;
        }
        AnimationVector3D animationVector3D = (AnimationVector3D) obj;
        return animationVector3D.a == this.a && animationVector3D.b == this.b && animationVector3D.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + n30.b(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
