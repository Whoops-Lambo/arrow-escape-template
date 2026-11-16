package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.tr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class RunnableC3724tr implements Runnable {
    public final /* synthetic */ AbstractC1988Es A00;

    public RunnableC3724tr(AbstractC1988Es abstractC1988Es) {
        this.A00 = abstractC1988Es;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A0r();
            this.A00.A0v(1000L);
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
