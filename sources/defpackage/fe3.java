package defpackage;

import com.applovin.impl.k4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fe3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;

    public /* synthetic */ fe3(k4 k4Var, int i) {
        this.a = i;
        this.b = k4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        k4 k4Var = this.b;
        switch (i) {
            case 0:
                k4Var.d();
                break;
            case 1:
                k4Var.c();
                break;
            default:
                k4Var.b();
                break;
        }
    }
}
