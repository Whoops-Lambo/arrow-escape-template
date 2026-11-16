package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zc1 extends fy {
    public ad1 r;
    public boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ad1 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc1(ad1 ad1Var, fy fyVar) {
        super(fyVar);
        this.u = ad1Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.j(null, null, false, this);
    }
}
