package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yz0 extends rc1 implements wr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ qo j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yz0(qo qoVar, int i) {
        super(1);
        this.i = i;
        this.j = qoVar;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int i = this.i;
        az2 az2Var = az2.a;
        qo qoVar = this.j;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                if (qoVar.isActive()) {
                    qoVar.resumeWith(new j52(th));
                }
                break;
            default:
                c01 c01Var = (c01) obj;
                c01Var.getClass();
                if (qoVar.isActive()) {
                    qoVar.resumeWith(c01Var);
                }
                break;
        }
        return az2Var;
    }
}
