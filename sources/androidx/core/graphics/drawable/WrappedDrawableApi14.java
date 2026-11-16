package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {
    public static final PorterDuff.Mode g = PorterDuff.Mode.SRC_IN;
    public int a;
    public PorterDuff.Mode b;
    public boolean c;
    public WrappedDrawableState d;
    public boolean e;
    public Drawable f;

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            WrappedDrawableState wrappedDrawableState = this.d;
            if (wrappedDrawableState != null) {
                wrappedDrawableState.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final Drawable b() {
        return this.f;
    }

    public final boolean c(int[] iArr) {
        if (this instanceof WrappedDrawableApi21) {
            return false;
        }
        WrappedDrawableState wrappedDrawableState = this.d;
        ColorStateList colorStateList = wrappedDrawableState.c;
        PorterDuff.Mode mode = wrappedDrawableState.d;
        if (colorStateList == null || mode == null) {
            this.c = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.c && colorForState == this.a && mode == this.b) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.a = colorForState;
        this.b = mode;
        this.c = true;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        WrappedDrawableState wrappedDrawableState = this.d;
        if (wrappedDrawableState == null || wrappedDrawableState.b == null) {
            return null;
        }
        wrappedDrawableState.a = getChangingConfigurations();
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return this.f.getLayoutDirection();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        WrappedDrawableState wrappedDrawableState;
        ColorStateList colorStateList = ((this instanceof WrappedDrawableApi21) || (wrappedDrawableState = this.d) == null) ? null : wrappedDrawableState.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.e && super.mutate() == this) {
            WrappedDrawableState wrappedDrawableState = this.d;
            WrappedDrawableState wrappedDrawableState2 = new WrappedDrawableState();
            wrappedDrawableState2.c = null;
            wrappedDrawableState2.d = g;
            if (wrappedDrawableState != null) {
                wrappedDrawableState2.a = wrappedDrawableState.a;
                wrappedDrawableState2.b = wrappedDrawableState.b;
                wrappedDrawableState2.c = wrappedDrawableState.c;
                wrappedDrawableState2.d = wrappedDrawableState.d;
            }
            this.d = wrappedDrawableState2;
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.mutate();
            }
            WrappedDrawableState wrappedDrawableState3 = this.d;
            if (wrappedDrawableState3 != null) {
                Drawable drawable2 = this.f;
                wrappedDrawableState3.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        return this.f.setLayoutDirection(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.f.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.f.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return c(iArr) || this.f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.d.c = colorStateList;
        c(this.f.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.d.d = mode;
        c(this.f.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations;
        int changingConfigurations2 = super.getChangingConfigurations();
        WrappedDrawableState wrappedDrawableState = this.d;
        if (wrappedDrawableState != null) {
            changingConfigurations = wrappedDrawableState.getChangingConfigurations();
        } else {
            changingConfigurations = 0;
        }
        return this.f.getChangingConfigurations() | changingConfigurations2 | changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2) && !this.f.setVisible(z, z2)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
