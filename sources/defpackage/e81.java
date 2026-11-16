package defpackage;

import android.util.Log;
import android.widget.FrameLayout;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class e81 implements ISDemandOnlyBannerListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public final void onBannerAdClicked(String str) {
        MediationBannerAdCallback mediationBannerAdCallback;
        Log.d("IronSourceMediationAdapter", "IronSource banner ad clicked for instance ID: " + str);
        d81 d81VarA = d81.a(str);
        if (d81VarA == null || (mediationBannerAdCallback = d81VarA.a) == null) {
            return;
        }
        mediationBannerAdCallback.onAdOpened();
        mediationBannerAdCallback.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public final void onBannerAdLeftApplication(String str) {
        MediationBannerAdCallback mediationBannerAdCallback;
        Log.d("IronSourceMediationAdapter", "IronSource banner ad has caused user to leave the application for instance ID: " + str);
        d81 d81VarA = d81.a(str);
        if (d81VarA == null || (mediationBannerAdCallback = d81VarA.a) == null) {
            return;
        }
        mediationBannerAdCallback.onAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public final void onBannerAdLoadFailed(String str, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w("IronSourceMediationAdapter", adError.toString());
        d81 d81VarA = d81.a(str);
        if (d81VarA == null) {
            return;
        }
        MediationAdLoadCallback mediationAdLoadCallback = d81VarA.b;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
        if (ironSourceError.getErrorCode() == 1050 || ironSourceError.getErrorCode() == 619) {
            return;
        }
        d81.f.remove(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public final void onBannerAdLoaded(String str) {
        FrameLayout frameLayout;
        Log.d("IronSourceMediationAdapter", "IronSource banner ad loaded for instance ID: " + str);
        d81 d81VarA = d81.a(str);
        if (d81VarA == null || (frameLayout = d81VarA.c) == null) {
            return;
        }
        frameLayout.addView(d81VarA.d);
        MediationAdLoadCallback mediationAdLoadCallback = d81VarA.b;
        if (mediationAdLoadCallback != null) {
            d81VarA.a = (MediationBannerAdCallback) mediationAdLoadCallback.onSuccess(d81VarA);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public final void onBannerAdShown(String str) {
        MediationBannerAdCallback mediationBannerAdCallback;
        Log.d("IronSourceMediationAdapter", "IronSource banner ad shown for instance ID: " + str);
        d81 d81VarA = d81.a(str);
        if (d81VarA != null && (mediationBannerAdCallback = d81VarA.a) != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
        for (String str2 : d81.f.keySet()) {
            if (!str2.equals(str)) {
                Log.d("IronSourceMediationAdapter", "IronSource Banner Destroy ad with instance ID: ".concat(str2));
                IronSource.destroyISDemandOnlyBanner(str2);
                d81.f.remove(str2);
            }
        }
    }
}
