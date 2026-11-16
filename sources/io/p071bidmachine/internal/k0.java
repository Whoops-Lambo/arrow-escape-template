package io.p071bidmachine.internal;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements View.OnLayoutChangeListener {
    public final float a;
    public final WeakReference b;
    public WeakReference c;
    public int d;
    public int e;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        if (view == null) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if ((i9 == this.d && i10 == this.e) || (view2 = (View) this.b.get()) == null) {
            return;
        }
        this.d = i9;
        this.e = i10;
        float f = ((i10 * i9) * this.a) / i9;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            view2.setLayoutParams(new ViewGroup.LayoutParams(i9, (int) f));
            return;
        }
        layoutParams.width = i9;
        layoutParams.height = (int) f;
        view2.requestLayout();
    }

    public k0(l0 l0Var, float f) {
        this.a = f;
        this.b = new WeakReference(l0Var);
    }
}
