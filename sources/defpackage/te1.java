package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class te1 implements SerialDescriptor {
    public final SerialDescriptor a;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        if (i >= 0) {
            return this.a;
        }
        e32.k(jc1.s(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te1)) {
            return false;
        }
        te1 te1Var = (te1) obj;
        return s71.b(this.a, te1Var.a) && s71.b(h(), te1Var.h());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        if (i >= 0) {
            return gg0.a;
        }
        e32.k(jc1.s(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final h00 getKind() {
        return nk2.e;
    }

    public final int hashCode() {
        return h().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        e32.k(jc1.s(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return h() + '(' + this.a + ')';
    }

    public te1(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        str.getClass();
        Integer numM = kk2.M(str);
        if (numM != null) {
            return numM.intValue();
        }
        d.r(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        return String.valueOf(i);
    }
}
