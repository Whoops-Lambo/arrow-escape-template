package com.facebook.ads.redexgen.X;

import com.facebook.ads.androidx.media3.common.Timeline;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC2420Wi {
    public InterfaceC2419Wh A00;
    public InterfaceC2430Ws A01;

    public abstract boolean A0Y();

    public abstract C2421Wj A0b(InterfaceC2250Pe[] interfaceC2250PeArr, RY ry, C2299Rk c2299Rk, Timeline timeline) throws AnonymousClass96;

    public abstract void A0c(Object obj);

    public final InterfaceC2430Ws A00() {
        return (InterfaceC2430Ws) AbstractC2159Ln.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AHM();
        }
    }

    public final void A02(InterfaceC2419Wh interfaceC2419Wh, InterfaceC2430Ws interfaceC2430Ws) {
        this.A00 = interfaceC2419Wh;
        this.A01 = interfaceC2430Ws;
    }
}
