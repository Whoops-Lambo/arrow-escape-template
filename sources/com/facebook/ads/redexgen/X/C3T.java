package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3T extends C17213u {
    public C17966r A00;
    public List<C3411ol> A01;

    public C3T(C2055Hi c2055Hi) {
        super(c2055Hi);
        this.A00 = new C17966r(this, 1, null, null, null);
    }

    public final void A27(C2636c2 c2636c2) {
        if (this.A00 != null) {
            this.A00.A0o(c2636c2);
        }
    }

    public C17966r getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0k(this.A01);
    }
}
