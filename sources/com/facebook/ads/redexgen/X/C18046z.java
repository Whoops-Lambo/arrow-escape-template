package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C18046z extends BK {
    public final /* synthetic */ C18036y A00;

    public C18046z(C18036y c18036y) {
        this.A00 = c18036y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC3269mQ
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(BL bl) {
        new Handler(Looper.getMainLooper()).post(new RunnableC3573rQ(this));
    }
}
