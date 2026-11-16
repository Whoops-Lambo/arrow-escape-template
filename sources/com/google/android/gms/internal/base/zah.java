package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import defpackage.ij3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zah extends Drawable implements Drawable.Callback {
    public long b;
    public int c;
    public int e;
    public boolean h;
    public final ij3 i;
    public Drawable j;
    public Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int a = 0;
    public int d = 255;
    public int f = 0;
    public final boolean g = true;

    public final boolean a() {
        if (!this.l) {
            boolean z = false;
            if (this.j.getConstantState() != null && this.k.getConstantState() != null) {
                z = true;
            }
            this.m = z;
            this.l = true;
        }
        return this.m;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        int i2 = this.a;
        int i3 = 0;
        if (i2 == 1) {
            this.b = SystemClock.uptimeMillis();
            this.a = 2;
            z = false;
        } else if (i2 == 2 && this.b >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.b) / this.e;
            z = fUptimeMillis >= 1.0f;
            if (z) {
                this.a = 0;
            }
            this.f = (int) ((this.c * Math.min(fUptimeMillis, 1.0f)) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            z = true;
        }
        int i4 = this.f;
        Drawable drawable = this.j;
        Drawable drawable2 = this.k;
        boolean z2 = this.g;
        if (!z) {
            if (z2) {
                drawable.setAlpha(this.d - i4);
                i3 = 1;
            }
            drawable.draw(canvas);
            if (i3 != 0) {
                drawable.setAlpha(this.d);
            }
            if (i4 > 0) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.d);
            }
            invalidateSelf();
            return;
        }
        if (z2) {
            if (i4 == 0) {
            }
            i = this.d;
            if (i4 == i) {
                drawable2.setAlpha(i);
                drawable2.draw(canvas);
            }
        }
        i3 = i4;
        drawable.draw(canvas);
        i4 = i3;
        i = this.d;
        if (i4 == i) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.j.getIntrinsicHeight(), this.k.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.j.getIntrinsicWidth(), this.k.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.n) {
            this.o = Drawable.resolveOpacity(this.j.getOpacity(), this.k.getOpacity());
            this.n = true;
        }
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (this.h || super.mutate() != this) {
            return this;
        }
        if (!a()) {
            e32.i("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            return null;
        }
        this.j.mutate();
        this.k.mutate();
        this.h = true;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.j.setBounds(rect);
        this.k.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f == this.d) {
            this.f = i;
        }
        this.d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        this.k.setColorFilter(colorFilter);
    }

    public zah(ij3 ij3Var) {
        ij3 ij3Var2 = new ij3();
        if (ij3Var != null) {
            ij3Var2.a = ij3Var.a;
            ij3Var2.b = ij3Var.b;
        }
        this.i = ij3Var2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        ij3 ij3Var = this.i;
        return ij3Var.b | changingConfigurations | ij3Var.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (a()) {
            int changingConfigurations = getChangingConfigurations();
            ij3 ij3Var = this.i;
            ij3Var.a = changingConfigurations;
            return ij3Var;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
