package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {
    public SpringForce l;
    public float m;

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final boolean c(long j) {
        float f = this.m;
        SpringForce springForce = this.l;
        if (f != Float.MAX_VALUE) {
            double d = springForce.i;
            long j2 = j / 2;
            DynamicAnimation.MassState massStateA = springForce.a(this.b, this.a, j2);
            SpringForce springForce2 = this.l;
            springForce2.i = this.m;
            this.m = Float.MAX_VALUE;
            DynamicAnimation.MassState massStateA2 = springForce2.a(massStateA.a, massStateA.b, j2);
            this.b = massStateA2.a;
            this.a = massStateA2.b;
        } else {
            DynamicAnimation.MassState massStateA3 = springForce.a(this.b, this.a, j);
            this.b = massStateA3.a;
            this.a = massStateA3.b;
        }
        float fMax = Math.max(this.b, this.g);
        this.b = fMax;
        float fMin = Math.min(fMax, this.f);
        this.b = fMin;
        float f2 = this.a;
        SpringForce springForce3 = this.l;
        springForce3.getClass();
        if (Math.abs(f2) >= springForce3.e || Math.abs(fMin - ((float) springForce3.i)) >= springForce3.d) {
            return false;
        }
        this.b = (float) this.l.i;
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return true;
    }

    public final void d(float f) {
        if (this.e) {
            this.m = f;
            return;
        }
        if (this.l == null) {
            this.l = new SpringForce(f);
        }
        SpringForce springForce = this.l;
        double d = f;
        springForce.i = d;
        double d2 = (float) d;
        if (d2 > this.f) {
            d.u("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < this.g) {
            d.u("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.i * 0.75f);
        springForce.d = dAbs;
        springForce.e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.e;
        if (z || z) {
            return;
        }
        this.e = true;
        if (!this.c) {
            this.b = ((DynamicAnimation.AnonymousClass15) this.d).a.a;
        }
        float f2 = this.b;
        if (f2 > this.f || f2 < this.g) {
            d.r("Starting value need to be in between min value and max value");
            return;
        }
        ThreadLocal threadLocal = AnimationHandler.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new AnimationHandler());
        }
        AnimationHandler animationHandler = (AnimationHandler) threadLocal.get();
        ArrayList arrayList = animationHandler.b;
        if (arrayList.size() == 0) {
            if (animationHandler.d == null) {
                animationHandler.d = new AnimationHandler.FrameCallbackProvider16(animationHandler.c);
            }
            animationHandler.d.a();
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }
}
