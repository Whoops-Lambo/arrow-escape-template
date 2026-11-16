package com.facebook.ads.redexgen.X;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2181Mk {
    public static byte[] A03;
    public static String[] A04 = {"w79GyGrR0KXUdyFlczXBOTQInBnsQT1J", "2vAWxnWp80wcwxFT2Voy", "m6eGOomlOcNAqPaawDA549Nz30e9XDec", "VRJoFU", "A4uXGTqATj5dLaCvvqORM87O5fPLlpk", "nCDPpg", "eNTE3gMtXrndnAE4XZKbfreU0xB4XrZ", "2Y5RseltTvKkT1bBSOX1"};
    public static final Set<Charset> A05;
    public static final char[] A06;
    public static final char[] A07;
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-102, -65, -57, -78, -67, -70, -75, 113, -90, -91, -105, 126, -119, 113, -60, -74, -62, -58, -74, -65, -76, -74, 113, -76, -64, -65, -59, -70, -65, -58, -78, -59, -70, -64, -65, 113, -77, -54, -59, -74, -117, 113, -103, -66, -58, -79, -68, -71, -76, 112, -91, -92, -106, 125, -120, 112, -61, -75, -63, -59, -75, -66, -77, -75, 112, -74, -71, -62, -61, -60, 112, -78, -55, -60, -75, -118, 112, -78, -51, -50, 126, -64, -57, -46, 126, -52, -51, -46, 126, -40, -61, -48, -51, -104, 126, 114, -117, -112, -110, -115, -115, -116, -113, -111, -126, -127, 61, -128, -123, 126, -113, -112, -126, -111, 87, 61};
    }

    static {
        A04();
        A06 = new char[]{'\r', '\n'};
        A07 = new char[]{'\n'};
        A05 = XR.A05(XA.A01, XA.A05, XA.A02, XA.A03, XA.A04);
    }

    public C2181Mk() {
        this.A00 = N1.A07;
    }

    public C2181Mk(int i) {
        this.A00 = new byte[i];
        this.A01 = i;
    }

    public C2181Mk(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C2181Mk(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
    }

    private char A00(Charset charset, char[] cArr) {
        char cA01;
        int i;
        if ((charset.equals(XA.A05) || charset.equals(XA.A01)) && A07() >= 1) {
            cA01 = C3C.A01(AnonymousClass36.A00(this.A00[this.A02]));
            i = 1;
        } else if ((charset.equals(XA.A02) || charset.equals(XA.A03)) && A07() >= 2) {
            cA01 = C3C.A00(this.A00[this.A02], this.A00[this.A02 + 1]);
            i = 2;
        } else {
            if (!charset.equals(XA.A04) || A07() < 2) {
                return (char) 0;
            }
            cA01 = C3C.A00(this.A00[this.A02 + 1], this.A00[this.A02]);
            i = 2;
        }
        if (!C3C.A04(cArr, cA01)) {
            return (char) 0;
        }
        this.A02 += i;
        char character = C3C.A01(cA01);
        return character;
    }

    private int A01(Charset charset) {
        int i;
        if (charset.equals(XA.A05) || charset.equals(XA.A01)) {
            i = 1;
        } else if (charset.equals(XA.A02) || charset.equals(XA.A04) || charset.equals(XA.A03)) {
            i = 2;
        } else {
            throw new IllegalArgumentException(A03(95, 21, 15) + charset);
        }
        for (int i2 = this.A02; i2 < i - (i - 1); i2 += i) {
            if ((charset.equals(XA.A05) || charset.equals(XA.A01)) && N1.A16(this.A00[i2])) {
                return i2;
            }
            if ((charset.equals(XA.A02) || charset.equals(XA.A03)) && this.A00[i2] == 0) {
                byte b = this.A00[i2 + 1];
                String[] strArr = A04;
                String str = strArr[6];
                String str2 = strArr[4];
                int i3 = str.length();
                if (i3 != str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A04;
                strArr2[3] = "dDv4NF";
                strArr2[5] = "aUmEKi";
                if (N1.A16(b)) {
                    return i2;
                }
            }
            if (charset.equals(XA.A04) && this.A00[i2 + 1] == 0 && N1.A16(this.A00[i2])) {
                return i2;
            }
        }
        int stride = this.A01;
        return stride;
    }

    private final String A02(char c) {
        if (A07() == 0) {
            return null;
        }
        int i = this.A02;
        while (i < stringLimit) {
            int stringLimit = this.A00[i];
            if (stringLimit == c) {
                break;
            }
            i++;
        }
        byte[] bArr = this.A00;
        int i2 = this.A02;
        int stringLimit2 = this.A02;
        String strA0r = N1.A0r(bArr, i2, i - stringLimit2);
        this.A02 = i;
        int i3 = this.A02;
        int stringLimit3 = this.A01;
        if (i3 < stringLimit3) {
            int stringLimit4 = this.A02;
            this.A02 = stringLimit4 + 1;
        }
        return strA0r;
    }

    private void A05(Charset charset) {
        if (A00(charset, A06) == '\r') {
            A00(charset, A07);
        }
    }

    public final double A06() {
        return Double.longBitsToDouble(A0P());
    }

    public final int A07() {
        return this.A01 - this.A02;
    }

    public final int A08() {
        return this.A00.length;
    }

    public final int A09() {
        return this.A02;
    }

    public final int A0A() {
        return this.A01;
    }

    public final int A0B() {
        return this.A00[this.A02] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        byte[] bArr4 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return i6 | (bArr4[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final int A0D() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return i4 | (bArr3[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        byte[] bArr4 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return i6 | ((bArr4[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
    }

    public final int A0F() {
        int iA0E = A0E();
        if (iA0E >= 0) {
            return iA0E;
        }
        throw new IllegalStateException(A03(77, 18, 80) + iA0E);
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return i2 | ((bArr2[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public final int A0H() {
        int b2 = A0I();
        int b1 = A0I();
        int b4 = A0I();
        int b3 = A0I();
        int b5 = (b2 << 21) | (b1 << 14);
        int b6 = b4 << 7;
        return b5 | b6 | b3;
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        return bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int A0J() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | (bArr2[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int result = this.A02;
        this.A02 = result + 2;
        return i4;
    }

    public final int A0K() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        byte[] bArr3 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return i4 | (bArr3[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final int A0L() {
        int iA0C = A0C();
        if (iA0C >= 0) {
            return iA0C;
        }
        throw new IllegalStateException(A03(77, 18, 80) + iA0C);
    }

    public final int A0M() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return i2 | (bArr2[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final long A0N() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = ((long) bArr[i]) & 255;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 8);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 16);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j4 = j3 | ((((long) bArr4[i4]) & 255) << 24);
        byte[] bArr5 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        long j5 = j4 | ((((long) bArr5[i5]) & 255) << 32);
        byte[] bArr6 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        long j6 = j5 | ((((long) bArr6[i6]) & 255) << 40);
        byte[] bArr7 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        long j7 = j6 | ((((long) bArr7[i7]) & 255) << 48);
        byte[] bArr8 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return j7 | ((255 & ((long) bArr8[i8])) << 56);
    }

    public final long A0O() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = ((long) bArr[i]) & 255;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 8);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 16);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return j3 | ((255 & ((long) bArr4[i4])) << 24);
    }

    public final long A0P() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 48);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 40);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        long j4 = j3 | ((((long) bArr4[i4]) & 255) << 32);
        byte[] bArr5 = this.A00;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        long j5 = j4 | ((((long) bArr5[i5]) & 255) << 24);
        byte[] bArr6 = this.A00;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        long j6 = j5 | ((((long) bArr6[i6]) & 255) << 16);
        byte[] bArr7 = this.A00;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        long j7 = j6 | ((((long) bArr7[i7]) & 255) << 8);
        byte[] bArr8 = this.A00;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return j7 | (255 & ((long) bArr8[i8]));
    }

    public final long A0Q() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        byte[] bArr2 = this.A00;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        long j2 = j | ((((long) bArr2[i2]) & 255) << 16);
        byte[] bArr3 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        long j3 = j2 | ((((long) bArr3[i3]) & 255) << 8);
        byte[] bArr4 = this.A00;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return j3 | (255 & ((long) bArr4[i4]));
    }

    public final long A0R() {
        long jA0P = A0P();
        if (jA0P >= 0) {
            return jA0P;
        }
        throw new IllegalStateException(A03(77, 18, 80) + jA0P);
    }

    public final long A0S() {
        int i = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long value = bArr[length];
        for (int i2 = 7; i2 >= 0; i2--) {
            int length2 = 1 << i2;
            if ((((long) length2) & value) == 0) {
                if (i2 < 6) {
                    int length3 = 1 << i2;
                    value &= (long) (length3 - 1);
                    i = 7 - i2;
                    break;
                }
                if (i2 != 7) {
                    break;
                }
                i = 1;
                break;
            }
        }
        if (i != 0) {
            for (int x = 1; x < i; x++) {
                byte[] bArr2 = this.A00;
                int length4 = this.A02;
                int i3 = bArr2[length4 + x];
                int i4 = i3 & 192;
                if (i4 == 128) {
                    int length5 = i3 & 63;
                    value = (value << 6) | ((long) length5);
                } else {
                    throw new NumberFormatException(A03(0, 42, 67) + value);
                }
            }
            int length6 = this.A02;
            this.A02 = length6 + i;
            return value;
        }
        throw new NumberFormatException(A03(42, 35, 66) + value);
    }

    public final String A0T() {
        return A0Y(XA.A05);
    }

    public final String A0U() {
        return A02((char) 0);
    }

    public final String A0V(int i) {
        if (i == 0) {
            return A03(0, 0, 38);
        }
        int i2 = i;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i2--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String strA0r = N1.A0r(bArr, stringLength4, i2);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i;
        return strA0r;
    }

    public final String A0W(int i) {
        return A0X(i, XA.A05);
    }

    public final String A0X(int i, Charset charset) {
        String str = new String(this.A00, this.A02, i, charset);
        this.A02 += i;
        return str;
    }

    public final String A0Y(Charset charset) {
        AbstractC2159Ln.A09(A05.contains(charset), A03(95, 21, 15) + charset);
        if (A07() == 0) {
            return null;
        }
        if (!charset.equals(XA.A01)) {
            A0Z();
        }
        int iA01 = A01(charset);
        int lineLimit = this.A02;
        String strA0X = A0X(iA01 - lineLimit, charset);
        int i = this.A02;
        int lineLimit2 = this.A01;
        if (i == lineLimit2) {
            return strA0X;
        }
        A05(charset);
        return strA0X;
    }

    public final Charset A0Z() {
        if (A07() >= 3 && this.A00[this.A02] == -17 && this.A00[this.A02 + 1] == -69 && this.A00[this.A02 + 2] == -65) {
            this.A02 += 3;
            return XA.A05;
        }
        if (A07() >= 2) {
            if (this.A00[this.A02] == -2 && this.A00[this.A02 + 1] == -1) {
                this.A02 += 2;
                return XA.A03;
            }
            if (this.A00[this.A02] == -1 && this.A00[this.A02 + 1] == -2) {
                this.A02 += 2;
                return XA.A04;
            }
            return null;
        }
        return null;
    }

    public final short A0a() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) (i2 | ((bArr2[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    public final short A0b() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) (i2 | (bArr2[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public final void A0c(int i) {
        if (i > A08()) {
            this.A00 = Arrays.copyOf(this.A00, i);
        }
    }

    public final void A0d(int i) {
        A0j(A08() < i ? new byte[i] : this.A00, i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final void A0e(int i) {
        boolean z;
        if (i >= 0) {
            byte[] bArr = this.A00;
            String[] strArr = A04;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[0] = "vXPGM4oYuMhP8cn0sKMu98erHclfQUXK";
            strArr2[2] = "0htGrTtOmHJaUq6aJPI9T2s360ZxgZpc";
            if (i <= bArr.length) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        AbstractC2159Ln.A07(z);
        this.A01 = i;
    }

    public final void A0f(int i) {
        AbstractC2159Ln.A07(i >= 0 && i <= this.A01);
        String[] strArr = A04;
        if (strArr[0].charAt(3) != strArr[2].charAt(3)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "XgOG9slgQTcdepqBCUxoFpnj4sip3HLE";
        strArr2[2] = "W3LGnL2r3Pk4TC9VMdmiPxsj9G2St223";
        this.A02 = i;
    }

    public final void A0g(int i) {
        A0f(this.A02 + i);
    }

    public final void A0h(C2180Mj c2180Mj, int i) {
        A0k(c2180Mj.A00, 0, i);
        c2180Mj.A08(0);
    }

    public final void A0i(byte[] bArr) {
        A0j(bArr, bArr.length);
    }

    public final void A0j(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
        this.A02 = 0;
    }

    public final void A0k(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A00, this.A02, bArr, i, i2);
        this.A02 += i2;
    }

    public final byte[] A0l() {
        return this.A00;
    }
}
