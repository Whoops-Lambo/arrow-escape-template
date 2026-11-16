package com.bytedance.adsdk.ugeno.kgy;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class fi implements yo {
    private float ahm;
    private float ct;
    private View kgy;
    private float noq;
    private float rz;
    private float uq;

    public void ahm(float f) {
        View view = this.kgy;
        if (view == null) {
            return;
        }
        this.rz = f;
        view.postInvalidate();
    }

    public void ct(float f) {
        this.noq = f;
        this.kgy.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getRipple() {
        return this.rz;
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getRubIn() {
        return this.noq;
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getShine() {
        return this.uq;
    }

    @Override // com.bytedance.adsdk.ugeno.kgy.yo
    public float getStretch() {
        return this.ct;
    }

    public void kgy(int i) {
        View view = this.kgy;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i);
        }
    }

    public void rz(float f) {
        View view = this.kgy;
        if (view == null) {
            return;
        }
        this.uq = f;
        view.postInvalidate();
    }

    public void uq(float f) {
        this.ct = f;
        this.kgy.postInvalidate();
    }

    public fi(View view) {
        this.kgy = view;
    }

    public float kgy() {
        return this.ahm;
    }

    public void kgy(float f) {
        View view = this.kgy;
        if (view == null) {
            return;
        }
        this.ahm = f;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f);
        }
    }
}
