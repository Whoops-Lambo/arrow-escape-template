package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class qp0 extends fy {
    public dd0 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ dd0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp0(dd0 dd0Var, dy dyVar) {
        super(dyVar);
        this.t = dd0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
