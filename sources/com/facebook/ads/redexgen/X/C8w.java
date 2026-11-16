package com.facebook.ads.redexgen.X;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8w, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C8w extends SK {
    public static String[] A0C = {"diWF70wbb85f1y1G3pwDvAeYx7bFQkWf", "SQiKt6gB", "SwfUuh21OW5mJYm2325gf9kDbNWvzDVM", "nF8yYRS4sAypZN5UiMDrKU4fOn04Ri26", "cX1SXgB2oG7xU7lwCorhHjyTVnR4l8Ve", "gSc0h7rvpPXOLVC7y7mKlU9b0", "Fwh9bCn2xIdbKa8PaCuSHTCtggyvOijj", "Thz7"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;
    public final long A09;
    public final long A0A;
    public final short A0B;

    public C8w() {
        this(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 20000L, (short) 1024);
    }

    public C8w(long j, long j2, short s) {
        AbstractC2159Ln.A07(j2 <= j);
        this.A09 = j;
        this.A0A = j2;
        this.A0B = s;
        this.A07 = N1.A07;
        this.A08 = N1.A07;
    }

    private int A00(long j) {
        return (int) ((((long) super.A05.A03) * j) / 1000000);
    }

    private int A01(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 2; iLimit >= i; iLimit -= 2) {
            int i = byteBuffer.getShort(iLimit);
            int iAbs = Math.abs(i);
            int i2 = this.A0B;
            if (iAbs > i2) {
                int i3 = this.A00;
                int i4 = this.A00;
                int i5 = i3 * (iLimit / i4);
                int i6 = this.A00;
                return i5 + i6;
            }
        }
        int iPosition = byteBuffer.position();
        String[] strArr = A0C;
        if (strArr[0].charAt(16) != strArr[2].charAt(16)) {
            throw new RuntimeException();
        }
        A0C[3] = "hvdBNGiD0AuV494kDX9Ptot0cNa6Bfvn";
        return iPosition;
    }

    private int A02(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < i; iPosition += 2) {
            int i = byteBuffer.getShort(iPosition);
            int iAbs = Math.abs(i);
            short s = this.A0B;
            String[] strArr = A0C;
            String str = strArr[7];
            String str2 = strArr[5];
            int length = str.length();
            int i2 = str2.length();
            if (length == i2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[7] = "nwlb";
            strArr2[5] = "uS7KfhWegN24Ky1LCkVoFZkVs";
            if (iAbs > s) {
                int i3 = this.A00;
                int i4 = this.A00;
                int i5 = i3 * (iPosition / i4);
                String[] strArr3 = A0C;
                String str3 = strArr3[7];
                String str4 = strArr3[5];
                int length2 = str3.length();
                int i6 = str4.length();
                if (length2 != i6) {
                    A0C[3] = "t4kVH1WvsASfXFb99kWsNVyZw9EnatUJ";
                    return i5;
                }
                String[] strArr4 = A0C;
                strArr4[4] = "JT9PNtUh6Dq5xmV9X3DNHeKl703pOb5Q";
                strArr4[6] = "aaYFiii986wxl2XcPgASH0RmhU32iqa9";
                return i5;
            }
        }
        int i7 = byteBuffer.limit();
        return i7;
    }

    private void A03(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        A00(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.A06 = true;
        }
    }

    private void A04(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int maybeSilenceBufferRemaining = A02(byteBuffer);
        int limit = byteBuffer.position();
        int maybeSilenceInputSize = maybeSilenceBufferRemaining - limit;
        int noisePosition = this.A07.length;
        int limit2 = this.A01;
        int noisePosition2 = noisePosition - limit2;
        if (maybeSilenceBufferRemaining < iLimit && maybeSilenceInputSize < noisePosition2) {
            byte[] bArr = this.A07;
            int limit3 = this.A01;
            A08(bArr, limit3);
            this.A01 = 0;
            this.A03 = 0;
            return;
        }
        int maybeSilenceInputSize2 = Math.min(maybeSilenceInputSize, noisePosition2);
        int limit4 = byteBuffer.position();
        byteBuffer.limit(limit4 + maybeSilenceInputSize2);
        byte[] bArr2 = this.A07;
        int limit5 = this.A01;
        byteBuffer.get(bArr2, limit5, maybeSilenceInputSize2);
        int limit6 = this.A01;
        this.A01 = limit6 + maybeSilenceInputSize2;
        int noisePosition3 = this.A01;
        int limit7 = this.A07.length;
        if (noisePosition3 == limit7) {
            boolean z = this.A06;
            String[] strArr = A0C;
            String str = strArr[4];
            String str2 = strArr[6];
            int noisePosition4 = str.charAt(20);
            int limit8 = str2.charAt(20);
            if (noisePosition4 == limit8) {
                String[] strArr2 = A0C;
                strArr2[0] = "XWBoTklimP7tvVAD35To6kwc9Ig1CWwc";
                strArr2[2] = "EMUU64nXAhKCRkmf3FS1h4tMrgtGE1z2";
                if (z) {
                    byte[] bArr3 = this.A07;
                    int limit9 = this.A02;
                    A08(bArr3, limit9);
                    long j = this.A04;
                    int noisePosition5 = this.A01;
                    int limit10 = this.A02;
                    int noisePosition6 = noisePosition5 - (limit10 * 2);
                    int limit11 = this.A00;
                    this.A04 = j + ((long) (noisePosition6 / limit11));
                } else {
                    long j2 = this.A04;
                    String[] strArr3 = A0C;
                    String str3 = strArr3[4];
                    String str4 = strArr3[6];
                    int noisePosition7 = str3.charAt(20);
                    int limit12 = str4.charAt(20);
                    if (noisePosition7 == limit12) {
                        String[] strArr4 = A0C;
                        strArr4[0] = "P4Fe3yLzU5WHc5773ON1EP6iF1pfPevB";
                        strArr4[2] = "d3WP6bkO0tpdCXnk33OmiPqViT5NLzuJ";
                        int noisePosition8 = this.A01;
                        int limit13 = this.A02;
                        int noisePosition9 = noisePosition8 - limit13;
                        int limit14 = this.A00;
                        this.A04 = j2 + ((long) (noisePosition9 / limit14));
                    }
                }
                byte[] bArr4 = this.A07;
                int limit15 = this.A01;
                A07(byteBuffer, bArr4, limit15);
                this.A01 = 0;
                this.A03 = 2;
            }
            throw new RuntimeException();
        }
        byteBuffer.limit(iLimit);
    }

    private void A05(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int limit = this.A07.length;
        byteBuffer.limit(Math.min(iLimit, iPosition + limit));
        int noiseLimit = A01(byteBuffer);
        int limit2 = byteBuffer.position();
        if (noiseLimit == limit2) {
            this.A03 = 1;
        } else {
            byteBuffer.limit(noiseLimit);
            A03(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void A06(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iA02 = A02(byteBuffer);
        byteBuffer.limit(iA02);
        long j = this.A04;
        int noisyPosition = byteBuffer.remaining();
        int limit = this.A00;
        this.A04 = j + ((long) (noisyPosition / limit));
        byte[] bArr = this.A08;
        int limit2 = this.A02;
        A07(byteBuffer, bArr, limit2);
        if (iA02 < iLimit) {
            byte[] bArr2 = this.A08;
            int limit3 = this.A02;
            A08(bArr2, limit3);
            this.A03 = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void A07(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.A02);
        int i2 = this.A02 - iMin;
        System.arraycopy(bArr, i - i2, this.A08, 0, i2);
        int fromInputSize = byteBuffer.limit();
        byteBuffer.position(fromInputSize - iMin);
        byteBuffer.get(this.A08, i2, iMin);
    }

    private void A08(byte[] bArr, int i) {
        A00(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.A06 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.SK
    public final LX A09(LX lx) throws LY {
        if (lx.A02 == 2) {
            return this.A05 ? lx : LX.A06;
        }
        throw new LY(lx);
    }

    @Override // com.facebook.ads.redexgen.X.SK
    public final void A0A() {
        if (this.A05) {
            this.A00 = super.A05.A00;
            long j = this.A09;
            if (A0C[3].charAt(9) != 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[0] = "SeTmjXBZLSN79jOL3ofgHHWOFAAvZkzY";
            strArr[2] = "yosJok1L6RiKBynN38EU6Cw34qT0vvEB";
            int iA00 = A00(j) * this.A00;
            int maybeSilenceBufferSize = this.A07.length;
            if (maybeSilenceBufferSize != iA00) {
                this.A07 = new byte[iA00];
            }
            int iA01 = A00(this.A0A);
            int maybeSilenceBufferSize2 = this.A00;
            this.A02 = iA01 * maybeSilenceBufferSize2;
            int length = this.A08.length;
            int maybeSilenceBufferSize3 = this.A02;
            if (length != maybeSilenceBufferSize3) {
                int maybeSilenceBufferSize4 = this.A02;
                this.A08 = new byte[maybeSilenceBufferSize4];
            }
        }
        this.A03 = 0;
        this.A04 = 0L;
        this.A01 = 0;
        String[] strArr2 = A0C;
        if (strArr2[0].charAt(16) != strArr2[2].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0C;
        strArr3[0] = "BMCfr1fjRmwgWJUC33Tkofk1o3dkqRZM";
        strArr3[2] = "hWmJtjX7FPu6PGBU3442wAfIarunN4hb";
        this.A06 = false;
    }

    @Override // com.facebook.ads.redexgen.X.SK
    public final void A0B() {
        if (this.A01 > 0) {
            byte[] bArr = this.A07;
            String[] strArr = A0C;
            if (strArr[4].charAt(20) != strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[7] = "hjO3";
            strArr2[5] = "dfGQzOW9ytBf0Nb6F0zDQ7Nem";
            A08(bArr, this.A01);
        }
        if (!this.A06) {
            this.A04 += (long) (this.A02 / this.A00);
        }
    }

    public final long A0C() {
        return this.A04;
    }

    public final void A0D(boolean z) {
        this.A05 = z;
    }

    @Override // com.facebook.ads.redexgen.X.SK, com.facebook.ads.redexgen.X.LZ
    public final boolean AB3() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.LZ
    public final void AIU(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !A01()) {
            switch (this.A03) {
                case 0:
                    A05(byteBuffer);
                    break;
                case 1:
                    A04(byteBuffer);
                    break;
                case 2:
                    A06(byteBuffer);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }
}
