package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ahm extends GradientDrawable {
    private final Paint ahm;
    protected Path kgy;

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Path path = this.kgy;
        if (path == null || path.isEmpty()) {
            kgy(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight(), this.ahm, 31);
        kgy(canvas);
        this.ahm.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.kgy, this.ahm);
        this.ahm.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void kgy(int i, int i2, int i3, int i4) {
        this.kgy.addRect(i, i2, i3, i4, Path.Direction.CW);
        invalidateSelf();
    }

    public ahm() {
        this.kgy = new Path();
        Paint paint = new Paint(1);
        this.ahm = paint;
        paint.setColor(-1);
    }

    public void kgy(Canvas canvas) {
        super.draw(canvas);
    }

    public ahm(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        super(orientation, iArr);
        this.kgy = new Path();
        Paint paint = new Paint(1);
        this.ahm = paint;
        paint.setColor(-1);
    }
}
