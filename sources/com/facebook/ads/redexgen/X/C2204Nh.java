package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2204Nh implements InterfaceC2690cu {
    public final C2180Mj A00 = new C2180Mj(new byte[4]);
    public final /* synthetic */ C2202Nf A01;

    public C2204Nh(C2202Nf c2202Nf) {
        this.A01 = c2202Nf;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2690cu
    public final void A5j(C2181Mk c2181Mk) {
        int tableId = c2181Mk.A0I();
        if (tableId != 0) {
            return;
        }
        int tableId2 = c2181Mk.A0I();
        if ((tableId2 & 128) == 0) {
            return;
        }
        c2181Mk.A0g(6);
        int iA07 = c2181Mk.A07() / 4;
        for (int i = 0; i < iA07; i++) {
            c2181Mk.A0h(this.A00, 4);
            int programCount = this.A00.A04(16);
            this.A00.A09(3);
            if (programCount == 0) {
                this.A00.A09(13);
            } else {
                int iA04 = this.A00.A04(13);
                if (this.A01.A0B.get(iA04) == null) {
                    this.A01.A0B.put(iA04, new C2219Nw(new C2203Ng(this.A01, iA04)));
                    C2202Nf.A02(this.A01);
                }
            }
        }
        int secondHeaderByte = this.A01.A09;
        if (secondHeaderByte != 2) {
            this.A01.A0B.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2690cu
    public final void AAo(C2189Ms c2189Ms, InterfaceC2481Yw interfaceC2481Yw, C2698d2 c2698d2) {
    }
}
