package com.bytedance.sdk.component.adexpress.noq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class gf extends View {
    private int ahm;
    private Paint ct;
    private int fi;
    private int kgy;
    private int noq;
    private final RectF rz;
    private Paint uq;
    private Paint yo;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void kgy() {
        Paint paint = new Paint();
        this.uq = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.yo = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.ct = paint3;
        paint3.setAntiAlias(true);
    }

    public void setBgColor(int i) {
        this.ct.setStyle(Paint.Style.FILL);
        this.ct.setColor(i);
    }

    public void setDislikeColor(int i) {
        this.yo.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.yo.setStrokeWidth(i);
    }

    public void setRadius(int i) {
        this.noq = i;
    }

    public void setStrokeColor(int i) {
        this.uq.setStyle(Paint.Style.STROKE);
        this.uq.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.uq.setStrokeWidth(i);
        this.fi = i;
    }

    public gf(Context context) {
        super(context);
        this.rz = new RectF();
        kgy();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.rz;
        int i = this.noq;
        canvas.drawRoundRect(rectF, i, i, this.ct);
        RectF rectF2 = this.rz;
        int i2 = this.noq;
        canvas.drawRoundRect(rectF2, i2, i2, this.uq);
        int i3 = this.kgy;
        int i4 = this.ahm;
        canvas.drawLine(i3 * 0.3f, i4 * 0.3f, i3 * 0.7f, i4 * 0.7f, this.yo);
        int i5 = this.kgy;
        int i6 = this.ahm;
        canvas.drawLine(i5 * 0.7f, i6 * 0.3f, i5 * 0.3f, i6 * 0.7f, this.yo);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.kgy = i;
        this.ahm = i2;
        RectF rectF = this.rz;
        int i5 = this.fi;
        rectF.set(i5, i5, i - i5, i2 - i5);
    }
}
