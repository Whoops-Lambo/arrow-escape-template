package com.bytedance.sdk.component.adexpress.noq;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class ioy extends FrameLayout {
    private static final int gf = (com.bytedance.sdk.component.adexpress.dynamic.ct.nu.ahm("", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true)[1] / 2) + 1;
    private static final int ra = (com.bytedance.sdk.component.adexpress.dynamic.ct.nu.ahm("", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true)[1] / 2) + 3;
    LinearLayout ahm;
    private Drawable ct;
    private float fi;
    LinearLayout kgy;
    private Drawable noq;
    private float rz;
    private float uq;
    private double yo;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.rz, (int) this.uq));
        imageView.setPadding(1, gf, 1, ra);
        return imageView;
    }

    public Drawable getStarEmptyDrawable() {
        return this.ct;
    }

    public Drawable getStarFillDrawable() {
        return this.noq;
    }

    public ioy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.kgy = new LinearLayout(getContext());
        this.ahm = new LinearLayout(getContext());
        this.kgy.setOrientation(0);
        this.kgy.setGravity(8388611);
        this.ahm.setOrientation(0);
        this.ahm.setGravity(8388611);
        this.ct = com.bytedance.sdk.component.utils.ay.rz(context, "tt_star_thick");
        this.noq = com.bytedance.sdk.component.utils.ay.rz(context, "tt_star");
    }

    public void kgy(double d, int i, int i2, int i3) {
        float f = i2;
        this.rz = (int) com.bytedance.sdk.component.adexpress.uq.yo.rz(getContext(), f);
        this.uq = (int) com.bytedance.sdk.component.adexpress.uq.yo.rz(getContext(), f);
        this.yo = d;
        this.fi = i3;
        removeAllViews();
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.ahm.addView(starImageView);
        }
        for (int i5 = 0; i5 < 5; i5++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.kgy.addView(starImageView2);
        }
        addView(this.kgy);
        addView(this.ahm);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.kgy.measure(i, i2);
        double d = this.yo;
        float f = this.rz;
        this.ahm.measure(View.MeasureSpec.makeMeasureSpec((int) (((d - ((double) ((int) d))) * ((double) (f - 2.0f))) + ((double) ((((int) d) * f) + 1.0f))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.kgy.getMeasuredHeight(), 1073741824));
        if (this.fi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            LinearLayout linearLayout = this.kgy;
            linearLayout.setPadding(0, ((int) (linearLayout.getMeasuredHeight() - this.fi)) / 2, 0, 0);
            this.ahm.setPadding(0, ((int) (this.kgy.getMeasuredHeight() - this.fi)) / 2, 0, 0);
        }
    }
}
