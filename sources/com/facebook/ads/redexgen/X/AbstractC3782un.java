package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public abstract class AbstractC3782un extends RelativeLayout {
    public static final int A09 = AbstractC3480pv.A0e;
    public static final int A0A = (int) (AbstractC3482px.A02 * 28.0f);
    public static final int A0B = (int) (AbstractC3482px.A02 * 32.0f);
    public C2841fN A00;
    public InterfaceC3781um A01;
    public boolean A02;
    public C3663ss A03;
    public final C2055Hi A04;
    public final InterfaceC3321nG A05;
    public final ViewOnClickListenerC1981El A06;
    public final C3764uV A07;
    public final C3786ur A08;

    public abstract boolean A1g();

    public AbstractC3782un(C3786ur c3786ur, boolean z) {
        C2841fN c2841fNA00;
        super(c3786ur.A06());
        this.A08 = c3786ur;
        this.A04 = c3786ur.A06();
        this.A05 = c3786ur.A07();
        if (c3786ur.A00() == 1) {
            c2841fNA00 = c3786ur.A05().A31().A01();
        } else {
            c2841fNA00 = c3786ur.A05().A31().A00();
        }
        this.A00 = c2841fNA00;
        this.A02 = z;
        this.A06 = new ViewOnClickListenerC1981El(c3786ur.A06(), c3786ur.A05(), this.A00, c3786ur.A07(), c3786ur.A0C(), c3786ur.A0F(), c3786ur.A0A(), c3786ur.A09());
        this.A06.setRoundedCornersEnabled(A03());
        this.A06.setViewShowsOverMedia(A0H());
        this.A06.setV2Design(A05());
        AbstractC3523qc.A0H(1001, this.A06);
        this.A07 = new C3764uV(this.A04, this.A00, this.A02, A04(), A0A());
        AbstractC3523qc.A0L(this.A07);
    }

    public final C3663ss A00(C2055Hi c2055Hi, LA la, C3329nO c3329nO, EnumC3666sv enumC3666sv, InterfaceC3556r9 interfaceC3556r9) {
        this.A03 = AbstractC3668sx.A01(c2055Hi, true, la, c3329nO, interfaceC3556r9, enumC3666sv, AbstractC3665su.A00(la));
        AbstractC3523qc.A0L(this.A03);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (la.A3S()) {
            layoutParams.setMargins(AbstractC3480pv.A0e, AbstractC3480pv.A0u, 0, 0);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else {
            layoutParams.setMargins(AbstractC3480pv.A0e, 0, 0, AbstractC3480pv.A0e);
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
        this.A03.setLayoutParams(layoutParams);
        return this.A03;
    }

    public final C3667sw A01(C2055Hi c2055Hi, EnumC3666sv enumC3666sv) {
        C3667sw c3667swA02 = AbstractC3668sx.A02(c2055Hi, enumC3666sv, this.A08.A05());
        AbstractC3523qc.A0L(c3667swA02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(AbstractC3480pv.A0e, 0, 0, AbstractC3480pv.A0e);
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        c3667swA02.setLayoutParams(layoutParams);
        return c3667swA02;
    }

    public final void A02(InterfaceC3740u7 interfaceC3740u7) {
        getCtaButton().A0H(interfaceC3740u7);
    }

    public boolean A03() {
        return true;
    }

    public boolean A04() {
        return true;
    }

    public final boolean A05() {
        if (this.A08.A05().A32().A0I().A07() == null) {
            return this.A08.A05().A2o() || this.A08.A05().A2q();
        }
        return this.A08.A05().A2Z();
    }

    public boolean A0A() {
        return true;
    }

    public boolean A0H() {
        return true;
    }

    public EnumC2795ec A1P(String str) {
        return getCtaButton().A0E(str);
    }

    public void A1Q() {
        if (this.A03 != null) {
            this.A03.A0O();
        }
    }

    public void A1R() {
    }

    public void A1S() {
    }

    public void A1T() {
    }

    public void A1U() {
    }

    public void A1V() {
    }

    public void A1W(int i) {
    }

    public void A1X(C2832fE c2832fE, String str, double d, Bundle bundle) {
        this.A07.A04(c2832fE.A0J().A0G(), c2832fE.A0J().A04(), null, false, !A1g() && d > 0.0d && d < 1.0d);
        this.A06.setCta(c2832fE.A0K(), str, new HashMap());
    }

    public void A1Y(C5Y c5y) {
    }

    public void A1Z(BD bd) {
    }

    public void A1a(C5V c5v, int i) {
    }

    public void A1b(boolean z) {
        if (!z && this.A03 != null) {
            this.A03.A0P();
        }
    }

    public void A1c(boolean z) {
    }

    public boolean A1d() {
        return false;
    }

    public boolean A1e() {
        return true;
    }

    public boolean A1f() {
        return false;
    }

    public boolean A1h(int i, int i2, Intent intent) {
        return false;
    }

    public boolean A1i(boolean z) {
        return false;
    }

    public C2055Hi getAdContextWrapper() {
        return this.A04;
    }

    public InterfaceC3321nG getAdEventManager() {
        return this.A05;
    }

    public int getCloseButtonStyle() {
        return 0;
    }

    public C2841fN getColors() {
        return this.A00;
    }

    public ViewOnClickListenerC1981El getCtaButton() {
        return this.A06;
    }

    public InterfaceC3781um getNtdHideCallback() {
        return this.A01;
    }

    public C3764uV getTitleDescContainer() {
        return this.A07;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C2841fN c2841fNA00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            c2841fNA00 = this.A08.A05().A31().A01();
        } else {
            c2841fNA00 = this.A08.A05().A31().A00();
        }
        this.A00 = c2841fNA00;
        this.A06.setViewShowsOverMedia(A0H());
        this.A06.setUpButtonColors(this.A00);
        this.A07.A03(this.A00, this.A02);
    }

    public void setAccidentalClickCappingListener(InterfaceC2796ed interfaceC2796ed) {
        getCtaButton().getCtaActionHelper().A09(interfaceC2796ed);
    }

    public void setChainedWatchAndBrowseSkippableStatus(boolean z) {
    }

    public void setNtdHideCallback(InterfaceC3781um interfaceC3781um) {
        this.A01 = interfaceC3781um;
    }
}
