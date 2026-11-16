package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jv implements dy {
    public static final jv b = new jv(0);
    public static final jv c = new jv(1);
    public final /* synthetic */ int a;

    private final void b(Object obj) {
    }

    private final void c(Object obj) {
    }

    public /* synthetic */ jv(int i) {
        this.a = i;
    }

    @Override // defpackage.dy
    public final sy getContext() {
        int i = this.a;
        cg0 cg0Var = cg0.a;
        switch (i) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            case 1:
            default:
                return cg0Var;
        }
    }

    @Override // defpackage.dy
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            case 1:
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }
}
