package io.p071bidmachine.iab.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d extends ProgressBar implements p {
    public final i a;
    public final Paint b;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, this.b);
        super.onDraw(canvas);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        i iVar = this.a;
        iVar.a.m = (Math.min(measuredWidth, measuredHeight) / 2.0f) - this.a.a.g;
        iVar.invalidateSelf();
    }

    public void setColorSchemeColors(int... iArr) {
        i iVar = this.a;
        h hVar = iVar.a;
        hVar.h = iArr;
        hVar.i = 0;
        int i = iArr[0];
        hVar.i = 0;
        hVar.o = i;
        iVar.invalidateSelf();
    }

    public void setProgressBackgroundColor(int i) {
        this.b.setColor(i);
    }

    public d(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(0);
        float f = getResources().getDisplayMetrics().density;
        int iC = y.c(context, 8.0f);
        setPadding(iC, iC, iC, iC);
        i iVar = new i(context);
        this.a = iVar;
        float f2 = f * 4.0f;
        h hVar = iVar.a;
        hVar.g = f2;
        hVar.b.setStrokeWidth(f2);
        iVar.invalidateSelf();
        i iVar2 = this.a;
        int[] iArr = {-65536};
        h hVar2 = iVar2.a;
        hVar2.h = iArr;
        int i = iArr[0];
        hVar2.i = 0;
        hVar2.o = i;
        iVar2.invalidateSelf();
        i iVar3 = this.a;
        iVar3.a.b.setStrokeCap(Paint.Cap.ROUND);
        iVar3.invalidateSelf();
        setIndeterminateDrawable(this.a);
        setIndeterminate(true);
    }

    @Override // io.p071bidmachine.iab.utils.p
    public void setStyle(@NonNull q qVar) {
        float fFloatValue = qVar.k(getContext()).floatValue();
        i iVar = this.a;
        h hVar = iVar.a;
        hVar.g = fFloatValue;
        hVar.b.setStrokeWidth(fFloatValue);
        iVar.invalidateSelf();
        Integer numValueOf = qVar.a;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(a.a);
        }
        int[] iArr = {numValueOf.intValue()};
        h hVar2 = iVar.a;
        hVar2.h = iArr;
        int i = iArr[0];
        hVar2.i = 0;
        hVar2.o = i;
        iVar.invalidateSelf();
        this.b.setColor(qVar.f().intValue());
        postInvalidate();
    }
}
