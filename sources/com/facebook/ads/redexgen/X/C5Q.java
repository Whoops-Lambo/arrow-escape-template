package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C5Q extends B5 {
    public final /* synthetic */ C1890Ay A00;

    public C5Q(C1890Ay c1890Ay) {
        this.A00 = c1890Ay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC3269mQ
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(B6 b6) {
        if (this.A00.A01 == null || this.A00.A05 || b6.A00().getAction() != 0) {
            return;
        }
        this.A00.A07.removeCallbacksAndMessages(null);
        if (this.A00.A0G(EnumC2734dc.A05)) {
            this.A00.A03();
            this.A00.A06(true, false);
        }
        if (this.A00.A04) {
            this.A00.A07.postDelayed(new C1891Az(this), this.A00.A00);
        }
    }
}
