package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class SlidingPaneLayout extends ViewGroup {
    public int a;
    public int b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public View f;
    public int g;
    public float h;
    public float i;
    public PanelSlideListener j;
    public boolean k;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            throw null;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
            accessibilityNodeInfoCompat2.f(null);
            accessibilityNodeInfo.setBoundsInParent(null);
            accessibilityNodeInfoObtain.getBoundsInScreen(null);
            accessibilityNodeInfo.setBoundsInScreen(null);
            accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            accessibilityNodeInfoCompat.j(accessibilityNodeInfoObtain.getClassName());
            accessibilityNodeInfoCompat.n(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            accessibilityNodeInfoCompat.k(accessibilityNodeInfoObtain.isClickable());
            accessibilityNodeInfo.setFocusable(accessibilityNodeInfoObtain.isFocusable());
            accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
            accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
            accessibilityNodeInfo.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
            accessibilityNodeInfoCompat.a(accessibilityNodeInfoObtain.getActions());
            accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities());
            accessibilityNodeInfoCompat.j(SlidingPaneLayout.class.getName());
            accessibilityNodeInfoCompat.c = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap weakHashMap = ViewCompat.a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (!(parentForAccessibility instanceof View)) {
                throw null;
            }
            accessibilityNodeInfoCompat.b = -1;
            accessibilityNodeInfo.setParent((View) parentForAccessibility);
            throw null;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class DisableLayerRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int[] c = {R.attr.layout_weight};
        public float a;
        public boolean b;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface PanelSlideListener {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SimplePanelSlideListener implements PanelSlideListener {
    }

    @Override // android.view.View
    public final void computeScroll() {
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class DragHelperCallback extends ViewDragHelper.Callback {
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int a(int i, View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int c(View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void e(int i, View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void f(int i) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void g(View view, int i, int i2) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean i(int i, View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int b(int i, View view) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void h(View view, float f, float f2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public boolean c;

        /* JADX INFO: renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.c = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public final boolean a() {
        WeakHashMap weakHashMap = ViewCompat.a;
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LayoutParams.c);
        layoutParams.a = typedArrayObtainStyledAttributes.getFloat(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    @ColorInt
    public int getCoveredFadeColor() {
        return this.b;
    }

    @Px
    public int getParallaxDistance() {
        return this.g;
    }

    @ColorInt
    public int getSliderFadeColor() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0138  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingTop;
        int iMin;
        int i3;
        int i4;
        int iMakeMeasureSpec;
        int i5;
        int iMakeMeasureSpec2;
        int i6;
        int iMakeMeasureSpec3;
        int i7;
        int iMakeMeasureSpec4;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
            if (mode2 == 0) {
                size2 = 300;
                mode2 = Integer.MIN_VALUE;
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        } else if (mode2 != 1073741824) {
            iMin = 0;
            paddingTop = 0;
        } else {
            iMin = (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f = null;
        int i8 = paddingLeft;
        int i9 = 0;
        boolean z = false;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (true) {
            i3 = 8;
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.getClass();
            } else {
                float f2 = layoutParams.a;
                if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f += f2;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0) {
                    }
                    i9 = i7 + 1;
                }
                int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                if (i11 == -2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i10, Integer.MIN_VALUE);
                    i6 = Integer.MIN_VALUE;
                } else {
                    i6 = Integer.MIN_VALUE;
                    iMakeMeasureSpec3 = i11 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingLeft - i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                }
                int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                i7 = i9;
                if (i12 == -2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, i6);
                } else {
                    iMakeMeasureSpec4 = i12 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                }
                childAt.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i6 && measuredHeight > iMin) {
                    iMin = Math.min(measuredHeight, paddingTop);
                }
                i8 -= measuredWidth;
                boolean z2 = i8 < 0;
                layoutParams.b = z2;
                z |= z2;
                if (z2) {
                    this.f = childAt;
                }
                i9 = i7 + 1;
            }
            i7 = i9;
            i9 = i7 + 1;
        }
        if (z || f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i13 = 0;
            while (i13 < childCount) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getVisibility() != i3) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i3) {
                        int i14 = ((ViewGroup.MarginLayoutParams) layoutParams2).width;
                        float f3 = layoutParams2.a;
                        boolean z3 = i14 == 0 && f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        int measuredWidth2 = z3 ? 0 : childAt2.getMeasuredWidth();
                        if (!z || childAt2 == this.f) {
                            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0) {
                                    int i15 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                    if (i15 == -2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                        i4 = 1073741824;
                                    } else if (i15 == -1) {
                                        i4 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                    } else {
                                        i4 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                                    }
                                } else {
                                    i4 = 1073741824;
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z) {
                                    int i16 = paddingLeft - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                                    int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i16, i4);
                                    if (measuredWidth2 != i16) {
                                        childAt2.measure(iMakeMeasureSpec5, iMakeMeasureSpec);
                                    }
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2 + ((int) ((f3 * Math.max(0, i8)) / f)), 1073741824), iMakeMeasureSpec);
                                }
                            }
                        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width < 0 && (measuredWidth2 > paddingLeft || f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                            if (z3) {
                                int i17 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                if (i17 == -2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    i5 = 1073741824;
                                } else if (i17 == -1) {
                                    i5 = 1073741824;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    i5 = 1073741824;
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
                                }
                            } else {
                                i5 = 1073741824;
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), iMakeMeasureSpec2);
                        }
                    }
                }
                i13++;
                i3 = 8;
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + iMin);
        this.e = z;
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        boolean z = savedState.c;
        if (z) {
            this.k = true;
        } else {
            this.k = false;
        }
        this.k = z;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e) {
            throw null;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCoveredFadeColor(@ColorInt int i) {
        this.b = i;
    }

    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        this.j = panelSlideListener;
    }

    public void setParallaxDistance(@Px int i) {
        this.g = i;
        requestLayout();
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.c = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.d = drawable;
    }

    public void setSliderFadeColor(@ColorInt int i) {
        this.a = i;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        View childAt;
        int i;
        int right;
        super.draw(canvas);
        if (a()) {
            drawable = this.d;
        } else {
            drawable = this.c;
        }
        if (getChildCount() > 1) {
            childAt = getChildAt(1);
        } else {
            childAt = null;
        }
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (a()) {
                right = childAt.getRight();
                i = intrinsicWidth + right;
            } else {
                int left = childAt.getLeft();
                int i2 = left - intrinsicWidth;
                i = left;
                right = i2;
            }
            drawable.setBounds(right, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.e && !layoutParams.b && this.f != null) {
            canvas.getClipBounds(null);
            if (a()) {
                throw null;
            }
            throw null;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!this.e && actionMasked == 0 && getChildCount() > 1 && getChildAt(1) != null) {
            motionEvent.getX();
            motionEvent.getY();
            throw null;
        }
        if (this.e && actionMasked != 3 && actionMasked != 1) {
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    throw null;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Math.abs(x - this.h);
                Math.abs(y - this.i);
                throw null;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.h = x2;
            this.i = y2;
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (a()) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        boolean z2 = this.e;
        if (z2) {
            z = !z2;
        } else {
            z = this.k;
        }
        savedState.c = z;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.e) {
            if (view == this.f) {
                z = true;
            } else {
                z = false;
            }
            this.k = z;
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(getContext().getDrawable(i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(getContext().getDrawable(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return layoutParams3;
    }
}
