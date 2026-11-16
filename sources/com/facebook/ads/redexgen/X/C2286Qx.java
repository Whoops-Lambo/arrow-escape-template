package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2286Qx implements InterfaceC2424Wm {
    public int A00;
    public int A01;
    public int A02;
    public C2422Wk[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public C2286Qx(boolean z, int i) {
        this(z, i, 0);
    }

    public C2286Qx(boolean z, int i, int i2) {
        AbstractC2159Ln.A07(i > 0);
        AbstractC2159Ln.A07(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new C2422Wk[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new C2422Wk(this.A06, i3 * i);
            }
            return;
        }
        this.A06 = null;
    }

    public final synchronized int A00() {
        return this.A00 * this.A04;
    }

    public final synchronized void A01() {
        if (this.A05) {
            A02(0);
        }
    }

    public final synchronized void A02(int i) {
        boolean targetBufferSizeReduced = i < this.A02;
        this.A02 = i;
        if (targetBufferSizeReduced) {
            ALn();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2424Wm
    public final synchronized C2422Wk A4Z() {
        C2422Wk c2422Wk;
        this.A00++;
        if (this.A01 > 0) {
            C2422Wk[] c2422WkArr = this.A03;
            int i = this.A01 - 1;
            this.A01 = i;
            c2422Wk = (C2422Wk) AbstractC2159Ln.A01(c2422WkArr[i]);
            this.A03[this.A01] = null;
        } else {
            c2422Wk = new C2422Wk(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (C2422Wk[]) Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return c2422Wk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2424Wm
    public final int A8u() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2424Wm
    public final synchronized void AIr(C2422Wk c2422Wk) {
        C2422Wk[] c2422WkArr = this.A03;
        int i = this.A01;
        this.A01 = i + 1;
        c2422WkArr[i] = c2422Wk;
        this.A00--;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2424Wm
    public final synchronized void AIs(InterfaceC2423Wl interfaceC2423Wl) {
        while (interfaceC2423Wl != null) {
            C2422Wk[] c2422WkArr = this.A03;
            int i = this.A01;
            this.A01 = i + 1;
            c2422WkArr[i] = interfaceC2423Wl.A7U();
            this.A00--;
            interfaceC2423Wl = interfaceC2423Wl.ADT();
        }
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2424Wm
    public final synchronized void ALn() {
        int iA05 = N1.A05(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int iMax = Math.max(0, iA05 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (iMax >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                C2422Wk highAllocation = (C2422Wk) AbstractC2159Ln.A01(this.A03[lowIndex]);
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C2422Wk lowAllocation = (C2422Wk) AbstractC2159Ln.A01(this.A03[highIndex]);
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            iMax = Math.max(iMax, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (iMax >= targetAllocationCount5) {
                return;
            }
        }
        C2422Wk[] c2422WkArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c2422WkArr, iMax, targetAvailableCount, (Object) null);
        this.A01 = iMax;
    }
}
