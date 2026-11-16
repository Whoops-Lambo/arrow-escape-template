package com.facebook.ads.redexgen.X;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class O3 implements InterfaceC2677ch {
    public static String[] A0C = {"1Lj4x7S1lVuTKgDJUSYDYqjEVIdvtlHj", "T31F5e1Ojmn8hLMrI14SV5rKxKNVIhyx", "jF388P0yRetCJLicjtzDxi0Gu", "lgyZGuQ1Tai7jsjPUROJbGJDHbx5fz51", "jF14IqutEYmI957EvX8WYxOXeb1zMo3b", "1IHFks79ZirbUEFpA1KxHK1Z7J0NDTOn", "lp14kmTG7oLZ4mKyt2MZy", "aeaRWDyfYOOo1pl6WrlQRcbXoucuBGP0"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public ZP A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final C2181Mk A09;
    public final Z9 A0A;
    public final String A0B;

    public O3() {
        this(null);
    }

    public O3(String str) {
        this.A02 = 0;
        this.A09 = new C2181Mk(4);
        this.A09.A0l()[0] = -1;
        this.A0A = new Z9();
        this.A04 = -9223372036854775807L;
        this.A0B = str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    private void A00(C2181Mk c2181Mk) {
        boolean z;
        byte[] bArrA0l = c2181Mk.A0l();
        int iA0A = c2181Mk.A0A();
        for (int iA09 = c2181Mk.A09(); iA09 < iA0A; iA09++) {
            int startOffset = bArrA0l[iA09];
            boolean z2 = (startOffset & 255) == 255;
            if (this.A08) {
                int startOffset2 = bArrA0l[iA09];
                if ((startOffset2 & 224) == 224) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.A08 = z2;
            int startOffset3 = A0C[1].charAt(6);
            if (startOffset3 != 49) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "fURMoL45edrYEaEvXIj3Ydyywbt1MKRQ";
            strArr[4] = "1rvVgcpF9PgBmcs6cVUZXkLFabzNefaL";
            if (z) {
                c2181Mk.A0f(iA09 + 1);
                this.A08 = false;
                this.A09.A0l()[1] = bArrA0l[iA09];
                this.A00 = 2;
                this.A02 = 1;
                return;
            }
        }
        c2181Mk.A0f(iA0A);
    }

    @RequiresNonNull
    private void A01(C2181Mk c2181Mk) {
        int iMin = Math.min(c2181Mk.A07(), this.A01 - this.A00);
        this.A05.AK9(c2181Mk, iMin);
        int bytesToRead = this.A00;
        this.A00 = bytesToRead + iMin;
        int i = this.A00;
        int bytesToRead2 = this.A01;
        if (i < bytesToRead2) {
            return;
        }
        long j = this.A04;
        if (A0C[7].charAt(15) == 'H') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[3] = "GGfFVDtbBiaeAEyl2e5ob8ZYab6JvgSi";
        strArr[4] = "9c1zRhiT0Cn1hO0QneAhNFTXMbYm4hq1";
        if (j != -9223372036854775807L) {
            this.A05.AKC(this.A04, 1, this.A01, 0, null);
            this.A04 += this.A03;
        }
        this.A00 = 0;
        this.A02 = 0;
    }

    @RequiresNonNull
    private void A02(C2181Mk c2181Mk) {
        int iMin = Math.min(c2181Mk.A07(), 4 - this.A00);
        byte[] bArrA0l = this.A09.A0l();
        int bytesToRead = this.A00;
        c2181Mk.A0k(bArrA0l, bytesToRead, iMin);
        int bytesToRead2 = this.A00;
        this.A00 = bytesToRead2 + iMin;
        int bytesToRead3 = this.A00;
        if (bytesToRead3 < 4) {
            return;
        }
        this.A09.A0f(0);
        Z9 z9 = this.A0A;
        int bytesToRead4 = this.A09.A0C();
        if (!z9.A00(bytesToRead4)) {
            this.A00 = 0;
            this.A02 = 1;
            return;
        }
        int bytesToRead5 = this.A0A.A02;
        this.A01 = bytesToRead5;
        if (!this.A07) {
            int bytesToRead6 = this.A0A.A04;
            long j = ((long) bytesToRead6) * 1000000;
            int bytesToRead7 = this.A0A.A03;
            this.A03 = j / ((long) bytesToRead7);
            C2126Ke c2126KeA0h = new C2126Ke().A0y(this.A06).A11(this.A0A.A06).A0h(4096);
            int bytesToRead8 = this.A0A.A01;
            C2126Ke c2126KeA0b = c2126KeA0h.A0b(bytesToRead8);
            int bytesToRead9 = this.A0A.A03;
            this.A05.A7E(c2126KeA0b.A0m(bytesToRead9).A10(this.A0B).A14());
            this.A07 = true;
        }
        this.A09.A0f(0);
        this.A05.AK9(this.A09, 4);
        this.A02 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2677ch
    public final void A5j(C2181Mk c2181Mk) {
        AbstractC2159Ln.A02(this.A05);
        while (c2181Mk.A07() > 0) {
            switch (this.A02) {
                case 0:
                    A00(c2181Mk);
                    break;
                case 1:
                    A02(c2181Mk);
                    break;
                case 2:
                    A01(c2181Mk);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2677ch
    public final void A6B(InterfaceC2481Yw interfaceC2481Yw, C2698d2 c2698d2) {
        c2698d2.A05();
        this.A06 = c2698d2.A04();
        this.A05 = interfaceC2481Yw.ALm(c2698d2.A03(), 1);
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
