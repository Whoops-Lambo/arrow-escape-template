package com.facebook.ads.redexgen.X;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.If, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class RunnableC2078If implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ BinderC2086In A01;
    public final /* synthetic */ String A02;

    public RunnableC2078If(BinderC2086In binderC2086In, String str, Bundle bundle) {
        this.A01 = binderC2086In;
        this.A02 = str;
        this.A00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A01.A01.A07(this.A02, this.A00);
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
