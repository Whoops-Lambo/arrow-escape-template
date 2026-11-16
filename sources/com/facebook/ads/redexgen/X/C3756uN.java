package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.uN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3756uN extends FrameLayout {
    public static String[] A08 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    public AbstractC3549r2 A00;
    public C3579rW A01;
    public final LA A02;
    public final C2055Hi A03;
    public final InterfaceC3556r9 A04;
    public final InterfaceC3755uM A05;
    public final C1896Be A06;
    public final List<View> A07;

    public C3756uN(C2055Hi c2055Hi, AbstractC3549r2 abstractC3549r2, LA la, C1896Be c1896Be, InterfaceC3556r9 interfaceC3556r9, InterfaceC3755uM interfaceC3755uM, View... viewArr) {
        super(c2055Hi);
        this.A07 = new ArrayList();
        this.A03 = c2055Hi;
        this.A00 = abstractC3549r2;
        this.A02 = la;
        for (View view : viewArr) {
            if (view != null) {
                this.A07.add(view);
            }
        }
        this.A04 = interfaceC3556r9;
        this.A06 = c1896Be;
        this.A05 = interfaceC3755uM;
        A04();
    }

    public C3756uN(C3786ur c3786ur, LA la, C1896Be c1896Be, C1878Am c1878Am, AbstractC3721to abstractC3721to, InterfaceC3556r9 interfaceC3556r9, InterfaceC3755uM interfaceC3755uM) {
        this(c3786ur, la, c1896Be, interfaceC3556r9, interfaceC3755uM, c1878Am, abstractC3721to);
    }

    public C3756uN(C3786ur c3786ur, LA la, C1896Be c1896Be, InterfaceC3556r9 interfaceC3556r9, InterfaceC3755uM interfaceC3755uM, View... viewArr) {
        this(c3786ur.A06(), c3786ur.A0B(), la, c1896Be, interfaceC3556r9, interfaceC3755uM, viewArr);
    }

    private void A04() {
        String strA06;
        RewardData rewardDataA1R = this.A02.A1R();
        if (rewardDataA1R == null) {
            strA06 = this.A02.A34().A05();
        } else {
            strA06 = this.A02.A34().A06(rewardDataA1R.getCurrency(), rewardDataA1R.getQuantity());
        }
        this.A01 = new C3579rW(this.A03, -1, -16777216, strA06, null, this.A02.A34().A04(), this.A02.A34().A03(), AbstractC3535qo.A01(EnumC3534qn.REWARD_ICON));
        this.A01.A02.setOnClickListener(new ViewOnClickListenerC3753uK(this));
        this.A01.A01.setOnClickListener(new ViewOnClickListenerC3754uL(this));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A01, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A06 != null) {
            this.A06.A0e(EnumC2815ex.A08);
        }
        this.A05.ADp();
        if (!this.A02.A32().A0W()) {
            this.A02.A3A(this.A04);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        if (this.A06 != null && !this.A06.A0p()) {
            this.A06.A0k(false, false, 11);
            AbstractC3523qc.A0P(this.A06, 4);
        }
        AbstractC3549r2 abstractC3549r2 = this.A00;
        String[] strArr = A08;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A08[0] = "vGH3jzSu";
        if (abstractC3549r2 != null) {
            AbstractC3523qc.A0I(this.A00);
        }
        for (View view : this.A07) {
            view.clearAnimation();
            AbstractC3523qc.A0P(view, 4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A05.AFr();
    }
}
