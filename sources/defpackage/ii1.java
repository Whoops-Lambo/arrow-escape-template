package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.checkbox.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ii1 extends Animatable2Compat.AnimationCallback {
    public final /* synthetic */ b b;

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void a(Drawable drawable) {
        ColorStateList colorStateList = this.b.o;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void b(Drawable drawable) {
        b bVar = this.b;
        ColorStateList colorStateList = bVar.o;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(bVar.s, colorStateList.getDefaultColor()));
        }
    }

    public ii1(b bVar) {
        this.b = bVar;
    }
}
