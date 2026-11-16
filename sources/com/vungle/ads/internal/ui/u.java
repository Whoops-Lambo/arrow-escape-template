package com.vungle.ads.internal.ui;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u extends rc1 implements sr0 {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ RenderProcessGoneDetail b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        super(0);
        this.a = webView;
        this.b = renderProcessGoneDetail;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onRenderProcessGone url: ");
        WebView webView = this.a;
        sbA.append(webView != null ? webView.getUrl() : null);
        sbA.append(", did crash: ");
        RenderProcessGoneDetail renderProcessGoneDetail = this.b;
        sbA.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        return sbA.toString();
    }
}
