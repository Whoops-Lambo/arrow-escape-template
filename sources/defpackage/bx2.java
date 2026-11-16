package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class bx2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fx2 b;

    public /* synthetic */ bx2(fx2 fx2Var, int i) {
        this.a = i;
        this.b = fx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        fx2 fx2Var = this.b;
        switch (i) {
            case 0:
                fx2.setupView$lambda$0(fx2Var);
                break;
            default:
                a63.a(fx2Var);
                break;
        }
    }
}
