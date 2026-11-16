package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class rc0 extends ul2 implements zr0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ sr0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc0(sr0 sr0Var, dy dyVar, int i) {
        super(2, dyVar);
        this.r = i;
        this.s = sr0Var;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        int i = this.r;
        sr0 sr0Var = this.s;
        switch (i) {
            case 0:
                return new rc0(sr0Var, dyVar, 0);
            case 1:
                return new rc0(sr0Var, dyVar, 1);
            default:
                return new rc0(sr0Var, dyVar, 2);
        }
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        az2 az2Var = az2.a;
        switch (i) {
            case 0:
                ((rc0) create((cz) obj, (dy) obj2)).invokeSuspend(az2Var);
                break;
            case 1:
                ((rc0) create((cz) obj, (dy) obj2)).invokeSuspend(az2Var);
                break;
            default:
                ((rc0) create((az2) obj, (dy) obj2)).invokeSuspend(az2Var);
                break;
        }
        return az2Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        az2 az2Var = az2.a;
        sr0 sr0Var = this.s;
        switch (i) {
            case 0:
                wz2.a0(obj);
                sr0Var.invoke();
                break;
            case 1:
                wz2.a0(obj);
                sr0Var.invoke();
                break;
            default:
                wz2.a0(obj);
                sr0Var.invoke();
                break;
        }
        return az2Var;
    }
}
