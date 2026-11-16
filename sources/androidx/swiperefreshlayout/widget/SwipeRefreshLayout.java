package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ViewCompat;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingParent, NestedScrollingChild {
    public OnRefreshListener a;
    public boolean b;
    public float c;
    public Animation d;
    public int e;
    public OnChildScrollUpCallback f;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            throw null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    class AnonymousClass2 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    class AnonymousClass4 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    class AnonymousClass5 implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            throw null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass6 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass7 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    class AnonymousClass8 extends Animation {
        @Override // android.view.animation.Animation
        public final void applyTransformation(float f, Transformation transformation) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnChildScrollUpCallback {
        boolean a();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface OnRefreshListener {
    }

    private void setColorViewAlpha(int i) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        throw null;
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        throw null;
    }

    public int getProgressViewEndOffset() {
        return 0;
    }

    public int getProgressViewStartOffset() {
        return 0;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        throw null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.c;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    throw null;
                }
                this.c = f - f2;
                iArr[1] = i2;
                throw null;
            }
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (ViewCompat.r(null)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAnimationProgress(float f) {
        throw null;
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        throw null;
    }

    public void setDistanceToTriggerSync(int i) {
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        throw null;
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i) {
        throw null;
    }

    public void setRefreshing(boolean z) {
        if (z && this.b != z) {
            this.b = z;
            throw null;
        }
        if (this.b != z) {
            this.b = z;
            if (z) {
                throw null;
            }
            Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.3
                @Override // android.view.animation.Animation
                public final void applyTransformation(float f, Transformation transformation) {
                    SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
                }
            };
            this.d = animation;
            animation.setDuration(150L);
            throw null;
        }
    }

    public void setSlingshotDistance(@Px int i) {
    }

    public void setTargetOffsetTopAndBottom(int i) {
        throw null;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        throw null;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (i2 == i - 1) {
            return 0;
        }
        return i2 >= 0 ? i2 + 1 : i2;
    }

    public int getProgressCircleDiameter() {
        return this.e;
    }

    public void setOnChildScrollUpCallback(@Nullable OnChildScrollUpCallback onChildScrollUpCallback) {
        this.f = onChildScrollUpCallback;
    }

    public void setOnRefreshListener(@Nullable OnRefreshListener onRefreshListener) {
        this.a = onRefreshListener;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.e = (int) (displayMetrics.density * 56.0f);
            } else {
                this.e = (int) (displayMetrics.density * 40.0f);
            }
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        if (isEnabled()) {
            OnChildScrollUpCallback onChildScrollUpCallback = this.f;
            if (onChildScrollUpCallback != null) {
                if (!onChildScrollUpCallback.a() && !this.b) {
                    throw null;
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getMeasuredWidth();
        getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        getPaddingLeft();
        getPaddingTop();
        getPaddingLeft();
        getPaddingRight();
        getPaddingTop();
        getPaddingBottom();
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824);
        View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (isEnabled() && !this.b && (i & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        if (isEnabled()) {
            OnChildScrollUpCallback onChildScrollUpCallback = this.f;
            if (onChildScrollUpCallback != null) {
                if (!onChildScrollUpCallback.a() && !this.b) {
                    throw null;
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
        } else {
            throw null;
        }
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }
}
