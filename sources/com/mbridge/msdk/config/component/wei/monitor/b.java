package com.mbridge.msdk.config.component.wei.monitor;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSession;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    AdSession a;

    public void a(WebView webView) {
        this.a.registerAdView(webView);
    }

    public b(AdSession adSession) {
        this.a = adSession;
    }
}
