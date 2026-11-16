package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ht0 extends fy {
    public it0 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ it0 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(it0 it0Var, fy fyVar) {
        super(fyVar);
        this.t = it0Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        Object objB = this.t.b(this);
        return objB == dz.a ? objB : new k52(objB);
    }
}
