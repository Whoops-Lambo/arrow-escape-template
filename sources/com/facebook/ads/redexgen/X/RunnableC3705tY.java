package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.tY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class RunnableC3705tY implements Runnable {
    public final /* synthetic */ C3706tZ A00;
    public final /* synthetic */ InterfaceC3707ta A01;

    public RunnableC3705tY(C3706tZ c3706tZ, InterfaceC3707ta interfaceC3707ta) {
        this.A00 = c3706tZ;
        this.A01 = interfaceC3707ta;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A01.ADv();
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
