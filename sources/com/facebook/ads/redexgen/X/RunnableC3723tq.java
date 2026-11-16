package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.tq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class RunnableC3723tq implements Runnable {
    public final /* synthetic */ AbstractC1988Es A00;

    public RunnableC3723tq(AbstractC1988Es abstractC1988Es) {
        this.A00 = abstractC1988Es;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A01 = this.A00.A0U.A04();
            this.A00.A03 = AbstractC1988Es.A0I(this.A00.A0U.A04());
            this.A00.A0p();
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
