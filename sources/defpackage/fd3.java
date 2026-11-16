package defpackage;

import com.applovin.impl.f2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fd3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ fd3(f2 f2Var, int i) {
        this.a = i;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        f2 f2Var = this.b;
        switch (i) {
            case 0:
                f2Var.L();
                break;
            case 1:
                f2Var.K();
                break;
            case 2:
                f2Var.P();
                break;
            case 3:
                f2Var.N();
                break;
            case 4:
                f2Var.I();
                break;
            case 5:
                f2Var.J();
                break;
            default:
                f2Var.M();
                break;
        }
    }
}
