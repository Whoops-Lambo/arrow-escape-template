package io.p071bidmachine.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.f;
import defpackage.d;
import defpackage.ve0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class r {
    public final View.OnClickListener a;
    public View b;
    public q c;
    public boolean d = false;
    public final f e = new f(this, 4);
    public final ve0 f = new ve0(this, 2);

    public static ViewGroup.MarginLayoutParams a(Context context, q qVar) {
        Integer numValueOf;
        Integer numValueOf2 = -2;
        Float f = qVar.t;
        if (f != null) {
            float fFloatValue = f.floatValue();
            Float f2 = qVar.t;
            if (fFloatValue == -1.0f) {
                numValueOf = Integer.valueOf(f2.intValue());
            } else {
                float fFloatValue2 = f2.floatValue();
                Float f3 = qVar.t;
                numValueOf = fFloatValue2 == -2.0f ? Integer.valueOf(f3.intValue()) : Integer.valueOf(y.c(context, f3.floatValue()));
            }
        } else {
            numValueOf = numValueOf2;
        }
        int iIntValue = numValueOf.intValue();
        Float f4 = qVar.u;
        if (f4 != null) {
            float fFloatValue3 = f4.floatValue();
            Float f5 = qVar.u;
            if (fFloatValue3 == -1.0f) {
                numValueOf2 = Integer.valueOf(f5.intValue());
            } else {
                float fFloatValue4 = f5.floatValue();
                Float f6 = qVar.u;
                numValueOf2 = fFloatValue4 == -2.0f ? Integer.valueOf(f6.intValue()) : Integer.valueOf(y.c(context, f6.floatValue()));
            }
        }
        return new ViewGroup.MarginLayoutParams(iIntValue, numValueOf2.intValue());
    }

    public void b(View view, q qVar) {
    }

    public abstract View d(Context context, q qVar);

    public abstract q e(Context context, q qVar);

    public final void f() {
        this.d = false;
        View view = this.b;
        if (view == null || this.c == null) {
            return;
        }
        view.animate().cancel();
        this.b.removeCallbacks(this.e);
        this.b.setClickable(true);
        View view2 = this.b;
        Float fValueOf = this.c.h;
        if (fValueOf == null) {
            fValueOf = Float.valueOf(1.0f);
        }
        view2.setAlpha(fValueOf.floatValue());
    }

    public final void g() {
        if (this.b != null) {
            f();
            y.f(this.b);
            this.b = null;
            this.c = null;
        }
    }

    public final void h(int i) {
        View view = this.b;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public r(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    public final void c(Context context, ViewGroup viewGroup, q qVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        q qVar2;
        q qVarD = e(context, qVar).d(qVar);
        if (!qVarD.n().booleanValue()) {
            g();
            return;
        }
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a(context, qVarD));
            Integer num = qVarD.f;
            if (num == null) {
                num = 48;
            }
            int iIntValue = num.intValue();
            Integer num2 = qVarD.e;
            if (num2 == null) {
                num2 = 3;
            }
            layoutParams.gravity = iIntValue | num2.intValue();
            marginLayoutParams = layoutParams;
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a(context, qVarD));
            qVarD.c(layoutParams2);
            marginLayoutParams = layoutParams2;
        } else {
            d.r("Parent should be instance of FrameLayout or RelativeLayout");
            return;
        }
        qVarD.a(context, marginLayoutParams);
        if (this.b != null && (qVar2 = this.c) != null && TextUtils.equals(qVar2.g, qVarD.g)) {
            this.b.setLayoutParams(marginLayoutParams);
            this.b.setVisibility(0);
        } else {
            y.f(this.b);
            View viewD = d(context, qVarD);
            this.b = viewD;
            viewGroup.addView(viewD, marginLayoutParams);
        }
        View view = this.b;
        Float fValueOf = qVarD.h;
        if (fValueOf == null) {
            fValueOf = Float.valueOf(1.0f);
        }
        view.setAlpha(fValueOf.floatValue());
        qVarD.b(context, this.b);
        this.b.setOnClickListener(this.a);
        this.c = qVarD;
        KeyEvent.Callback callback = this.b;
        if (callback instanceof p) {
            ((p) callback).setStyle(qVarD);
        }
        b(this.b, qVarD);
    }
}
