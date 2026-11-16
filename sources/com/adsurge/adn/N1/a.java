package com.adsurge.adn.N1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.adsurge.adn.p041m0.c;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends View {
    public final Paint a;
    public int b;
    public int c;
    public final Paint d;
    public final Path e;
    public float[] f;
    public final RectF g;
    public boolean h;
    public Object[] i;
    public Shader j;

    public final void a(Canvas canvas, float f, float f2) {
        int i;
        if (!this.h || (i = this.b) <= 0 || i >= 100) {
            a(canvas, f, f2, this.a);
        } else {
            float f3 = f2 / 2.0f;
            com.adsurge.adn.p032j0.a.a(canvas, this.a, f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.d.setColor(i);
    }

    public void setProgress(int i) {
        if (i == this.b) {
            return;
        }
        if (i <= 0) {
            this.b = 0;
        } else if (i >= 100) {
            this.b = 100;
        } else {
            this.b = i;
        }
        postInvalidate();
    }

    public void setProgressColor(int i) {
        this.a.setColor(i);
        postInvalidate();
    }

    public void setProgressGradient(Object[] objArr) {
        this.i = objArr;
    }

    public void setRoundEnable(boolean z) {
        this.h = z;
    }

    public void setRoundRadius(float f) {
        if (this.f == null) {
            this.f = new float[8];
        }
        Arrays.fill(this.f, f);
    }

    public void setTotalProgress(int i) {
        this.c = i;
    }

    public a(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = 100;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new Path();
        this.g = new RectF();
        this.h = false;
        setLayerType(1, null);
        paint2.setColor(Color.parseColor("#d8d8d8"));
        paint.setColor(Color.parseColor("#3185FC"));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float f = width;
        float f2 = height;
        this.g.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
        float[] fArr = this.f;
        if (fArr != null) {
            this.e.addRoundRect(this.g, fArr, Path.Direction.CW);
            canvas.clipPath(this.e);
        }
        super.onDraw(canvas);
        int i = this.b;
        if (i >= 0) {
            float f3 = (i / this.c) * f;
            Object[] objArr = this.i;
            if (objArr != null && this.j == null) {
                Shader shaderA = c.a(objArr, width, height);
                this.j = shaderA;
                this.a.setShader(shaderA);
            }
            a(canvas, f, f2, this.d);
            a(canvas, f3, f2);
        }
        this.e.reset();
    }

    public final void a(Canvas canvas, float f, float f2, Paint paint) {
        this.g.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
        canvas.drawRect(this.g, paint);
    }
}
