package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C18036y extends AbstractC1999Fd {
    public static String[] A0F = {"Wig1hLPkKRVxVmj3WWn5TJs0oa9CPoof", "nXJy7w8xrBopQigqFpns", "L9zf6W9Mlj7Zg9Gn", "g2eJG", "3uE", "W6oSc", "Ua6HLBUtKyHuD7Z", "bgivUb39KQdrYsEepiJJw5K7MLLYT62o"};
    public C5Z A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final ViewGroup A04;
    public final C3183kz A05;
    public final InterfaceC3321nG A06;
    public final C1896Be A07;
    public final BM A08;
    public final BK A09;
    public final C1887Av A0A;
    public final ViewOnClickListenerC1884As A0B;
    public final C1883Ar A0C;
    public final AbstractC2637c3 A0D;
    public final C2636c2 A0E;

    public C18036y(C2055Hi c2055Hi, InterfaceC3321nG interfaceC3321nG, C3183kz c3183kz, C3329nO c3329nO, View.OnClickListener onClickListener, LA la) {
        super(c2055Hi, onClickListener, c3329nO, la);
        this.A03 = false;
        this.A02 = false;
        this.A08 = new BM() { // from class: com.facebook.ads.redexgen.X.70
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC3269mQ
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C5Y c5y) {
                if (C3300mv.A1T(((AbstractC1999Fd) this.A00).A08)) {
                    this.A00.A07.A0f(EnumC2761e4.A03, 30);
                }
            }
        };
        this.A09 = new C18046z(this);
        this.A06 = interfaceC3321nG;
        this.A05 = c3183kz;
        this.A0D = A00();
        this.A0E = A07();
        this.A04 = new FrameLayout(c2055Hi);
        addView(this.A04, new RelativeLayout.LayoutParams(-1, -1));
        this.A07 = A01(c3329nO);
        this.A0B = A04();
        this.A0A = A03();
        this.A0C = A06(c3329nO);
        AbstractC3523qc.A0L(this.A0C);
        A0G();
    }

    private C1998Fc A00() {
        return new C1998Fc(this);
    }

    private C1896Be A01(C3329nO c3329nO) {
        C1896Be c1896Be = new C1896Be(super.A08);
        AbstractC3523qc.A0L(c1896Be);
        c1896Be.setFunnelLoggingHandler(c3329nO);
        c1896Be.getEventBus().A03(this.A08, this.A09);
        if (C3300mv.A1V(super.A08)) {
            c1896Be.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        boolean zA1Q = C3300mv.A1Q(super.A08);
        if (A0F[4].length() != 3) {
            throw new RuntimeException();
        }
        A0F[5] = "REocw";
        if (!zA1Q) {
            c1896Be.setOnClickListener(new ViewOnClickListenerC3574rR(this));
        }
        RelativeLayout.LayoutParams videoLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        videoLayoutParams.addRule(13);
        addView(c1896Be, videoLayoutParams);
        return c1896Be;
    }

    private C1887Av A03() {
        C1887Av c1887Av = new C1887Av(super.A08);
        c1887Av.setTextColor(-1);
        AbstractC3523qc.A0b(c1887Av, false, 12);
        c1887Av.setGravity(17);
        this.A07.A0g(c1887Av);
        return c1887Av;
    }

    private ViewOnClickListenerC1884As A04() {
        ViewOnClickListenerC1884As viewOnClickListenerC1884As = new ViewOnClickListenerC1884As(super.A08);
        this.A07.A0g(viewOnClickListenerC1884As);
        return viewOnClickListenerC1884As;
    }

    private C1883Ar A06(C3329nO c3329nO) {
        C1883Ar c1883Ar = new C1883Ar(super.A08, c3329nO, true);
        c1883Ar.setBackgroundPaintColor(855638016);
        this.A07.A0g(c1883Ar);
        return c1883Ar;
    }

    private C2636c2 A07() {
        return new C2636c2(this, 50, true, new WeakReference(this.A0D), super.A08);
    }

    private void A09() {
        if (getVisibility() == 0 && this.A02 && hasWindowFocus()) {
            this.A0E.A0U();
            return;
        }
        if (super.A05 != null) {
            super.A05.A0P();
        }
        this.A0E.A0V();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1999Fd
    public final void A0E() {
        this.A0E.A0V();
        this.A07.getEventBus().A04(this.A08, this.A09);
        this.A07.A0X();
        if (super.A05 != null) {
            super.A05.A0O();
        }
        C1896Be c1896Be = this.A07;
        String[] strArr = A0F;
        if (strArr[3].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        A0F[5] = "m52FM";
        AbstractC3523qc.A0K(c1896Be);
        if (this.A00 != null) {
            this.A00.A0p();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1999Fd
    public final void A0F() {
        super.A0F();
        this.A0C.A09();
        this.A03 = true;
        this.A0E.A0U();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1999Fd
    public final void A0G() {
        super.A0G();
        if (C3300mv.A1W(super.A08)) {
            AbstractC3523qc.A0K(this.A0B);
            this.A0B.setLayoutParams(A0D(true, false));
            addView(this.A0B);
        }
        if (C3300mv.A1S(super.A08)) {
            AbstractC3523qc.A0K(this.A0A);
            this.A0A.setLayoutParams(A0D(true, true));
            addView(this.A0A);
        }
        if (C3300mv.A1U(super.A08)) {
            AbstractC3523qc.A0K(this.A0C);
            this.A0C.setLayoutParams(A0D(false, false));
            addView(this.A0C);
        }
        if (super.A04 != null) {
            AbstractC3523qc.A0K(super.A04);
            if (C3300mv.A1U(super.A08)) {
                super.A04.setLayoutParams(AbstractC1999Fd.A0B(this.A0C));
            } else {
                super.A04.setLayoutParams(AbstractC1999Fd.A0B(null));
            }
            addView(super.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1999Fd
    public final boolean A0H() {
        return this.A07.A0m();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1999Fd
    public final boolean A0I() {
        if (getMeasuredWidth() <= 0 || this.A07.getMeasuredWidth() <= 0) {
            return true;
        }
        int measuredWidth = (int) (((double) (getMeasuredWidth() - this.A07.getMeasuredWidth())) / 2.0d);
        int i = AbstractC1999Fd.A0C;
        int widthGap = AbstractC1999Fd.A0B;
        return measuredWidth > i + (widthGap * 2);
    }

    public final C18036y A0J(String str, String str2, String str3, String str4, String str5) {
        this.A01 = str2;
        this.A07.setVideoURI(this.A05.A0T(str2));
        this.A00 = new C5Z(super.A08, this.A06, this.A07, str);
        if (str3 != null) {
            boolean zIsEmpty = TextUtils.isEmpty(str3);
            String[] strArr = A0F;
            String str6 = strArr[3];
            String cachedVideoUrl = strArr[1];
            if (str6.length() == cachedVideoUrl.length()) {
                throw new RuntimeException();
            }
            A0F[6] = "ntVhLGQ5bthREmR";
            if (!zIsEmpty) {
                new AsyncTaskC1989Et(this.A04, super.A08).A05(this.A04.getHeight(), this.A04.getWidth()).A06(new C1997Fb(this)).A07(str3);
            }
        }
        if (str5 != null) {
            this.A0B.setPlayAccessibilityLabel(str4);
        }
        if (str5 != null) {
            this.A0B.setPauseAccessibilityLabel(str5);
        }
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1999Fd
    public int getMediaViewId() {
        return this.A07.getId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A02 = true;
        A09();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A02 = false;
        A09();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A09();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A09();
    }
}
