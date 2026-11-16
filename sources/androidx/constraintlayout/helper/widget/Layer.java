package androidx.constraintlayout.helper.widget;

import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class Layer extends ConstraintHelper {
    public float i;
    public float j;
    public float k;
    public ConstraintLayout l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public View[] u;
    public float v;
    public float w;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k() {
        int i;
        if (this.l != null && (i = this.b) != 0) {
            if (this.u.length != i) {
                this.u = new View[i];
            }
            for (int i2 = 0; i2 < this.b; i2++) {
                this.u[i2] = this.l.a(this.a[i2]);
            }
        }
        this.o = Float.NaN;
        this.p = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).q0;
        constraintWidget.P(0);
        constraintWidget.M(0);
        n();
        layout(((int) this.s) - getPaddingLeft(), ((int) this.t) - getPaddingTop(), getPaddingRight() + ((int) this.q), getPaddingBottom() + ((int) this.r));
        o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void l(ConstraintLayout constraintLayout) {
        this.l = constraintLayout;
        float rotation = getRotation();
        if (rotation != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.k = rotation;
        } else {
            if (Float.isNaN(this.k)) {
                return;
            }
            this.k = rotation;
        }
    }

    public final void n() {
        if (this.l == null) {
            return;
        }
        if (Float.isNaN(this.o) || Float.isNaN(this.p)) {
            if (!Float.isNaN(this.i) && !Float.isNaN(this.j)) {
                this.p = this.j;
                this.o = this.i;
                return;
            }
            View[] viewArrH = h(this.l);
            int left = viewArrH[0].getLeft();
            int top = viewArrH[0].getTop();
            int right = viewArrH[0].getRight();
            int bottom = viewArrH[0].getBottom();
            for (int i = 0; i < this.b; i++) {
                View view = viewArrH[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.q = right;
            this.r = bottom;
            this.s = left;
            this.t = top;
            if (Float.isNaN(this.i)) {
                this.o = (left + right) / 2;
            } else {
                this.o = this.i;
            }
            if (Float.isNaN(this.j)) {
                this.p = (top + bottom) / 2;
            } else {
                this.p = this.j;
            }
        }
    }

    public final void o() {
        if (this.l == null) {
            return;
        }
        n();
        double radians = Float.isNaN(this.k) ? 0.0d : Math.toRadians(this.k);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.m;
        float f2 = f * fCos;
        float f3 = this.n;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.b; i++) {
            View view = this.u[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.o;
            float f8 = bottom - this.p;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.v;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.w;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.n);
            view.setScaleX(this.m);
            if (!Float.isNaN(this.k)) {
                view.setRotation(this.k);
            }
        }
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.i = f;
        o();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.j = f;
        o();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.k = f;
        o();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.m = f;
        o();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.n = f;
        o();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.v = f;
        o();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.w = f;
        o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = (ConstraintLayout) getParent();
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.b; i++) {
            View viewA = this.l.a(this.a[i]);
            if (viewA != null) {
                viewA.setVisibility(visibility);
                if (elevation > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    viewA.setTranslationZ(viewA.getTranslationZ() + elevation);
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
