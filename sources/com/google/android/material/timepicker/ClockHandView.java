package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.ecffri.arrows.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.m63;
import defpackage.nq2;
import defpackage.ps;
import defpackage.r12;
import defpackage.y6;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
class ClockHandView extends View {
    public final ValueAnimator a;
    public boolean b;
    public final ArrayList c;
    public final int d;
    public final float e;
    public final Paint f;
    public final RectF g;
    public final int h;
    public float i;
    public boolean j;
    public double k;
    public int l;
    public int m;

    public final void a(float f) {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.i = f2;
        this.k = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.m;
        int iRound = this.l;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f3 = width;
        float f4 = iRound;
        float fCos = (((float) Math.cos(this.k)) * f4) + f3;
        float fSin = (f4 * ((float) Math.sin(this.k))) + height;
        float f5 = this.d;
        this.g.set(fCos - f5, fSin - f5, fCos + f5, fSin + f5);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ClockFaceView clockFaceView = (ClockFaceView) ((ps) obj);
            if (Math.abs(clockFaceView.I - f2) > 0.001f) {
                clockFaceView.I = f2;
                clockFaceView.m();
            }
        }
        invalidate();
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.a = new ValueAnimator();
        this.c = new ArrayList();
        Paint paint = new Paint();
        this.f = paint;
        this.g = new RectF();
        this.m = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r12.h, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        nq2.k(R.attr.motionDurationLong2, context, 200);
        nq2.l(context, R.attr.motionEasingEmphasizedInterpolator, y6.b);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.h = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.e = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = ViewCompat.a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.m;
        int iRound = this.l;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f = width;
        float f2 = iRound;
        float fCos = (((float) Math.cos(this.k)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.k))) + f3;
        Paint paint = this.f;
        paint.setStrokeWidth(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i2 = this.d;
        canvas.drawCircle(fCos, fSin, i2, paint);
        double dSin = Math.sin(this.k);
        double d = iRound - i2;
        paint.setStrokeWidth(this.h);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.k) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.e, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.a.isRunning()) {
            a(this.i);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z2 = false;
                z = false;
            } else {
                z2 = this.j;
                if (this.b) {
                    if (((float) Math.hypot(x - (getWidth() / 2), y - (getHeight() / 2))) <= Math.round(this.l * 0.66f) + m63.a(getContext(), 12)) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    this.m = i;
                }
                z = false;
            }
        } else {
            this.j = false;
            z = true;
            z2 = false;
        }
        boolean z5 = this.j;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i2 = degrees + 90;
        if (i2 < 0) {
            i2 = degrees + 450;
        }
        float f = i2;
        if (this.i != f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z3) {
            z4 = true;
        } else if (z3 || z2) {
            a(f);
            z4 = true;
        }
        this.j = z5 | z4;
        return true;
    }
}
