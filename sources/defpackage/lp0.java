package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public final class lp0 extends fy {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ mp0 t;
    public mp0 u;
    public cp0 v;
    public u62 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(mp0 mp0Var, dy dyVar) {
        super(dyVar);
        this.t = mp0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.collect(null, this);
    }
}
