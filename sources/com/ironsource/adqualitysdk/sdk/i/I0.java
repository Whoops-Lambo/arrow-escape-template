package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class I0 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ L0 f164;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f165;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f166;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ WebView f167;

    public I0(L0 l0, WebView webView, String str, boolean z) {
        this.f164 = l0;
        this.f167 = webView;
        this.f166 = str;
        this.f165 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void mo344() {
        M0 m0 = this.f164.f178;
        if (m0.f185) {
            List list = m0.f188;
            if (list == null || list.isEmpty()) {
                L0 l0 = this.f164;
                WebView webView = this.f167;
                String str = this.f166;
                boolean z = this.f165;
                l0.getClass();
                AbstractC4631n.m403(new K0(l0, webView, str, z));
                return;
            }
            Iterator it = this.f164.f178.f188.iterator();
            while (it.hasNext()) {
                if (this.f166.startsWith((String) it.next())) {
                    L0 l1 = this.f164;
                    WebView webView2 = this.f167;
                    String str2 = this.f166;
                    boolean z2 = this.f165;
                    l1.getClass();
                    AbstractC4631n.m403(new K0(l1, webView2, str2, z2));
                    return;
                }
            }
        }
    }
}
