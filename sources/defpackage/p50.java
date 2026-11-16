package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class p50 extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ q50 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p50(q50 q50Var, int i) {
        super(0);
        this.i = i;
        this.j = q50Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        q50 q50Var = this.j;
        switch (i) {
            case 0:
                return Integer.valueOf(q50Var.b.get(5));
            case 1:
                return Integer.valueOf(q50Var.b.get(11));
            case 2:
                return Integer.valueOf(q50Var.b.get(12));
            case 3:
                return Integer.valueOf(q50Var.b.get(2) + 1);
            case 4:
                return Integer.valueOf(q50Var.b.get(13));
            default:
                return Integer.valueOf(q50Var.b.get(1));
        }
    }
}
