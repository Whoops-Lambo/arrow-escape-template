package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class n extends rc1 implements sr0 {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ WebViewRenderProcess b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        super(0);
        this.a = webView;
        this.b = webViewRenderProcess;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onRenderProcessUnresponsive(Title = ");
        sbA.append(this.a.getTitle());
        sbA.append(", URL = ");
        sbA.append(this.a.getOriginalUrl());
        sbA.append(", (webViewRenderProcess != null) = ");
        sbA.append(this.b != null);
        return sbA.toString();
    }
}
