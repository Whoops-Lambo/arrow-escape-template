package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C7 implements InterfaceC3714th {
    public final WeakReference<AbstractC17605h> A00;

    public C7(AbstractC17605h abstractC17605h) {
        this.A00 = new WeakReference<>(abstractC17605h);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3714th
    public final void AFA(C3713tg c3713tg) {
        AbstractC17605h cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A1r();
        }
    }
}
