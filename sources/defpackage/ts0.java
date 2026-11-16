package defpackage;

import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ts0 implements OnFyberMarketplaceInitializedListener {
    public final /* synthetic */ InitializationCompleteCallback a;

    @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
    public final void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus2 = OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY;
        InitializationCompleteCallback initializationCompleteCallback = this.a;
        if (fyberInitStatus == fyberInitStatus2) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        AdError adErrorB = g40.b(fyberInitStatus);
        InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.c;
        Log.w("FyberMediationAdapter", adErrorB.getMessage());
        initializationCompleteCallback.onInitializationFailed(adErrorB.getMessage());
    }

    public ts0(InitializationCompleteCallback initializationCompleteCallback) {
        this.a = initializationCompleteCallback;
    }
}
