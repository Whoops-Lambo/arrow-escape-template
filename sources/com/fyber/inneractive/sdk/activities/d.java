package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements View.OnClickListener {
    public final /* synthetic */ InneractiveFullscreenAdActivity a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/activities/d;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_d_onClick_53433ba785fbce6dfb368015a84bf8b7(view);
    }

    public d(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.a = inneractiveFullscreenAdActivity;
    }

    public void safedk_d_onClick_53433ba785fbce6dfb368015a84bf8b7(View p0) {
        this.a.dismissAd(true);
    }
}
