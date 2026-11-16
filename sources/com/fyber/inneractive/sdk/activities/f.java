package com.fyber.inneractive.sdk.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class f extends WebChromeClient {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public f(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.a.setTitle("Page is Loading...");
        this.a.setProgress(i * 100);
        if (i == 100) {
            this.a.setTitle(webView.getUrl());
        }
    }
}
