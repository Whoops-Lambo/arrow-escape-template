package com.fyber.inneractive.sdk.util;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements Runnable {
    public final /* synthetic */ WebView a;

    public o0(WebView webView) {
        this.a = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getSettings().setDisplayZoomControls(false);
    }
}
