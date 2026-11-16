package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.ecffri.arrows.R;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.d;
import defpackage.d0;
import defpackage.jc1;
import defpackage.m93;
import defpackage.nf2;
import defpackage.ni1;
import defpackage.nq2;
import defpackage.pi1;
import defpackage.qd2;
import defpackage.qj0;
import defpackage.r12;
import defpackage.rd1;
import defpackage.rd2;
import defpackage.yj;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public rd1 a;
    public final pi1 b;
    public final ColorStateList c;
    public final rd2 d;
    public final yj e;
    public final float f;
    public final boolean g;
    public int h;
    public ViewDragHelper i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public int t;
    public final LinkedHashSet u;
    public final nf2 v;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void c(CoordinatorLayout.LayoutParams layoutParams) {
        this.p = null;
        this.i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void f() {
        this.p = null;
        this.i = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1.q(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        s(2);
        r2.e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L17
            r0 = 5
            if (r4 != r0) goto Ld
            rd1 r0 = r2.a
            int r0 = r0.k()
            goto L1d
        Ld:
            java.lang.String r2 = "Invalid state to get outer edge offset: "
            java.lang.String r2 = defpackage.pv1.k(r4, r2)
            defpackage.d.r(r2)
            return
        L17:
            rd1 r0 = r2.a
            int r0 = r0.j()
        L1d:
            androidx.customview.widget.ViewDragHelper r1 = r2.i
            if (r1 == 0) goto L55
            if (r5 == 0) goto L2e
            int r3 = r3.getTop()
            boolean r3 = r1.q(r0, r3)
            if (r3 == 0) goto L55
            goto L4b
        L2e:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.i(r0, r5, r3, r3)
            if (r3 != 0) goto L49
            int r5 = r1.a
            if (r5 != 0) goto L49
            android.view.View r5 = r1.r
            if (r5 == 0) goto L49
            r5 = 0
            r1.r = r5
        L49:
            if (r3 == 0) goto L55
        L4b:
            r3 = 2
            r2.s(r3)
            yj r2 = r2.e
            r2.a(r4)
            return
        L55:
            r2.s(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.u(android.view.View, int, boolean):void");
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(android.view.AbsSavedState.EMPTY_STATE);
            this.c = sideSheetBehavior.h;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0206  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115  */
    /* JADX WARN: Code duplicated, block: B:60:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:74:0x0146  */
    /* JADX WARN: Code duplicated, block: B:76:0x015e  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        CoordinatorLayout.LayoutParams layoutParams;
        rd2 rd2Var;
        WeakReference weakReference;
        rd2 rd2VarA;
        View view2;
        WeakReference weakReference2;
        rd2 rd2VarA2;
        View view3;
        int left;
        int i2;
        int iL;
        int i3;
        View viewFindViewById;
        int i4;
        WeakHashMap weakHashMap = ViewCompat.a;
        int i5 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference3 = this.p;
        pi1 pi1Var = this.b;
        int i6 = 0;
        if (weakReference3 == null) {
            this.p = new WeakReference(view);
            Context context = view.getContext();
            nq2.l(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            nq2.k(R.attr.motionDurationMedium2, context, 300);
            nq2.k(R.attr.motionDurationShort3, context, 150);
            nq2.k(R.attr.motionDurationShort2, context, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (pi1Var != null) {
                view.setBackground(pi1Var);
                float fK = this.f;
                if (fK == -1.0f) {
                    fK = ViewCompat.k(view);
                }
                pi1Var.j(fK);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    ViewCompat.C(view, colorStateList);
                }
            }
            int i7 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i7) {
                view.setVisibility(i7);
            }
            v();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (ViewCompat.g(view) == null) {
                ViewCompat.B(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i8 = Gravity.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        rd1 rd1Var = this.a;
        if (rd1Var != null) {
            switch (rd1Var.a) {
                case 0:
                    i4 = 1;
                    break;
                default:
                    i4 = 0;
                    break;
            }
            if (i4 != i8) {
                layoutParams = null;
                rd2Var = this.d;
                if (i8 == 0) {
                    this.a = new rd1(this, i5);
                    if (rd2Var != null) {
                        weakReference2 = this.p;
                        if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                            layoutParams = (CoordinatorLayout.LayoutParams) view3.getLayoutParams();
                        }
                        if (layoutParams != null || ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin <= 0) {
                            qd2 qd2VarE = rd2Var.e();
                            qd2VarE.f = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            qd2VarE.g = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            rd2VarA2 = qd2VarE.a();
                            if (pi1Var != null) {
                                pi1Var.setShapeAppearanceModel(rd2VarA2);
                            }
                        }
                    }
                } else {
                    if (i8 == 1) {
                        d.r(jc1.k(i8, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                        return false;
                    }
                    this.a = new rd1(this, i6);
                    if (rd2Var != null) {
                        weakReference = this.p;
                        if (weakReference != null && (view2 = (View) weakReference.get()) != null && (view2.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                            layoutParams = (CoordinatorLayout.LayoutParams) view2.getLayoutParams();
                        }
                        if (layoutParams != null || ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin <= 0) {
                            qd2 qd2VarE2 = rd2Var.e();
                            qd2VarE2.e = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            qd2VarE2.h = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            rd2VarA = qd2VarE2.a();
                            if (pi1Var != null) {
                                pi1Var.setShapeAppearanceModel(rd2VarA);
                            }
                        }
                    }
                }
            }
        } else {
            layoutParams = null;
            rd2Var = this.d;
            if (i8 == 0) {
                this.a = new rd1(this, i5);
                if (rd2Var != null) {
                    weakReference2 = this.p;
                    if (weakReference2 != null) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view3.getLayoutParams();
                    }
                    if (layoutParams != null) {
                        qd2 qd2VarE3 = rd2Var.e();
                        qd2VarE3.f = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        qd2VarE3.g = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        rd2VarA2 = qd2VarE3.a();
                        if (pi1Var != null) {
                            pi1Var.setShapeAppearanceModel(rd2VarA2);
                        }
                    } else {
                        qd2 qd2VarE4 = rd2Var.e();
                        qd2VarE4.f = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        qd2VarE4.g = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        rd2VarA2 = qd2VarE4.a();
                        if (pi1Var != null) {
                            pi1Var.setShapeAppearanceModel(rd2VarA2);
                        }
                    }
                }
            } else {
                if (i8 == 1) {
                    d.r(jc1.k(i8, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.a = new rd1(this, i6);
                if (rd2Var != null) {
                    weakReference = this.p;
                    if (weakReference != null) {
                        layoutParams = (CoordinatorLayout.LayoutParams) view2.getLayoutParams();
                    }
                    if (layoutParams != null) {
                        qd2 qd2VarE5 = rd2Var.e();
                        qd2VarE5.e = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        qd2VarE5.h = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        rd2VarA = qd2VarE5.a();
                        if (pi1Var != null) {
                            pi1Var.setShapeAppearanceModel(rd2VarA);
                        }
                    } else {
                        qd2 qd2VarE6 = rd2Var.e();
                        qd2VarE6.e = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        qd2VarE6.h = new d0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        rd2VarA = qd2VarE6.a();
                        if (pi1Var != null) {
                            pi1Var.setShapeAppearanceModel(rd2VarA);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.v);
        }
        int iL2 = this.a.l(view);
        coordinatorLayout.q(i, view);
        this.m = coordinatorLayout.getWidth();
        switch (this.a.a) {
            case 0:
                left = coordinatorLayout.getLeft();
                break;
            default:
                left = coordinatorLayout.getRight();
                break;
        }
        this.n = left;
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            switch (this.a.a) {
                case 0:
                    i2 = marginLayoutParams.leftMargin;
                    break;
                default:
                    i2 = marginLayoutParams.rightMargin;
                    break;
            }
        } else {
            i2 = 0;
        }
        this.o = i2;
        int i9 = this.h;
        if (i9 == 1 || i9 == 2) {
            iL = iL2 - this.a.l(view);
        } else if (i9 == 3) {
            iL = 0;
        } else {
            if (i9 != 5) {
                e.e(this.h, "Unexpected value: ");
                return false;
            }
            iL = this.a.k();
        }
        view.offsetLeftAndRight(iL);
        if (this.q == null && (i3 = this.r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i3)) != null) {
            this.q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                m93.b();
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void n(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable o(View view) {
        android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    public final void s(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.u.iterator();
        if (!it.hasNext()) {
            v();
        } else {
            it.next().getClass();
            m93.b();
        }
    }

    public final boolean t() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    public final void v() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.v(Constants.REFERRER_LINK_MAX_RESPONSE_CHARS, view);
        ViewCompat.s(0, view);
        ViewCompat.v(1048576, view);
        ViewCompat.s(0, view);
        int i = 1;
        int i2 = 5;
        if (this.h != 5) {
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.n, new qj0(i2, i, this));
        }
        int i3 = 3;
        if (this.h != 3) {
            ViewCompat.w(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.l, new qj0(i3, i, this));
        }
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this.e = new yj(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new nf2(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r12.B);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = ni1.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = rd2.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = ViewCompat.a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        rd2 rd2Var = this.d;
        if (rd2Var != null) {
            pi1 pi1Var = new pi1(rd2Var);
            this.b = pi1Var;
            pi1Var.i(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        VelocityTracker velocityTracker;
        if ((view.isShown() || ViewCompat.g(view) != null) && this.g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.s) != null) {
                velocityTracker.recycle();
                this.s = null;
            }
            if (this.s == null) {
                this.s = VelocityTracker.obtain();
            }
            this.s.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.j) {
                    this.j = false;
                    return false;
                }
            } else {
                this.t = (int) motionEvent.getX();
            }
            if (!this.j && (viewDragHelper = this.i) != null && viewDragHelper.r(motionEvent)) {
                return true;
            }
            return false;
        }
        this.j = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (t()) {
            this.i.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (t() && actionMasked == 2 && !this.j && t()) {
            float fAbs = Math.abs(this.t - motionEvent.getX());
            ViewDragHelper viewDragHelper = this.i;
            if (fAbs > viewDragHelper.b) {
                viewDragHelper.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.j;
    }

    public SideSheetBehavior() {
        this.e = new yj(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new nf2(this);
    }
}
