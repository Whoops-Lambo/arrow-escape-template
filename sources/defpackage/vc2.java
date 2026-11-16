package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vc2 extends fy {
    public wc2 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ wc2 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc2(wc2 wc2Var, fy fyVar) {
        super(fyVar);
        this.t = wc2Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        Object objA = this.t.a(null, this);
        return objA == dz.a ? objA : new k52(objA);
    }
}
