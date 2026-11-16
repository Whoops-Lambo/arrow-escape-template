package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class RunnableC3646sb implements Runnable {
    public final /* synthetic */ C3648sd A00;

    public RunnableC3646sb(C3648sd c3648sd) {
        this.A00 = c3648sd;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02.getVisibility() == 0) {
                this.A00.A07(8);
            }
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
