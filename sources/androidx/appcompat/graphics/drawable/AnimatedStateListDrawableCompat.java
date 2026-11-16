package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {
    public AnimatedStateListState p;
    public Transition q;
    public int r = -1;
    public int s = -1;
    public boolean t;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnimatableTransition extends Transition {
        public final Animatable a;

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void c() {
            this.a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void d() {
            this.a.stop();
        }

        public AnimatableTransition(Animatable animatable) {
            this.a = animatable;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnimatedStateListState extends StateListDrawableCompat.StateListState {
        public LongSparseArray J;
        public SparseArrayCompat K;

        public final int f(int i) {
            Object obj;
            if (i < 0) {
                return 0;
            }
            SparseArrayCompat sparseArrayCompat = this.K;
            Object obj2 = 0;
            int iA = ContainerHelpersKt.a(sparseArrayCompat.c, i, sparseArrayCompat.a);
            if (iA >= 0 && (obj = sparseArrayCompat.b[iA]) != SparseArrayCompatKt.a) {
                obj2 = obj;
            }
            return ((Integer) obj2).intValue();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public final void d() {
            this.J = this.J.clone();
            this.K = this.K.clone();
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        public AnimatedStateListState(AnimatedStateListState animatedStateListState, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.J = animatedStateListState.J;
                this.K = animatedStateListState.K;
            } else {
                this.J = new LongSparseArray();
                this.K = new SparseArrayCompat();
            }
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnimatedVectorDrawableTransition extends Transition {
        public final AnimatedVectorDrawableCompat a;

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void c() {
            this.a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void d() {
            this.a.stop();
        }

        public AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            this.a = animatedVectorDrawableCompat;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnimationDrawableTransition extends Transition {
        public final ObjectAnimator a;
        public final boolean b;

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final boolean a() {
            return this.b;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void b() {
            this.a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void c() {
            this.a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public final void d() {
            this.a.cancel();
        }

        public AnimationDrawableTransition(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            int i;
            int i2;
            int i3;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = numberOfFrames - 1;
            }
            FrameInterpolator frameInterpolator = new FrameInterpolator();
            int numberOfFrames2 = animationDrawable.getNumberOfFrames();
            frameInterpolator.b = numberOfFrames2;
            int[] iArr = frameInterpolator.a;
            if (iArr == null || iArr.length < numberOfFrames2) {
                frameInterpolator.a = new int[numberOfFrames2];
            }
            int[] iArr2 = frameInterpolator.a;
            int i4 = 0;
            for (int i5 = 0; i5 < numberOfFrames2; i5++) {
                if (z) {
                    i3 = (numberOfFrames2 - i5) - 1;
                } else {
                    i3 = i5;
                }
                int duration = animationDrawable.getDuration(i3);
                iArr2[i5] = duration;
                i4 += duration;
            }
            frameInterpolator.c = i4;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(frameInterpolator.c);
            objectAnimatorOfInt.setInterpolator(frameInterpolator);
            this.b = z2;
            this.a = objectAnimatorOfInt;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FrameInterpolator implements TimeInterpolator {
        public int[] a;
        public int b;
        public int c;

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            int i = (int) ((f * this.c) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.c : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class Transition {
        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public final DrawableContainerCompat.DrawableContainerState b() {
        return new AnimatedStateListState(this.p, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    /* JADX INFO: renamed from: f */
    public final StateListDrawableCompat.StateListState b() {
        return new AnimatedStateListState(this.p, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.t) {
            super.mutate();
            this.p.d();
            this.t = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i;
        Transition animatableTransition;
        AnimatedStateListState animatedStateListState = this.p;
        int iE = animatedStateListState.e(iArr);
        if (iE < 0) {
            iE = animatedStateListState.e(StateSet.WILD_CARD);
        }
        boolean z = false;
        if (iE != this.g) {
            Transition transition = this.q;
            if (transition != null) {
                if (iE != this.r) {
                    if (iE == this.s && transition.a()) {
                        transition.b();
                        this.r = this.s;
                        this.s = iE;
                    } else {
                        i = this.r;
                        transition.d();
                    }
                }
                z = true;
            } else {
                i = this.g;
            }
            this.q = null;
            this.s = -1;
            this.r = -1;
            AnimatedStateListState animatedStateListState2 = this.p;
            int iF = animatedStateListState2.f(i);
            int iF2 = animatedStateListState2.f(iE);
            if (iF2 != 0 && iF != 0) {
                long j = ((long) iF2) | (((long) iF) << 32);
                int iLongValue = (int) ((Long) animatedStateListState2.J.d(j)).longValue();
                if (iLongValue >= 0) {
                    boolean z2 = (((Long) animatedStateListState2.J.d(j)).longValue() & 8589934592L) != 0;
                    d(iLongValue);
                    Object obj = this.c;
                    if (obj instanceof AnimationDrawable) {
                        animatableTransition = new AnimationDrawableTransition((AnimationDrawable) obj, (((Long) animatedStateListState2.J.d(j)).longValue() & 4294967296L) != 0, z2);
                    } else if (obj instanceof AnimatedVectorDrawableCompat) {
                        animatableTransition = new AnimatedVectorDrawableTransition((AnimatedVectorDrawableCompat) obj);
                    } else if (obj instanceof Animatable) {
                        animatableTransition = new AnimatableTransition((Animatable) obj);
                    } else if (d(iE)) {
                        z = true;
                    }
                    animatableTransition.c();
                    this.q = animatableTransition;
                    this.s = i;
                    this.r = iE;
                    z = true;
                } else if (d(iE)) {
                    z = true;
                }
            } else if (d(iE)) {
                z = true;
            }
        }
        Drawable drawable = this.c;
        return drawable != null ? drawable.setState(iArr) | z : z;
    }

    public AnimatedStateListDrawableCompat(AnimatedStateListState animatedStateListState, Resources resources) {
        e(new AnimatedStateListState(animatedStateListState, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public final void e(DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.e(drawableContainerState);
        if (drawableContainerState instanceof AnimatedStateListState) {
            this.p = (AnimatedStateListState) drawableContainerState;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        Transition transition = this.q;
        if (transition != null) {
            transition.d();
            this.q = null;
            d(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Transition transition = this.q;
        if (transition != null && (visible || z2)) {
            if (z) {
                transition.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
