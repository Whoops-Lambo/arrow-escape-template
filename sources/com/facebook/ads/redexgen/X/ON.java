package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class ON implements InterfaceC2677ch {
    public static byte[] A0C;
    public static String[] A0D = {"ep9gEVnLdHQukhszVIgQLkMVsu7wmA", "5A1zYpSeIeOgAqUkbC", "kXHLxxwLRtkdCVbOZs2QIWnQntQQylkW", "tWYnEg4Wx6AOnen8geTVgcs3Rk1exgFZ", "nsAK4bp41FYiOmcf294ZlwkuQ7OJH9Wc", "E3xEuYzC7Z", "HSxndViYjZhdb7", "wynUtS2qCDQ1uB1gl7eO4Qu"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public VC A05;
    public ZP A06;
    public String A07;
    public boolean A08;
    public final C2180Mj A09;
    public final C2181Mk A0A;
    public final String A0B;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{103, 115, 98, 111, 105, 41, 103, 101, 53};
    }

    static {
        A02();
    }

    public ON() {
        this(null);
    }

    public ON(String str) {
        this.A09 = new C2180Mj(new byte[128]);
        this.A0A = new C2181Mk(this.A09.A00);
        this.A02 = 0;
        this.A04 = -9223372036854775807L;
        this.A0B = str;
    }

    @RequiresNonNull
    private void A01() {
        this.A09.A08(0);
        C2462Yc c2462YcA09 = AbstractC2463Yd.A09(this.A09);
        if (this.A05 == null || c2462YcA09.A01 != this.A05.A06 || c2462YcA09.A04 != this.A05.A0G || !N1.A1E(c2462YcA09.A06, this.A05.A0W)) {
            C2126Ke c2126KeA0j = new C2126Ke().A0y(this.A07).A11(c2462YcA09.A06).A0b(c2462YcA09.A01).A0m(c2462YcA09.A04).A10(this.A0B).A0j(c2462YcA09.A00);
            if (A00(0, 9, 35).equals(c2462YcA09.A06)) {
                c2126KeA0j.A0a(c2462YcA09.A00);
            }
            this.A05 = c2126KeA0j.A14();
            this.A06.A7E(this.A05);
        }
        this.A01 = c2462YcA09.A02;
        long j = c2462YcA09.A03;
        if (A0D[0].length() != 30) {
            throw new RuntimeException();
        }
        String[] strArr = A0D;
        strArr[7] = "y7sa434xnL7Q43sfgX6PnLI";
        strArr[6] = "xeNUR191odINOC";
        this.A03 = (j * 1000000) / ((long) this.A05.A0G);
    }

    private boolean A03(C2181Mk c2181Mk) {
        while (true) {
            int iA07 = c2181Mk.A07();
            if (A0D[3].charAt(0) != 't') {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[7] = "dAJxwBAgW7qvdGzP1N5Wvw9";
            strArr[6] = "1V4X54GGKEEW4j";
            if (iA07 <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = c2181Mk.A0I() == 11;
            } else {
                int iA0I = c2181Mk.A0I();
                if (iA0I == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = iA0I == 11;
            }
        }
    }

    private boolean A04(C2181Mk c2181Mk, byte[] bArr, int i) {
        int iMin = Math.min(c2181Mk.A07(), i - this.A00);
        int bytesToRead = this.A00;
        c2181Mk.A0k(bArr, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2677ch
    public final void A5j(C2181Mk c2181Mk) {
        AbstractC2159Ln.A02(this.A06);
        while (c2181Mk.A07() > 0) {
            switch (this.A02) {
                case 0:
                    if (A03(c2181Mk)) {
                        this.A02 = 1;
                        this.A0A.A0l()[0] = 11;
                        this.A0A.A0l()[1] = 119;
                        this.A00 = 2;
                    }
                    break;
                case 1:
                    if (A04(c2181Mk, this.A0A.A0l(), 128)) {
                        A01();
                        this.A0A.A0f(0);
                        this.A06.AK9(this.A0A, 128);
                        this.A02 = 2;
                    }
                    break;
                case 2:
                    int iMin = Math.min(c2181Mk.A07(), this.A01 - this.A00);
                    this.A06.AK9(c2181Mk, iMin);
                    int bytesToRead = this.A00;
                    this.A00 = bytesToRead + iMin;
                    int i = this.A00;
                    int bytesToRead2 = this.A01;
                    if (i == bytesToRead2) {
                        if (this.A04 != -9223372036854775807L) {
                            this.A06.AKC(this.A04, 1, this.A01, 0, null);
                            this.A04 += this.A03;
                        }
                        this.A02 = 0;
                    }
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2677ch
    public final void A6B(InterfaceC2481Yw interfaceC2481Yw, C2698d2 c2698d2) {
        c2698d2.A05();
        this.A07 = c2698d2.A04();
        this.A06 = interfaceC2481Yw.ALm(c2698d2.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2677ch
    public final void AI2() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2677ch
    public final void AI3(long j, int i) {
        if (j != -9223372036854775807L) {
            this.A04 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2677ch
    public final void AKN() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
    }
}
