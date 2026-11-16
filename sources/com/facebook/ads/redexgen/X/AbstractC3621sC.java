package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import com.facebook.ads.AdClosedListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.sC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC3621sC extends FrameLayout {
    public static String[] A0E = {"AAeZRN2H16PPhMJrfuA2G4PuGtT4Jjli", "OIhbSlqkB188ZcHiABYu6F5MkKYuApEU", "4dNIifo7dYPF8CZDUdmIVRVLxTf4KjLi", "nNT7Gm4j1GPvPSvjwdusJnzdrzE", "GlaPNPfWvOmZlDbzC", "MG9AH3sD678j7mtR5VZ1R1Wgg0cAPJ", "gwWnxwxKgg1hGV", "MUdeuAMc7brNflaDgveS0ucCfNh"};
    public int A00;
    public AdClosedListener A01;
    public EnumC2918gc A02;
    public C2919gd A03;
    public C2920ge A04;
    public InterfaceC3620sB A05;
    public final C2916ga A06;
    public final C2055Hi A07;
    public final InterfaceC3321nG A08;
    public final InterfaceC3556r9 A09;
    public final InterfaceC3557rA A0A;
    public final String A0B;
    public final C2853fZ A0C;
    public final InterfaceC3623sE A0D;

    public abstract void A0O();

    public abstract void A0P();

    public abstract void A0R(C2920ge c2920ge, EnumC2918gc enumC2918gc);

    public abstract boolean A0S();

    public AbstractC3621sC(C2055Hi c2055Hi, InterfaceC3321nG interfaceC3321nG, String str) {
        this(c2055Hi, interfaceC3321nG, str, null, null, null);
    }

    public AbstractC3621sC(C2055Hi c2055Hi, InterfaceC3321nG interfaceC3321nG, String str, C2853fZ c2853fZ, InterfaceC3557rA interfaceC3557rA, InterfaceC3556r9 interfaceC3556r9) {
        super(c2055Hi);
        this.A00 = 0;
        this.A02 = EnumC2918gc.A04;
        this.A04 = null;
        this.A0D = new FF(this);
        this.A07 = c2055Hi;
        this.A08 = interfaceC3321nG;
        this.A0A = interfaceC3557rA;
        this.A09 = interfaceC3556r9;
        this.A0B = str;
        this.A0C = c2853fZ;
        this.A06 = AbstractC2917gb.A00(this.A07.A02());
    }

    public static /* synthetic */ int A02(AbstractC3621sC abstractC3621sC) {
        int i = abstractC3621sC.A00;
        abstractC3621sC.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A03(AbstractC3621sC abstractC3621sC) {
        int i = abstractC3621sC.A00;
        abstractC3621sC.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A03 != null && this.A03.A0A()) {
            this.A08.ABo(this.A0B, this.A03.A02());
            this.A03.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        this.A04 = null;
        if (this.A03 != null) {
            this.A03.A05();
        }
        A0O();
        if (A0E[4].length() != 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[6] = "T97PvisYvRSslU";
        strArr[5] = "4m6IDlN75J4PWuz7VqWCz3A27IQvrs";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(C2920ge c2920ge) {
        if (this.A03 != null) {
            this.A03.A08(this.A02);
        }
        A0Q(c2920ge, this.A02);
        C2812eu.A01(this.A07).A0L();
        if (A0S()) {
            A0E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C2920ge c2920ge) {
        this.A04 = c2920ge;
        if (this.A03 != null) {
            this.A03.A09(this.A02, this.A00);
        }
        A0R(c2920ge, this.A02);
    }

    public final void A0M() {
        A0E();
    }

    public final void A0N() {
        this.A03 = new C2919gd(new C3329nO(this.A0B, this.A08));
        if (this.A0A != null) {
            this.A0A.AGF(true);
        }
        if (this.A05 != null) {
            this.A05.ADo();
        }
        A0F();
    }

    public void A0Q(C2920ge c2920ge, EnumC2918gc enumC2918gc) {
        if (this.A01 != null) {
            this.A07.A0F().ACJ();
            this.A01.onAdClosed();
        }
    }

    public void setAdReportingCallbackListener(InterfaceC3620sB interfaceC3620sB) {
        this.A05 = interfaceC3620sB;
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.A01 = adClosedListener;
    }
}
