package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements View.OnClickListener {
    public final /* synthetic */ f0 a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/player/controller/e0;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.p, view);
        safedk_e0_onClick_4d93ab782816bfab8a321d1b641091a8(view);
    }

    public e0(f0 f0Var) {
        this.a = f0Var;
    }

    public void safedk_e0_onClick_4d93ab782816bfab8a321d1b641091a8(View p0) {
        this.a.b.dismiss();
        this.a.a.getClass();
    }
}
