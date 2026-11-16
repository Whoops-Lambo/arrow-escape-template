package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.ecffri.arrows.R;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.k63;
import defpackage.l63;
import defpackage.m93;
import defpackage.ni1;
import defpackage.nj;
import defpackage.nq2;
import defpackage.oi1;
import defpackage.pi1;
import defpackage.pv1;
import defpackage.r12;
import defpackage.r61;
import defpackage.rd2;
import defpackage.tj;
import defpackage.uf1;
import defpackage.uj;
import defpackage.vj;
import defpackage.wj;
import defpackage.xj;
import defpackage.yj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public final yj A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public ViewDragHelper M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public int Y;
    public int Z;
    public final int a;
    public boolean a0;
    public boolean b;
    public HashMap b0;
    public final float c;
    public final SparseIntArray c0;
    public final int d;
    public final wj d0;
    public int e;
    public boolean f;
    public int g;
    public final int h;
    public final pi1 i;
    public final ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final rd2 y;
    public boolean z;

    public final void C(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(nj.q(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.I && i == 5) {
            pv1.u(i, "Cannot set state: ", "BottomSheetBehavior");
            return;
        }
        int i2 = (i == 6 && this.b && z(i) <= this.D) ? 3 : i;
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            D(i);
            return;
        }
        View view = (View) this.U.get();
        tj tjVar = new tj(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = ViewCompat.a;
            if (view.isAttachedToWindow()) {
                view.post(tjVar);
                return;
            }
        }
        tjVar.run();
    }

    public final void H(int i, boolean z) {
        pi1 pi1Var;
        if (i == 2) {
            return;
        }
        boolean z2 = this.L == 3 && (this.x || A());
        if (this.z == z2 || (pi1Var = this.i) == null) {
            return;
        }
        this.z = z2;
        ValueAnimator valueAnimator = this.B;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(pi1Var.a.i, z2 ? t() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fT = this.z ? t() : 1.0f;
        oi1 oi1Var = pi1Var.a;
        if (oi1Var.i != fT) {
            oi1Var.i = fT;
            pi1Var.e = true;
            pi1Var.invalidateSelf();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void c(CoordinatorLayout.LayoutParams layoutParams) {
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void f() {
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.K;
        if (i2 > 0) {
            if (i4 < y()) {
                int iY = top - y();
                iArr[1] = iY;
                int i5 = -iY;
                WeakHashMap weakHashMap = ViewCompat.a;
                view.offsetTopAndBottom(i5);
                D(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = ViewCompat.a;
                view.offsetTopAndBottom(-i2);
                D(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.G;
            if (i4 > i6 && !this.I) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = ViewCompat.a;
                view.offsetTopAndBottom(i8);
                D(4);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = ViewCompat.a;
                view.offsetTopAndBottom(-i2);
                D(1);
            }
        }
        v(view.getTop());
        this.O = i2;
        this.P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.O = 0;
        this.P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    public final float t() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        pi1 pi1Var = this.i;
        if (pi1Var != null && (weakReference = this.U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.U.get();
            if (A() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fA = pi1Var.a.a.e.a(pi1Var.g());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fA <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f = 0.0f;
                    } else {
                        f = radius / fA;
                    }
                } else {
                    f = 0.0f;
                }
                float fA2 = pi1Var.a.a.f.a(pi1Var.g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fA2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f2 = radius2 / fA2;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int z(int i) {
        if (i == 3) {
            return y();
        }
        if (i == 4) {
            return this.G;
        }
        if (i == 5) {
            return this.T;
        }
        if (i == 6) {
            return this.E;
        }
        d.r(pv1.k(i, "Invalid state to get top offset: "));
        return 0;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            boolean z2;
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.e = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f = z2;
            this.g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(android.view.AbsSavedState.EMPTY_STATE);
            this.c = bottomSheetBehavior.L;
            this.d = bottomSheetBehavior.e;
            this.e = bottomSheetBehavior.b;
            this.f = bottomSheetBehavior.I;
            this.g = bottomSheetBehavior.J;
        }
    }

    public final boolean A() {
        WeakReference weakReference = this.U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void B(int i) {
        boolean z = this.f;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!z && this.e == i) {
                return;
            }
            this.f = false;
            this.e = Math.max(0, i);
        }
        J();
    }

    public final void D(int i) {
        if (this.L == i) {
            return;
        }
        this.L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.I;
        }
        WeakReference weakReference = this.U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            I(true);
        } else if (i == 6 || i == 5 || i == 4) {
            I(false);
        }
        H(i, true);
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            G();
        } else {
            arrayList.get(0).getClass();
            m93.b();
        }
    }

    public final boolean E(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        return Math.abs(((f * this.Q) + ((float) view.getTop())) - ((float) this.G)) / ((float) u()) > 0.5f;
    }

    public final void G() {
        View view;
        int iA;
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.v(524288, view);
        ViewCompat.s(0, view);
        ViewCompat.v(Constants.REFERRER_LINK_MAX_RESPONSE_CHARS, view);
        ViewCompat.s(0, view);
        ViewCompat.v(1048576, view);
        ViewCompat.s(0, view);
        SparseIntArray sparseIntArray = this.c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            ViewCompat.v(i, view);
            ViewCompat.s(0, view);
            sparseIntArray.delete(0);
        }
        if (!this.b && this.L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            xj xjVar = new xj(this, 6);
            ArrayList arrayListH = ViewCompat.h(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListH.size()) {
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        int[] iArr = ViewCompat.d;
                        if (i3 >= 32 || i4 != -1) {
                            break;
                        }
                        int i5 = iArr[i3];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListH.size(); i6++) {
                            z &= ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListH.get(i6)).a() != i5;
                        }
                        if (z) {
                            i4 = i5;
                        }
                        i3++;
                    }
                    iA = i4;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListH.get(i2)).a).getLabel())) {
                    iA = ((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListH.get(i2)).a();
                    break;
                }
                i2++;
            }
            if (iA != -1) {
                AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, iA, string, xjVar, null);
                AccessibilityDelegateCompat accessibilityDelegateCompatE = ViewCompat.e(view);
                if (accessibilityDelegateCompatE == null) {
                    accessibilityDelegateCompatE = new AccessibilityDelegateCompat();
                }
                ViewCompat.z(view, accessibilityDelegateCompatE);
                ViewCompat.v(accessibilityActionCompat.a(), view);
                ViewCompat.h(view).add(accessibilityActionCompat);
                ViewCompat.s(0, view);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.I && this.L != 5) {
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.n, new xj(this, 5));
        }
        int i7 = this.L;
        if (i7 == 3) {
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.m, new xj(this, this.b ? 4 : 6));
            return;
        }
        if (i7 == 4) {
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.l, new xj(this, this.b ? 3 : 6));
        } else {
            if (i7 != 6) {
                return;
            }
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.m, new xj(this, 4));
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.l, new xj(this, 3));
        }
    }

    public final void I(boolean z) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.b0 != null) {
                    return;
                } else {
                    this.b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.U.get() && z) {
                    this.b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.b0 = null;
        }
    }

    public final void J() {
        View view;
        if (this.U != null) {
            s();
            if (this.L != 4 || (view = (View) this.U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = ViewCompat.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        boolean z = false;
        if (this.U == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z2 = (Build.VERSION.SDK_INT < 29 || this.n || this.f) ? false : true;
            if (this.o || this.p || this.q || this.s || this.t || this.u || z2) {
                vj vjVar = new vj(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                l63 l63Var = new l63();
                l63Var.a = paddingStart;
                l63Var.b = paddingEnd;
                l63Var.c = paddingBottom;
                ViewCompat.G(view, new uf1(vjVar, l63Var, z, 28));
                if (view.isAttachedToWindow()) {
                    ViewCompat.x(view);
                } else {
                    view.addOnAttachStateChangeListener(new k63());
                }
            }
            ViewCompat.N(view, new r61(view));
            this.U = new WeakReference(view);
            Context context = view.getContext();
            nq2.l(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            nq2.k(R.attr.motionDurationMedium2, context, 300);
            nq2.k(R.attr.motionDurationShort3, context, 150);
            nq2.k(R.attr.motionDurationShort2, context, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            pi1 pi1Var = this.i;
            if (pi1Var != null) {
                view.setBackground(pi1Var);
                float fK = this.H;
                if (fK == -1.0f) {
                    fK = ViewCompat.k(view);
                }
                pi1Var.j(fK);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    ViewCompat.C(view, colorStateList);
                }
            }
            G();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.M == null) {
            this.M = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(i, view);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int iMin = this.T;
        int i2 = iMin - height;
        int i3 = this.w;
        if (i2 < i3) {
            boolean z3 = this.r;
            int i4 = this.l;
            if (z3) {
                if (i4 != -1) {
                    iMin = Math.min(iMin, i4);
                }
                this.R = iMin;
            } else {
                int iMin2 = iMin - i3;
                if (i4 != -1) {
                    iMin2 = Math.min(iMin2, i4);
                }
                this.R = iMin2;
            }
        }
        this.D = Math.max(0, this.T - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        s();
        int i5 = this.L;
        if (i5 == 3) {
            view.offsetTopAndBottom(y());
        } else if (i5 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.I && i5 == 5) {
            view.offsetTopAndBottom(this.T);
        } else if (i5 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i5 == 1 || i5 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        H(this.L, false);
        this.V = new WeakReference(w(view));
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        m93.b();
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean j(View view) {
        WeakReference weakReference = this.V;
        return (weakReference == null || view != weakReference.get() || this.L == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void n(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = savedState.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = savedState.g;
            }
        }
        int i2 = savedState.c;
        if (i2 == 1 || i2 == 2) {
            this.L = 4;
        } else {
            this.L = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable o(View view) {
        android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    public final int u() {
        int iMin;
        int i;
        int i2;
        if (this.f) {
            iMin = Math.min(Math.max(this.g, this.T - ((this.S * 9) / 16)), this.R);
            i = this.v;
        } else {
            if (!this.n && !this.o && (i2 = this.m) > 0) {
                return Math.max(this.e, i2 + this.h);
            }
            iMin = this.e;
            i = this.v;
        }
        return iMin + i;
    }

    public final void v(int i) {
        if (((View) this.U.get()) != null) {
            ArrayList arrayList = this.W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.G;
            if (i <= i2 && i2 != y()) {
                y();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            m93.b();
        }
    }

    public final int y() {
        if (this.b) {
            return this.D;
        }
        return Math.max(this.C, this.r ? 0 : this.w);
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i;
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new yj(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.Z = -1;
        this.c0 = new SparseIntArray();
        this.d0 = new wj(this);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r12.d);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.j = ni1.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.y = rd2.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        rd2 rd2Var = this.y;
        if (rd2Var != null) {
            pi1 pi1Var = new pi1(rd2Var);
            this.i = pi1Var;
            pi1Var.i(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(t(), 1.0f);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.B.addUpdateListener(new uj(this, 0));
        this.H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            B(i);
        } else {
            B(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.I != z) {
            this.I = z;
            if (!z && this.L == 5) {
                C(4);
            }
            G();
        }
        this.n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.b != z2) {
            this.b = z2;
            if (this.U != null) {
                s();
            }
            D((this.b && this.L == 6) ? 3 : this.L);
            H(this.L, true);
            G();
        }
        this.J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f < 1.0f) {
            this.F = f;
            if (this.U != null) {
                this.E = (int) ((1.0f - f) * this.T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i2 = typedValuePeekValue2.data;
                if (i2 >= 0) {
                    this.C = i2;
                    H(this.L, true);
                } else {
                    d.r("offset must be greater than or equal to 0");
                    throw null;
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    H(this.L, true);
                } else {
                    d.r("offset must be greater than or equal to 0");
                    throw null;
                }
            }
            this.d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        d.r("ratio must be a float value between 0 and 1");
        throw null;
    }

    public static View w(View view) {
        if (view.getVisibility() == 0) {
            if (ViewCompat.r(view)) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View viewW = w(viewGroup.getChildAt(i));
                    if (viewW != null) {
                        return viewW;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static int x(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        D(2);
        H(r4, true);
        r2.A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.q(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.z(r4)
            androidx.customview.widget.ViewDragHelper r1 = r2.M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.q(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.i(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.D(r3)
            r3 = 1
            r2.H(r4, r3)
            yj r2 = r2.A
            r2.a(r4)
            return
        L40:
            r2.D(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.F(android.view.View, int, boolean):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        View view2;
        int i;
        ViewDragHelper viewDragHelper;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.Y = -1;
                this.Z = -1;
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.X = null;
                }
            }
            if (this.X == null) {
                this.X = VelocityTracker.obtain();
            }
            this.X.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.a0 = false;
                    this.Y = -1;
                    if (this.N) {
                        this.N = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.Z = (int) motionEvent.getY();
                if (this.L != 2) {
                    WeakReference weakReference = this.V;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.m(view2, x, this.Z)) {
                        this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.a0 = true;
                    }
                }
                if (this.Y == -1 && !coordinatorLayout.m(view, x, this.Z)) {
                    z = true;
                } else {
                    z = false;
                }
                this.N = z;
            }
            if (this.N || (viewDragHelper = this.M) == null || !viewDragHelper.r(motionEvent)) {
                WeakReference weakReference2 = this.V;
                if (weakReference2 != null) {
                    view3 = (View) weakReference2.get();
                }
                if (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.m(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || (i = this.Z) == -1 || Math.abs(i - motionEvent.getY()) <= this.M.b) {
                    return false;
                }
            }
            return true;
        }
        this.N = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), x(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.l, marginLayoutParams.height));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == y()) {
            D(3);
            return;
        }
        WeakReference weakReference = this.V;
        if (weakReference != null && view2 == weakReference.get() && this.P) {
            if (this.O > 0) {
                if (!this.b && view.getTop() > this.E) {
                    i3 = 6;
                }
            } else if (this.I) {
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker == null) {
                    yVelocity = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.X.getYVelocity(this.Y);
                }
                if (E(view, yVelocity)) {
                    i3 = 5;
                } else if (this.O == 0) {
                    top2 = view.getTop();
                    if (this.b) {
                        if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                            i3 = 4;
                        }
                    } else {
                        i2 = this.E;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.G)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.G)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    }
                } else {
                    if (!this.b) {
                        top = view.getTop();
                        if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.O == 0) {
                top2 = view.getTop();
                if (this.b) {
                    if (Math.abs(top2 - this.D) >= Math.abs(top2 - this.G)) {
                        i3 = 4;
                    }
                } else {
                    i2 = this.E;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.G)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.G)) {
                        i3 = 4;
                    }
                    i3 = 6;
                }
            } else {
                if (!this.b) {
                    top = view.getTop();
                    if (Math.abs(top - this.E) < Math.abs(top - this.G)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            F(view, i3, false);
            this.P = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.M;
        boolean z = this.K;
        if (viewDragHelper != null && (z || i == 1)) {
            viewDragHelper.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            this.Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((z || this.L == 1) && actionMasked == 2 && !this.N)) {
            float fAbs = Math.abs(this.Z - motionEvent.getY());
            ViewDragHelper viewDragHelper2 = this.M;
            if (fAbs > viewDragHelper2.b) {
                viewDragHelper2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.N;
    }

    public final void s() {
        int iU = u();
        boolean z = this.b;
        int i = this.T;
        if (z) {
            this.G = Math.max(i - iU, this.D);
        } else {
            this.G = i - iU;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.k = -1;
        this.l = -1;
        this.A = new yj(this);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.Z = -1;
        this.c0 = new SparseIntArray();
        this.d0 = new wj(this);
    }
}
