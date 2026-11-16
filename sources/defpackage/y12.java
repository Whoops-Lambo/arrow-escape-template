package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class y12 {
    public static final x12 a = new x12();
    public static final k2 b;

    public abstract int a(int i);

    public abstract int d();

    static {
        Integer num = t81.a;
        b = (num == null || num.intValue() >= 34) ? new av1() : new hl0();
    }

    public int f(int i, int i2) {
        int iD;
        int i3;
        int iA;
        if (i2 <= i) {
            ak1.n(ek2.f(Integer.valueOf(i), Integer.valueOf(i2)));
            return 0;
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iA = a(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iD = d() >>> 1;
                    i3 = iD % i4;
                } while ((i4 - 1) + (iD - i3) < 0);
                iA = i3;
            }
            return i + iA;
        }
        while (true) {
            int iD2 = d();
            if (i <= iD2 && iD2 < i2) {
                return iD2;
            }
        }
    }

    public long h(long j, long j2) {
        long jG;
        long j3;
        long jA;
        int iD;
        if (j2 <= j) {
            ak1.n(ek2.f(Long.valueOf(j), Long.valueOf(j2)));
            return 0L;
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iD = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iD = d();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) d()) & 4294967295L);
                }
                jA = ((long) iD) & 4294967295L;
            } else {
                do {
                    jG = g() >>> 1;
                    j3 = jG % j4;
                } while ((j4 - 1) + (jG - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jG2 = g();
            if (j <= jG2 && jG2 < j2) {
                return jG2;
            }
        }
    }

    public long i() {
        return h(0L, 1000L);
    }

    public long g() {
        return (((long) d()) << 32) + ((long) d());
    }
}
