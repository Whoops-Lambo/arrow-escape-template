package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class k9 extends fy {
    public /* synthetic */ Object r;
    public int s;
    public final /* synthetic */ l9 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(l9 l9Var, dy dyVar) {
        super(dyVar);
        this.t = l9Var;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return this.t.emit(null, this);
    }
}
