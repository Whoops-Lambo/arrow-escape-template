package defpackage;

import com.google.android.gms.internal.ads.zzifx;
import com.google.android.gms.internal.ads.zzigb;
import com.google.android.gms.internal.ads.zzihu;
import com.inmobi.media.core.config.models.AdConfig;
import io.p071bidmachine.media3.extractor.ts.y;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ky4 extends zzigb {
    public final byte[] d;
    public final int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public final long D() throws zzihu {
        int i = this.g;
        if (this.f - i < 8) {
            y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        return ((((long) bArr[i + 7]) & 255) << 56) | j2 | (j & 255) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final void E(int i) throws zzihu {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            y.v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[PHI: r5
  0x0072: PHI (r5v5 int) = (r5v4 int), (r5v9 int), (r5v11 int) binds: [B:17:0x0045, B:21:0x0051, B:25:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    public final int F() throws zzihu {
        try {
            int i = this.g;
            byte[] bArr = this.d;
            int i2 = i + 1;
            int i3 = bArr[i];
            if (i3 < 0) {
                int i4 = i + 2;
                int i5 = (bArr[i2] << 7) ^ i3;
                if (i5 < 0) {
                    i3 = (i5 == true ? 1 : 0) ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (i5 == true ? 1 : 0) ^ (bArr[i4] << 14);
                    if (i7 >= 0) {
                        int i8 = i7 ^ 16256;
                        i2 = i6;
                        i3 = i8;
                    } else {
                        i4 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            i3 = i9 ^ (-2080896);
                        } else {
                            int i10 = i + 5;
                            byte b = bArr[i4];
                            int i11 = (i9 ^ (b << 28)) ^ 266354560;
                            if (b < 0) {
                                i4 = i + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i + 7;
                                    if (bArr[i4] < 0) {
                                        i4 = i + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i + 9;
                                            if (bArr[i4] < 0) {
                                                int i12 = i + 10;
                                                if (bArr[i10] < 0) {
                                                    throw new zzihu("CodedInputStream encountered a malformed varint.");
                                                }
                                                i3 = i11;
                                                i2 = i12;
                                            } else {
                                                int i13 = i10;
                                                i3 = i11;
                                                i2 = i13;
                                            }
                                        }
                                    } else {
                                        int i14 = i10;
                                        i3 = i11;
                                        i2 = i14;
                                    }
                                }
                                i3 = i11;
                            } else {
                                int i15 = i10;
                                i3 = i11;
                                i2 = i15;
                            }
                        }
                    }
                }
                i2 = i4;
            }
            this.g = i2;
            if (i2 <= this.f) {
                return i3;
            }
            throw new zzihu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (zzihu e) {
            if (this.g <= this.f) {
                throw e;
            }
            y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        } catch (IndexOutOfBoundsException unused) {
            y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
    }

    public final long G() throws zzihu {
        long j;
        long j2;
        long j3;
        int i = this.g;
        int i2 = this.f;
        byte[] bArr = this.d;
        if (i2 != i) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j3 = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j3 = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j3 = (-2080896) ^ i9;
                            i4 = i8;
                        } else {
                            i6 = i + 5;
                            long j4 = (((long) bArr[i8]) << 28) ^ ((long) i9);
                            if (j4 >= 0) {
                                j3 = j4 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j5 = (((long) bArr[i6]) << 35) ^ j4;
                                if (j5 < 0) {
                                    j = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j6 = j5 ^ (((long) bArr[i4]) << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j5 = j6 ^ (((long) bArr[i10]) << 49);
                                        if (j5 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            j6 = j5 ^ (((long) bArr[i4]) << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                i4 = i + 10;
                                                j5 = j6 ^ (((long) bArr[i10]) << 63);
                                                if (j5 >= 0) {
                                                    j = -9151873028817141888L;
                                                }
                                            }
                                        }
                                    }
                                    j3 = j6 ^ j2;
                                    i4 = i10;
                                }
                                j3 = j ^ j5;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.g = i4;
                return j3;
            }
        }
        long j7 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            int i12 = this.g;
            if (i12 == this.f) {
                y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.g = i12 + 1;
            byte b2 = bArr[i12];
            j7 |= ((long) (b2 & 127)) << i11;
            if ((b2 & 128) == 0) {
                return j7;
            }
        }
        y.v("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int H() throws zzihu {
        int i = this.g;
        if (this.f - i < 4) {
            y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final int a(int i) throws zzihu {
        if (i < 0) {
            y.v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.g;
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
            if (i > Integer.MAX_VALUE - (i2 - this.h)) {
                y.v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                return 0;
            }
        }
        int i4 = this.j;
        if (i3 > i4) {
            y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.j = i3;
        int i5 = this.e;
        if (i3 > i5) {
            i3 = i5;
        }
        this.f = i3;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final void b(int i) {
        this.j = i;
        int i2 = this.e;
        if (i > i2) {
            i = i2;
        }
        this.f = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final int c() {
        int i = this.j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final boolean d() {
        return this.g == this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final int e() {
        return this.g - this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final void j(int i) throws zzihu {
        if (this.i == i) {
            return;
        }
        y.v("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final boolean k(int i) throws zzihu {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                E(8);
                return true;
            }
            if (i2 == 2) {
                E(F());
                return true;
            }
            if (i2 == 3) {
                h();
                j(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    j(0);
                }
                return false;
            }
            if (i2 == 5) {
                E(4);
                return true;
            }
            y.u();
            return false;
        }
        int i4 = this.f - this.g;
        byte[] bArr = this.d;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.g;
                this.g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            y.v("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i3 < 10) {
            int i6 = this.g;
            if (i6 == this.f) {
                y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.g = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        y.v("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    public /* synthetic */ ky4(byte[] bArr, int i, int i2) {
        this.d = bArr;
        int i3 = i2 + i;
        this.e = i3;
        this.f = i3;
        this.g = i;
        this.h = i;
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final int A() throws zzihu {
        int iF = F();
        return (-(iF & 1)) ^ (iF >>> 1);
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final long B() throws zzihu {
        long jG = G();
        return (-(jG & 1)) ^ (jG >>> 1);
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final int C() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final int i() throws zzihu {
        if (d()) {
            this.i = 0;
            return 0;
        }
        int iF = F();
        this.i = iF;
        if ((iF >>> 3) != 0) {
            return iF;
        }
        y.v("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final double l() {
        return Double.longBitsToDouble(D());
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final float m() {
        return Float.intBitsToFloat(H());
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final long n() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final long o() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final int p() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final long q() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final int r() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final boolean s() {
        if (G() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final String t() throws zzihu {
        int iF = F();
        if (iF > 0) {
            int i = this.f;
            int i2 = this.g;
            if (iF <= i - i2) {
                String str = new String(this.d, i2, iF, StandardCharsets.UTF_8);
                this.g += iF;
                return str;
            }
        }
        if (iF == 0) {
            return "";
        }
        if (iF < 0) {
            y.v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final String u() throws zzihu {
        int iF = F();
        if (iF > 0) {
            int i = this.f;
            int i2 = this.g;
            if (iF <= i - i2) {
                String strD = tz4.d(i2, iF, this.d);
                this.g += iF;
                return strD;
            }
        }
        if (iF == 0) {
            return "";
        }
        if (iF <= 0) {
            y.v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final jy4 v() throws zzihu {
        int iF = F();
        byte[] bArr = this.d;
        if (iF > 0) {
            int i = this.f;
            int i2 = this.g;
            if (iF <= i - i2) {
                jy4 jy4VarI = zzifx.I(i2, iF, bArr);
                this.g += iF;
                return jy4VarI;
            }
        }
        if (iF == 0) {
            return zzifx.b;
        }
        if (iF > 0) {
            int i3 = this.f;
            int i4 = this.g;
            if (iF <= i3 - i4) {
                int i5 = iF + i4;
                this.g = i5;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                jy4 jy4Var = zzifx.b;
                if (bArrCopyOfRange.length == 0) {
                    return zzifx.b;
                }
                return new jy4(bArrCopyOfRange);
            }
        }
        if (iF <= 0) {
            y.v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        y.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final int w() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final int x() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final int y() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.zzigb
    public final long z() {
        return D();
    }
}
