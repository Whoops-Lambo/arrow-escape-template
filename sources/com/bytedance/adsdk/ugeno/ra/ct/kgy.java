package com.bytedance.adsdk.ugeno.ra.ct;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.ct;
import com.bytedance.adsdk.ugeno.fi.fi;
import com.bytedance.adsdk.ugeno.fi.uq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy extends FrameLayout {
    private float ahm;
    private LinearLayout ct;
    private ct fi;
    private float kgy;
    private LinearLayout noq;
    private double rz;
    private float uq;
    private Context yo;

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.kgy, (int) this.ahm);
        float f = this.uq;
        layoutParams.leftMargin = (int) f;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ct ctVar = this.fi;
        if (ctVar != null) {
            ctVar.kgy(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ct ctVar = this.fi;
        if (ctVar != null) {
            ctVar.kgy(i, i2);
        }
        super.onMeasure(i, i2);
        this.ct.measure(i, i2);
        double dFloor = Math.floor(this.rz);
        float f = this.uq;
        float f2 = this.kgy;
        this.noq.measure(View.MeasureSpec.makeMeasureSpec((int) (((this.rz - dFloor) * ((double) f2)) + (((double) (f + f + f2)) * dFloor) + ((double) f)), 1073741824), View.MeasureSpec.makeMeasureSpec(this.ct.getMeasuredHeight(), 1073741824));
    }

    public kgy(Context context) {
        super(context);
        this.yo = context;
        this.ct = new LinearLayout(context);
        this.noq = new LinearLayout(context);
        this.ct.setOrientation(0);
        this.ct.setGravity(8388611);
        this.noq.setOrientation(0);
        this.noq.setGravity(8388611);
    }

    public void kgy(double d, int i, int i2, float f, int i3) {
        removeAllViews();
        this.ct.removeAllViews();
        this.noq.removeAllViews();
        this.kgy = (int) fi.kgy(this.yo, f);
        this.ahm = (int) fi.kgy(this.yo, f);
        this.rz = d;
        this.uq = i3;
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            kgy(starImageView, "tt_ugen_rating_star");
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            this.noq.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            kgy(starImageView2, "tt_ugen_rating_star");
            starImageView2.setColorFilter(i2);
            this.ct.addView(starImageView2);
        }
        addView(this.ct);
        addView(this.noq);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ct ctVar = this.fi;
        if (ctVar != null) {
            ctVar.yo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ct ctVar = this.fi;
        if (ctVar != null) {
            ctVar.fi();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ct ctVar = this.fi;
        if (ctVar != null) {
            ctVar.ahm(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ct ctVar = this.fi;
        if (ctVar != null) {
            ctVar.kgy(z);
        }
    }

    public void kgy(ImageView imageView, String str) {
        imageView.setImageResource(uq.ahm(this.yo, str));
    }

    public void kgy(ct ctVar) {
        this.fi = ctVar;
    }
}
