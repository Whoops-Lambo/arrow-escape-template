package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.FloatLayout;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class MotionLabel extends View implements FloatLayout {
    public int a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public float f;
    public String g;
    public int h;
    public int i;
    public int j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.MotionLabel$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.MotionLabel$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            throw null;
        }
    }

    public Typeface getTypeface() {
        throw null;
    }

    public void setTextOutlineThickness(float f) {
        this.b = true;
        if (Float.isNaN(f)) {
            this.b = false;
        }
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        throw null;
    }

    private float getHorizontalOffset() {
        Float.isNaN(this.f);
        this.g.length();
        throw null;
    }

    private float getVerticalOffset() {
        Float.isNaN(this.f);
        throw null;
    }

    public final void a() {
        Float.isNaN(this.o);
        Float.isNaN(this.p);
        Float.isNaN(this.q);
        Float.isNaN(this.r);
        throw null;
    }

    public float getRound() {
        return this.d;
    }

    public float getRoundPercent() {
        return this.c;
    }

    public float getScaleFromTextSize() {
        return this.f;
    }

    public float getTextBackgroundPanX() {
        return this.o;
    }

    public float getTextBackgroundPanY() {
        return this.p;
    }

    public float getTextBackgroundRotate() {
        return this.r;
    }

    public float getTextBackgroundZoom() {
        return this.q;
    }

    public int getTextOutlineColor() {
        return this.a;
    }

    public float getTextPanX() {
        return this.m;
    }

    public float getTextPanY() {
        return this.n;
    }

    public float getTextureHeight() {
        return this.k;
    }

    public float getTextureWidth() {
        return this.l;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.f) ? 1.0f : this.e / this.f;
        super.onDraw(canvas);
        boolean z = this.b;
        if (!z && f == 1.0f) {
            canvas.drawText(this.g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT + this.h + getHorizontalOffset(), this.i + getVerticalOffset(), null);
        } else {
            if (z) {
                throw null;
            }
            getHorizontalOffset();
            getVerticalOffset();
            throw null;
        }
    }

    @RequiresApi
    public void setRoundPercent(float f) {
        boolean z = this.c != f;
        this.c = f;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            setClipToOutline(true);
            Math.min(getWidth(), getHeight());
            throw null;
        }
        setClipToOutline(false);
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f = f;
    }

    public void setTextBackgroundPanX(float f) {
        this.o = f;
        a();
        throw null;
    }

    public void setTextBackgroundPanY(float f) {
        this.p = f;
        a();
        throw null;
    }

    public void setTextBackgroundRotate(float f) {
        this.r = f;
        a();
        throw null;
    }

    public void setTextBackgroundZoom(float f) {
        this.q = f;
        a();
        throw null;
    }

    public void setTextOutlineColor(int i) {
        this.a = i;
        this.b = true;
        invalidate();
    }

    public void setTextPanX(float f) {
        this.m = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.n = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.e = f;
        StringBuilder sb = new StringBuilder();
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        sb.append(".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()");
        sb.append("  ");
        sb.append(f);
        sb.append(" / ");
        sb.append(this.f);
        Log.v("MotionLabel", sb.toString());
        Float.isNaN(this.f);
        throw null;
    }

    public void setTextureHeight(float f) {
        this.k = f;
        a();
        throw null;
    }

    public void setTextureWidth(float f) {
        this.l = f;
        a();
        throw null;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        float f;
        super.layout(i, i2, i3, i4);
        boolean zIsNaN = Float.isNaN(this.f);
        if (zIsNaN) {
            f = 1.0f;
        } else {
            f = this.e / this.f;
        }
        boolean z = this.b;
        if (z || !zIsNaN) {
            if (!z && f == 1.0f) {
            } else {
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.h = getPaddingLeft();
        getPaddingRight();
        this.i = getPaddingTop();
        getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            this.g.getClass();
            throw null;
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.j) {
            invalidate();
        }
        this.j = i;
        int i2 = i & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            } else {
                this.n = 1.0f;
            }
        } else {
            this.n = -1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        return;
                    }
                }
            }
            this.m = 1.0f;
            return;
        }
        this.m = -1.0f;
    }

    @RequiresApi
    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.d = f;
            float f2 = this.c;
            this.c = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.d != f) {
            z = true;
        } else {
            z = false;
        }
        this.d = f;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            setClipToOutline(false);
            if (z) {
                invalidateOutline();
                return;
            }
            return;
        }
        setClipToOutline(true);
        getWidth();
        getHeight();
        throw null;
    }

    public void setText(CharSequence charSequence) {
        this.g = charSequence.toString();
        invalidate();
    }

    public void setTextFillColor(int i) {
        invalidate();
    }
}
