package defpackage;

import com.applovin.impl.q4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class cg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ cg3(q4 q4Var, int i) {
        this.a = i;
        this.b = q4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        q4 q4Var = this.b;
        switch (i) {
            case 0:
                q4Var.q();
                break;
            case 1:
                q4Var.p();
                break;
            case 2:
                q4Var.k();
                break;
            case 3:
                q4Var.r();
                break;
            case 4:
                q4Var.m();
                break;
            case 5:
                q4Var.s();
                break;
            case 6:
                q4Var.u();
                break;
            case 7:
                q4Var.t();
                break;
            case 8:
                q4Var.o();
                break;
            case 9:
                q4Var.n();
                break;
            default:
                q4Var.l();
                break;
        }
    }
}
