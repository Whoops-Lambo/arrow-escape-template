package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class FC extends AbstractC3621sC {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2916ga A03;
    public final C2055Hi A04;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{53, 22, 20, 28, 105, 70, 69, 89, 79, 10, 107, 78, 10, 120, 79, 90, 69, 88, 94, 67, 68, 77};
    }

    static {
        A01();
        A08 = (int) (AbstractC3482px.A02 * 8.0f);
        A07 = (int) (AbstractC3482px.A02 * 10.0f);
        A06 = (int) (AbstractC3482px.A02 * 44.0f);
    }

    public FC(C2055Hi c2055Hi, InterfaceC3321nG interfaceC3321nG, String str) {
        super(c2055Hi, interfaceC3321nG, str);
        this.A04 = c2055Hi;
        this.A03 = AbstractC2917gb.A00(this.A04.A02());
        this.A00 = new ImageView(getContext());
        this.A00.setPadding(A07, A07, A07, A07);
        this.A00.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A06, A06);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        AbstractC3523qc.A0O(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        this.A01.setPadding(A08, A08, A08, A08);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3621sC
    public final void A0O() {
        this.A00.setImageBitmap(AbstractC3535qo.A01(EnumC3534qn.CROSS));
        this.A00.setOnClickListener(new ViewOnClickListenerC3640sV(this));
        this.A00.setContentDescription(A00(4, 18, 29));
        C3625sG c3625sG = new C3625sG(this.A04);
        c3625sG.setData(this.A03.A0H(), EnumC3534qn.HIDE_AD);
        c3625sG.setOnClickListener(new ViewOnClickListenerC3641sW(this, c3625sG));
        C3625sG c3625sG2 = new C3625sG(this.A04);
        c3625sG2.setData(this.A03.A0L(), EnumC3534qn.REPORT_AD);
        c3625sG2.setOnClickListener(new ViewOnClickListenerC3642sX(this, c3625sG2));
        C3625sG c3625sG3 = new C3625sG(this.A04);
        c3625sG3.setData(this.A03.A0M(), EnumC3534qn.AD_CHOICES_ICON);
        c3625sG3.setOnClickListener(new ViewOnClickListenerC3643sY(this, c3625sG3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        menuParams.setMargins(A08, A08, A08, A08);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        AbstractC3523qc.A0X(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(c3625sG, menuParams);
        linearLayout.addView(c3625sG2, menuParams);
        linearLayout.addView(c3625sG3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3621sC
    public final void A0P() {
        AbstractC3523qc.A0J(this);
        AbstractC3523qc.A0K(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3621sC
    public final void A0Q(C2920ge c2920ge, EnumC2918gc enumC2918gc) {
        String strA0H;
        EnumC3534qn enumC3534qn;
        int i;
        this.A00.setOnClickListener(null);
        if (enumC2918gc == EnumC2918gc.A05) {
            strA0H = this.A03.A0F();
            enumC3534qn = EnumC3534qn.REPORT_AD;
            i = -552389;
        } else {
            strA0H = this.A03.A0H();
            enumC3534qn = EnumC3534qn.HIDE_AD;
            i = -13272859;
        }
        C3618s9 c3618s9A0H = new C3618s9(this.A04, this.A0D).A0H(strA0H);
        String title = this.A03.A0D();
        C3618s9 c3618s9A0G = c3618s9A0H.A0G(title);
        String title2 = c2920ge.A04();
        C3619sA adHiddenView = c3618s9A0G.A0E(title2).A0J(false).A0D(enumC3534qn).A0C(i).A0K(false).A0I(false).A0L();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        AbstractC3523qc.A0X(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
        super.A0Q(c2920ge, enumC2918gc);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3621sC
    public final void A0R(C2920ge c2920ge, EnumC2918gc enumC2918gc) {
        boolean isReportFlow = enumC2918gc == EnumC2918gc.A05;
        C3639sU c3639sU = new C3639sU(this.A04, c2920ge, this.A0D, isReportFlow ? EnumC3534qn.REPORT_AD : EnumC3534qn.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(AbstractC3535qo.A01(EnumC3534qn.BACK_ARROW));
        this.A00.setOnClickListener(new ViewOnClickListenerC3644sZ(this));
        this.A00.setContentDescription(A00(0, 4, 64));
        AbstractC3523qc.A0X(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c3639sU, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3621sC
    public final boolean A0S() {
        return true;
    }
}
