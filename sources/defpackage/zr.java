package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zr implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg0 b;

    public /* synthetic */ zr(yg0 yg0Var, int i) {
        this.a = i;
        this.b = yg0Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        yg0 yg0Var = this.b;
        switch (i) {
            case 0:
                cs csVar = (cs) yg0Var;
                csVar.s(csVar.t());
                break;
            default:
                we0 we0Var = (we0) yg0Var;
                we0Var.l = z;
                we0Var.p();
                if (!z) {
                    we0Var.s(false);
                    we0Var.m = false;
                }
                break;
        }
    }
}
