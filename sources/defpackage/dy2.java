package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class dy2 implements Comparable {
    public final long a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return s71.i(this.a ^ Long.MIN_VALUE, ((dy2) obj).a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dy2) {
            return this.a == ((dy2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j >= 0) {
            ns1.d(10);
            String string = Long.toString(j, 10);
            string.getClass();
            return string;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        ns1.d(10);
        String string2 = Long.toString(j2, 10);
        string2.getClass();
        ns1.d(10);
        String string3 = Long.toString(j3, 10);
        string3.getClass();
        return string2.concat(string3);
    }

    public /* synthetic */ dy2(long j) {
        this.a = j;
    }
}
