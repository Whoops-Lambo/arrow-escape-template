package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class j implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/j;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_j_onClick_de0d2565025937b8ee6b9157ff655a60(view);
    }

    public j(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    public void safedk_j_onClick_de0d2565025937b8ee6b9157ff655a60(View p0) {
        WebView webView = this.a.e;
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        this.a.e.goBack();
    }
}
