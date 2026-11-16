package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class O0 extends M0 {
    @Override // com.ironsource.adqualitysdk.sdk.i.M0
    /* JADX INFO: renamed from: ﾇ */
    public final Object mo353(WebView webView) {
        Rect rect = AbstractC4634o0.f422;
        View view = webView;
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
        }
        return view;
    }
}
