package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C1993Ex extends AbstractRunnableC3416oq {
    public final WeakReference<C2636c2> A00;

    public C1993Ex(C2636c2 c2636c2) {
        this.A00 = new WeakReference<>(c2636c2);
    }

    public C1993Ex(WeakReference<C2636c2> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC3416oq
    public final void A07() {
        C2636c2 viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
