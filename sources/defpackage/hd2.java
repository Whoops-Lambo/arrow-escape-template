package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class hd2 extends fy {
    public id2 r;
    public boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ id2 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd2(id2 id2Var, fy fyVar) {
        super(fyVar);
        this.u = id2Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.j(null, this);
    }
}
