package defpackage;

import com.google.android.gms.internal.ads.zzgwq;
import com.google.android.gms.internal.ads.zzhbu;
import com.google.android.gms.internal.ads.zzhcj;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class qs4 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;
    public final boolean i;

    public final int a(char c) throws zzhbu {
        if (c > 127) {
            throw new zzhbu("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.g[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new zzhbu("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new zzhbu(jc1.q(new StringBuilder(String.valueOf(c).length() + 24), "Unrecognized character: ", c));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qs4)) {
            return false;
        }
        qs4 qs4Var = (qs4) obj;
        return this.i == qs4Var.i && Arrays.equals(this.b, qs4Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (true != this.i ? 1237 : 1231);
    }

    public final String toString() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067 A[LOOP:0: B:19:0x0063->B:21:0x0067, LOOP_END] */
    public qs4(String str, char[] cArr, byte[] bArr, boolean z) {
        int iNumberOfLeadingZeros;
        boolean z2;
        boolean[] zArr;
        this.a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (xs4.a[roundingMode.ordinal()]) {
                    case 1:
                        if (((length - 1) & length) == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        fs1.K(z2);
                    case 2:
                    case 3:
                        iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                        this.d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i = 1 << (3 - iNumberOfTrailingZeros);
                        this.e = i;
                        this.f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                        this.c = length - 1;
                        this.g = bArr;
                        zArr = new boolean[i];
                        for (int i2 = 0; i2 < this.f; i2++) {
                            int i3 = this.d;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[zzhcj.a(i2 * 8, i3)] = true;
                        }
                        this.h = zArr;
                        this.i = z;
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
                        while (i2 < this.f) {
                            int i5 = this.d;
                            RoundingMode roundingMode3 = RoundingMode.CEILING;
                            zArr[zzhcj.a(i2 * 8, i5)] = true;
                        }
                        this.h = zArr;
                        this.i = z;
                        return;
                    case 6:
                    case 7:
                    case 8:
                        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                        iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                        this.d = iNumberOfLeadingZeros;
                        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                        int i6 = 1 << (3 - iNumberOfTrailingZeros3);
                        this.e = i6;
                        this.f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                        this.c = length - 1;
                        this.g = bArr;
                        zArr = new boolean[i6];
                        while (i2 < this.f) {
                            int i7 = this.d;
                            RoundingMode roundingMode4 = RoundingMode.CEILING;
                            zArr[zzhcj.a(i2 * 8, i7)] = true;
                        }
                        this.h = zArr;
                        this.i = z;
                        return;
                    default:
                        throw new AssertionError();
                }
            } else {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
        } catch (ArithmeticException e) {
            int length2 = cArr.length;
            throw new IllegalArgumentException(pv1.l(length2, "Illegal alphabet length ", new StringBuilder(String.valueOf(length2).length() + 24)), e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qs4(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    d.r(zzgwq.a("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                d.r(zzgwq.a("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}
