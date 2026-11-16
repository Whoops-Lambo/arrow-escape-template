package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2689ct {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C2180Mj A05 = new C2180Mj(new byte[64]);
    public final C2189Ms A06;
    public final InterfaceC2677ch A07;

    public C2689ct(InterfaceC2677ch interfaceC2677ch, C2189Ms c2189Ms) {
        this.A07 = interfaceC2677ch;
        this.A06 = c2189Ms;
    }

    private void A00() {
        this.A05.A09(8);
        this.A03 = this.A05.A0H();
        this.A02 = this.A05.A0H();
        this.A05.A09(6);
        this.A00 = this.A05.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A05.A09(4);
            long jA04 = ((long) this.A05.A04(3)) << 30;
            this.A05.A09(1);
            long pts = this.A05.A04(15) << 15;
            long j = jA04 | pts;
            this.A05.A09(1);
            long pts2 = this.A05.A04(15);
            long j2 = j | pts2;
            this.A05.A09(1);
            if (!this.A04 && this.A02) {
                this.A05.A09(4);
                long pts3 = this.A05.A04(3);
                this.A05.A09(1);
                long pts4 = (pts3 << 30) | ((long) (this.A05.A04(15) << 15));
                this.A05.A09(1);
                long pts5 = pts4 | ((long) this.A05.A04(15));
                this.A05.A09(1);
                this.A06.A06(pts5);
                this.A04 = true;
            }
            this.A01 = this.A06.A06(j2);
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A07.AKN();
    }

    public final void A03(C2181Mk c2181Mk) throws L9 {
        c2181Mk.A0k(this.A05.A00, 0, 3);
        this.A05.A08(0);
        A00();
        c2181Mk.A0k(this.A05.A00, 0, this.A00);
        this.A05.A08(0);
        A01();
        this.A07.AI3(this.A01, 4);
        this.A07.A5j(c2181Mk);
        this.A07.AI2();
    }
}
