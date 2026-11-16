package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class oq0 extends fy {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ l9 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(l9 l9Var, dy dyVar) {
        super(dyVar);
        this.t = l9Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
