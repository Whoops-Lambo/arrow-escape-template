package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class fq0 extends fy {
    public gq0 r;
    public /* synthetic */ Object s;
    public int t;
    public final /* synthetic */ gq0 u;
    public Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq0(gq0 gq0Var, dy dyVar) {
        super(dyVar);
        this.u = gq0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return this.u.emit(null, this);
    }
}
