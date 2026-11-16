package defpackage;

import com.applovin.impl.o4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class qf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o4 b;

    public /* synthetic */ qf3(o4 o4Var, int i) {
        this.a = i;
        this.b = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        o4 o4Var = this.b;
        switch (i) {
            case 0:
                o4Var.g();
                break;
            default:
                o4Var.f();
                break;
        }
    }
}
