package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzchx extends TextureView {
    public final zzcil a;
    public final zzciv b;

    public void A(int i) {
    }

    public void B(int i) {
    }

    public void c(int i) {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.h, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void f(int i) {
    }

    public void g(int i) {
    }

    public abstract String h();

    public abstract void i(zzcif zzcifVar);

    public abstract void j(String str);

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract int n();

    public abstract int o();

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public abstract void p(int i);

    public abstract void q(float f, float f2);

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract int w();

    public abstract void x();

    public Integer y() {
        return null;
    }

    public zzchx(Context context) {
        super(context);
        this.a = new zzcil();
        this.b = new zzciv(context, this);
    }

    public void z(String str, String[] strArr, Integer num) {
        j(str);
    }
}
