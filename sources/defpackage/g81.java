package defpackage;

import android.util.Log;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class g81 implements ISDemandOnlyInterstitialListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdClicked(String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        Log.d("IronSourceMediationAdapter", "IronSource interstitial ad clicked for instance ID: " + str);
        f81 f81VarA = f81.a(str);
        if (f81VarA == null || (mediationInterstitialAdCallback = f81VarA.a) == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdClosed(String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        Log.d("IronSourceMediationAdapter", "IronSource interstitial ad closed for instance ID: " + str);
        f81 f81VarA = f81.a(str);
        if (f81VarA != null && (mediationInterstitialAdCallback = f81VarA.a) != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
        f81.d.remove(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        MediationAdLoadCallback mediationAdLoadCallback;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w("IronSourceMediationAdapter", adError.toString());
        f81 f81VarA = f81.a(str);
        if (f81VarA != null && (mediationAdLoadCallback = f81VarA.b) != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
        f81.d.remove(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdOpened(String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        Log.d("IronSourceMediationAdapter", "IronSource interstitial ad opened for instance ID: " + str);
        f81 f81VarA = f81.a(str);
        if (f81VarA == null || (mediationInterstitialAdCallback = f81VarA.a) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdOpened();
        mediationInterstitialAdCallback.reportAdImpression();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdReady(String str) {
        MediationAdLoadCallback mediationAdLoadCallback;
        Log.d("IronSourceMediationAdapter", "IronSource interstitial ad is ready for instance ID: " + str);
        f81 f81VarA = f81.a(str);
        if (f81VarA == null || (mediationAdLoadCallback = f81VarA.b) == null) {
            return;
        }
        f81VarA.a = (MediationInterstitialAdCallback) mediationAdLoadCallback.onSuccess(f81VarA);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public final void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w("IronSourceMediationAdapter", adError.toString());
        f81 f81VarA = f81.a(str);
        if (f81VarA != null && (mediationInterstitialAdCallback = f81VarA.a) != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
        f81.d.remove(str);
    }
}
