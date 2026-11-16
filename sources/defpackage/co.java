package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class co extends fy {
    public lz1 r;
    public /* synthetic */ Object s;
    public final /* synthetic */ eo t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(eo eoVar, fy fyVar) {
        super(fyVar);
        this.t = eoVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.c(null, this);
    }
}
