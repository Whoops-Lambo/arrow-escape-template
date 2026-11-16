package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.text.NumberFormat;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C17846f extends AbstractC1975Ef {
    public static byte[] A0M;
    public static String[] A0N = {"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public View A00;
    public View A01;
    public ImageView A02;
    public C2055Hi A03;
    public C3467pi A04;
    public AbstractC3549r2 A05;
    public C3770ub A06;
    public AbstractC3782un A07;
    public C3798v3 A08;
    public C3825vU A09;
    public C2967hR A0A;
    public C2958hI A0B;
    public C1871Af A0C;
    public boolean A0D;
    public boolean A0E;
    public final Handler A0F;
    public final InterfaceC3556r9 A0G;
    public final InterfaceC3755uM A0H;
    public final C3756uN A0I;
    public final C3786ur A0J;
    public final C1896Be A0K;
    public final C1878Am A0L;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0M = new byte[]{-85, -86, -68, -75, -54, -71, -45, -57, -56, -75, -58, -56, -67, -62, -69, -45, -75, -62, -67, -63, -75, -56, -67, -61, -62, -57, -45, -60, -64, -75, -51, -71, -72, -109, -106, -102, -116, -90, -103, -116, -98, -120, -103, -117, -90, -102, -118, -103, -116, -116, -107, -90, -102, -113, -106, -98, -107, -127, 107, 125, -119, 111, 120, 110, -119, 109, 107, 124, 110, -119, 125, 114, 121, -127, 120, -55, -57, -71, -58, -73, -64, -67, -73, -65};
    }

    static {
        A0D();
        A0R = AbstractC3480pv.A0e;
        A0Z = AbstractC3480pv.A0c;
        A0O = (int) (AbstractC3482px.A02 * 8.0f);
        A0P = (int) (AbstractC3482px.A02 * 10.0f);
        A0U = (int) (AbstractC3482px.A02 * 20.0f);
        A0V = (int) (AbstractC3482px.A02 * 13.0f);
        A0S = (int) (AbstractC3482px.A02 * 48.0f);
        A0Y = (int) (AbstractC3482px.A02 * 14.0f);
        A0W = (int) (AbstractC3482px.A02 * 12.0f);
        A0Q = AbstractC3480pv.A0y;
        A0X = AbstractC2938gx.A02(-1, 77);
        A0T = (int) (AbstractC3482px.A02 * 16.0f);
        A0a = (int) (AbstractC3482px.A02 * 12.0f);
    }

    public C17846f(C3786ur c3786ur) {
        super(c3786ur, false);
        this.A0F = new Handler(Looper.getMainLooper());
        this.A0E = false;
        this.A0D = false;
        this.A03 = c3786ur.A06();
        this.A05 = c3786ur.A0B();
        this.A0J = c3786ur;
        this.A01 = new View(this.A03);
        AbstractC3523qc.A0L(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A0A();
        this.A0G = c3786ur.A0C();
        AbstractC3765uW.A00(c3786ur.A06(), this, getAdInfo().A0I().A08());
        this.A0K = A02(c3786ur);
        AbstractC3523qc.A0L(this.A0K);
        getAdDetailsView().bringToFront();
        if (!A05()) {
            this.A0L = A03(c3786ur);
        } else {
            this.A0L = null;
        }
        if (getAdDataBundle().A2m()) {
            if (this.A0L != null) {
                this.A0L.setVisibility(8);
            }
            getAdDetailsView().setVisibility(8);
            A09();
        }
        A1l();
        this.A0A = new C2967hR(this.A03, c3786ur.A07(), getAdDataBundle());
        this.A0H = new C1972Ec(this);
        this.A0I = A01(c3786ur);
        C3476pr c3476prA02 = ((AbstractC1975Ef) this).A08.A02(getAdDataBundle());
        this.A03.A0H().A00(c3476prA02.A01);
        if (c3476prA02.A00) {
            this.A0K.getVideoImplView().setOnClickListener(new ViewOnClickListenerC3789uu(this));
        } else if (C3300mv.A1L(getAdContextWrapper())) {
            AbstractC3718tl.A00(this.A0K.getVideoImplView(), C3300mv.A1M(getAdContextWrapper()), new ViewOnClickListenerC3790uv(this));
        }
        if (c3786ur.A05().A2a()) {
            if (this.A0J.A05().A2d()) {
                this.A07 = new ER(c3786ur);
            } else {
                this.A07 = new ES(c3786ur);
            }
            View view = this.A07;
            ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            addView(view, layoutParams2);
            getAdDetailsView().setVisibility(8);
        }
    }

    private C3756uN A01(C3786ur c3786ur) {
        if (this.A0L != null) {
            return new C3756uN(c3786ur, getAdDataBundle(), this.A0K, this.A0L, getAdDetailsView(), this.A0G, this.A0H);
        }
        return new C3756uN(c3786ur, getAdDataBundle(), this.A0K, this.A0G, this.A0H, getAdDetailsView());
    }

    private C1896Be A02(C3786ur c3786ur) {
        RelativeLayout.LayoutParams layoutParams;
        C1896Be c1896Be = (C1896Be) c3786ur.A02();
        if (c1896Be == null) {
            c1896Be = new C1896Be(this.A03);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if (getAdDataBundle().A2m()) {
            c1896Be.getVideoView().setPadding(c1896Be.getVideoView().getPaddingLeft(), c1896Be.getVideoView().getPaddingTop(), c1896Be.getVideoView().getPaddingRight(), c1896Be.getVideoView().getPaddingBottom() + A0a);
        }
        layoutParams2.addRule(13);
        addView(c1896Be, layoutParams2);
        int iA1j = A1j(c3786ur.A0B());
        this.A02 = (ImageView) c3786ur.A03();
        if (this.A02 != null) {
            if (!A05()) {
                ImageView imageView = this.A02;
                int i = AbstractC1975Ef.A0K;
                int toolbarHeight = AbstractC1975Ef.A0K;
                imageView.setPadding(i, toolbarHeight, AbstractC1975Ef.A0K, AbstractC1975Ef.A0K);
                layoutParams = new RelativeLayout.LayoutParams(AbstractC1975Ef.A0L, AbstractC1975Ef.A0L);
                layoutParams.setMargins(0, iA1j, AbstractC1975Ef.A0J, 0);
                layoutParams.addRule(11);
            } else {
                layoutParams = new RelativeLayout.LayoutParams(AbstractC3782un.A0B, AbstractC3782un.A0B);
                int i2 = AbstractC3480pv.A0e;
                int toolbarHeight2 = AbstractC3480pv.A0u;
                layoutParams.setMargins(i2, toolbarHeight2, AbstractC3480pv.A0e, AbstractC3480pv.A0c);
                layoutParams.addRule(9);
            }
            layoutParams.addRule(10);
            ImageView imageView2 = this.A02;
            String[] strArr = A0N;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A0N[3] = "RUV05LvgTVtcmprhEttuSCpIx";
            c1896Be.addView(imageView2, layoutParams);
        }
        return c1896Be;
    }

    private C1878Am A03(C3786ur c3786ur) {
        C1878Am c1878AmA0E = c3786ur.A0E();
        if (c1878AmA0E == null) {
            return null;
        }
        c1878AmA0E.A0A(-1, AbstractC1975Ef.A0D, false);
        c1878AmA0E.setPadding(AbstractC1975Ef.A0O, AbstractC1975Ef.A0O, AbstractC1975Ef.A0O, AbstractC1975Ef.A0O);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, AbstractC1975Ef.A0N);
        progressBarLayoutParams.addRule(12);
        addView(c1878AmA0E, progressBarLayoutParams);
        return c1878AmA0E;
    }

    private void A05() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.A0B != null) {
            addView(this.A0B.A0W(), layoutParams);
        }
    }

    private void A06() {
        this.A08 = new C3798v3(this.A0J.A06(), getAdDataBundle(), this.A0J.A08(), this.A0F, this.A0J.A0C());
        addView(this.A08.A0E(getCtaButton()));
    }

    private void A07() {
        AbstractC3523qc.A0e(this.A02, getCtaButton(), getAdDetailsView(), this.A01, this.A0I, this.A0J.A0B());
        for (InterfaceC2760e3 interfaceC2760e3 : this.A0K.getPlugins()) {
            if (interfaceC2760e3 instanceof AnonymousClass51) {
                this.A0K.A0h(interfaceC2760e3);
                return;
            }
        }
    }

    private void A08() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0H();
            this.A0K.A0h(getAnimationPlugin());
        }
    }

    private void A09() {
        RelativeLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        A0E(relativeLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0R, 0);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        appMetadataLayoutParams.setMargins(A0R, A0Z, A0R, A0Z);
        appMetadataLayoutParams.addRule(12);
        relativeLayout2.addView(relativeLayout, layoutParams2);
        ViewOnClickListenerC1981El ctaButton = getCtaButton();
        ctaButton.setTextSize(14.0f);
        ctaButton.setIncludeFontPadding(false);
        ctaButton.setTextColor(-1);
        layoutParams2.addRule(0, ctaButton.getId());
        if (!getAdDataBundle().A2e()) {
            ctaButton.setPadding(A0P, A0P, A0P, A0P);
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(6, relativeLayout.getId());
            layoutParams.addRule(8, relativeLayout.getId());
            ctaButton.setBackgroundColor(-12549889);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            AbstractC3523qc.A0W(ctaButton, AbstractC3523qc.A06(-16738826, A0O));
            ctaButton.setPadding(A0U, A0V, A0U, A0V);
            ctaButton.setStateListAnimator(null);
            AbstractC3523qc.A0a(ctaButton);
        }
        layoutParams.addRule(11);
        if (ctaButton.getParent() != null) {
            AbstractC3523qc.A0e(ctaButton);
        }
        relativeLayout2.addView(ctaButton, layoutParams);
        addView(relativeLayout2, appMetadataLayoutParams);
        relativeLayout2.bringToFront();
    }

    private void A0A() {
        if (this.A05 == null) {
            return;
        }
        LA adDataBundle = getAdDataBundle();
        if (A0N[6].length() != 18) {
            throw new RuntimeException();
        }
        String[] strArr = A0N;
        strArr[2] = "8PENcoURn8tYxYDZWdxrE0xj5q4aF";
        strArr[0] = "NpgYsaWM2tMmK1ULlf2RY7UcVYKwt";
        if (!adDataBundle.A2D()) {
            this.A0C = new C1871Af(this.A05, 400, -this.A05.getToolbarHeight(), 0);
        }
    }

    private void A0B() {
        new C3329nO(getAdDataBundle().A37(), getAdEventManager()).A04(EnumC3328nN.A1D, null);
        if (!getAdInfo().A0W()) {
            return;
        }
        super.A09.set(true);
        AbstractC3523qc.A0X(this);
        AbstractC3523qc.A0e(this.A0L, this.A0I, this.A00);
        AbstractC3523qc.A0M(this.A05);
        Pair<EnumC2968hS, View> pairA03 = this.A0A.A03(getCtaButton());
        View view = (View) pairA03.second;
        String[] strArr = A0N;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0N[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        this.A00 = view;
        A0F((EnumC2968hS) pairA03.first);
        if (getAdInfo().A0L().A00() >= 0) {
            this.A0D = true;
            if (this.A05 != null) {
                this.A05.setToolbarActionMode(getAdDataBundle().A3N() ? 8 : 2);
                this.A05.setProgressImmediate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.A04 = new C3467pi((int) getAdInfo().A0L().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C1971Eb(this));
            this.A04.A07();
        }
    }

    private void A0C() {
        if (this.A0C != null) {
            this.A0C.A4b(true, false);
        }
        if (!A05() && !getAdDataBundle().A2m() && getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A4b(true, false);
        }
    }

    private void A0E(RelativeLayout relativeLayout) {
        int i;
        String formattingRatingCount;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A0S, A0S);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C3758uP c3758uP = new C3758uP(this.A03);
        AbstractC3523qc.A0O(c3758uP, 0);
        AbstractC3523qc.A0L(c3758uP);
        new AsyncTaskC1989Et(c3758uP, this.A03).A05(A0S, A0S).A07(getAdDataBundle().A35().A01());
        TextView textView = new TextView(this.A03);
        AbstractC3523qc.A0L(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(getAdDataBundle().A31().A01().A07(true));
        textView.setText(getAdDataBundle().A32().A0J().A0H());
        textView.setTextSize(!getAdDataBundle().A2e() ? 16.0f : 17.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C2055Hi c2055Hi = this.A03;
        if (!getAdDataBundle().A2e()) {
            i = A0Y;
        } else {
            i = A0W;
            String[] strArr = A0N;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A0N[5] = "zMOp0v68HU8LM6AfFyrfYJAIOfQzbFgD";
        }
        C3760uR c3760uR = new C3760uR(c2055Hi, i, 5, A0X, -1);
        c3760uR.setGravity(16);
        LinearLayout.LayoutParams ratingCountParams = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A03);
        textView2.setTextColor(getAdDataBundle().A31().A01().A07(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        if (!getAdDataBundle().A2e()) {
            textView2.setTextSize(13.0f);
        }
        LinearLayout.LayoutParams starRatingContainerParams = new LinearLayout.LayoutParams(-2, -1);
        starRatingContainerParams.leftMargin = A0Q;
        LinearLayout linearLayout = new LinearLayout(this.A03);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, A0T);
        layoutParams2.topMargin = A0Q / 2;
        layoutParams2.addRule(3, textView.getId());
        linearLayout.addView(c3760uR, ratingCountParams);
        linearLayout.addView(textView2, starRatingContainerParams);
        RelativeLayout.LayoutParams containerParams = new RelativeLayout.LayoutParams(-2, -2);
        containerParams.leftMargin = A0Q;
        containerParams.addRule(1, c3758uP.getId());
        containerParams.addRule(15);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        relativeLayout2.addView(linearLayout, layoutParams2);
        relativeLayout2.addView(textView);
        relativeLayout.addView(relativeLayout2, containerParams);
        relativeLayout.addView(c3758uP, layoutParams);
        if (TextUtils.isEmpty(getAdDataBundle().A32().A0J().A0D())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c3760uR.setRating(Float.parseFloat(getAdDataBundle().A32().A0J().A0D()));
        if (getAdDataBundle().A32().A0J().A0A() == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A04(0, 1, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
        if (!getAdDataBundle().A2e()) {
            formattingRatingCount = NumberFormat.getNumberInstance().format(Integer.parseInt(getAdDataBundle().A32().A0J().A0A()));
        } else {
            formattingRatingCount = AbstractC3492q7.A01(Integer.parseInt(getAdDataBundle().A32().A0J().A0A()));
        }
        sb.append(formattingRatingCount);
        String formattingRatingCount2 = A04(1, 1, 116);
        sb.append(formattingRatingCount2);
        String formattingRatingCount3 = sb.toString();
        textView2.setText(formattingRatingCount3);
    }

    private void A0F(EnumC2968hS enumC2968hS) {
        EnumC3372o7 enumC3372o7A00 = EnumC3372o7.A00(getAdDataBundle().A1a());
        if (enumC3372o7A00 == EnumC3372o7.A08) {
            if (this.A09 != null) {
                return;
            }
            AbstractC3523qc.A0e(this.A02, getCtaButton(), getAdDetailsView(), this.A01, this.A0I);
            this.A09 = new C3825vU(this.A03, getAdDataBundle(), this.A0J.A08(), this.A0F, this.A0J.A0C(), this.A05);
            addView(this.A09.A0K(getCtaButton()), new RelativeLayout.LayoutParams(-1, -1));
            return;
        }
        if (enumC3372o7A00 == EnumC3372o7.A05) {
            if (this.A06 != null) {
                return;
            }
            AbstractC3523qc.A0e(this.A02, getCtaButton(), getAdDetailsView(), this.A01, this.A0I);
            this.A06 = new C3770ub(this.A03, getAdDataBundle(), this.A0J.A08(), this.A0F, this.A0J.A0C());
            addView(this.A06.A0D(getCtaButton()), new RelativeLayout.LayoutParams(-1, -1));
            return;
        }
        if (!getAdDataBundle().A32().A0L().A03().isEmpty()) {
            if (getAdDataBundle().A32().A0L().A04()) {
                this.A0B = new C2958hI(this.A03, getAdDataBundle(), this.A0G, getCtaButton(), this.A0F, this.A0J.A08());
                AbstractC3523qc.A0e(this.A05, getAdDetailsView(), this.A02);
                A05();
                return;
            }
        } else if (getAdDataBundle().A32().A0L().A04() || getAdDataBundle().A32().A0L().A05()) {
            A07();
            A06();
            return;
        }
        A0G(enumC2968hS);
        String[] strArr = A0N;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0N[5] = "XwWMDLrqRvQWrOlwGXJRzy5eNtvO8QzI";
    }

    private void A0G(EnumC2968hS enumC2968hS) {
        if (this.A00 == null) {
        }
        this.A0K.A0i(false);
        this.A0K.setVisibility(8);
        switch (C3791uw.A00[enumC2968hS.ordinal()]) {
            case 1:
                getAdDetailsView().setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, A1j(this.A05), 0, 0);
                layoutParams.addRule(2, getAdDetailsView().getId());
                addView(this.A00, layoutParams);
                break;
            case 2:
                AbstractC3523qc.A0e(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(AbstractC1975Ef.A0M, AbstractC1975Ef.A0M, AbstractC1975Ef.A0M, AbstractC1975Ef.A0M);
                addView(this.A00, layoutParams2);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1975Ef, com.facebook.ads.redexgen.X.AbstractC3782un
    public final void A1Q() {
        super.A1Q();
        A08();
        getAdDetailsView().A0j();
        if (this.A09 != null) {
            this.A09.A0L();
        }
        C3770ub c3770ub = this.A06;
        if (A0N[5].charAt(17) != 'k') {
            A0N[6] = "md7rIfygLfbWPIkKcE";
            if (c3770ub != null) {
                this.A06.A0E();
            }
            if (this.A0B != null) {
                this.A0B.A0Y();
            }
            if (this.A08 != null) {
                this.A08.A0H();
            }
            this.A0F.removeCallbacksAndMessages(null);
            if (A0N[3].length() == 25) {
                A0N[5] = "bB4JBA3ZSEqYzY8c8XgwhRx5D9raQ3WM";
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1975Ef, com.facebook.ads.redexgen.X.AbstractC3782un
    public final void A1X(C2832fE c2832fE, String str, double d, Bundle bundle) {
        super.A1X(c2832fE, str, d, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A04(2, 31, 103), false)) {
            A0C();
        }
        if (bundle.getBoolean(A04(57, 18, 29), false)) {
            A0B();
        }
        if (bundle.getBoolean(A04(33, 24, 58), false)) {
            C3756uN c3756uN = this.A0I;
            if (A0N[1].charAt(18) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[2] = "jjtMTZWEM7Dg1szUnnnmuTjwvMhej";
            strArr[0] = "cexdZia4vusGbXInA5fVVHDcQrSB4";
            c3756uN.A07(this);
        }
        if (A05() && (getAdDetailsView() instanceof AbstractC1988Es)) {
            AbstractC1988Es abstractC1988Es = (AbstractC1988Es) getAdDetailsView();
            String[] strArr2 = A0N;
            if (strArr2[7].length() != strArr2[4].length()) {
                String[] strArr3 = A0N;
                strArr3[2] = "Ih6EqgYtvSfaYgSNPPElGp7Lxj0t8";
                strArr3[0] = "h5CA5aG2lPOu2yMQLS9sdpZh4eIWu";
                abstractC1988Es.A0q();
                return;
            }
            String[] strArr4 = A0N;
            strArr4[7] = "00UfvTGlPPvipTISrgumxqYWr80Pn";
            strArr4[4] = "mO62e8xwcE";
            abstractC1988Es.A0q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3782un
    public final void A1Y(C5Y c5y) {
        super.A1Y(c5y);
        if (A05() && !getAdDataBundle().A2D()) {
            removeView(getAdDetailsView());
        }
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3782un
    public final void A1Z(BD bd) {
        super.A1Z(bd);
        if (this.A07 != null && this.A07.getVisibility() == 0) {
            return;
        }
        if (A05()) {
            this.A03.A0F().AM1(AbstractC3458pZ.A00((float) this.A0J.A05().A1F()), getResources().getConfiguration().orientation, true, false, AbstractC2798ef.A0E(this.A0J.A04()));
        }
        Resources resources = getResources();
        if (A0N[5].charAt(17) == 'k') {
            throw new RuntimeException();
        }
        A0N[6] = "ip031XD9FRryimrL8V";
        A1t(resources.getConfiguration().orientation);
        if (getAdDataBundle().A2O()) {
            this.A0K.setOnClickListener(getCtaButton());
        }
        if (A05()) {
            getAdDetailsView().setVisibility(0);
            if (getAdDetailsView() instanceof AbstractC1988Es) {
                ((AbstractC1988Es) getAdDetailsView()).A0u(getResources().getConfiguration().orientation);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3782un
    public final void A1a(C5V c5v, int i) {
        super.A1a(c5v, i);
        int videoLengthMs = c5v.A00();
        int remainingVideoTimeInMillis = this.A0K.getDuration();
        int videoLengthMs2 = remainingVideoTimeInMillis - videoLengthMs;
        if (getAnimationPlugin() != null && videoLengthMs2 < 3000 && getAnimationPlugin().A0M()) {
            getAnimationPlugin().A0I();
        }
        if ((getAdDetailsView() instanceof AbstractC1988Es) && !this.A0J.A05().A2d()) {
            int currentPosMs = c5v.A00();
            ((AbstractC1988Es) getAdDetailsView()).A0s(((remainingVideoTimeInMillis * i) + currentPosMs) / 1000);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3782un
    public final void A1b(boolean z) {
        super.A1b(z);
        getAdDetailsView().A0m(z);
        if (this.A07 != null) {
            this.A07.A1b(z);
        }
        if (this.A09 != null) {
            this.A09.A0N(z);
        }
        C3770ub c3770ub = this.A06;
        String[] strArr = A0N;
        if (strArr[7].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0N;
        strArr2[7] = "iXZFA7pvq2EjOt4WoFSsptv7Y6FsA";
        strArr2[4] = "3FZLJfDRd9";
        if (c3770ub != null) {
            this.A06.A0G(z);
        }
        if (this.A0B != null) {
            this.A0B.A0e(z);
        }
        if (this.A08 != null) {
            this.A08.A0J(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3782un
    public final boolean A1d() {
        return getAdInfo().A0W();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3782un
    public final boolean A1g() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    @Override // com.facebook.ads.redexgen.X.AbstractC3782un
    public final boolean A1i(boolean z) {
        boolean zA0W;
        if (!z || this.A0E) {
            zA0W = getAdInfo().A0W();
            if (A0N[5].charAt(17) != 'k') {
                A0N[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
                if (!zA0W && !super.A09.get()) {
                    this.A0K.A0e(EnumC2815ex.A09);
                    return true;
                }
            }
        } else {
            boolean z2 = super.A09.get();
            String[] strArr = A0N;
            if (strArr[7].length() != strArr[4].length()) {
                String[] strArr2 = A0N;
                strArr2[2] = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw";
                strArr2[0] = "8CoNQoXVMdzgwU1krh95bRLsSKKH4";
                if (!z2) {
                    this.A0I.A07(this);
                    return true;
                }
                zA0W = getAdInfo().A0W();
                if (A0N[5].charAt(17) != 'k') {
                    A0N[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
                    return !zA0W ? false : false;
                }
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1975Ef
    public final AbstractC3721to A1k(C3786ur c3786ur, C2832fE c2832fE, String str) {
        double dA1F = c3786ur.A05().A1F();
        if (A05()) {
            return new C3766uX((float) dA1F, str, c3786ur.A06(), getColors(), c3786ur.A05(), c3786ur.A0C(), getCtaButton(), AbstractC1975Ef.A0H, false, c3786ur.A07(), c3786ur.A0F(), c3786ur.A0A(), c3786ur.A0E(), c3786ur.A08(), false).A03();
        }
        return new C1977Eh(c3786ur.A06(), getCtaButton(), AbstractC1975Ef.A0I, c2832fE.A0J().A00() == EnumC2837fJ.A05, getColors(), c2832fE.A0K().A07(), str, c3786ur.A07(), c3786ur.A0C(), c3786ur.A0F(), c3786ur.A0A(), c3786ur.A05());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1975Ef
    public final void A1l() {
        super.A1l();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().ABd(this.A0K);
        }
    }

    public final void A1q() {
        getCtaButton().A0E(A04(75, 9, 71));
    }

    public final void A1r() {
        if (getAdDetailsView() instanceof AbstractC1988Es) {
            ((AbstractC1988Es) getAdDetailsView()).setPlaceHolderTextForRewardsConversion(getAdDataBundle().A1o());
        }
    }

    public final void A1s() {
        new C3329nO(this.A0J.A05().A37(), getAdEventManager()).A04(EnumC3328nN.A0v, null);
        if (this.A0J.A0B() != null) {
            this.A0J.A0B().setVisibility(8);
            String[] strArr = A0N;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A0N[6] = "yAwhrDcExjWPfFDTEi";
            removeView(this.A0J.A0B());
        }
        removeView(this.A07);
        removeView(this.A0K);
        A08();
        removeView(getAdDetailsView());
        removeView(this.A0L);
        removeView(this.A00);
        if (this.A0B != null) {
            removeView(this.A0B.A0X());
        }
        if (this.A0J.A05().A2d()) {
            A1n();
        } else {
            A1m();
        }
    }

    public final void A1t(int i) {
        if (!A05()) {
            return;
        }
        this.A03.A0F().AM3(i);
        this.A0K.A0a(i);
        A1o(i, this.A0K, (RelativeLayout) this.A0K.getVideoView());
    }

    public final void A1u(C5Z c5z) {
        if (this.A07 != null) {
            boolean z = this.A07 instanceof ER;
            if (A0N[3].length() != 25) {
                throw new RuntimeException();
            }
            A0N[5] = "FAigyzJhEFxQxsaDiDi5NbLqtOf6Lp3I";
            if (z) {
                ((ER) this.A07).A1j(c5z);
            }
            if (this.A07 instanceof ES) {
                ((ES) this.A07).A1j(c5z);
            }
            this.A07.A1Q();
            removeView(this.A07);
            if (A0N[6].length() != 18) {
                String[] strArr = A0N;
                strArr[7] = "VyeDXSZFGYmD1QmQMyFsICGfXcawo";
                strArr[4] = "LIOwJh30UZ";
                this.A07 = null;
            } else {
                String[] strArr2 = A0N;
                strArr2[7] = "wN3IsD8puMayp9KO28b4vVZi0fOl6";
                strArr2[4] = "vypOhhEh5B";
                this.A07 = null;
            }
        }
        getAdDetailsView().setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC3782un
    public int getCloseButtonStyle() {
        if (getAdDataBundle().A2n() && this.A05 != null) {
            return this.A05.getToolbarActionMode();
        }
        if (this.A0D) {
            if (getAdDataBundle().A3N()) {
                return 8;
            }
            return 2;
        }
        if (A1d() && !super.A09.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1975Ef, com.facebook.ads.redexgen.X.AbstractC3782un, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A07 != null && this.A07.getVisibility() == 0) {
            getAdDetailsView().setVisibility(8);
            return;
        }
        if (this.A09 != null && super.A09.get()) {
            this.A09.A0M(configuration.orientation);
            String[] strArr = A0N;
            if (strArr[7].length() != strArr[4].length()) {
                A0N[1] = "DO7In235juv9PXUKV934zSaX5akZYCRG";
                return;
            }
        } else {
            C3770ub c3770ub = this.A06;
            String[] strArr2 = A0N;
            if (strArr2[2].length() == strArr2[0].length()) {
                A0N[3] = "fUeg7uXpIwsYCOJvIzf4Pz9qp";
                if (c3770ub != null && super.A09.get()) {
                    this.A06.A0F(configuration.orientation);
                    return;
                }
                if (getAdDataBundle().A32().A0L().A04() && this.A0B != null && super.A09.get()) {
                    this.A0B.A0a(configuration.orientation);
                    if (A0N[3].length() != 25) {
                        throw new RuntimeException();
                    }
                    A0N[5] = "kZmqBw7HqjefhdtwCyHYueahbgSJOGXS";
                    return;
                }
                A1t(configuration.orientation);
                return;
            }
        }
        throw new RuntimeException();
    }

    public void setVideoAdViewListener(InterfaceC3506qL interfaceC3506qL) {
        if (this.A07 instanceof ER) {
            ((ER) this.A07).setVideoAdViewListener(interfaceC3506qL);
        }
        if (this.A07 instanceof ES) {
            ((ES) this.A07).setVideoAdViewListener(interfaceC3506qL);
        }
    }
}
