package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2103Jf extends AbstractRunnableC3416oq {
    public final /* synthetic */ HandlerC2898gI A00;

    public C2103Jf(HandlerC2898gI handlerC2898gI) {
        this.A00 = handlerC2898gI;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        this.A00.A09.AJZ(this.A00.A00);
        if (AbstractC3303my.A0I(this.A00.A0A)) {
            this.A00.A0J();
        }
        boolean retryScheduled = this.A00.A0I(AbstractC3303my.A0C(this.A00.A0A));
        if (retryScheduled) {
            return;
        }
        boolean retryScheduled2 = AbstractC3303my.A0E(this.A00.A0A);
        if (retryScheduled2) {
            return;
        }
        AbstractC3250m7.A05(this.A00.A0A);
    }
}
