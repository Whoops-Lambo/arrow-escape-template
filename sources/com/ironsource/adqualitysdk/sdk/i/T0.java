package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class T0 extends AbstractRunnableC1096 {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ U0 f209;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f210;

    public T0(U0 u0, String str) {
        this.f209 = u0;
        this.f210 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC1096
    /* JADX INFO: renamed from: ﾒ */
    public final void mo344() {
        WebView webView = this.f209.f213;
        String str = this.f210;
        String str2 = i1.f370;
        if (webView != null) {
            if (webView.getHandler() == null && webView.getRootView() == null) {
                return;
            }
            StringBuilder sbM577 = AbstractC0688.m577("uLgBrUdCHPyirU2pQkACvbOtGK4cAw==\n", "0tl3zDQhbpU=\n", new StringBuilder(), str);
            sbM577.append(StringFog.decrypt("8FMVyA==\n", "0no882UbnT8=\n"));
            IronSourceNetworkBridge.webviewLoadUrl(webView, sbM577.toString());
        }
    }
}
