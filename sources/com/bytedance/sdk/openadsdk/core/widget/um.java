package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ra3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class um extends com.bytedance.sdk.openadsdk.core.ct.uq {
    private int ahm;
    private final RectF ct;
    private final Paint kgy;
    private BitmapShader noq;
    private int rz;
    private final Matrix uq;

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

    private Bitmap kgy(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public void setXRound(int i) {
        this.ahm = i;
        postInvalidate();
    }

    public void setYRound(int i) {
        this.rz = i;
        postInvalidate();
    }

    public um(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ahm = 25;
        this.rz = 25;
        this.ct = new RectF();
        Paint paint = new Paint();
        this.kgy = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.uq = new Matrix();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmapKgy;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && ra3.B(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (this.noq == null && (bitmapKgy = kgy(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.noq = new BitmapShader(bitmapKgy, tileMode, tileMode);
            float fMax = 1.0f;
            if (bitmapKgy.getWidth() != getWidth() || bitmapKgy.getHeight() != getHeight()) {
                fMax = Math.max((getWidth() * 1.0f) / bitmapKgy.getWidth(), (getHeight() * 1.0f) / bitmapKgy.getHeight());
            }
            this.uq.setScale(fMax, fMax);
            this.noq.setLocalMatrix(this.uq);
        }
        BitmapShader bitmapShader = this.noq;
        if (bitmapShader != null) {
            this.kgy.setShader(bitmapShader);
            canvas.drawRoundRect(this.ct, this.ahm, this.rz, this.kgy);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.ct.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.noq = null;
    }

    public um(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public um(Context context) {
        this(context, null);
    }
}
