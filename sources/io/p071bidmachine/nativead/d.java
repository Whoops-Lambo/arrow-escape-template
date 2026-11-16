package io.p071bidmachine.nativead;

import android.view.View;
import android.view.ViewGroup;
import io.p071bidmachine.rendering.view.e;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class d implements View.OnLayoutChangeListener {
    public final WeakReference a;
    public int b;
    public int c;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        if (view == null) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if ((i9 == this.b && i10 == this.c) || (view2 = (View) this.a.get()) == null) {
            return;
        }
        this.b = i9;
        this.c = i10;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            view2.setLayoutParams(new ViewGroup.LayoutParams(i9, i10));
            return;
        }
        layoutParams.width = i9;
        layoutParams.height = i10;
        view2.requestLayout();
    }

    public d(e eVar) {
        this.a = new WeakReference(eVar);
    }
}
