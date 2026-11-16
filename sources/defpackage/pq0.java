package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public final class pq0 extends fy {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ aq0 t;
    public Object u;
    public cp0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(aq0 aq0Var, dy dyVar) {
        super(dyVar);
        this.t = aq0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
