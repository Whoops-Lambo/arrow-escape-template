package com.bytedance.sdk.component.adexpress.noq;

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
import android.widget.ImageView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ra3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class lqi extends ImageView {
    private int ahm;
    private Paint kgy;
    private int rz;
    private Matrix uq;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
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

    public lqi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ahm = 25;
        this.rz = 25;
        Paint paint = new Paint();
        this.kgy = paint;
        paint.setAntiAlias(true);
        this.kgy.setFilterBitmap(true);
        this.uq = new Matrix();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && ra3.u(drawable)) {
            super.onDraw(canvas);
            return;
        }
        if (drawable != null) {
            Bitmap bitmapKgy = kgy(drawable);
            if (bitmapKgy != null) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmapKgy, tileMode, tileMode);
                float fMax = 1.0f;
                if (bitmapKgy.getWidth() != getWidth() || bitmapKgy.getHeight() != getHeight()) {
                    fMax = Math.max((getWidth() * 1.0f) / bitmapKgy.getWidth(), (getHeight() * 1.0f) / bitmapKgy.getHeight());
                }
                this.uq.setScale(fMax, fMax);
                bitmapShader.setLocalMatrix(this.uq);
                this.kgy.setShader(bitmapShader);
                canvas.drawRoundRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth(), getHeight()), this.ahm, this.rz, this.kgy);
                return;
            }
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
    }

    public lqi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public lqi(Context context) {
        this(context, null);
    }
}
