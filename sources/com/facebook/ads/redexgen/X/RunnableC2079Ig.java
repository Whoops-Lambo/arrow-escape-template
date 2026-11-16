package com.facebook.ads.redexgen.X;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class RunnableC2079Ig implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ BinderC2086In A01;

    public RunnableC2079Ig(BinderC2086In binderC2086In, Bundle bundle) {
        this.A01 = binderC2086In;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A01.A01.A03(this.A00);
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
