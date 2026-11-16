package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.ecffri.arrows.R;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import defpackage.c71;
import defpackage.d;
import defpackage.f63;
import defpackage.f7;
import defpackage.g7;
import defpackage.h50;
import defpackage.ip2;
import defpackage.ke0;
import defpackage.lw0;
import defpackage.ni1;
import defpackage.nq2;
import defpackage.os2;
import defpackage.ow0;
import defpackage.pi1;
import defpackage.r12;
import defpackage.uf1;
import defpackage.v7;
import defpackage.wh1;
import defpackage.xt;
import defpackage.y6;
import defpackage.yt;
import defpackage.zt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AttachedBehavior {
    public static final /* synthetic */ int z = 0;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public WindowInsetsCompat g;
    public ArrayList h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public WeakReference n;
    public final boolean o;
    public ValueAnimator p;
    public final ValueAnimator.AnimatorUpdateListener q;
    public final ArrayList r;
    public final long s;
    public final TimeInterpolator t;
    public int[] u;
    public Drawable v;
    public Integer w;
    public final float x;
    public Behavior y;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class BaseBehavior<T extends AppBarLayout> extends lw0 {
        public int j;
        public int k;
        public ValueAnimator l;
        public SavedState m;
        public WeakReference n;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f = -1;
            this.h = -1;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = baseBehavior.v(coordinatorLayout2, appBarLayout, u() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0 && ViewCompat.f(coordinatorLayout2) == null) {
                ViewCompat.z(coordinatorLayout2, new b(coordinatorLayout2, baseBehavior, appBarLayout));
            }
        }

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new c();
            public boolean c;
            public boolean d;
            public int e;
            public float f;
            public boolean g;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                boolean z;
                boolean z2;
                super(parcel, classLoader);
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.c = z;
                if (parcel.readByte() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.d = z2;
                this.e = parcel.readInt();
                this.f = parcel.readFloat();
                this.g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.e);
                parcel.writeFloat(this.f);
                parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int downNestedPreScrollRange;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = v(coordinatorLayout, appBarLayout2, u() - i, i3, i4);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.l) {
                appBarLayout2.f(appBarLayout2.g(view));
            }
        }

        @Override // defpackage.e63, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.m;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            y(coordinatorLayout, appBarLayout, i2);
                        } else {
                            w(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            y(coordinatorLayout, appBarLayout, 0);
                        } else {
                            w(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.c) {
                w(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.d) {
                w(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.e);
                int i3 = -childAt.getBottom();
                if (this.m.g) {
                    WeakHashMap weakHashMap = ViewCompat.a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.m.f) + i3;
                }
                w(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.f = 0;
            this.m = null;
            int iA = MathUtils.a(s(), -appBarLayout.getTotalScrollRange(), 0);
            f63 f63Var = this.a;
            if (f63Var != null) {
                f63Var.b(iA);
            } else {
                this.b = iA;
            }
            D(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.d(s());
            if (ViewCompat.f(coordinatorLayout) != null) {
                return true;
            }
            ViewCompat.z(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.r(i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            A(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void n(View view, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                this.m = (SavedState) parcelable;
            } else {
                this.m = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final Parcelable o(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateB = B(absSavedState, (AppBarLayout) view);
            return savedStateB == null ? absSavedState : savedStateB;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.l || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.l) != null) {
                valueAnimator.cancel();
            }
            this.n = null;
            this.k = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                C(coordinatorLayout, appBarLayout);
                if (appBarLayout.l) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.n = new WeakReference(view2);
        }

        @Override // defpackage.lw0
        public final int v(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            boolean zB;
            List list;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iU = u();
            int i4 = 0;
            if (i2 == 0 || iU < i2 || iU > i3) {
                this.j = 0;
            } else {
                int iA = MathUtils.a(i, i2, i3);
                if (iU != iA) {
                    if (!appBarLayout.e) {
                        top = iA;
                        break;
                    }
                    int iAbs = Math.abs(iA);
                    int childCount = appBarLayout.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount) {
                            View childAt = appBarLayout.getChildAt(i5);
                            g7 g7Var = (g7) childAt.getLayoutParams();
                            Interpolator interpolator = g7Var.c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i5++;
                            } else if (interpolator != null) {
                                int i6 = g7Var.a;
                                if ((i6 & 1) != 0) {
                                    topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) g7Var).topMargin + ((LinearLayout.LayoutParams) g7Var).bottomMargin;
                                    if ((i6 & 2) != 0) {
                                        WeakHashMap weakHashMap = ViewCompat.a;
                                        topInset -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    topInset = 0;
                                }
                                WeakHashMap weakHashMap2 = ViewCompat.a;
                                if (childAt.getFitsSystemWindows()) {
                                    topInset -= appBarLayout.getTopInset();
                                }
                                if (topInset > 0) {
                                    float f = topInset;
                                    top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iA);
                                    break;
                                }
                            }
                        }
                        top = iA;
                        break;
                    }
                    f63 f63Var = this.a;
                    if (f63Var != null) {
                        zB = f63Var.b(top);
                    } else {
                        this.b = top;
                        zB = false;
                    }
                    int i7 = iU - iA;
                    this.j = iA - top;
                    if (zB) {
                        for (int i8 = 0; i8 < appBarLayout.getChildCount(); i8++) {
                            g7 g7Var2 = (g7) appBarLayout.getChildAt(i8).getLayoutParams();
                            uf1 uf1Var = g7Var2.b;
                            if (uf1Var != null && (g7Var2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i8);
                                float fS = s();
                                Rect rect = (Rect) uf1Var.c;
                                Rect rect2 = (Rect) uf1Var.b;
                                childAt2.getDrawingRect(rect2);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                rect2.offset(0, -appBarLayout.getTopInset());
                                float fAbs = rect2.top - Math.abs(fS);
                                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                if (fAbs <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    float fAbs2 = Math.abs(fAbs / rect2.height());
                                    if (fAbs2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        f2 = fAbs2 > 1.0f ? 1.0f : fAbs2;
                                    }
                                    float f3 = 1.0f - f2;
                                    float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (f3 * f3)));
                                    childAt2.setTranslationY(fHeight);
                                    childAt2.getDrawingRect(rect);
                                    rect.offset(0, (int) (-fHeight));
                                    if (fHeight >= rect.height()) {
                                        childAt2.setVisibility(4);
                                    } else {
                                        childAt2.setVisibility(0);
                                    }
                                    WeakHashMap weakHashMap3 = ViewCompat.a;
                                    childAt2.setClipBounds(rect);
                                } else {
                                    WeakHashMap weakHashMap4 = ViewCompat.a;
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    childAt2.setVisibility(0);
                                }
                            }
                        }
                    }
                    if (!zB && appBarLayout.e && (list = (List) coordinatorLayout.b.b.get(appBarLayout)) != null && !list.isEmpty()) {
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            View view2 = (View) list.get(i9);
                            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).a;
                            if (behavior != null) {
                                behavior.d(coordinatorLayout, view2, appBarLayout);
                            }
                        }
                    }
                    appBarLayout.d(s());
                    D(coordinatorLayout, appBarLayout, iA, iA < iU ? -1 : 1, false);
                    i4 = i7;
                }
            }
            if (ViewCompat.f(coordinatorLayout) != null) {
                return i4;
            }
            ViewCompat.z(coordinatorLayout, new b(coordinatorLayout, this, appBarLayout));
            return i4;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        public static void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zG;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 < childCount) {
                    childAt = appBarLayout.getChildAt(i3);
                    if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    childAt = null;
                    break;
                }
            }
            if (childAt != null) {
                int i4 = ((g7) childAt.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    WeakHashMap weakHashMap = ViewCompat.a;
                    int minimumHeight = childAt.getMinimumHeight();
                    zG = true;
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zG = false;
                    }
                } else {
                    zG = false;
                }
            } else {
                zG = false;
            }
            if (appBarLayout.l) {
                zG = appBarLayout.g(z(coordinatorLayout));
            }
            boolean zF = appBarLayout.f(zG);
            if (!z) {
                if (zF) {
                    List list = (List) coordinatorLayout.b.b.get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.d;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) ((View) arrayList.get(i5)).getLayoutParams()).a;
                        if (behavior instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) behavior).f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public static View x(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public static View z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final SavedState B(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z;
            boolean z2;
            int iS = s();
            int childCount = appBarLayout.getChildCount();
            boolean z3 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iS;
                if (childAt.getTop() + iS <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    if (iS == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    savedState.d = z;
                    if (!z && (-iS) >= appBarLayout.getTotalScrollRange()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    savedState.c = z2;
                    savedState.e = i;
                    WeakHashMap weakHashMap = ViewCompat.a;
                    if (bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight()) {
                        z3 = true;
                    }
                    savedState.g = z3;
                    savedState.f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iU = u() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    View childAt = appBarLayout.getChildAt(i);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    g7 g7Var = (g7) childAt.getLayoutParams();
                    if ((g7Var.a & 32) == 32) {
                        top -= ((LinearLayout.LayoutParams) g7Var).topMargin;
                        bottom += ((LinearLayout.LayoutParams) g7Var).bottomMargin;
                    }
                    int i2 = -iU;
                    if (top <= i2 && bottom >= i2) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                g7 g7Var2 = (g7) childAt2.getLayoutParams();
                int i3 = g7Var2.a;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap weakHashMap = ViewCompat.a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap weakHashMap2 = ViewCompat.a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap weakHashMap3 = ViewCompat.a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iU < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) g7Var2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) g7Var2).bottomMargin;
                    }
                    if (iU < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    y(coordinatorLayout, appBarLayout, MathUtils.a(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        @Override // defpackage.lw0
        public final int u() {
            return s() + this.j;
        }

        public final void y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            int iAbs = Math.abs(u() - i);
            float fAbs = Math.abs(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (fAbs > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                height = Math.round((iAbs / fAbs) * 1000.0f) * 3;
            } else {
                height = (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int iU = u();
            ValueAnimator valueAnimator = this.l;
            if (iU == i) {
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.l.cancel();
                    return;
                }
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.l = valueAnimator2;
                valueAnimator2.setInterpolator(y6.e);
                this.l.addUpdateListener(new a(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.l.setDuration(Math.min(height, 600));
            this.l.setIntValues(iU, i);
            this.l.start();
        }

        public BaseBehavior() {
            this.f = -1;
            this.h = -1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ScrollingViewBehavior extends ow0 {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r12.z);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                ViewCompat.z(coordinatorLayout, null);
            }
        }

        public static AppBarLayout v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).a;
            if (behavior instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).j) + this.e) - u(view2);
                WeakHashMap weakHashMap = ViewCompat.a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l) {
                    appBarLayout.f(appBarLayout.g(view));
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutV = v(coordinatorLayout.d(view));
            if (appBarLayoutV != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutV.e(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    @Deprecated
    public float getTargetElevation() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public void setLiftOnScrollTargetView(@Nullable View view) {
        this.m = -1;
        if (view != null) {
            this.n = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            d.r("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static g7 b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            g7 g7Var = new g7((LinearLayout.LayoutParams) layoutParams);
            g7Var.a = 1;
            return g7Var;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            g7 g7Var2 = new g7((ViewGroup.MarginLayoutParams) layoutParams);
            g7Var2.a = 1;
            return g7Var2;
        }
        g7 g7Var3 = new g7(layoutParams);
        g7Var3.a = 1;
        return g7Var3;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g7 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        g7 g7Var = new g7(context, attributeSet);
        g7Var.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r12.b);
        g7Var.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        g7Var.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new uf1(1);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            g7Var.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return g7Var;
    }

    public final void c() {
        Behavior behavior = this.y;
        BaseBehavior.SavedState savedStateB = (behavior == null || this.b == -1 || this.f != 0) ? null : behavior.B(AbsSavedState.b, this);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        if (savedStateB != null) {
            Behavior behavior2 = this.y;
            if (behavior2.m != null) {
                return;
            }
            behavior2.m = savedStateB;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g7;
    }

    public final void d(int i) {
        this.a = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = ViewCompat.a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                zt ztVar = (zt) this.h.get(i2);
                if (ztVar != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = ztVar.a;
                    collapsingToolbarLayout.y = i;
                    xt xtVar = collapsingToolbarLayout.k;
                    WindowInsetsCompat windowInsetsCompat = collapsingToolbarLayout.A;
                    int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : 0;
                    int childCount = collapsingToolbarLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = collapsingToolbarLayout.getChildAt(i3);
                        yt ytVar = (yt) childAt.getLayoutParams();
                        f63 f63VarB = CollapsingToolbarLayout.b(childAt);
                        int i4 = ytVar.a;
                        if (i4 == 1) {
                            f63VarB.b(MathUtils.a(-i, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((yt) childAt.getLayoutParams())).bottomMargin));
                        } else if (i4 == 2) {
                            f63VarB.b(Math.round((-i) * ytVar.b));
                        }
                    }
                    collapsingToolbarLayout.d();
                    if (collapsingToolbarLayout.p != null && systemWindowInsetTop > 0) {
                        WeakHashMap weakHashMap2 = ViewCompat.a;
                        collapsingToolbarLayout.postInvalidateOnAnimation();
                    }
                    int height = collapsingToolbarLayout.getHeight();
                    WeakHashMap weakHashMap3 = ViewCompat.a;
                    int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - systemWindowInsetTop;
                    float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
                    float f = minimumHeight;
                    float fMin = Math.min(1.0f, scrimVisibleHeightTrigger / f);
                    xtVar.d = fMin;
                    xtVar.e = h50.c(1.0f, fMin, 0.5f, fMin);
                    xtVar.f = collapsingToolbarLayout.y + minimumHeight;
                    xtVar.p(Math.abs(i) / f);
                }
            }
        }
    }

    public final void e(boolean z2, boolean z3, boolean z4) {
        this.f = (z2 ? 1 : 2) | (z3 ? 4 : 0) | (z4 ? 8 : 0);
        requestLayout();
    }

    public final boolean f(boolean z2) {
        if (this.i || this.k == z2) {
            return false;
        }
        this.k = z2;
        refreshDrawableState();
        if (!(getBackground() instanceof pi1)) {
            return true;
        }
        boolean z3 = this.o;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z3) {
            float f2 = z2 ? 0.0f : 1.0f;
            if (z2) {
                f = 1.0f;
            }
            h(f2, f);
            return true;
        }
        if (!this.l) {
            return true;
        }
        float f3 = this.x;
        float f4 = z2 ? 0.0f : f3;
        if (z2) {
            f = f3;
        }
        h(f4, f);
        return true;
    }

    public final boolean g(View view) {
        int i;
        if (this.n == null && (i = this.m) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.m);
            }
            if (viewFindViewById != null) {
                this.n = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.n;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        g7 g7Var = new g7(-1, -2);
        g7Var.a = 1;
        return g7Var;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.y = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                g7 g7Var = (g7) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = g7Var.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) g7Var).topMargin + ((LinearLayout.LayoutParams) g7Var).bottomMargin;
                    if ((i3 & 8) != 0) {
                        WeakHashMap weakHashMap = ViewCompat.a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            WeakHashMap weakHashMap2 = ViewCompat.a;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap weakHashMap3 = ViewCompat.a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        WeakHashMap weakHashMap4 = ViewCompat.a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                g7 g7Var = (g7) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) g7Var).topMargin + ((LinearLayout.LayoutParams) g7Var).bottomMargin + childAt.getMeasuredHeight();
                int i3 = g7Var.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap = ViewCompat.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.d = iMax;
        return iMax;
    }

    @IdRes
    public int getLiftOnScrollTargetViewId() {
        return this.m;
    }

    public int getPendingAction() {
        return this.f;
    }

    @Nullable
    public Drawable getStatusBarForeground() {
        return this.v;
    }

    @VisibleForTesting
    public final int getTopInset() {
        WindowInsetsCompat windowInsetsCompat = this.g;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.getSystemWindowInsetTop();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                g7 g7Var = (g7) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = g7Var.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) g7Var).topMargin + ((LinearLayout.LayoutParams) g7Var).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = ViewCompat.a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap2 = ViewCompat.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.b = iMax;
        return iMax;
    }

    public final void h(float f, float f2) {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.s);
        this.p.setInterpolator(this.t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.q;
        if (animatorUpdateListener != null) {
            this.p.addUpdateListener(animatorUpdateListener);
        }
        this.p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.u == null) {
            this.u = new int[4];
        }
        int[] iArr = this.u;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z2 = this.j;
        iArr[0] = z2 ? R.attr.state_liftable : -2130969742;
        iArr[1] = (z2 && this.k) ? R.attr.state_lifted : -2130969743;
        iArr[2] = z2 ? R.attr.state_collapsible : -2130969738;
        iArr[3] = (z2 && this.k) ? R.attr.state_collapsed : -2130969737;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    public void setExpanded(boolean z2) {
        WeakHashMap weakHashMap = ViewCompat.a;
        e(z2, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z2) {
        this.l = z2;
    }

    public void setLiftOnScrollTargetViewId(@IdRes int i) {
        this.m = i;
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    public void setLiftableOverrideEnabled(boolean z2) {
        this.i = z2;
    }

    public void setStatusBarForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            Integer numValueOf = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.v = drawableMutate;
            if (drawableMutate instanceof pi1) {
                numValueOf = Integer.valueOf(((pi1) drawableMutate).u);
            } else {
                ColorStateList colorStateListA = ke0.a(drawableMutate);
                if (colorStateListA != null) {
                    numValueOf = Integer.valueOf(colorStateListA.getDefaultColor());
                }
            }
            this.w = numValueOf;
            Drawable drawable3 = this.v;
            boolean z2 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                Drawable drawable4 = this.v;
                WeakHashMap weakHashMap = ViewCompat.a;
                drawable4.setLayoutDirection(getLayoutDirection());
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            if (this.v != null && getTopInset() > 0) {
                z2 = true;
            }
            setWillNotDraw(!z2);
            WeakHashMap weakHashMap2 = ViewCompat.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(@ColorInt int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public AppBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        boolean z2;
        Integer numValueOf;
        int color;
        super(os2.G(context, attributeSet, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout), attributeSet, R.attr.appBarLayoutStyle);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        int i = 0;
        this.f = 0;
        this.r = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = ip2.d(context3, attributeSet, c71.b, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = ip2.d(context2, attributeSet, r12.a, R.attr.appBarLayoutStyle, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayD2.getDrawable(0);
            WeakHashMap weakHashMap = ViewCompat.a;
            setBackground(drawable);
            final ColorStateList colorStateListA = ni1.a(context2, typedArrayD2, 6);
            if (colorStateListA != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.o = z2;
            final ColorStateList colorStateListA2 = ke0.a(getBackground());
            if (colorStateListA2 != null) {
                final pi1 pi1Var = new pi1();
                pi1Var.k(colorStateListA2);
                if (colorStateListA != null) {
                    Context context4 = getContext();
                    TypedValue typedValueA = wh1.a(context4, R.attr.colorSurface);
                    if (typedValueA != null) {
                        int i2 = typedValueA.resourceId;
                        if (i2 != 0) {
                            color = context4.getColor(i2);
                        } else {
                            color = typedValueA.data;
                        }
                        numValueOf = Integer.valueOf(color);
                    } else {
                        numValueOf = null;
                    }
                    final Integer num = numValueOf;
                    this.q = new ValueAnimator.AnimatorUpdateListener() { // from class: e7
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num2;
                            AppBarLayout appBarLayout = this.a;
                            ArrayList arrayList = appBarLayout.r;
                            int iD = ki1.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), colorStateListA2.getDefaultColor(), colorStateListA.getDefaultColor());
                            ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD);
                            pi1 pi1Var2 = pi1Var;
                            pi1Var2.k(colorStateListValueOf);
                            if (appBarLayout.v != null && (num2 = appBarLayout.w) != null && num2.equals(num)) {
                                appBarLayout.v.setTint(iD);
                            }
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            int size = arrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = arrayList.get(i3);
                                i3++;
                                if (obj != null) {
                                    m93.b();
                                    return;
                                } else if (pi1Var2.a.c != null) {
                                    throw null;
                                }
                            }
                        }
                    };
                    setBackground(pi1Var);
                } else {
                    pi1Var.i(context2);
                    this.q = new f7(i, this, pi1Var);
                    setBackground(pi1Var);
                }
            }
            this.s = nq2.k(R.attr.motionDurationMedium2, context2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.t = nq2.l(context2, R.attr.motionEasingStandardInterpolator, y6.a);
            if (typedArrayD2.hasValue(4)) {
                e(typedArrayD2.getBoolean(4, false), false, false);
            }
            if (typedArrayD2.hasValue(3)) {
                c71.s(this, typedArrayD2.getDimensionPixelSize(3, 0));
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayD2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayD2.getBoolean(2, false));
                }
                if (typedArrayD2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayD2.getBoolean(1, false));
                }
            }
            this.x = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.l = typedArrayD2.getBoolean(5, false);
            this.m = typedArrayD2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(8));
            typedArrayD2.recycle();
            ViewCompat.G(this, new v7(this, 9));
        } catch (Throwable th) {
            typedArrayD.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.v != null && getTopInset() > 0) {
            int iSave = canvas.save();
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -this.a);
            this.v.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Nullable
    public pi1 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof pi1) {
            return (pi1) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = ViewCompat.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                minimumHeight = getChildAt(childCount - 1).getMinimumHeight();
            } else {
                minimumHeight = 0;
            }
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof pi1) {
            c71.t(this, (pi1) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        WeakHashMap weakHashMap = ViewCompat.a;
        boolean z3 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        c();
        this.e = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((g7) getChildAt(i5).getLayoutParams()).c != null) {
                this.e = true;
                break;
            }
        }
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.i) {
            if (!this.l) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 < childCount3) {
                        int i7 = ((g7) getChildAt(i6).getLayoutParams()).a;
                        if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                            break;
                        } else {
                            i6++;
                        }
                    } else {
                        z3 = false;
                        break;
                    }
                }
            }
            if (this.j != z3) {
                this.j = z3;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = ViewCompat.a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode != Integer.MIN_VALUE) {
                        if (mode == 0) {
                            measuredHeight += getTopInset();
                        }
                    } else {
                        measuredHeight = MathUtils.a(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        c();
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof pi1) {
            ((pi1) background).j(f);
        }
    }

    public void setStatusBarForegroundResource(@DrawableRes int i) {
        setStatusBarForeground(AppCompatResources.a(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        c71.s(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z2;
        super.setVisibility(i);
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.v) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        g7 g7Var = new g7(-1, -2);
        g7Var.a = 1;
        return g7Var;
    }
}
