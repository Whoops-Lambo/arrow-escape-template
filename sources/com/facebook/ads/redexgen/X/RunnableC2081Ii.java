package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class RunnableC2081Ii implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ Bundle A02;
    public final /* synthetic */ BinderC2086In A03;
    public final /* synthetic */ boolean A04;

    public RunnableC2081Ii(BinderC2086In binderC2086In, int i, Uri uri, boolean z, Bundle bundle) {
        this.A03 = binderC2086In;
        this.A00 = i;
        this.A01 = uri;
        this.A04 = z;
        this.A02 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A03.A01.A02(this.A00, this.A01, this.A04, this.A02);
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
