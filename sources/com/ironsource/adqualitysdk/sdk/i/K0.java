package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class K0 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ L0 f173;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f174;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f175;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ WebView f176;

    public K0(L0 l0, WebView webView, String str, boolean z) {
        this.f173 = l0;
        this.f176 = webView;
        this.f175 = str;
        this.f174 = z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        AbstractC4631n.m405(new J0(this, this.f176.getOriginalUrl(), this.f173.f178.mo353(this.f176)));
    }
}
