package com.facebook.ads.redexgen.X;

import java.io.File;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class NO implements InterfaceC2712dG<File> {
    @Override // com.facebook.ads.redexgen.X.InterfaceC2712dG
    public final C2711dF<File> A4N(File file, InterfaceC2730dY interfaceC2730dY) {
        if (file.exists()) {
            return new C2711dF<>(true, file);
        }
        return new C2711dF<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2712dG
    public final void A5m(File file, InterfaceC2730dY interfaceC2730dY) {
    }
}
