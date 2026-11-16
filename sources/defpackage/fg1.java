package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class fg1 implements Iterable, bc1 {
    public final long a;
    public final long b;
    public final long c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof fg1)) {
            return false;
        }
        if (isEmpty() && ((fg1) obj).isEmpty()) {
            return true;
        }
        fg1 fg1Var = (fg1) obj;
        return this.a == fg1Var.a && this.b == fg1Var.b;
    }

    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new eg1(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }

    public fg1(long j, long j2) {
        this.a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.b = j2;
        this.c = 1L;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.a;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }
}
