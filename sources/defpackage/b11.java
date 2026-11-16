package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b11 extends fy {
    public c11 r;
    public m22 s;
    public Object t;
    public /* synthetic */ Object u;
    public final /* synthetic */ c11 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b11(c11 c11Var, fy fyVar) {
        super(fyVar);
        this.v = c11Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
