package io.p071bidmachine.iab.utils;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import defpackage.h50;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class i extends Drawable implements Animatable {
    public static final LinearInterpolator f = new LinearInterpolator();
    public static final e g = new e();
    public static final int[] h = {-16777216};
    public final h a;
    public float b;
    public final ValueAnimator c;
    public float d;
    public boolean e;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public static void a(i iVar, float f2, h hVar, boolean z) {
        float interpolation;
        if (iVar.e) {
            b(f2, hVar);
            float fFloor = (float) (Math.floor(hVar.l / 0.8f) + 1.0d);
            float f3 = hVar.j;
            float f4 = hVar.k;
            hVar.d = (((f4 - 0.01f) - f3) * f2) + f3;
            hVar.e = f4;
            float f5 = hVar.l;
            hVar.f = h50.c(fFloor, f5, f2, f5);
            return;
        }
        if (f2 != 1.0f || z) {
            float f6 = hVar.l;
            float interpolation2 = hVar.j;
            e eVar = g;
            if (f2 < 0.5f) {
                interpolation = (eVar.getInterpolation(f2 / 0.5f) * 0.79f) + interpolation2 + 0.01f;
            } else {
                float f7 = interpolation2 + 0.79f;
                interpolation2 = f7 - (((1.0f - eVar.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation = f7;
            }
            float f8 = (0.20999998f * f2) + f6;
            float f9 = (f2 + iVar.d) * 216.0f;
            hVar.d = interpolation2;
            hVar.e = interpolation;
            hVar.f = f8;
            iVar.b = f9;
        }
    }

    public static void b(float f2, h hVar) {
        if (f2 <= 0.75f) {
            hVar.o = hVar.h[hVar.i];
            return;
        }
        float f3 = (f2 - 0.75f) / 0.25f;
        int[] iArr = hVar.h;
        int i = hVar.i;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        hVar.o = ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f3))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f3))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f3))) << 8) | (i7 + ((int) (f3 * ((i3 & 255) - i7))));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.n;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.c;
        valueAnimator.cancel();
        h hVar = this.a;
        float f2 = hVar.d;
        hVar.j = f2;
        float f3 = hVar.e;
        hVar.k = f3;
        hVar.l = hVar.f;
        if (f3 != f2) {
            this.e = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        hVar.i = 0;
        hVar.o = hVar.h[0];
        hVar.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        hVar.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        hVar.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        hVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        hVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        hVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c.cancel();
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        h hVar = this.a;
        hVar.i = 0;
        hVar.o = hVar.h[0];
        hVar.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        hVar.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        hVar.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        hVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        hVar.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        hVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        invalidateSelf();
    }

    public i(Context context) {
        context.getResources();
        h hVar = new h();
        this.a = hVar;
        int[] iArr = h;
        hVar.h = iArr;
        hVar.i = 0;
        hVar.o = iArr[0];
        hVar.g = 2.5f;
        hVar.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new f(this, hVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f);
        valueAnimatorOfFloat.addListener(new g(this, hVar));
        this.c = valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        h hVar = this.a;
        Paint paint = hVar.b;
        RectF rectF = hVar.a;
        float f2 = hVar.m;
        float fMin = (hVar.g / 2.0f) + f2;
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - (hVar.g / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f3 = hVar.d;
        float f4 = hVar.f;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((hVar.e + f4) * 360.0f) - f5;
        paint.setColor(hVar.o);
        paint.setAlpha(hVar.n);
        float f7 = hVar.g / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, hVar.c);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        canvas.restore();
    }
}
