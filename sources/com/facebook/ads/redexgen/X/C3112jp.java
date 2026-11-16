package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.InitApi;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C3112jp implements InitApi {
    @Override // com.facebook.ads.internal.api.InitApi
    public final void initialize(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i) {
        C3247m4.A0G(C3110jn.A09(context), multithreadedBundleWrapper, initListener, i);
    }

    @Override // com.facebook.ads.internal.api.InitApi
    public final boolean isInitialized() {
        return C3247m4.A0H();
    }

    @Override // com.facebook.ads.internal.api.InitApi
    public final void onAdLoadInvoked(Context context) {
        C3247m4.A08(C3110jn.A09(context));
    }

    @Override // com.facebook.ads.internal.api.InitApi
    public final void onContentProviderCreated(Context context) {
        C3247m4.A09(C3110jn.A09(context));
    }
}
