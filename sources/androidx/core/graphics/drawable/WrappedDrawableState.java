package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
final class WrappedDrawableState extends Drawable.ConstantState {
    public int a;
    public Drawable.ConstantState b;
    public ColorStateList c;
    public PorterDuff.Mode d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.a;
        Drawable.ConstantState constantState = this.b;
        return (constantState != null ? constantState.getChangingConfigurations() : 0) | i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        WrappedDrawableApi21 wrappedDrawableApi21 = new WrappedDrawableApi21();
        wrappedDrawableApi21.d = this;
        Drawable.ConstantState constantState = this.b;
        if (constantState != null) {
            wrappedDrawableApi21.a(constantState.newDrawable(resources));
        }
        if (WrappedDrawableApi21.h == null) {
            try {
                WrappedDrawableApi21.h = Drawable.class.getDeclaredMethod("isProjected", null);
                return wrappedDrawableApi21;
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
        return wrappedDrawableApi21;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }
}
