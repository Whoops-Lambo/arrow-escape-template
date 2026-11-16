package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class bq0 extends fy {
    public cq0 r;
    public /* synthetic */ Object s;
    public int t;
    public final /* synthetic */ cq0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq0(cq0 cq0Var, dy dyVar) {
        super(dyVar);
        this.u = cq0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return this.u.emit(null, this);
    }
}
