package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C2136Ko implements InterfaceC3147kO {
    public static String[] A05 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ LA A00;
    public final /* synthetic */ InterfaceC2864fk A01;
    public final /* synthetic */ C2865fl A02;
    public final /* synthetic */ C2055Hi A03;
    public final /* synthetic */ boolean A04;

    public C2136Ko(C2865fl c2865fl, C2055Hi c2055Hi, boolean z, LA la, InterfaceC2864fk interfaceC2864fk) {
        this.A02 = c2865fl;
        this.A03 = c2055Hi;
        this.A04 = z;
        this.A00 = la;
        this.A01 = interfaceC2864fk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3147kO
    public final void ADt() {
        if (C3300mv.A1q(this.A03) && this.A04) {
            this.A02.A02.add(M1.A01(this.A03, this.A00, 1, new C2138Kq(this)));
            return;
        }
        InterfaceC2864fk interfaceC2864fk = this.A01;
        if (A05[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "X6BBoGIR5wPjpoFUlFYz";
        strArr[3] = "SlUPa0nBeexeGnx3tyWk";
        interfaceC2864fk.ADl();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3147kO
    public final void ADu() {
        this.A01.ADk(AdError.CACHE_ERROR);
    }
}
