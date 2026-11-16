package com.fyber.inneractive.sdk.activities;

import android.view.View;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class l implements View.OnClickListener {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/l;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_l_onClick_d7c7888abfb6187679676e7d36a80bd0(view);
    }

    public l(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    public void safedk_l_onClick_d7c7888abfb6187679676e7d36a80bd0(View p0) {
        WebView webView = this.a.e;
        if (webView != null) {
            webView.reload();
            int i = IAlog.a;
            IAlog.d("%s %s", "AD_INTERNAL_BROWSER_REFRESH", this.a.e.getUrl());
        }
    }
}
