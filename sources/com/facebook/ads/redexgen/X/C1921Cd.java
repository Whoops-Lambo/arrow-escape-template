package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C1921Cd implements InterfaceC3848vr {
    public final /* synthetic */ C1920Cc A00;

    public C1921Cd(C1920Cc c1920Cc) {
        this.A00 = c1920Cc;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3848vr
    public final void AHg(View view) {
        if (this.A00.A0G) {
            this.A00.A0E = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3848vr
    public final void AHi(View view) {
        ED ed = (ED) view;
        ed.A1m();
        if (this.A00.A0G) {
            this.A00.A0E = true;
        }
        if (this.A00.A0B.A0Z() && ((Integer) ed.getTag(-1593835536)).intValue() == 0) {
            this.A00.A0B.A0U();
        }
    }
}
