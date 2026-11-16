package com.facebook.ads.redexgen.X;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class OG implements InterfaceC2677ch {
    public static byte[] A0L;
    public static String[] A0M = {"XIIjnjdFYQVCtdrlkJcHdDoR80m8cVgP", "owkmjBi7RD4T7wEJ0Z5qsPBdy5XBWaNI", "YqHCOvd4KSZAhVJGzYGAlRF6PfNfNDl", "8HrS9oH6Bl73q9G4lty2QskZuMTT9Ad3", "1vrRnJ4yUoJNeCsTOs", "OYApvTmLFEs5ZQUBeKfBNMkvy33UT6TX", "MdWN3vRrL4V6R5Sljp5k7gd7NnBuAkyJ", "tIqEUkhIdE6CbQpVMZy02iy0diDP43UJ"};
    public static final byte[] A0N;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public ZP A0A;
    public ZP A0B;
    public ZP A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final C2180Mj A0H;
    public final C2181Mk A0I;
    public final String A0J;
    public final boolean A0K;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0L = new byte[]{36, 40, 106, 125, 124, 40, 105, 123, 123, 125, 101, 97, 102, 111, 40, 73, 73, 75, 40, 68, 75, 38, 76, 105, 121, 126, 95, 104, 108, 105, 104, 127, 113, 80, 65, 80, 86, 65, 80, 81, 21, 84, 64, 81, 92, 90, 21, 90, 87, 95, 80, 86, 65, 21, 65, 76, 69, 80, 15, 21, 76, 93, 93, 65, 68, 78, 76, 89, 68, 66, 67, 2, 68, 73, 30, 56, 44, 61, 48, 54, 118, 52, 41, 109, 56, 116, 53, 56, 45, 52};
        if (A0M[0].charAt(23) != 'R') {
            throw new RuntimeException();
        }
        A0M[3] = "sAkikvs1jZ7mk1hfs4I9QLiXXK3MQFMn";
    }

    static {
        A09();
        A0N = new byte[]{73, 68, 51};
    }

    public OG(boolean z) {
        this(z, null);
    }

    public OG(boolean z, String str) {
        this.A0H = new C2180Mj(new byte[7]);
        this.A0I = new C2181Mk(Arrays.copyOf(A0N, 10));
        A06();
        this.A03 = -1;
        this.A02 = -1;
        this.A08 = -9223372036854775807L;
        this.A09 = -9223372036854775807L;
        this.A0K = z;
        this.A0J = str;
    }

    @EnsuresNonNull
    private void A01() {
        AbstractC2159Ln.A01(this.A0C);
    }

    @RequiresNonNull
    private void A02() throws L9 {
        this.A0H.A08(0);
        if (!this.A0G) {
            int iA04 = this.A0H.A04(2) + 1;
            if (iA04 != 2) {
                MV.A07(A00(22, 10, 51), A00(32, 28, 11) + iA04 + A00(0, 22, 54));
                iA04 = 2;
            }
            this.A0H.A09(5);
            int iA05 = this.A0H.A04(3);
            int audioObjectType = this.A02;
            byte[] bArrA07 = YZ.A07(iA04, audioObjectType, iA05);
            YY aacConfig = YZ.A03(bArrA07);
            C2126Ke c2126KeA0w = new C2126Ke().A0y(this.A0D).A11(A00(75, 15, 103)).A0w(aacConfig.A02);
            int audioObjectType2 = aacConfig.A00;
            C2126Ke c2126KeA0b = c2126KeA0w.A0b(audioObjectType2);
            int audioObjectType3 = aacConfig.A01;
            VC vcA14 = c2126KeA0b.A0m(audioObjectType3).A12(Collections.singletonList(bArrA07)).A10(this.A0J).A14();
            int audioObjectType4 = vcA14.A0G;
            this.A08 = 1024000000 / ((long) audioObjectType4);
            this.A0C.A7E(vcA14);
            this.A0G = true;
        } else {
            C2180Mj c2180Mj = this.A0H;
            String[] strArr = A0M;
            String str = strArr[5];
            String str2 = strArr[7];
            int iCharAt = str.charAt(29);
            int sampleSize = str2.charAt(29);
            if (iCharAt == sampleSize) {
                throw new RuntimeException();
            }
            A0M[6] = "RDW6QgyzfrheMO4rLZgltkW7TYCvHjcm";
            c2180Mj.A09(10);
        }
        this.A0H.A09(4);
        int iA06 = (this.A0H.A04(13) - 2) - 5;
        if (A0M[1].charAt(9) == 'V') {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[2] = "Cp9dS5j7gr5WjG7WGJY3hKVlRVfN3sn";
        strArr2[4] = "YMSmvOKMelhUdRuYh2";
        if (this.A0F) {
            iA06 -= 2;
        }
        A0D(this.A0C, this.A08, 0, iA06);
    }

    @RequiresNonNull
    private void A03() {
        this.A0B.AK9(this.A0I, 10);
        this.A0I.A0f(6);
        A0D(this.A0B, 0L, 10, this.A0I.A0H() + 10);
    }

    private void A04() {
        this.A0E = false;
        A06();
    }

    private void A05() {
        this.A06 = 1;
        this.A00 = 0;
    }

    private void A06() {
        this.A06 = 0;
        this.A00 = 0;
        this.A04 = 256;
    }

    private void A07() {
        this.A06 = 3;
        this.A00 = 0;
    }

    private void A08() {
        this.A06 = 2;
        this.A00 = A0N.length;
        this.A05 = 0;
        this.A0I.A0f(0);
    }

    private void A0A(C2181Mk c2181Mk) {
        if (c2181Mk.A07() == 0) {
            return;
        }
        this.A0H.A00[0] = c2181Mk.A0l()[c2181Mk.A09()];
        this.A0H.A08(2);
        int iA04 = this.A0H.A04(4);
        if (this.A02 != -1) {
            int currentFrameSampleRateIndex = this.A02;
            if (iA04 != currentFrameSampleRateIndex) {
                A04();
                return;
            }
        }
        if (!this.A0E) {
            this.A0E = true;
            int currentFrameSampleRateIndex2 = this.A01;
            this.A03 = currentFrameSampleRateIndex2;
            this.A02 = iA04;
        }
        A07();
    }

    private void A0B(C2181Mk c2181Mk) {
        byte[] bArrA0l = c2181Mk.A0l();
        int iA09 = c2181Mk.A09();
        int iA0A = c2181Mk.A0A();
        while (iA09 < iA0A) {
            int endOffset = iA09 + 1;
            int i = bArrA0l[iA09] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (this.A04 == 512 && A0E((byte) -1, (byte) i) && (this.A0E || A0G(c2181Mk, endOffset - 2))) {
                this.A01 = (i & 8) >> 3;
                this.A0F = (i & 1) == 0;
                if (!this.A0E) {
                    A05();
                } else {
                    A07();
                }
                c2181Mk.A0f(endOffset);
                return;
            }
            switch (this.A04 | i) {
                case 329:
                    this.A04 = 768;
                    iA09 = endOffset;
                    break;
                case EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE:
                    this.A04 = 512;
                    iA09 = endOffset;
                    break;
                case 836:
                    this.A04 = 1024;
                    iA09 = endOffset;
                    break;
                case 1075:
                    A08();
                    c2181Mk.A0f(endOffset);
                    break;
                default:
                    int data = this.A04;
                    if (data != 256) {
                        this.A04 = 256;
                        iA09 = endOffset - 1;
                    } else {
                        iA09 = endOffset;
                    }
                    break;
            }
            return;
        }
        c2181Mk.A0f(iA09);
    }

    @RequiresNonNull
    private void A0C(C2181Mk c2181Mk) {
        int iMin = Math.min(c2181Mk.A07(), this.A05 - this.A00);
        this.A0A.AK9(c2181Mk, iMin);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + iMin;
        int i = this.A00;
        int bytesToRead2 = this.A05;
        if (i == bytesToRead2) {
            if (this.A09 != -9223372036854775807L) {
                this.A0A.AKC(this.A09, 1, this.A05, 0, null);
                this.A09 += this.A07;
            }
            A06();
        }
    }

    private void A0D(ZP zp, long j, int i, int i2) {
        this.A06 = 4;
        this.A00 = i;
        this.A0A = zp;
        this.A07 = j;
        this.A05 = i2;
    }

    private boolean A0E(byte b, byte b2) {
        return A0F(((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public static boolean A0F(int i) {
        return (65526 & i) == 65520;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef A[RETURN, SYNTHETIC] */
    private boolean A0G(C2181Mk c2181Mk, int i) {
        C2180Mj c2180Mj;
        int iA04;
        byte[] bArrA0l;
        int iA0A;
        int i2;
        int currentFrameVersion;
        int currentFrameVersion2;
        int currentFrameVersion3;
        int currentFrameVersion4;
        int currentFrameVersion5;
        int currentFrameVersion6;
        int currentFrameVersion7;
        int currentFrameVersion8;
        c2181Mk.A0f(i + 1);
        if (!A0I(c2181Mk, this.A0H.A00, 1)) {
            return false;
        }
        this.A0H.A08(4);
        int iA05 = this.A0H.A04(1);
        int currentFrameVersion9 = this.A03;
        if (currentFrameVersion9 != -1) {
            int currentFrameVersion10 = this.A03;
            if (iA05 != currentFrameVersion10) {
                return false;
            }
        }
        int currentFrameVersion11 = this.A02;
        if (currentFrameVersion11 != -1) {
            if (!A0I(c2181Mk, this.A0H.A00, 1)) {
                return true;
            }
            this.A0H.A08(2);
            int iA06 = this.A0H.A04(4);
            int currentFrameVersion12 = this.A02;
            if (iA06 != currentFrameVersion12) {
                return false;
            }
            int i3 = i + 2;
            String[] strArr = A0M;
            String str = strArr[2];
            String str2 = strArr[4];
            int length = str.length();
            int currentFrameVersion13 = str2.length();
            if (length != currentFrameVersion13) {
                A0M[1] = "UtL0d5mYq2CM2rOORq8wXJPW7dFlMw0F";
                c2181Mk.A0f(i3);
                if (!A0I(c2181Mk, this.A0H.A00, 4)) {
                    return true;
                }
                c2180Mj = this.A0H;
                if (A0M[0].charAt(23) == 'R') {
                    A0M[0] = "xIlePV9u2bkVOsPsBAT9xhdRhvUovSnl";
                    c2180Mj.A08(14);
                    iA04 = this.A0H.A04(13);
                    if (iA04 < 7) {
                        return false;
                    }
                    bArrA0l = c2181Mk.A0l();
                    iA0A = c2181Mk.A0A();
                    i2 = i + iA04;
                    if (i2 >= iA0A) {
                        return true;
                    }
                    currentFrameVersion = bArrA0l[i2];
                    if (currentFrameVersion == -1) {
                        currentFrameVersion6 = i2 + 1;
                        if (currentFrameVersion6 == iA0A) {
                            return true;
                        }
                        currentFrameVersion7 = i2 + 1;
                        if (A0E((byte) -1, bArrA0l[currentFrameVersion7])) {
                            currentFrameVersion8 = i2 + 1;
                            if (((bArrA0l[currentFrameVersion8] & 8) >> 3) == iA05) {
                                return true;
                            }
                        }
                        return false;
                    }
                    if (bArrA0l[i2] != 73) {
                        return false;
                    }
                    currentFrameVersion2 = i2 + 1;
                    if (currentFrameVersion2 == iA0A) {
                        return true;
                    }
                    currentFrameVersion3 = i2 + 1;
                    if (bArrA0l[currentFrameVersion3] != 68) {
                        return false;
                    }
                    currentFrameVersion4 = i2 + 2;
                    if (currentFrameVersion4 == iA0A) {
                        return true;
                    }
                    currentFrameVersion5 = i2 + 2;
                    if (bArrA0l[currentFrameVersion5] == 51) {
                        return true;
                    }
                    return false;
                }
            }
        } else {
            if (!A0I(c2181Mk, this.A0H.A00, 4)) {
                return true;
            }
            c2180Mj = this.A0H;
            if (A0M[0].charAt(23) == 'R') {
                A0M[0] = "xIlePV9u2bkVOsPsBAT9xhdRhvUovSnl";
                c2180Mj.A08(14);
                iA04 = this.A0H.A04(13);
                if (iA04 < 7) {
                    return false;
                }
                bArrA0l = c2181Mk.A0l();
                iA0A = c2181Mk.A0A();
                i2 = i + iA04;
                if (i2 >= iA0A) {
                    return true;
                }
                currentFrameVersion = bArrA0l[i2];
                if (currentFrameVersion == -1) {
                    currentFrameVersion6 = i2 + 1;
                    if (currentFrameVersion6 == iA0A) {
                        return true;
                    }
                    currentFrameVersion7 = i2 + 1;
                    if (A0E((byte) -1, bArrA0l[currentFrameVersion7])) {
                        currentFrameVersion8 = i2 + 1;
                        if (((bArrA0l[currentFrameVersion8] & 8) >> 3) == iA05) {
                            return true;
                        }
                    }
                    return false;
                }
                if (bArrA0l[i2] != 73) {
                    return false;
                }
                currentFrameVersion2 = i2 + 1;
                if (currentFrameVersion2 == iA0A) {
                    return true;
                }
                currentFrameVersion3 = i2 + 1;
                if (bArrA0l[currentFrameVersion3] != 68) {
                    return false;
                }
                currentFrameVersion4 = i2 + 2;
                if (currentFrameVersion4 == iA0A) {
                    return true;
                }
                currentFrameVersion5 = i2 + 2;
                if (bArrA0l[currentFrameVersion5] == 51) {
                    return true;
                }
                return false;
            }
        }
        throw new RuntimeException();
    }

    private boolean A0H(C2181Mk c2181Mk, byte[] bArr, int i) {
        int iMin = Math.min(c2181Mk.A07(), i - this.A00);
        int bytesToRead = this.A00;
        c2181Mk.A0k(bArr, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    private boolean A0I(C2181Mk c2181Mk, byte[] bArr, int i) {
        if (c2181Mk.A07() < i) {
            return false;
        }
        c2181Mk.A0k(bArr, 0, i);
        return true;
    }

    public final long A0J() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2677ch
    public final void A5j(C2181Mk c2181Mk) throws L9 {
        A01();
        while (c2181Mk.A07() > 0) {
            switch (this.A06) {
                case 0:
                    A0B(c2181Mk);
                    break;
                case 1:
                    A0A(c2181Mk);
                    break;
                case 2:
                    if (A0H(c2181Mk, this.A0I.A0l(), 10)) {
                        A03();
                    }
                    break;
                case 3:
                    if (A0H(c2181Mk, this.A0H.A00, this.A0F ? 7 : 5)) {
                        A02();
                    }
                    break;
                case 4:
                    A0C(c2181Mk);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2677ch
    public final void A6B(InterfaceC2481Yw interfaceC2481Yw, C2698d2 c2698d2) {
        c2698d2.A05();
        this.A0D = c2698d2.A04();
        this.A0C = interfaceC2481Yw.ALm(c2698d2.A03(), 1);
        this.A0A = this.A0C;
        if (this.A0K) {
            c2698d2.A05();
            this.A0B = interfaceC2481Yw.ALm(c2698d2.A03(), 5);
            this.A0B.A7E(new C2126Ke().A0y(c2698d2.A04()).A11(A00(60, 15, 19)).A14());
            return;
        }
        this.A0B = new QA();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2677ch
    public final void AI2() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2677ch
    public final void AI3(long j, int i) {
        if (j != -9223372036854775807L) {
            this.A09 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2677ch
    public final void AKN() {
        this.A09 = -9223372036854775807L;
        A04();
    }
}
