package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ek extends fy {
    public /* synthetic */ Object r;
    public final /* synthetic */ gk s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(gk gkVar, fy fyVar) {
        super(fyVar);
        this.s = gkVar;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        Object objB = gk.B(this.s, this);
        return objB == dz.a ? objB : new jq(objB);
    }
}
