package com.adsurge.adn.E1;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.adsurge.adn.E1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1627b extends e {
    public final com.adsurge.adn.Y0.c a;
    public boolean b = false;
    public boolean c = false;
    public long d = 0;
    public long e = -1;

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l.a
    public void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
            int statusCode = webResourceResponse == null ? 0 : webResourceResponse.getStatusCode();
            String string = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "" : webResourceRequest.getUrl().toString();
            if (this.c) {
                return;
            }
            this.c = true;
            com.adsurge.adn.w1.b.a(6001021, this.a, (Integer) null, Integer.valueOf(statusCode), new com.adsurge.adn.V.h().a(string));
        }
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l
    public void c(String str) {
        if (this.c) {
            return;
        }
        this.c = true;
        com.adsurge.adn.w1.b.a(6001022, this.a, new com.adsurge.adn.V.h().a(SystemClock.elapsedRealtime() - this.e));
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l.a
    public void n() {
        com.adsurge.adn.w1.b.a(6001023, this.a, Integer.valueOf((int) (SystemClock.elapsedRealtime() - this.d)));
    }

    public C1627b(com.adsurge.adn.u1.c cVar) {
        this.a = com.adsurge.adn.Y0.c.a(cVar);
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l
    public void a(String str, Bitmap bitmap) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.e = SystemClock.elapsedRealtime();
        com.adsurge.adn.w1.b.a(6001020, this.a);
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l
    public void a(int i, String str, String str2) {
        if (this.c) {
            return;
        }
        this.c = true;
        com.adsurge.adn.w1.b.a(6001021, this.a, (Integer) null, Integer.valueOf(i), new com.adsurge.adn.V.h().a(str2));
    }

    @Override // com.adsurge.adn.E1.e, com.adsurge.adn.E1.l.a
    public void a(String str) {
        this.d = SystemClock.elapsedRealtime();
    }
}
