package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7E, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C7E extends IV {
    public C7E(C3095jY c3095jY) {
        super(c3095jY);
    }

    @Override // com.facebook.ads.redexgen.X.IV, com.facebook.ads.redexgen.X.InterfaceC3556r9
    public final /* bridge */ /* synthetic */ void A4U(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        super.A4U(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.IV, com.facebook.ads.redexgen.X.InterfaceC3556r9
    public final /* bridge */ /* synthetic */ void A4V(View view, RelativeLayout.LayoutParams layoutParams) {
        super.A4V(view, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.IV, com.facebook.ads.redexgen.X.InterfaceC3556r9
    public final void A5C(String str) {
        super.A5C(str);
        if (this.A00.get() == null) {
            return;
        }
        String strA03 = EnumC2755dy.A08.A03();
        String rewardedVideoError = EnumC2755dy.A09.A03();
        if (str.equals(strA03)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.X.IV, com.facebook.ads.redexgen.X.InterfaceC3556r9
    public final /* bridge */ /* synthetic */ void A5D(String str, C3267mO c3267mO) {
        super.A5D(str, c3267mO);
    }

    @Override // com.facebook.ads.redexgen.X.IV, com.facebook.ads.redexgen.X.InterfaceC3556r9
    public final /* bridge */ /* synthetic */ void ABW(String str, C2853fZ c2853fZ) {
        super.ABW(str, c2853fZ);
    }

    @Override // com.facebook.ads.redexgen.X.IV, com.facebook.ads.redexgen.X.InterfaceC3556r9
    public final /* bridge */ /* synthetic */ void AEH(int i) {
        super.AEH(i);
    }
}
