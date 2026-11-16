package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class BP extends RelativeLayout implements InterfaceC2760e3 {
    public C1896Be A00;

    public BP(C2055Hi c2055Hi) {
        super(c2055Hi);
    }

    public BP(C2055Hi c2055Hi, AttributeSet attributeSet, int i) {
        super(c2055Hi, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2760e3
    public final void ABd(C1896Be c1896Be) {
        this.A00 = c1896Be;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2760e3
    public final void ALp(C1896Be c1896Be) {
        A08();
        this.A00 = null;
    }

    public C1896Be getVideoView() {
        return this.A00;
    }
}
