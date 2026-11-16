package io.p071bidmachine.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ n0(s0 s0Var, int i) {
        this.a = i;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        s0 s0Var = this.b;
        switch (i) {
            case 0:
                s0Var.p();
                break;
            case 1:
                if (!s0Var.O) {
                    a0 a0Var = s0Var.r;
                    a0Var.getClass();
                    a0Var.p(s0Var);
                }
                break;
            default:
                s0Var.I = true;
                break;
        }
    }
}
