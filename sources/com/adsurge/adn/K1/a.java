package com.adsurge.adn.K1;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adsurge.adn.E1.o;
import com.adsurge.adn.I0.g;
import defpackage.ok2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a implements o {
    public final WebViewClient a;
    public final WebView b;

    public final /* synthetic */ void a(String str) {
        WebViewClient webViewClient = this.a;
        if (webViewClient != null) {
            webViewClient.shouldOverrideUrlLoading(this.b, str);
        }
    }

    @JavascriptInterface
    public void open(String str) {
        g.a(new ok2(27, this, str));
    }

    public a(WebViewClient webViewClient, WebView webView) {
        this.a = webViewClient;
        this.b = webView;
    }

    @Override // com.adsurge.adn.E1.o
    public String a() {
        return "__adsurgeOpenBridge__";
    }
}
