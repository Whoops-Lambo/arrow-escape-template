package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class jp0 extends fy {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ kp0 t;
    public Object u;
    public cp0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0(kp0 kp0Var, dy dyVar) {
        super(dyVar);
        this.t = kp0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.collect(null, this);
    }
}
