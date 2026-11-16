package defpackage;

import com.applovin.impl.z1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class cj3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    public /* synthetic */ cj3(z1 z1Var, int i) {
        this.a = i;
        this.b = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        z1 z1Var = this.b;
        switch (i) {
            case 0:
                z1Var.G();
                break;
            case 1:
                z1Var.H();
                break;
            case 2:
                z1Var.I();
                break;
            default:
                z1Var.F();
                break;
        }
    }
}
