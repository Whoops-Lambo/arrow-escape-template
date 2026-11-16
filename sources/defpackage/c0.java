package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends os1 {
    public static final c0 a = new c0();

    @Override // defpackage.os1
    public final boolean f() {
        return false;
    }

    @Override // defpackage.os1
    public final Object h() {
        return null;
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.os1
    public final Object d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.os1
    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // defpackage.os1
    public final Object g(u15 u15Var) {
        return u15Var.get();
    }

    @Override // defpackage.os1
    public final int hashCode() {
        return 2040732332;
    }
}
