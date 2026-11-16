package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.G5;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public j0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        WebView webView;
        IAConfigManager iAConfigManager = IAConfigManager.Q;
        if (iAConfigManager.M == null && (context = iAConfigManager.g) != null) {
            try {
                webView = new WebView(context);
                webView.setWebViewClient(new c0());
            } catch (Throwable unused) {
                IAlog.a("failed to create a new webview", new Object[0]);
                webView = null;
            }
            iAConfigManager.M = webView;
        }
        WebView webView2 = iAConfigManager.M;
        String str = this.a;
        String str2 = this.b;
        if (webView2 != null) {
            if (str2 == null) {
                str2 = "";
            }
            DTExchangeNetworkBridge.webviewLoadDataWithBaseURL(webView2, str, str2, "text/html", G5.O, null);
        }
        com.fyber.inneractive.sdk.util.r.b.postDelayed(IAConfigManager.S, 10000L);
    }
}
