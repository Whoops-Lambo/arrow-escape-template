package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dq extends fy {
    public eq r;
    public Object s;
    public /* synthetic */ Object t;
    public final /* synthetic */ eq u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(eq eqVar, dy dyVar) {
        super(dyVar);
        this.u = eqVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.emit(null, this);
    }
}
