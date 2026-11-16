package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class IV implements InterfaceC3556r9 {
    public final WeakReference<C3095jY> A00;

    public IV(C3095jY c3095jY) {
        this.A00 = new WeakReference<>(c3095jY);
    }

    private void A00(C3095jY c3095jY) {
        C3005i4 c3005i4A07 = c3095jY.A07();
        if (c3005i4A07 != null && c3095jY.A04() != null) {
            c3095jY.A04().bringChildToFront(c3005i4A07);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3556r9
    public void A4U(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        C3095jY c3095jY = this.A00.get();
        if (c3095jY != null && c3095jY.A04() != null) {
            c3095jY.A04().addView(view, i, layoutParams);
            A00(c3095jY);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3556r9
    public void A4V(View view, RelativeLayout.LayoutParams layoutParams) {
        C3095jY c3095jY = this.A00.get();
        if (c3095jY != null && c3095jY.A04() != null) {
            c3095jY.A04().addView(view, layoutParams);
            A00(c3095jY);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3556r9
    public void A5C(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0C(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3556r9
    public void A5D(String str, C3267mO c3267mO) {
        if (this.A00.get() != null) {
            this.A00.get().A0E(str, c3267mO);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3556r9
    public void ABW(String str, C2853fZ c2853fZ) {
        if (this.A00.get() != null) {
            this.A00.get().A0D(str, c2853fZ);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3556r9
    public void AEH(int i) {
        C3095jY activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i);
        }
    }
}
