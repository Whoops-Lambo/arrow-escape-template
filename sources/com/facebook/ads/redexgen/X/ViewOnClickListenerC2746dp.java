package com.facebook.ads.redexgen.X;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class ViewOnClickListenerC2746dp implements View.OnClickListener {
    public final /* synthetic */ C1882Aq A00;

    public ViewOnClickListenerC2746dp(C1882Aq c1882Aq) {
        this.A00 = c1882Aq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3408oi.A02(this)) {
            return;
        }
        try {
            this.A00.A03.A04(EnumC3328nN.A0z, null);
            this.A00.A02.A0F().A4C();
            if (this.A00.A00 != null) {
                if (this.A00.A07()) {
                    this.A00.A00.setVolume(1.0f);
                } else {
                    this.A00.A00.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            AbstractC3408oi.A00(th, this);
        }
    }
}
