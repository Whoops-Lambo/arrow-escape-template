package defpackage;

import com.applovin.impl.j0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ae3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ ae3(j0 j0Var, int i) {
        this.a = i;
        this.b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        j0 j0Var = this.b;
        switch (i) {
            case 0:
                j0Var.e();
                break;
            case 1:
                j0Var.f();
                break;
            case 2:
                j0Var.a();
                break;
            default:
                j0Var.d();
                break;
        }
    }
}
