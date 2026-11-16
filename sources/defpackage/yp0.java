package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public final class yp0 extends fy {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ op0 t;
    public aq0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp0(op0 op0Var, dy dyVar) {
        super(dyVar);
        this.t = op0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.collect(null, this);
    }
}
