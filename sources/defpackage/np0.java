package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class np0 extends fy {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ op0 t;
    public op0 u;
    public cp0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np0(op0 op0Var, dy dyVar) {
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
