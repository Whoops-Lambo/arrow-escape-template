package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class HS implements InterfaceC3406og {
    @Override // com.facebook.ads.redexgen.X.InterfaceC3406og
    public final void AJr(Throwable th, Object obj) {
        if (obj instanceof InterfaceC3188l6) {
            C2055Hi adContext = ((InterfaceC3188l6) obj).A7M();
            if (adContext != null) {
                adContext.A0Q(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C2055Hi)) {
            return;
        }
        ((C2055Hi) context).A0Q(th);
    }
}
