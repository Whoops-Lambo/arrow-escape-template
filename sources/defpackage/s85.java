package defpackage;

import com.google.android.gms.internal.nearby.zzsi;
import com.google.android.gms.internal.nearby.zztj;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class s85 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;

    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[LOOP:1: B:35:0x00a1->B:37:0x00a5, LOOP_END] */
    public s85(String str, char[] cArr) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        while (true) {
            if (i < cArr.length) {
                char c = cArr[i];
                if (!(c < 128)) {
                    d.r(zzsi.a("Non-ASCII character: %s", Character.valueOf(c)));
                    throw null;
                }
                if (!(bArr[c] == -1)) {
                    d.r(zzsi.a("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
                bArr[c] = (byte) i;
                i++;
            } else {
                this.a = str;
                this.b = cArr;
                try {
                    int length = cArr.length;
                    RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                    if (length <= 0) {
                        throw new IllegalArgumentException("x (0) must be > 0");
                    }
                    switch (a95.a[roundingMode.ordinal()]) {
                        case 1:
                            if (((length - 1) & length) != 0) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                        case 2:
                        case 3:
                            iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                            this.d = iNumberOfLeadingZeros;
                            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                            int i2 = 1 << (3 - iNumberOfTrailingZeros);
                            this.e = i2;
                            this.f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                            this.c = length - 1;
                            this.g = bArr;
                            zArr = new boolean[i2];
                            for (int i3 = 0; i3 < this.f; i3++) {
                                zArr[zztj.a(i3 * 8, this.d, RoundingMode.CEILING)] = true;
                            }
                            return;
                        case 4:
                        case 5:
                            iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                            this.d = iNumberOfLeadingZeros;
                            int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                            int i4 = 1 << (3 - iNumberOfTrailingZeros2);
                            this.e = i4;
                            this.f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                            this.c = length - 1;
                            this.g = bArr;
                            zArr = new boolean[i4];
                            while (i3 < this.f) {
                                zArr[zztj.a(i3 * 8, this.d, RoundingMode.CEILING)] = true;
                            }
                            return;
                        case 6:
                        case 7:
                        case 8:
                            int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                            iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                            this.d = iNumberOfLeadingZeros;
                            int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                            int i5 = 1 << (3 - iNumberOfTrailingZeros3);
                            this.e = i5;
                            this.f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                            this.c = length - 1;
                            this.g = bArr;
                            zArr = new boolean[i5];
                            while (i3 < this.f) {
                                zArr[zztj.a(i3 * 8, this.d, RoundingMode.CEILING)] = true;
                            }
                            return;
                        default:
                            throw new AssertionError();
                    }
                } catch (ArithmeticException e) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s85) && Arrays.equals(this.b, ((s85) obj).b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + 1237;
    }

    public final String toString() {
        return this.a;
    }
}
