package io.p071bidmachine.iab.mraid;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ e0(h0 h0Var, int i) {
        this.a = i;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        h0 h0Var = this.b;
        switch (i) {
            case 0:
                h0Var.c();
                break;
            default:
                h0Var.c();
                break;
        }
    }
}
