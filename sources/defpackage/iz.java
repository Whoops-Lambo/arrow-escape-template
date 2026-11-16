package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class iz extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ jz s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz(jz jzVar, fy fyVar) {
        super(fyVar);
        this.s = jzVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.g(0, this);
    }
}
