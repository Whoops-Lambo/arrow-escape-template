package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ug0 extends hp2 {
    public final /* synthetic */ xg0 a;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.b().a();
    }

    @Override // defpackage.hp2, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b().b();
    }

    public ug0(xg0 xg0Var) {
        this.a = xg0Var;
    }
}
