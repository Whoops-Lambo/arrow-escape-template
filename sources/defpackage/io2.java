package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class io2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ jo2 b;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.a;
        if (view2.getVisibility() == 0) {
            this.b.c(view2);
        }
    }

    public io2(jo2 jo2Var, View view) {
        this.b = jo2Var;
        this.a = view;
    }
}
