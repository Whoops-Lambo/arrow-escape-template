package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2017Fw implements InterfaceC3101je {
    public final /* synthetic */ C2014Ft A00;

    public C2017Fw(C2014Ft c2014Ft) {
        this.A00 = c2014Ft;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3101je
    public final boolean AAw() {
        if (this.A00.A0G.canGoBack()) {
            this.A00.A0G.goBack();
            return true;
        }
        return false;
    }
}
