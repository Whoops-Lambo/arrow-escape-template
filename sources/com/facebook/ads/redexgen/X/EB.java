package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class EB implements InterfaceC3714th {
    public final WeakReference<C6V> A00;

    public EB(C6V c6v) {
        this.A00 = new WeakReference<>(c6v);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3714th
    public final void AFA(C3713tg c3713tg) {
        C6V c6v = this.A00.get();
        if (c6v != null) {
            c6v.A06 = c3713tg.A00() != null;
            c6v.A02();
        }
    }
}
