package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.It, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2091It implements InterfaceC3078jH {
    public final /* synthetic */ AbstractC3057iw A00;

    public C2091It(AbstractC3057iw abstractC3057iw) {
        this.A00 = abstractC3057iw;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3078jH
    public final View A7s(int i) {
        return this.A00.A20(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3078jH
    public final int A7u(View view) {
        return this.A00.A1m(view) + ((C3058ix) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3078jH
    public final int A7v(View view) {
        return this.A00.A1j(view) - ((C3058ix) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3078jH
    public final int A9J() {
        return this.A00.A1e() - this.A00.A1c();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3078jH
    public final int A9K() {
        return this.A00.A1b();
    }
}
