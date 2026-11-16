package com.facebook.ads.redexgen.X;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.vW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3827vW extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC1981El A02;
    public static final int A05 = (int) (AbstractC3482px.A02 * 36.0f);
    public static final int A06 = (int) (AbstractC3482px.A02 * 36.0f);
    public static final int A03 = (int) (AbstractC3482px.A02 * 23.0f);
    public static final int A04 = (int) (AbstractC3482px.A02 * 3.0f);
    public static final int A07 = (int) (AbstractC3482px.A02 * 4.0f);

    public C3827vW(C2055Hi c2055Hi, ViewOnClickListenerC1981El viewOnClickListenerC1981El, LA la, InterfaceC3321nG interfaceC3321nG, InterfaceC3556r9 interfaceC3556r9, C2636c2 c2636c2, C3514qT c3514qT, C2841fN c2841fN, InterfaceC3740u7 interfaceC3740u7) {
        super(c2055Hi);
        this.A00 = c2841fN.A09(true);
        this.A01 = new RelativeLayout(c2055Hi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c2055Hi, la.A32().A0K().A05());
        if (viewOnClickListenerC1981El == null) {
            this.A02 = new ViewOnClickListenerC1981El(c2055Hi, la.A1X(), (C2841fN) null, interfaceC3321nG, interfaceC3556r9, c2636c2, c3514qT, la.A33());
        } else {
            this.A02 = viewOnClickListenerC1981El;
        }
        A03();
        this.A02.setCta(la.A32().A0K(), la.A37(), new HashMap(), interfaceC3740u7);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C2055Hi c2055Hi, View view) {
        ImageView imageView = new ImageView(c2055Hi);
        imageView.setImageBitmap(AbstractC3535qo.A01(EnumC3534qn.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C2055Hi c2055Hi, String str) {
        Button button = new Button(c2055Hi);
        AbstractC3523qc.A0L(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        AbstractC3523qc.A0R(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c2055Hi, button);
    }

    public final EnumC2795ec A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(LA la, AbstractC3549r2 abstractC3549r2) {
        this.A02.A0I(la, abstractC3549r2);
    }

    public void setCta(C2843fP c2843fP, String str, HashMap<String, String> extras, InterfaceC3740u7 interfaceC3740u7) {
        this.A02.setCta(c2843fP, str, extras, interfaceC3740u7);
    }
}
