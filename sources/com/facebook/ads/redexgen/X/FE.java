package com.facebook.ads.redexgen.X;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class FE extends AbstractC3621sC {
    public static final int A03 = (int) (AbstractC3482px.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C2916ga A01;
    public final C2055Hi A02;

    public FE(C2055Hi c2055Hi, InterfaceC3321nG interfaceC3321nG, String str, C2853fZ c2853fZ, InterfaceC3557rA interfaceC3557rA, InterfaceC3556r9 interfaceC3556r9) {
        super(c2055Hi, interfaceC3321nG, str, c2853fZ, interfaceC3557rA, interfaceC3556r9);
        this.A02 = c2055Hi;
        this.A01 = AbstractC2917gb.A00(c2055Hi.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC3523qc.A0O(this.A00, -1728053248);
        if (C3300mv.A2d(c2055Hi)) {
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.sH
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A0T(view);
                }
            });
        }
    }

    public static RelativeLayout.LayoutParams A00(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3621sC
    public final void A0O() {
        C2920ge c2920geA0A = this.A01.A0A();
        C3636sR c3636sR = new C3636sR(this.A02);
        AbstractC3523qc.A0H(1119, c3636sR);
        c3636sR.setInfo(EnumC3534qn.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c3636sR.setOnClickListener(new ViewOnClickListenerC3627sI(this));
        C2920ge c2920geA0B = this.A01.A0B();
        C3636sR c3636sR2 = new C3636sR(this.A02);
        AbstractC3523qc.A0H(1120, c3636sR2);
        c3636sR2.setInfo(EnumC3534qn.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c3636sR2.setOnClickListener(new ViewOnClickListenerC3628sJ(this));
        C3636sR c3636sR3 = new C3636sR(this.A02);
        AbstractC3523qc.A0H(1121, c3636sR3);
        c3636sR3.setInfo(EnumC3534qn.AD_CHOICES_ICON, this.A01.A0M(), "");
        c3636sR3.setOnClickListener(new ViewOnClickListenerC3629sK(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A03 * 2, A03, A03 * 2, A03);
        AbstractC3523qc.A0O(linearLayout, -1);
        if (!c2920geA0A.A05().isEmpty()) {
            linearLayout.addView(c3636sR, itemParams);
        }
        if (!c2920geA0B.A05().isEmpty()) {
            linearLayout.addView(c3636sR2, itemParams);
        }
        linearLayout.addView(c3636sR3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3621sC
    public final void A0P() {
        this.A00.removeAllViews();
        AbstractC3523qc.A0K(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3621sC
    public final void A0Q(C2920ge c2920ge, EnumC2918gc enumC2918gc) {
        String strA0E;
        int i;
        if (enumC2918gc == EnumC2918gc.A04) {
            return;
        }
        boolean z = enumC2918gc == EnumC2918gc.A05;
        C3618s9 c3618s9 = new C3618s9(this.A02, this.A0D);
        if (z) {
            strA0E = this.A01.A0F();
        } else {
            strA0E = this.A01.A0E();
        }
        C3618s9 c3618s9A0D = c3618s9.A0H(strA0E).A0G(this.A01.A0D()).A0E(c2920ge.A04()).A0D(z ? EnumC3534qn.REPORT_AD : EnumC3534qn.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        C3619sA adHiddenView = c3618s9A0D.A0C(i).A0F(this.A0C != null ? this.A0C.A01() : "").A0L();
        AbstractC3523qc.A0O(adHiddenView, -1);
        AbstractC3523qc.A0X(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
        super.A0Q(c2920ge, enumC2918gc);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3621sC
    public final void A0R(C2920ge c2920ge, EnumC2918gc enumC2918gc) {
        String strA0H;
        boolean z = enumC2918gc == EnumC2918gc.A05;
        C2055Hi c2055Hi = this.A02;
        InterfaceC3623sE interfaceC3623sE = this.A0D;
        if (z) {
            strA0H = this.A01.A0L();
        } else {
            strA0H = this.A01.A0H();
        }
        C3639sU c3639sU = new C3639sU(c2055Hi, c2920ge, interfaceC3623sE, strA0H, z ? EnumC3534qn.REPORT_AD : EnumC3534qn.HIDE_AD);
        c3639sU.setClickable(true);
        AbstractC3523qc.A0O(c3639sU, -1);
        c3639sU.setPadding(A03 * 2, A03, A03 * 2, A03);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(c3639sU, A00(false));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3621sC
    public final boolean A0S() {
        return false;
    }

    public final /* synthetic */ void A0T(View view) {
        this.A0D.A5d();
    }
}
