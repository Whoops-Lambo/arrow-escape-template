package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class je1 extends le1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je1(ne1 ne1Var, int i) {
        super(ne1Var);
        this.f = i;
    }

    @Override // defpackage.le1, java.util.Iterator
    public Object next() {
        switch (this.f) {
            case 1:
                return a().f;
            default:
                return super.next();
        }
    }
}
