package com.facebook.ads.redexgen.X;

import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3358nr {
    public final InterfaceC3356np A0B;
    public final boolean A0F;
    public final String A0C = C3358nr.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<C3357nq> A0D = new LinkedList();

    public C3358nr(C3192lA c3192lA, InterfaceC3356np interfaceC3356np) {
        int nativeViewabilityHistorySamplingRate = AbstractC3302mx.A0D(c3192lA);
        if (nativeViewabilityHistorySamplingRate < 1) {
            this.A0F = false;
        } else {
            this.A0F = c3192lA.A09().A00() < 1.0d / ((double) nativeViewabilityHistorySamplingRate);
        }
        this.A0B = interfaceC3356np;
    }

    private int A00() {
        return this.A0B.A8E();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(C3357nq c3357nq) {
        synchronized (this.A0D) {
            this.A0D.add(c3357nq);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new C3357nq(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new C3357nq(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new C3357nq(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new C3357nq(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new C3357nq(A01(), 108, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new C3357nq(0, 101, -1, null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        A03(new C3357nq(A01(), 105, A00(), null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new C3357nq(A01(), 102, A00(), null));
    }

    public final void A0C(C3192lA c3192lA, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new C3357nq(A01(), 103, A00(), null));
        ExecutorC3528qh.A06.execute(new RunnableC3355no(this, str, c3192lA));
    }
}
