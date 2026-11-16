package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class po implements as0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ po(pp1 pp1Var, op1 op1Var) {
        this.a = 1;
        this.b = pp1Var;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        az2 az2Var = az2.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((wr0) obj4).invoke((Throwable) obj);
                break;
            case 1:
                pp1 pp1Var = (pp1) obj4;
                pp1.h.set(pp1Var, null);
                pp1Var.g(null);
                break;
            default:
                ((z82) obj4).c();
                break;
        }
        return az2Var;
    }

    public /* synthetic */ po(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
