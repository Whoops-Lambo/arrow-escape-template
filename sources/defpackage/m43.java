package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m43 implements Comparable, Serializable {
    public static final m43 c = new m43(0, 0);
    public final long a;
    public final long b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m43)) {
            return false;
        }
        m43 m43Var = (m43) obj;
        return this.a == m43Var.a && this.b == m43Var.b;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        o43 o43Var = new o43();
        o43Var.a = this.a;
        o43Var.b = this.b;
        return o43Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m43 m43Var = (m43) obj;
        m43Var.getClass();
        long j = m43Var.a;
        long j2 = this.a;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.b ^ Long.MIN_VALUE, m43Var.b ^ Long.MIN_VALUE);
    }

    public final int hashCode() {
        return Long.hashCode(this.a ^ this.b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        j7.T(this.a, 0, 0, 4, bArr);
        bArr[8] = 45;
        j7.T(this.a, 9, 4, 6, bArr);
        bArr[13] = 45;
        j7.T(this.a, 14, 6, 8, bArr);
        bArr[18] = 45;
        j7.T(this.b, 19, 0, 2, bArr);
        bArr[23] = 45;
        j7.T(this.b, 24, 2, 8, bArr);
        return kk2.B(bArr);
    }

    public m43(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
