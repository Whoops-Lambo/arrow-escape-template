package com.mbridge.msdk.config.dynamic.baseview.webview.client;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class a extends WebChromeClient {
    private final String a = "MBWebChromeClient";
    private com.mbridge.msdk.config.dynamic.baseview.webview.listener.a b;

    public void a(com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar) {
        this.b = aVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        com.mbridge.msdk.config.dynamic.baseview.webview.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.onProgressChanged(webView, i);
        }
    }
}
