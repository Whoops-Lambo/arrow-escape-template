package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class CallableC3264mL implements Callable<String> {
    public final /* synthetic */ C3192lA A00;

    public CallableC3264mL(C3192lA c3192lA) {
        this.A00 = c3192lA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String call() {
        String browserUserAgent = AbstractC3265mM.A03.get();
        if (browserUserAgent != null) {
            return browserUserAgent;
        }
        WebView webView = new WebView(this.A00.getApplicationContext());
        webView.setWebViewClient(new C3263mK(this));
        String userAgentString = webView.getSettings().getUserAgentString();
        webView.destroy();
        if (userAgentString != null) {
            AbstractC3265mM.A03.set(userAgentString);
        }
        return userAgentString;
    }
}
