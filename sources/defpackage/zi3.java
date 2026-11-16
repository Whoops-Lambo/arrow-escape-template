package defpackage;

import com.applovin.impl.y1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zi3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y1 b;

    public /* synthetic */ zi3(y1 y1Var, int i) {
        this.a = i;
        this.b = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        y1 y1Var = this.b;
        switch (i) {
            case 0:
                y1Var.j();
                break;
            default:
                y1Var.k();
                break;
        }
    }
}
