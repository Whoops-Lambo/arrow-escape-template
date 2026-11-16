package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class gb3 implements ib3 {
    public static final Object c = new Object();
    public volatile ib3 a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static gb3 b(hb3 hb3Var) {
        if (hb3Var instanceof gb3) {
            return (gb3) hb3Var;
        }
        gb3 gb3Var = new gb3();
        gb3Var.b = c;
        gb3Var.a = hb3Var;
        return gb3Var;
    }

    @Override // defpackage.ib3
    public final Object a() {
        Object objA;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.b;
                if (objA == obj2) {
                    objA = this.a.a();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.b = objA;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
