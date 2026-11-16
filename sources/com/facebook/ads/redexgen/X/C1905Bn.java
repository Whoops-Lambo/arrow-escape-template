package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C1905Bn implements InterfaceC2541aV {
    public static String[] A01 = {"uB1RC", "E7rLPB8klTW5J9FjuULp7NzB4AWE19Zm", "BGfRoGqubHgomR1aknLAm7BQoVqY9Rjo", "2aqRDajB7mkFiu8JUeuEjEkcXKsGj4gd", "YPIu8FWl8tmTV", "O2dNNTCX3dr0fdBVB7HhwqWACslxe6aK", "WKmspm9NaQlidgYEldSczPSkp8W1cJlS", "CDbKVWoo3Luj5aOlcVCk0HC1kDrFWNgV"};
    public final /* synthetic */ C2911gV A00;

    public C1905Bn(C2911gV c2911gV) {
        this.A00 = c2911gV;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2541aV
    public final void AIN() {
        if (this.A00.A02 != null) {
            C2911gV c2911gV = this.A00;
            if (A01[3].charAt(8) == 'm') {
                throw new RuntimeException();
            }
            A01[3] = "G62o5XZ8JRlbj2NUyH9KkdSeUCUXeXTA";
            c2911gV.A02.A5C(this.A00.A03.A9h());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2541aV
    public final void AIP(C2537aR c2537aR) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c2537aR == null || !c2537aR.A00()) {
            this.A00.A01.A0F().ACk();
            this.A00.A02.A5C(this.A00.A03.A9h());
            return;
        }
        this.A00.A01.A0F().ACl();
        C2911gV c2911gV = this.A00;
        if (A01[5].length() == 14) {
            throw new RuntimeException();
        }
        A01[1] = "MYgqySdSEunU6EGhIZ8lv2VKjJmAUpiH";
        c2911gV.A02.A5C(this.A00.A03.A9i());
    }
}
