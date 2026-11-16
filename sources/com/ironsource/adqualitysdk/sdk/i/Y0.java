package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Y0 implements InterfaceC0438 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final WeakHashMap f297;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final HashSet f298 = new HashSet();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final R0 f299;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String f300;

    static {
        StringFog.decrypt("pSa+YHVGM2KbMKhTckY2\n", "8kPcNhwjRC4=\n");
        f297 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m360() {
        R0 r0 = this.f299;
        W0 w0 = new W0(this);
        WebView webView = (WebView) r0.f201.get();
        if (webView != null) {
            try {
                P0 p0 = new P0(i1.m383(webView), w0);
                r0.f200 = new WeakReference(p0);
                webView.setWebViewClient(p0);
                r0.f199 = true;
                return;
            } catch (Exception e) {
                AbstractC1290.m905(R0.f198, StringFog.decrypt("XudYGOr1Cy9v4UMZ//U7L3nDQxLvlgAjfvte\n", "G5Uqd5jVbEo=\n"), (Throwable) e, false);
            }
        }
        r0.f199 = false;
    }

    public Y0(WebView webView, String str) {
        this.f300 = str;
        R0 r0 = new R0(webView);
        this.f299 = r0;
        m360();
        new X0(this);
        WebView webView2 = (WebView) r0.f201.get();
        if (webView2 != null) {
            try {
                i1.m384(webView2);
            } catch (Exception e) {
                AbstractC1290.m905(R0.f198, StringFog.decrypt("swNO5y4T7ZiCBVXmOxPdmJQyVPozXu++mhhZ5ig=\n", "9nE8iFwziv0=\n"), (Throwable) e, false);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0438
    /* JADX INFO: renamed from: ﾒ */
    public final void mo345(WebView webView) {
        for (InterfaceC0438 interfaceC0438 : new HashSet(this.f298)) {
            if (interfaceC0438 != null) {
                interfaceC0438.mo345(webView);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0438
    /* JADX INFO: renamed from: ﾒ */
    public final void mo347(WebView webView, String str, String str2) {
        for (InterfaceC0438 interfaceC0438 : new HashSet(this.f298)) {
            if (interfaceC0438 != null) {
                interfaceC0438.mo347(webView, str, str2);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0438
    /* JADX INFO: renamed from: ﾒ */
    public final void mo348(WebView webView, String str, boolean z) {
        for (InterfaceC0438 interfaceC0438 : new HashSet(this.f298)) {
            if (interfaceC0438 != null) {
                interfaceC0438.mo348(webView, str, z);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0438
    /* JADX INFO: renamed from: ﾒ */
    public final void mo346(WebView webView, String str) {
        for (InterfaceC0438 interfaceC0438 : new HashSet(this.f298)) {
            if (interfaceC0438 != null) {
                interfaceC0438.mo346(webView, str);
            }
        }
    }
}
