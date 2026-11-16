package io.p071bidmachine.rendering.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.p071bidmachine.rendering.internal.f0;
import io.p071bidmachine.rendering.internal.v;
import io.p071bidmachine.rendering.internal.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends View implements v, f0 {
    public final Paint a;
    public float b;
    public int c;
    public int d;

    @VisibleForTesting
    public static /* synthetic */ void getLineBackgroundColor$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLineColor$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLinePaint$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPercent$annotations() {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // io.p071bidmachine.rendering.internal.f0
    public final void a(long j, long j2, float f) {
        this.b = f;
        postInvalidate();
    }

    public final int getLineBackgroundColor() {
        return this.d;
    }

    public final int getLineColor() {
        return this.c;
    }

    @NotNull
    public final Paint getLinePaint() {
        return this.a;
    }

    public final float getPercent() {
        return this.b;
    }

    public final void setLineBackgroundColor(int i) {
        this.d = i;
    }

    public final void setLineColor(int i) {
        this.c = i;
    }

    public final void setPercent(float f) {
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
        this.a = new Paint(1);
        this.c = z.a;
    }

    @Override // io.p071bidmachine.rendering.internal.v
    public final void b(io.p071bidmachine.rendering.model.e eVar) {
        eVar.getClass();
        Integer num = eVar.j;
        if (num != null) {
            this.d = num.intValue();
        }
        Integer num2 = eVar.i;
        if (num2 != null) {
            this.c = num2.intValue();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        int i = this.d;
        Paint paint = this.a;
        paint.setColor(i);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, paint);
        paint.setColor(this.c);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.b) / 100.0f), measuredHeight, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.setStrokeWidth(getMeasuredHeight());
    }
}
