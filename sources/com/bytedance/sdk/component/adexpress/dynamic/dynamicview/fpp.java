package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class fpp extends Drawable {
    private int ahm;
    private Paint kgy;
    private int rz;
    private RectF uq;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = this.uq;
        int i = this.rz;
        canvas.drawRoundRect(rectF, i, i, this.kgy);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.kgy.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.kgy.setColorFilter(colorFilter);
    }

    public fpp(int i, int i2) {
        this.rz = i;
        this.ahm = i2;
        Paint paint = new Paint();
        this.kgy = paint;
        paint.setColor(0);
        this.kgy.setAntiAlias(true);
        this.kgy.setShadowLayer(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -16777216);
        this.kgy.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.ahm;
        this.uq = new RectF(i + i5, i2 + i5, i3 - i5, i4 - i5);
    }
}
