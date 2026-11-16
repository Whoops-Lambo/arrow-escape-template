package defpackage;

import com.applovin.impl.t3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ih3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ ih3(t3 t3Var, int i) {
        this.a = i;
        this.b = t3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        t3 t3Var = this.b;
        switch (i) {
            case 0:
                t3Var.h();
                break;
            default:
                t3Var.d();
                break;
        }
    }
}
