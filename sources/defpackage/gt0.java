package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gt0 extends fy {
    public it0 r;
    public String s;
    public /* synthetic */ Object t;
    public final /* synthetic */ it0 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt0(it0 it0Var, fy fyVar) {
        super(fyVar);
        this.u = it0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        Object objA = this.u.a(null, this);
        return objA == dz.a ? objA : new k52(objA);
    }
}
