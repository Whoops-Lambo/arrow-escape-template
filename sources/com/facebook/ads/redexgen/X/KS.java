package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class KS implements InterfaceC3175kr {
    public final C2855fb A00;
    public final InterfaceC2874fu A01;
    public final C3183kz A02;
    public final C2055Hi A03;
    public final boolean A04;

    public KS(C2055Hi c2055Hi, InterfaceC2874fu interfaceC2874fu, C3183kz c3183kz, C2855fb c2855fb, boolean z) {
        this.A03 = c2055Hi;
        this.A01 = interfaceC2874fu;
        this.A02 = c3183kz;
        this.A00 = c2855fb;
        this.A04 = z;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        C2875fv playableWebViewClient = new C2875fv(this.A00, this.A01, this.A04);
        webView.setWebViewClient(playableWebViewClient);
        webView.loadUrl(this.A00.A0M());
        playableWebViewClient.A03();
    }

    private void A01(boolean z) {
        if (this.A00.A0G() == EnumC2856fc.A05) {
            A00();
            return;
        }
        String strA0M = this.A00.A0M();
        if (z) {
            C3183kz c3183kz = this.A02;
            String markupUrlResult = this.A00.A0M();
            strA0M = c3183kz.A0S(markupUrlResult);
        }
        this.A00.A0U(strA0M);
        this.A01.AGL();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3175kr
    public final void AEJ() {
        if (this.A04) {
            this.A01.AGK(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC3175kr
    public final void AEU() {
        A01(true);
    }
}
