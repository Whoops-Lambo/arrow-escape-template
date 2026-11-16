package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends fy {
    public u62 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ z62 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(z62 z62Var, dy dyVar) {
        super(dyVar);
        this.t = z62Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.collect(null, this);
    }
}
