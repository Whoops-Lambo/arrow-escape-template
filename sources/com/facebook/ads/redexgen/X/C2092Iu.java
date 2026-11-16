package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2092Iu implements InterfaceC3051iq {
    public static String[] A01 = {"IP6gXu3Aic9rrZpr", "DSm6OHbiM4aoMyjFh2wy7Spd3inn5axc", "lJd94ygIcpnkIi9oYNWqXg3HQV8t0X4Q", "337I3pVrWHOBtYrFGcdtPHZp8Kpz9VIJ", "vd5lczoeg9gY82TvyWngHoQKFpNC9gt0", "CefcuhKyPhUbDvzsvxPUhaoMgi2Xy5FO", "Qia1n7qQgpdEP2KZeQvga8Xzcvoo51Ij", "UfDKqgBAky8ekVpIbdpaQQPTuf6RISL4"};
    public final /* synthetic */ C7O A00;

    public C2092Iu(C7O c7o) {
        this.A00 = c7o;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3051iq
    public final void ADr(AbstractC3075jE abstractC3075jE) {
        abstractC3075jE.A0k(true);
        if (abstractC3075jE.A06 != null && abstractC3075jE.A07 == null) {
            abstractC3075jE.A06 = null;
        }
        abstractC3075jE.A07 = null;
        if (!abstractC3075jE.A0L() && !this.A00.A24(abstractC3075jE.A0H) && abstractC3075jE.A0p()) {
            C7O c7o = this.A00;
            if (A01[6].charAt(16) != 'e') {
                throw new RuntimeException();
            }
            A01[0] = "BbBTSQcWyeSpGVnm";
            c7o.removeDetachedView(abstractC3075jE.A0H, false);
        }
    }
}
