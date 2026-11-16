package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zp0 extends fy {
    public aq0 r;
    public /* synthetic */ Object s;
    public int t;
    public final /* synthetic */ aq0 u;
    public Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp0(aq0 aq0Var, dy dyVar) {
        super(dyVar);
        this.u = aq0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.t |= Integer.MIN_VALUE;
        return this.u.emit(null, this);
    }
}
