package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C1980Ek extends AbstractRunnableC3416oq {
    public final /* synthetic */ AbstractC3749uG A00;

    public C1980Ek(AbstractC3749uG abstractC3749uG) {
        this.A00 = abstractC3749uG;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        if (!this.A00.isPressed()) {
            this.A00.setPressed(true);
            this.A00.postOnAnimationDelayed(this.A00.A09, 250L);
        } else {
            this.A00.postDelayed(this, this.A00.A07);
        }
    }
}
