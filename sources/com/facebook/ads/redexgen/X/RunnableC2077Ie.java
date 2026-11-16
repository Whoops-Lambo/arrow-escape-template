package com.facebook.ads.redexgen.X;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class RunnableC2077Ie implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ BinderC2086In A02;

    public RunnableC2077Ie(BinderC2086In binderC2086In, int i, Bundle bundle) {
        this.A02 = binderC2086In;
        this.A00 = i;
        this.A01 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A02.A01.A0A(this.A00, this.A01);
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
