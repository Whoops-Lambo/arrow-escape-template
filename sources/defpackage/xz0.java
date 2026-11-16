package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xz0 extends rc1 implements wr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ wr0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xz0(int i, wr0 wr0Var) {
        super(1);
        this.i = i;
        this.j = wr0Var;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.i;
        az2 az2Var = az2.a;
        wr0 wr0Var = this.j;
        switch (i) {
            case 0:
                c01 c01Var = (c01) obj;
                c01Var.getClass();
                wr0Var.invoke(c01Var);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                wr0Var.invoke(th);
                break;
            default:
                jy1 jy1Var = (jy1) obj;
                jy1Var.getClass();
                wr0Var.invoke(jy1Var);
                break;
        }
        return az2Var;
    }
}
