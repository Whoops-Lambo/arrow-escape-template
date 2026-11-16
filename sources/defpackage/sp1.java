package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class sp1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys1 b;

    public /* synthetic */ sp1(ys1 ys1Var, int i) {
        this.a = i;
        this.b = ys1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ys1 ys1Var = this.b;
        switch (i) {
            case 0:
                ys1Var.a.getView().requestPointerCapture();
                break;
            default:
                ys1Var.a.getView().releasePointerCapture();
                break;
        }
    }
}
