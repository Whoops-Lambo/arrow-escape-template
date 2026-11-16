package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class ef2 extends fy {
    public String r;
    public cf2 s;
    public /* synthetic */ Object t;
    public final /* synthetic */ ff2 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef2(ff2 ff2Var, dy dyVar) {
        super(dyVar);
        this.u = ff2Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return ff2.a(this.u, null, null, this);
    }
}
