package com.facebook.ads.redexgen.X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class C3263mK extends WebViewClient {
    public final /* synthetic */ CallableC3264mL A00;

    public C3263mK(CallableC3264mL callableC3264mL) {
        this.A00 = callableC3264mL;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC3704tX.A0D(AbstractC3223lf.A2j);
        return true;
    }
}
