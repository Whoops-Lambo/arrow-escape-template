package defpackage;

import com.applovin.impl.d2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rc3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ rc3(d2 d2Var, int i) {
        this.a = i;
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        d2 d2Var = this.b;
        switch (i) {
            case 0:
                d2Var.K();
                break;
            case 1:
                d2Var.J();
                break;
            case 2:
                d2Var.M();
                break;
            case 3:
                d2Var.I();
                break;
            case 4:
                d2Var.H();
                break;
            case 5:
                d2Var.O();
                break;
            default:
                d2Var.L();
                break;
        }
    }
}
