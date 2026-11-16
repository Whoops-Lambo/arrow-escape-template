package com.facebook.ads.redexgen.X;

import java.util.Set;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class H3 implements InterfaceC16962t<C3307n2, C3312n7> {
    public H0 A00;

    @Override // com.facebook.ads.redexgen.X.InterfaceC16962t
    public final /* synthetic */ Set A4a() {
        return AbstractC16982v.A00(this);
    }

    public H3(H0 h0) {
        this.A00 = h0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2l != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC16962t
    public final void A70(C16882l<C3307n2, C3312n7> c16882l, C2Z c2z) {
        switch (c2z.AA7(c16882l)) {
            case A03:
            case A05:
                this.A00.A02(c16882l, c2z);
                break;
        }
    }
}
