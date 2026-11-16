package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.ct.uq;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class NiceImageView extends uq {
    private boolean ahm;
    private int at;
    private final Paint ay;
    private int ct;
    private int dg;
    private int fi;
    private final float[] fpp;
    private int gf;
    private final RectF gm;
    private final Path ioy;
    private final Context kgy;
    private final Xfermode kus;
    private Path lqi;
    private int noq;
    private int nu;
    private int ra;
    private boolean rz;
    private RectF sx;
    private int twf;
    private final float[] um;
    private int uq;
    private int vs;
    private float xh;
    private int yo;

    @Override // com.bytedance.sdk.openadsdk.core.ct.uq, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.ct.uq, android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void ahm() {
        if (!this.ahm) {
            this.sx.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.vs, this.dg);
            if (this.rz) {
                this.sx = this.gm;
                return;
            }
            return;
        }
        float fMin = Math.min(this.vs, this.dg) / 2.0f;
        this.xh = fMin;
        RectF rectF = this.sx;
        int i = this.vs;
        int i2 = this.dg;
        rectF.set((i / 2.0f) - fMin, (i2 / 2.0f) - fMin, (i / 2.0f) + fMin, (i2 / 2.0f) + fMin);
    }

    private void kgy(Canvas canvas) {
        boolean z = this.ahm;
        int i = this.uq;
        if (!z) {
            if (i > 0) {
                kgy(canvas, i, this.ct, this.gm, this.um);
            }
        } else {
            if (i > 0) {
                kgy(canvas, i, this.ct, this.xh - (i / 2.0f));
            }
            int i2 = this.noq;
            if (i2 > 0) {
                kgy(canvas, i2, this.yo, (this.xh - this.uq) - (i2 / 2.0f));
            }
        }
    }

    private void rz() {
        if (this.ahm) {
            return;
        }
        int i = 0;
        if (this.fi <= 0) {
            float[] fArr = this.um;
            int i2 = this.gf;
            float f = i2;
            fArr[1] = f;
            fArr[0] = f;
            int i3 = this.ra;
            float f2 = i3;
            fArr[3] = f2;
            fArr[2] = f2;
            int i4 = this.at;
            float f3 = i4;
            fArr[5] = f3;
            fArr[4] = f3;
            int i5 = this.nu;
            float f4 = i5;
            fArr[7] = f4;
            fArr[6] = f4;
            float[] fArr2 = this.fpp;
            int i6 = this.uq;
            float f5 = i2 - (i6 / 2.0f);
            fArr2[1] = f5;
            fArr2[0] = f5;
            float f6 = i3 - (i6 / 2.0f);
            fArr2[3] = f6;
            fArr2[2] = f6;
            float f7 = i4 - (i6 / 2.0f);
            fArr2[5] = f7;
            fArr2[4] = f7;
            float f8 = i5 - (i6 / 2.0f);
            fArr2[7] = f8;
            fArr2[6] = f8;
            return;
        }
        while (true) {
            float[] fArr3 = this.um;
            if (i >= fArr3.length) {
                return;
            }
            int i7 = this.fi;
            fArr3[i] = i7;
            this.fpp[i] = i7 - (this.uq / 2.0f);
            i++;
        }
    }

    private void uq() {
        if (this.ahm) {
            return;
        }
        this.noq = 0;
    }

    public void isCircle(boolean z) {
        this.ahm = z;
        uq();
        ahm();
        invalidate();
    }

    public void isCoverSrc(boolean z) {
        this.rz = z;
        ahm();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.sx, null, 31);
        if (!this.rz) {
            int i = this.vs;
            int i2 = this.uq;
            int i3 = this.noq;
            int i4 = this.dg;
            canvas.scale((((i - (i2 * 2)) - (i3 * 2)) * 1.0f) / i, (((i4 - (i2 * 2)) - (i3 * 2)) * 1.0f) / i4, i / 2.0f, i4 / 2.0f);
        }
        super.onDraw(canvas);
        this.ay.reset();
        this.ioy.reset();
        boolean z = this.ahm;
        Path path = this.ioy;
        if (z) {
            path.addCircle(this.vs / 2.0f, this.dg / 2.0f, this.xh, Path.Direction.CCW);
        } else {
            path.addRoundRect(this.sx, this.fpp, Path.Direction.CCW);
        }
        this.ay.setAntiAlias(true);
        this.ay.setStyle(Paint.Style.FILL);
        this.ay.setXfermode(this.kus);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.ioy, this.ay);
        } else {
            this.lqi.addRect(this.sx, Path.Direction.CCW);
            this.lqi.op(this.ioy, Path.Op.DIFFERENCE);
            canvas.drawPath(this.lqi, this.ay);
        }
        this.ay.setXfermode(null);
        int i5 = this.twf;
        if (i5 != 0) {
            this.ay.setColor(i5);
            canvas.drawPath(this.ioy, this.ay);
        }
        canvas.restore();
        kgy(canvas);
    }

    public void setBorderColor(@ColorInt int i) {
        this.ct = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.uq = gbb.ahm(this.kgy, i);
        kgy(false);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.nu = gbb.ahm(this.kgy, i);
        kgy(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.at = gbb.ahm(this.kgy, i);
        kgy(true);
    }

    public void setCornerRadius(int i) {
        this.fi = gbb.ahm(this.kgy, i);
        kgy(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.gf = gbb.ahm(this.kgy, i);
        kgy(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.ra = gbb.ahm(this.kgy, i);
        kgy(true);
    }

    public void setInnerBorderColor(@ColorInt int i) {
        this.yo = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.noq = gbb.ahm(this.kgy, i);
        uq();
        invalidate();
    }

    public void setMaskColor(@ColorInt int i) {
        this.twf = i;
        invalidate();
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ct = -1;
        this.yo = -1;
        this.kgy = context;
        this.fi = gbb.ahm(context, 10.0f);
        this.um = new float[8];
        this.fpp = new float[8];
        this.gm = new RectF();
        this.sx = new RectF();
        this.ay = new Paint();
        this.ioy = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.kus = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.kus = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.lqi = new Path();
        }
        rz();
        uq();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.vs = i;
        this.dg = i2;
        kgy();
        ahm();
    }

    private void kgy(Canvas canvas, int i, int i2, float f) {
        kgy(i, i2);
        this.ioy.addCircle(this.vs / 2.0f, this.dg / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.ioy, this.ay);
    }

    private void kgy(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        kgy(i, i2);
        this.ioy.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.ioy, this.ay);
    }

    private void kgy(int i, int i2) {
        this.ioy.reset();
        this.ay.setStrokeWidth(i);
        this.ay.setColor(i2);
        this.ay.setStyle(Paint.Style.STROKE);
    }

    private void kgy() {
        if (this.ahm) {
            return;
        }
        RectF rectF = this.gm;
        int i = this.uq;
        rectF.set(i / 2.0f, i / 2.0f, this.vs - (i / 2.0f), this.dg - (i / 2.0f));
    }

    private void kgy(boolean z) {
        if (z) {
            this.fi = 0;
        }
        rz();
        kgy();
        invalidate();
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context) {
        this(context, null);
    }
}
