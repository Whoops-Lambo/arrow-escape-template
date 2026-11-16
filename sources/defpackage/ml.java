package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ml extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ ol s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(ol olVar, fy fyVar) {
        super(fyVar);
        this.s = olVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.c(this);
    }
}
