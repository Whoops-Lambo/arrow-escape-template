package defpackage;

import com.applovin.impl.f1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class dd3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ dd3(f1 f1Var, int i) {
        this.a = i;
        this.b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        f1 f1Var = this.b;
        switch (i) {
            case 0:
                f1Var.j();
                break;
            case 1:
                f1Var.e();
                break;
            default:
                f1Var.i();
                break;
        }
    }
}
