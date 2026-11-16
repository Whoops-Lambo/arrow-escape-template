package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.NestedScrollingParent3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    public static final /* synthetic */ int c0 = 0;
    public boolean A;
    public float B;
    public float C;
    public float D;
    public long E;
    public float F;
    public boolean G;
    public boolean H;
    public TransitionListener I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public long N;
    public boolean O;
    public int P;
    public long Q;
    public float R;
    public int S;
    public float T;
    public float U;
    public boolean V;
    public boolean W;
    public TransitionState a0;
    public boolean b0;
    public MotionScene s;
    public Interpolator t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class DecelerateInterpolator extends MotionInterpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class DevModeDraw {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class Model {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface MotionTracker {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class MyTracker implements MotionTracker {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class StateCache {
        public float a;
        public float b;
        public int c;
        public int d;

        public final void a() {
            int i = this.c;
            if (i != -1 || this.d != -1) {
                int i2 = this.d;
                if (i == -1) {
                    throw null;
                }
                if (i2 != -1) {
                    throw null;
                }
                throw null;
            }
            boolean zIsNaN = Float.isNaN(this.b);
            float f = this.a;
            if (!zIsNaN) {
                throw null;
            }
            if (!Float.isNaN(f)) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface TransitionListener {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class TransitionState {
        public static final TransitionState a;
        public static final TransitionState b;
        public static final TransitionState c;
        public static final /* synthetic */ TransitionState[] d;

        /* JADX INFO: Fake field, exist only in values array */
        TransitionState EF0;

        static {
            TransitionState transitionState = new TransitionState("UNDEFINED", 0);
            TransitionState transitionState2 = new TransitionState("SETUP", 1);
            a = transitionState2;
            TransitionState transitionState3 = new TransitionState("MOVING", 2);
            b = transitionState3;
            TransitionState transitionState4 = new TransitionState("FINISHED", 3);
            c = transitionState4;
            d = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) d.clone();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void e(int i) {
        this.k = null;
    }

    public DesignTool getDesignTool() {
        return null;
    }

    public Bundle getTransitionState() {
        throw null;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void h(int i, View view) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean o(View view, View view2, int i, int i2) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.V = true;
        try {
            if (this.s == null) {
                super.onLayout(z, i, i2, i3, i4);
                this.V = false;
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.K != i5 || this.L != i6) {
                throw null;
            }
            this.K = i5;
            this.L = i6;
            this.V = false;
        } catch (Throwable th) {
            this.V = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void setOnHide(float f) {
        throw null;
    }

    public void setOnShow(float f) {
        throw null;
    }

    public void setProgress(float f) {
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            throw null;
        }
        TransitionState transitionState = TransitionState.c;
        TransitionState transitionState2 = TransitionState.b;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.D == 1.0f && this.w == this.x) {
                setState(transitionState2);
            }
            this.w = this.v;
            if (this.D == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                setState(transitionState);
            }
        } else if (f >= 1.0f) {
            if (this.D == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.w == this.v) {
                setState(transitionState2);
            }
            this.w = this.x;
            if (this.D == 1.0f) {
                setState(transitionState);
            }
        } else {
            this.w = -1;
            setState(transitionState2);
        }
        if (this.s == null) {
            return;
        }
        this.G = true;
        this.F = f;
        this.C = f;
        this.E = -1L;
        this.H = true;
        invalidate();
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TransitionState.values().length];
            a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.s;
        if (motionScene == null) {
            return null;
        }
        motionScene.getClass();
        throw null;
    }

    public int getCurrentState() {
        return this.w;
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.s;
        if (motionScene == null) {
            return null;
        }
        motionScene.getClass();
        return null;
    }

    public int getEndState() {
        return this.x;
    }

    public float getProgress() {
        return this.D;
    }

    public MotionScene getScene() {
        return this.s;
    }

    public int getStartState() {
        return this.v;
    }

    public float getTargetPosition() {
        return this.F;
    }

    public long getTransitionTimeMs() {
        MotionScene motionScene = this.s;
        if (motionScene != null) {
            this.B = motionScene.a() / 1000.0f;
        }
        return (long) (this.B * 1000.0f);
    }

    public float getVelocity() {
        return this.u;
    }

    public final void k(float f) {
        MotionScene motionScene = this.s;
        if (motionScene == null) {
            return;
        }
        float f2 = this.D;
        float f3 = this.C;
        if (f2 != f3 && this.G) {
            this.D = f3;
        }
        float f4 = this.D;
        if (f4 == f) {
            return;
        }
        this.F = f;
        this.B = motionScene.a() / 1000.0f;
        setProgress(this.F);
        this.t = this.s.b();
        this.G = false;
        getNanoTime();
        this.H = true;
        this.C = f4;
        this.D = f4;
        invalidate();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void l(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        boolean z;
        MotionScene motionScene = this.s;
        if (motionScene == null || motionScene.a == null) {
            return;
        }
        float f = this.C;
        this.N = getNanoTime();
        if (f != this.C) {
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (this.E == -1) {
            this.E = getNanoTime();
        }
        float f2 = this.D;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < 1.0f) {
            this.w = -1;
        }
        if (this.O || (this.H && this.F != f2)) {
            float fSignum = Math.signum(this.F - f2);
            long nanoTime = getNanoTime();
            float f3 = (((nanoTime - this.E) * fSignum) * 1.0E-9f) / this.B;
            float f4 = this.D + f3;
            if (this.G) {
                f4 = this.F;
            }
            if ((fSignum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 >= this.F) || (fSignum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 <= this.F)) {
                f4 = this.F;
                this.H = false;
            }
            this.D = f4;
            this.C = f4;
            this.E = nanoTime;
            this.u = f3;
            if (Math.abs(f3) > 1.0E-5f) {
                setState(TransitionState.b);
            }
            if ((fSignum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 >= this.F) || (fSignum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 <= this.F)) {
                f4 = this.F;
                this.H = false;
            }
            TransitionState transitionState = TransitionState.c;
            if (f4 >= 1.0f || f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.H = false;
                setState(transitionState);
            }
            int childCount = getChildCount();
            this.O = false;
            getNanoTime();
            this.U = f4;
            Interpolator interpolator = this.t;
            if (interpolator != null) {
                interpolator.getInterpolation(f4);
            }
            Interpolator interpolator2 = this.t;
            if (interpolator2 != null) {
                float interpolation = interpolator2.getInterpolation((fSignum / this.B) + f4);
                this.u = interpolation;
                this.u = interpolation - this.t.getInterpolation(f4);
            }
            if (childCount > 0) {
                getChildAt(0);
                throw null;
            }
            boolean z2 = (fSignum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 >= this.F) || (fSignum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 <= this.F);
            if (!this.O && !this.H && z2) {
                setState(transitionState);
            }
            boolean z3 = (!z2) | this.O;
            this.O = z3;
            if (f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i4 = this.v) != -1 && this.w != i4) {
                this.w = i4;
                this.s.getClass();
                throw null;
            }
            if (f4 >= 1.0d) {
                int i5 = this.w;
                int i6 = this.x;
                if (i5 != i6) {
                    this.w = i6;
                    this.s.getClass();
                    throw null;
                }
            }
            if (z3 || this.H) {
                invalidate();
            } else if ((fSignum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == 1.0f) || (fSignum < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                setState(transitionState);
            }
            if (!this.O && !this.H && ((fSignum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == 1.0f) || (fSignum < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                q();
            }
        }
        float f5 = this.D;
        if (f5 >= 1.0f) {
            int i7 = this.w;
            int i8 = this.x;
            z = i7 != i8;
            this.w = i8;
        } else if (f5 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i9 = this.w;
            int i10 = this.v;
            z = i9 != i10;
            this.w = i10;
        } else {
            z = false;
        }
        this.b0 |= z;
        if (z && !this.V) {
            requestLayout();
        }
        this.C = this.D;
        if (iArr[0] == 0 && iArr[1] == 0) {
            return;
        }
        this.M = true;
    }

    public final void m() {
        this.I.getClass();
        if (this.T != this.C) {
            if (this.S != -1) {
                throw null;
            }
            this.S = -1;
            this.T = this.C;
            throw null;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.M || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.M = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionScene motionScene = this.s;
        if (motionScene != null && this.A) {
            motionScene.getClass();
            MotionScene.Transition transition = this.s.a;
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.s == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = (this.y == i && this.z == i2) ? false : true;
        if (this.b0) {
            this.b0 = false;
            q();
            this.I.getClass();
            throw null;
        }
        boolean z2 = this.h ? true : z;
        this.y = i;
        this.z = i2;
        this.s.getClass();
        this.s.getClass();
        if (!z2) {
            throw null;
        }
        if (this.v != -1) {
            super.onMeasure(i, i2);
            this.s.getClass();
            throw null;
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
        getPaddingTop();
        getPaddingBottom();
        getPaddingLeft();
        getPaddingRight();
        this.c.getClass();
        int i3 = (int) ((this.U * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        requestLayout();
        int i4 = (int) ((this.U * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        requestLayout();
        setMeasuredDimension(i3, i4);
        float fSignum = Math.signum(this.F - this.D);
        float nanoTime = this.D + ((((getNanoTime() - this.E) * fSignum) * 1.0E-9f) / this.B);
        if (this.G) {
            nanoTime = this.F;
        }
        if ((fSignum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && nanoTime >= this.F) || (fSignum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && nanoTime <= this.F)) {
            nanoTime = this.F;
        }
        if ((fSignum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && nanoTime >= this.F) || (fSignum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && nanoTime <= this.F)) {
            nanoTime = this.F;
        }
        this.U = nanoTime;
        int childCount = getChildCount();
        getNanoTime();
        Interpolator interpolator = this.t;
        if (interpolator != null) {
            interpolator.getInterpolation(nanoTime);
        }
        if (childCount <= 0) {
            return;
        }
        getChildAt(0);
        throw null;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.s != null) {
            d();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MotionScene motionScene = this.s;
        if (motionScene == null || !this.A) {
            return super.onTouchEvent(motionEvent);
        }
        motionScene.getClass();
        throw null;
    }

    public final void p() {
        this.I.getClass();
        if (this.S != -1) {
            this.I.getClass();
            throw null;
        }
        this.S = this.w;
        throw null;
    }

    public final void q() {
        if (this.s != null) {
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        MotionScene motionScene;
        if (this.w != -1 || (motionScene = this.s) == null || motionScene.a == null) {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i) {
        this.J = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.W = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.A = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.s == null) {
            setProgress(f);
        } else {
            setState(TransitionState.b);
            setProgress(((AccelerateDecelerateInterpolator) this.s.b()).getInterpolation(f));
        }
    }

    public void setScene(MotionScene motionScene) {
        this.s = motionScene;
        d();
        motionScene.getClass();
        throw null;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.c;
        if (transitionState == transitionState2 && this.w == -1) {
            return;
        }
        TransitionState transitionState3 = this.a0;
        this.a0 = transitionState;
        TransitionState transitionState4 = TransitionState.b;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            m();
        }
        int iOrdinal = transitionState3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && transitionState == transitionState2) {
                p();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            m();
        }
        if (transitionState == transitionState2) {
            p();
        }
    }

    public void setTransition(MotionScene.Transition transition) {
        this.s.a = transition;
        setState(TransitionState.a);
        if (this.w == (this.s.a == null ? -1 : 0)) {
            this.D = 1.0f;
            this.C = 1.0f;
            this.F = 1.0f;
        } else {
            this.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.C = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        transition.getClass();
        this.E = getNanoTime();
        MotionScene motionScene = this.s;
        MotionScene.Transition transition2 = motionScene.a;
        int i = transition2 == null ? -1 : 0;
        int i2 = transition2 == null ? -1 : 0;
        if (i == this.v && i2 == this.x) {
            return;
        }
        this.v = i;
        this.x = i2;
        if (transition2 == null || i2 != 0 || i != 0) {
            throw null;
        }
        motionScene.getClass();
        throw null;
    }

    public void setTransitionDuration(int i) {
        MotionScene motionScene = this.s;
        if (motionScene == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        MotionScene.Transition transition = motionScene.a;
        if (transition != null) {
            transition.a = Math.max(i, 8);
        } else {
            motionScene.b = i;
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.I = transitionListener;
    }

    public void setTransitionState(Bundle bundle) {
        bundle.getFloat("motion.progress");
        throw null;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void i(View view, View view2, int i, int i2) {
        this.N = getNanoTime();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        if (this.s != null && this.w != -1) {
            throw null;
        }
        q();
        if (this.W) {
            post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.4
                @Override // java.lang.Runnable
                public final void run() {
                    throw null;
                }
            });
            return;
        }
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (!(view instanceof MotionHelper)) {
        } else {
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        throw null;
    }

    public final void r(float f, float f2) {
        if (super.isAttachedToWindow()) {
            setProgress(f);
            setState(TransitionState.b);
            this.u = f2;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f3 = 1.0f;
                }
                k(f3);
                return;
            } else {
                if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f != 1.0f) {
                    if (f > 0.5f) {
                        f3 = 1.0f;
                    }
                    k(f3);
                    return;
                }
                return;
            }
        }
        throw null;
    }

    public final void s(int i) {
        if (super.isAttachedToWindow()) {
            int i2 = this.w;
            if (i2 != i) {
                if (this.v == i) {
                    k(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return;
                }
                if (this.x == i) {
                    k(1.0f);
                    return;
                }
                this.x = i;
                if (i2 != -1) {
                    if (super.isAttachedToWindow()) {
                        MotionScene motionScene = this.s;
                        if (motionScene == null) {
                            k(1.0f);
                            this.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            k(1.0f);
                            return;
                        } else {
                            this.v = i2;
                            this.x = i;
                            if (motionScene.a == null || i != 0 || i2 == 0) {
                                throw null;
                            }
                            throw null;
                        }
                    }
                    throw null;
                }
                this.F = 1.0f;
                this.C = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.D = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.E = getNanoTime();
                getNanoTime();
                this.G = false;
                this.B = this.s.a() / 1000.0f;
                this.v = -1;
                MotionScene.Transition transition = this.s.a;
                throw null;
            }
            return;
        }
        throw null;
    }

    public void setStartState(int i) {
        if (super.isAttachedToWindow()) {
            this.w = i;
            return;
        }
        throw null;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return Debug.a(context, this.v) + "->" + Debug.a(context, this.x) + " (pos:" + this.D + " Dpos/Dt:" + this.u;
    }

    public void setTransition(int i) {
        MotionScene motionScene = this.s;
        if (motionScene == null) {
            return;
        }
        motionScene.getClass();
        throw null;
    }
}
