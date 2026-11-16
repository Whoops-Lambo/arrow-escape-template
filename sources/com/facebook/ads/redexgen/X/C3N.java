package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3N, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C3N extends C3P {
    @Override // com.facebook.ads.redexgen.X.C2976ha
    public final C2993hs A07(View view, C2993hs c2993hs) {
        WindowInsets result = (WindowInsets) C2993hs.A01(c2993hs);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C2993hs.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C2976ha
    public final C2993hs A08(View view, C2993hs c2993hs) {
        WindowInsets result = (WindowInsets) C2993hs.A01(c2993hs);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C2993hs.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C2976ha
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.C2976ha
    public final void A0E(View view, InterfaceC2961hL interfaceC2961hL) {
        if (interfaceC2961hL == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC2975hZ(this, interfaceC2961hL));
        }
    }
}
