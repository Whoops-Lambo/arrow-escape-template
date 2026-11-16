package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class M9 implements InterfaceC3147kO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C18227r A01;
    public final /* synthetic */ C18227r A02;
    public final /* synthetic */ C3243lz A03;

    public M9(C18227r c18227r, int i, C3243lz c3243lz, C18227r c18227r2) {
        this.A01 = c18227r;
        this.A00 = i;
        this.A03 = c3243lz;
        this.A02 = c18227r2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3147kO
    public final void ADt() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3147kO
    public final void ADu() {
        this.A01.A00.AFQ(this.A02, C3359nt.A00(AdErrorType.NO_FILL));
    }
}
