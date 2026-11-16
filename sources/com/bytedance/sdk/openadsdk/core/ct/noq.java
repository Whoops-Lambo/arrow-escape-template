package com.bytedance.sdk.openadsdk.core.ct;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class noq extends FrameLayout {
    private int ahm;
    private Drawable ct;
    private ValueAnimator fi;
    private long gf;
    private int kgy;
    private boolean noq;
    private Drawable rz;
    private Drawable uq;
    private boolean yo;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    private void ahm() {
        ValueAnimator valueAnimator = this.fi;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.fi.removeAllUpdateListeners();
            this.fi = null;
        }
        this.gf = 0L;
    }

    private void kgy() {
        if (this.fi != null) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 10000);
        this.fi = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(2000L);
        this.fi.setRepeatCount(-1);
        this.fi.setInterpolator(new LinearInterpolator());
        this.fi.setRepeatMode(1);
        this.fi.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.ct.noq.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                noq.this.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.fi.start();
        setMax(10000);
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        this.ct = drawable;
        setProgressDrawable(drawable);
        if (this.noq && this.fi == null) {
            kgy();
        }
    }

    public void setMax(int i) {
        this.kgy = i;
    }

    public void setProgressDrawable(Drawable drawable) {
        this.uq = drawable;
        setBackground(drawable);
        this.rz = null;
        this.gf = 0L;
        this.ahm = -1;
        Drawable drawable2 = this.uq;
        if (drawable2 instanceof LayerDrawable) {
            int numberOfLayers = ((LayerDrawable) drawable2).getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable3 = ((LayerDrawable) this.uq).getDrawable(i);
                if ((drawable3 instanceof ScaleDrawable) || (drawable3 instanceof ClipDrawable)) {
                    this.rz = drawable3;
                }
            }
        }
        Drawable drawable4 = this.uq;
        if (drawable4 instanceof RotateDrawable) {
            this.rz = drawable4;
        }
    }

    public noq(Context context) {
        super(context);
        this.kgy = 100;
    }

    private boolean rz() {
        return com.bytedance.sdk.openadsdk.utils.ahm.yo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.noq = true;
        if (this.ct != null) {
            kgy();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.noq = false;
        this.yo = false;
        ahm();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            if (this.yo) {
                this.yo = false;
                ValueAnimator valueAnimator = this.fi;
                if (valueAnimator != null) {
                    valueAnimator.resume();
                    return;
                } else {
                    kgy();
                    return;
                }
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.fi;
        if (valueAnimator2 != null && !this.yo) {
            this.yo = true;
            valueAnimator2.pause();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(gf.kgy(this, layoutParams));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public void setProgress(int i) {
        if (kgy(i) && this.ahm != i) {
            this.ahm = i;
            Drawable drawable = this.rz;
            if (drawable != null) {
                drawable.setLevel((int) ((i * 10000.0f) / this.kgy));
            }
        }
    }

    public noq(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.kgy = 100;
    }

    private boolean kgy(int i) {
        if (rz() && (this.rz instanceof RotateDrawable) && i != 0 && i < this.kgy) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - this.gf < 48) {
                return false;
            }
            this.gf = jUptimeMillis;
        }
        return true;
    }
}
