package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class RunnableC3722tp implements Runnable {
    public final /* synthetic */ AbstractC1988Es A00;

    public RunnableC3722tp(AbstractC1988Es abstractC1988Es) {
        this.A00 = abstractC1988Es;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0J.getVisibility() == 0) {
                this.A00.A0t(8);
            }
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
