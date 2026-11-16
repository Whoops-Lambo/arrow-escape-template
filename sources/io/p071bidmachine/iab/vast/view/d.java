package io.p071bidmachine.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.unity3d.services.UnityAdsConstants;
import io.p071bidmachine.iab.utils.a;
import io.p071bidmachine.iab.utils.p;
import io.p071bidmachine.iab.utils.q;
import io.p071bidmachine.iab.utils.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends View implements p {
    public final Paint a;
    public float b;
    public float c;
    public int d;
    public int e;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public int getLineColor() {
        return this.d;
    }

    @Override // io.p071bidmachine.iab.utils.p
    public void setStyle(@NonNull q qVar) {
        Integer numValueOf = qVar.a;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(a.a);
        }
        this.d = numValueOf.intValue();
        this.e = qVar.f().intValue();
        this.c = qVar.k(getContext()).floatValue();
        Float fValueOf = qVar.h;
        if (fValueOf == null) {
            fValueOf = Float.valueOf(1.0f);
        }
        setAlpha(fValueOf.floatValue());
        postInvalidate();
    }

    public d(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = 15.0f;
        this.d = a.a;
        this.e = 0;
        this.c = y.c(getContext(), 4.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        float f = this.c;
        Paint paint = this.a;
        paint.setStrokeWidth(f);
        paint.setColor(this.e);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, paint);
        paint.setColor(this.d);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.b) / 100.0f), measuredHeight, paint);
    }
}
