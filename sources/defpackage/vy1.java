package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vy1 implements SerialDescriptor {
    public final String a;
    public final ty1 b;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return 0;
    }

    public final void a() {
        throw new IllegalStateException(nj.q(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy1)) {
            return false;
        }
        vy1 vy1Var = (vy1) obj;
        return this.a.equals(vy1Var.a) && s71.b(this.b, vy1Var.b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final h00 getKind() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return jc1.q(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }

    public vy1(String str, ty1 ty1Var) {
        ty1Var.getClass();
        this.a = str;
        this.b = ty1Var;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        a();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        a();
        throw null;
    }
}
