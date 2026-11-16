package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class wy2 extends uy {
    public static final /* synthetic */ int c = 0;

    static {
        new wy2();
    }

    @Override // defpackage.uy
    public final void L(sy syVar, Runnable runnable) {
        h93 h93Var = (h93) syVar.get(h93.c);
        if (h93Var != null) {
            h93Var.b = true;
        } else {
            d.u("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.uy
    public final uy T(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.uy
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
