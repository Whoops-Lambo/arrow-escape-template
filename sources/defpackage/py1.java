package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class py1 extends os1 {
    public final Object a;

    @Override // defpackage.os1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.os1
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.os1
    public final boolean equals(Object obj) {
        if (obj instanceof py1) {
            return this.a.equals(((py1) obj).a);
        }
        return false;
    }

    @Override // defpackage.os1
    public final Object g(u15 u15Var) {
        return this.a;
    }

    @Override // defpackage.os1
    public final Object h() {
        return this.a;
    }

    @Override // defpackage.os1
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return jc1.p(new StringBuilder("Optional.of("), this.a, ")");
    }

    public py1(Object obj) {
        this.a = obj;
    }
}
