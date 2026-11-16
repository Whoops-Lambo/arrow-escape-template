package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class X0 extends WebChromeClient {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Y0 f230;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public boolean f231 = false;

    public X0(Y0 y0) {
        this.f230 = y0;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        this.f230.mo346(webView, str2);
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        if (i != 100 || this.f231) {
            return;
        }
        this.f231 = true;
        this.f230.mo345(webView);
    }
}
