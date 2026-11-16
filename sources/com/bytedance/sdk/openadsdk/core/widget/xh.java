package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.ay;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class xh extends View {
    private final boolean ahm;
    private Drawable ct;
    private final Path kgy;
    private float noq;
    private int rz;
    private Drawable uq;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.rz * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.rz, 1073741824));
    }

    public xh(Context context, boolean z) {
        super(context);
        this.kgy = new Path();
        this.ahm = z;
        kgy();
    }

    private void ahm() {
        int width = getWidth();
        int height = getHeight();
        if (this.noq > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && width > 0 && height > 0) {
            this.kgy.reset();
            this.kgy.addRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width * this.noq, height), Path.Direction.CCW);
        }
    }

    public void kgy(double d, int i) {
        int iKgy = (int) gbb.kgy(getContext(), i, false);
        this.rz = iKgy;
        this.uq.setBounds(0, 0, iKgy, iKgy);
        Drawable drawable = this.ct;
        int i2 = this.rz;
        drawable.setBounds(0, 0, i2, i2);
        this.noq = ((float) d) / 5.0f;
        ahm();
        requestLayout();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.rz > 0) {
            int iSave = canvas.save();
            for (int i = 0; i < 5; i++) {
                this.uq.draw(canvas);
                canvas.translate(this.rz, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            canvas.restoreToCount(iSave);
            canvas.clipPath(this.kgy);
            for (int i2 = 0; i2 < 5; i2++) {
                this.ct.draw(canvas);
                canvas.translate(this.rz, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ahm();
    }

    public xh(Context context) {
        this(context, false);
    }

    private void kgy() {
        Context context = getContext();
        this.uq = ay.rz(context, this.ahm ? "tt_star_thick_dark" : "tt_star_thick");
        this.ct = ay.rz(context, "tt_star");
    }
}
