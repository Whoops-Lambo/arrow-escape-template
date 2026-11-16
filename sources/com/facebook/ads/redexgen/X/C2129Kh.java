package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2129Kh implements InterfaceC3175kr {
    public static String[] A05 = {"udExhBBZigXHD765", "VCbgsgLtwNII3DWSf3Df", "sJ3cSki5Ts1gkpIy0", "hudoenMQ7OfQJqKUwYviTAHkC5956B", "3GiDDKpH2PPu7", "VAV0OzmNbR17K1ZAu", "eIBPlY8UdwZIA15YBWaPzTw3Re1i6Niv", "w6ShnqqW6c5InpRu2fdQvGfdyx0XiT7r"};
    public final /* synthetic */ LA A00;
    public final /* synthetic */ InterfaceC2864fk A01;
    public final /* synthetic */ C2865fl A02;
    public final /* synthetic */ C2055Hi A03;
    public final /* synthetic */ boolean A04;

    public C2129Kh(C2865fl c2865fl, C2055Hi c2055Hi, boolean z, LA la, InterfaceC2864fk interfaceC2864fk) {
        this.A02 = c2865fl;
        this.A03 = c2055Hi;
        this.A04 = z;
        this.A00 = la;
        this.A01 = interfaceC2864fk;
    }

    private void A00(boolean z) {
        if (z) {
            C2055Hi c2055Hi = this.A03;
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ua1Hqbcww3qJrVJ6O";
            strArr2[2] = "2U70GzBDbPON7gkn8";
            if (C3300mv.A1q(c2055Hi) && this.A04) {
                this.A02.A02.add(M1.A01(this.A03, this.A00, 1, new C2133Kl(this)));
                return;
            } else {
                this.A01.ADl();
                return;
            }
        }
        this.A01.ADk(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3175kr
    public final void AEJ() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3175kr
    public final void AEU() {
        A00(true);
    }
}
