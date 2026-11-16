package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.e32;
import defpackage.nj;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class DrawerLayout extends ViewGroup implements Openable {
    public static final int[] m = {R.attr.layout_gravity};
    public static final boolean n;
    public float a;
    public float b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public DrawerListener i;
    public Drawable j;
    public WindowInsets k;
    public boolean l;

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements AccessibilityViewCommand {
        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public final boolean a(View view) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    class AnonymousClass2 implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z = false;
            boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.k = windowInsets;
            drawerLayout.l = z2;
            if (!z2 && drawerLayout.getBackground() == null) {
                z = true;
            }
            drawerLayout.setWillNotDraw(z);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int[] iArr = DrawerLayout.m;
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfoCompat.j("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfo.setFocusable(false);
            accessibilityNodeInfo.setFocused(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) AccessibilityNodeInfoCompat.AccessibilityActionCompat.e.a);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) AccessibilityNodeInfoCompat.AccessibilityActionCompat.f.a);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            int[] iArr = DrawerLayout.m;
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            throw null;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
            this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            int[] iArr = DrawerLayout.m;
            WeakHashMap weakHashMap = ViewCompat.a;
            if (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) {
                accessibilityNodeInfoCompat.b = -1;
                accessibilityNodeInfo.setParent(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface DrawerListener {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int a;
        public float b;
        public int c;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class SimpleDrawerListener implements DrawerListener {
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public final void a() {
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        View childAt;
        if (i == 4) {
            int childCount = getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = getChildAt(i2);
                if (g(childAt)) {
                    if (!g(childAt)) {
                        e32.o(childAt, " is not a drawer", "View ");
                        return false;
                    }
                    if (((LayoutParams) childAt.getLayoutParams()).b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        break;
                    }
                }
                i2++;
            }
            if (childAt != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        View childAt;
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if (g(childAt)) {
                if (!g(childAt)) {
                    e32.o(childAt, " is not a drawer", "View ");
                    return false;
                }
                if (((LayoutParams) childAt.getLayoutParams()).b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    break;
                }
            }
            i2++;
        }
        if (childAt == null || d(childAt) != 0) {
            return childAt != null;
        }
        b(false);
        throw null;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    public void setDrawerLockMode(int i) {
        i(i, 3);
        i(i, 5);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = 0;
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class ViewDragCallback extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int a(int i, View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int c(View view) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void f(int i) {
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void h(View view, float f, float f2) {
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
        public final void e(int i, View view) {
            ((LayoutParams) view.getLayoutParams()).getClass();
            throw null;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void g(View view, int i, int i2) {
            view.getWidth();
            throw null;
        }
    }

    public final View c(int i) {
        WeakHashMap weakHashMap = ViewCompat.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int i3 = ((LayoutParams) childAt.getLayoutParams()).a;
            WeakHashMap weakHashMap2 = ViewCompat.a;
            if ((Gravity.getAbsoluteGravity(i3, getLayoutDirection()) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.a = 0;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.a = 0;
            layoutParams3.a = layoutParams2.a;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.a = 0;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.a = 0;
        return layoutParams5;
    }

    public float getDrawerElevation() {
        return this.a;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.j;
    }

    public final void i(int i, int i2) {
        View viewC;
        WeakHashMap weakHashMap = ViewCompat.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.e = i;
        } else if (i2 == 5) {
            this.f = i;
        } else if (i2 == 8388611) {
            this.g = i;
        } else if (i2 == 8388613) {
            this.h = i;
        }
        if (i != 0) {
            throw null;
        }
        if (i != 1) {
            if (i == 2 && (viewC = c(absoluteGravity)) != null) {
                h(viewC);
                return;
            }
            return;
        }
        View viewC2 = c(absoluteGravity);
        if (viewC2 != null) {
            if (!g(viewC2)) {
                e32.o(viewC2, " is not a sliding drawer", "View ");
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewC2.getLayoutParams();
            if (this.d) {
                layoutParams.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                layoutParams.c = 0;
                invalidate();
                return;
            }
            layoutParams.c |= 4;
            if (a(viewC2)) {
                viewC2.getWidth();
                viewC2.getTop();
                throw null;
            }
            getWidth();
            viewC2.getTop();
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Throwable {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        Throwable th;
        boolean z2 = true;
        this.c = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (e(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i9 = i6 - ((int) (layoutParams.b * f3));
                        f = (i6 - i9) / f3;
                        i5 = i9;
                    }
                    boolean z3 = f != layoutParams.b ? z2 : false;
                    int i10 = layoutParams.a & 112;
                    if (i10 != 16) {
                        if (i10 != 80) {
                            int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                        } else {
                            int i12 = i4 - i2;
                            childAt.layout(i5, (i12 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        }
                        th = null;
                    } else {
                        int i13 = i4 - i2;
                        int i14 = (i13 - measuredHeight) / 2;
                        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                            th = null;
                        } else {
                            int i16 = i14 + measuredHeight;
                            th = null;
                            int i17 = i13 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i16 > i17) {
                                i14 = i17 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i14, measuredWidth + i5, measuredHeight + i14);
                    }
                    if (z3) {
                        LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                        if (f != layoutParams2.b) {
                            layoutParams2.b = f;
                            throw th;
                        }
                    }
                    int i18 = layoutParams.b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (n && (rootWindowInsets = getRootWindowInsets()) != null) {
            WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets).getSystemGestureInsets();
            throw null;
        }
        this.c = false;
        this.d = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                d.r("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
                return;
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.k != null) {
            WeakHashMap weakHashMap = ViewCompat.a;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        WeakHashMap weakHashMap2 = ViewCompat.a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.a, layoutDirection);
                    boolean fitsSystemWindows = childAt.getFitsSystemWindows();
                    WindowInsets windowInsetsReplaceSystemWindowInsets = this.k;
                    if (fitsSystemWindows) {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (e(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!g(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    float fK = ViewCompat.k(childAt);
                    float f = this.a;
                    if (fK != f) {
                        ViewCompat.E(childAt, f);
                    }
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(((LayoutParams) childAt.getLayoutParams()).a, getLayoutDirection());
                    int i4 = absoluteGravity2 & 7;
                    boolean z4 = i4 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException(nj.q(new StringBuilder("Child drawer has absolute gravity "), (absoluteGravity2 & 3) != 3 ? (absoluteGravity2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i4) : "LEFT", " but this DrawerLayout already has a drawer view along that edge"));
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewC;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        int i = savedState.c;
        if (i != 0 && (viewC = c(i)) != null) {
            h(viewC);
        }
        int i2 = savedState.d;
        if (i2 != 3) {
            i(i2, 3);
        }
        int i3 = savedState.e;
        if (i3 != 3) {
            i(i3, 5);
        }
        int i4 = savedState.f;
        if (i4 != 3) {
            i(i4, 8388611);
        }
        int i5 = savedState.g;
        if (i5 != 3) {
            i(i5, 8388613);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.a = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (g(childAt)) {
                ViewCompat.E(childAt, this.a);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        if (this.i != null) {
            throw null;
        }
        if (drawerListener != null) {
            throw null;
        }
        this.i = drawerListener;
    }

    public void setStatusBarBackground(int i) {
        this.j = i != 0 ? getContext().getDrawable(i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        this.j = new ColorDrawable(i);
        invalidate();
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29) {
            z = true;
        } else {
            z = false;
        }
        n = z;
    }

    public static boolean e(View view) {
        if (((LayoutParams) view.getLayoutParams()).a == 0) {
            return true;
        }
        return false;
    }

    public static boolean f(View view) {
        if (g(view)) {
            if ((((LayoutParams) view.getLayoutParams()).c & 1) != 1) {
                return false;
            }
            return true;
        }
        e32.o(view, " is not a drawer", "View ");
        return false;
    }

    public static boolean g(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = ViewCompat.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = ViewCompat.a;
        if ((Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 3) == 3) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (g(childAt)) {
                if (f(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                throw null;
            }
        }
        if (!z) {
            throw null;
        }
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 < childCount) {
                childAt = getChildAt(i2);
                if ((((LayoutParams) childAt.getLayoutParams()).c & 1) == 1) {
                    break;
                } else {
                    i2++;
                }
            } else {
                childAt = null;
                break;
            }
        }
        if (childAt == null && !g(view)) {
            WeakHashMap weakHashMap = ViewCompat.a;
            view.setImportantForAccessibility(1);
        } else {
            WeakHashMap weakHashMap2 = ViewCompat.a;
            view.setImportantForAccessibility(4);
        }
    }

    public final void b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (g(childAt)) {
                if (z) {
                    layoutParams.getClass();
                } else {
                    childAt.getWidth();
                    if (a(childAt)) {
                        childAt.getTop();
                        throw null;
                    }
                    getWidth();
                    childAt.getTop();
                    throw null;
                }
            }
        }
        throw null;
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).b);
        }
        this.b = fMax;
        throw null;
    }

    public final int d(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        if (g(view)) {
            int i5 = ((LayoutParams) view.getLayoutParams()).a;
            WeakHashMap weakHashMap = ViewCompat.a;
            int layoutDirection = getLayoutDirection();
            if (i5 != 3) {
                if (i5 != 5) {
                    if (i5 != 8388611) {
                        if (i5 == 8388613) {
                            int i6 = this.h;
                            if (i6 != 3) {
                                return i6;
                            }
                            if (layoutDirection == 0) {
                                i4 = this.f;
                            } else {
                                i4 = this.e;
                            }
                            if (i4 != 3) {
                                return i4;
                            }
                        }
                    } else {
                        int i7 = this.g;
                        if (i7 != 3) {
                            return i7;
                        }
                        if (layoutDirection == 0) {
                            i3 = this.e;
                        } else {
                            i3 = this.f;
                        }
                        if (i3 != 3) {
                            return i3;
                        }
                    }
                } else {
                    int i8 = this.f;
                    if (i8 != 3) {
                        return i8;
                    }
                    if (layoutDirection == 0) {
                        i2 = this.h;
                    } else {
                        i2 = this.g;
                    }
                    if (i2 != 3) {
                        return i2;
                    }
                }
            } else {
                int i9 = this.e;
                if (i9 != 3) {
                    return i9;
                }
                if (layoutDirection == 0) {
                    i = this.g;
                } else {
                    i = this.h;
                }
                if (i != 3) {
                    return i;
                }
            }
            return 0;
        }
        e32.o(view, " is not a drawer", "View ");
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int childCount = getChildCount();
            if (childCount != 0) {
                motionEvent.getX();
                motionEvent.getY();
                int i = childCount - 1;
                if (i >= 0) {
                    getChildAt(i).getHitRect(null);
                    throw null;
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zE = e(view);
        int width = getWidth();
        int iSave = canvas.save();
        if (zE) {
            int childCount = getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && g(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt)) {
                        int right = childAt.getRight();
                        if (right > i) {
                            i = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i, 0, width, getHeight());
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        if (this.b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && zE) {
            throw null;
        }
        return zDrawChild;
    }

    public final void h(View view) {
        if (g(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.d) {
                layoutParams.b = 1.0f;
                layoutParams.c = 1;
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt == view) {
                        WeakHashMap weakHashMap = ViewCompat.a;
                        childAt.setImportantForAccessibility(1);
                    } else {
                        WeakHashMap weakHashMap2 = ViewCompat.a;
                        childAt.setImportantForAccessibility(4);
                    }
                }
                AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.n;
                ViewCompat.v(accessibilityActionCompat.a(), view);
                ViewCompat.s(0, view);
                if (f(view) && d(view) != 2) {
                    ViewCompat.w(view, accessibilityActionCompat, null);
                }
                invalidate();
                return;
            }
            layoutParams.c |= 2;
            if (a(view)) {
                view.getTop();
                throw null;
            }
            getWidth();
            view.getWidth();
            view.getTop();
            throw null;
        }
        e32.o(view, " is not a sliding drawer", "View ");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int systemWindowInsetTop;
        super.onDraw(canvas);
        if (this.l && this.j != null) {
            WindowInsets windowInsets = this.k;
            if (windowInsets != null) {
                systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
            } else {
                systemWindowInsetTop = 0;
            }
            if (systemWindowInsetTop > 0) {
                this.j.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.j.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.c;
            boolean z2 = true;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.c = layoutParams.a;
                break;
            }
        }
        savedState.d = this.e;
        savedState.e = this.f;
        savedState.f = this.g;
        savedState.g = this.h;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z) {
            return;
        }
        b(true);
        throw null;
    }

    public void setScrimColor(@ColorInt int i) {
        invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.j = drawable;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m);
        layoutParams.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }
}
