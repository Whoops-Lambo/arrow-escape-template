package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ut2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yt2 b;

    public /* synthetic */ ut2(yt2 yt2Var, int i) {
        this.a = i;
        this.b = yt2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        yt2 yt2Var = this.b;
        switch (i) {
            case 0:
                yt2.c(yt2Var);
                break;
            default:
                int[] iArr = {0, 0};
                yt2Var.getLocationOnScreen(iArr);
                yt2Var.getOnExpandedListener().invoke(Integer.valueOf(iArr[1]), Integer.valueOf(yt2Var.getHeight()));
                break;
        }
    }
}
