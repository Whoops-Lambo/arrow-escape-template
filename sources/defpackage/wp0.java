package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class wp0 extends fy {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ m9 t;
    public Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(m9 m9Var, dy dyVar) {
        super(dyVar);
        this.t = m9Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.collect(null, this);
    }
}
