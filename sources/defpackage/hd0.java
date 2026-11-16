package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class hd0 implements r02 {
    public static final Object c = new Object();
    public volatile el0 a;
    public volatile Object b;

    public static r02 a(el0 el0Var) {
        if (el0Var instanceof hd0) {
            return el0Var;
        }
        hd0 hd0Var = new hd0();
        hd0Var.b = c;
        hd0Var.a = el0Var;
        return hd0Var;
    }

    @Override // defpackage.q02
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
