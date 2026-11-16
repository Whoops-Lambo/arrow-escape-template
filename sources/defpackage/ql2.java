package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class ql2 implements ol2 {
    public static final i50 d = new i50(5);
    public final Object a = new Object();
    public volatile ol2 b;
    public Object c;

    @Override // defpackage.ol2
    public final Object get() {
        ol2 ol2Var = this.b;
        i50 i50Var = d;
        if (ol2Var != i50Var) {
            synchronized (this.a) {
                try {
                    if (this.b != i50Var) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = i50Var;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object objP = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (objP == d) {
            objP = jc1.p(new StringBuilder("<supplier that returned "), this.c, ">");
        }
        return jc1.p(sb, objP, ")");
    }

    public ql2(ol2 ol2Var) {
        ol2Var.getClass();
        this.b = ol2Var;
    }
}
