package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class wi2 extends fy {
    public xi2 r;
    public cp0 s;
    public yi2 t;
    public c91 u;
    public Object v;
    public /* synthetic */ Object w;
    public final /* synthetic */ xi2 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi2(xi2 xi2Var, dy dyVar) {
        super(dyVar);
        this.x = xi2Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        this.x.collect(null, this);
        return dz.a;
    }
}
