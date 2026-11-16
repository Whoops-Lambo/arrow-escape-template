package defpackage;

import android.util.Log;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class i81 implements ISDemandOnlyRewardedVideoListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdClicked(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        Log.d("IronSourceMediationAdapter", "IronSource rewarded ad clicked for instance ID: " + str);
        h81 h81VarA = h81.a(str);
        if (h81VarA == null || (mediationRewardedAdCallback = h81VarA.a) == null) {
            return;
        }
        mediationRewardedAdCallback.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdClosed(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        Log.d("IronSourceMediationAdapter", "IronSource rewarded ad closed for instance ID: " + str);
        h81 h81VarA = h81.a(str);
        if (h81VarA != null && (mediationRewardedAdCallback = h81VarA.a) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        h81.d.remove(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        MediationAdLoadCallback mediationAdLoadCallback;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.e("IronSourceMediationAdapter", adError.toString());
        h81 h81VarA = h81.a(str);
        if (h81VarA != null && (mediationAdLoadCallback = h81VarA.b) != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
        h81.d.remove(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdLoadSuccess(String str) {
        MediationAdLoadCallback mediationAdLoadCallback;
        Log.d("IronSourceMediationAdapter", "IronSource rewarded ad loaded for instance ID: " + str);
        h81 h81VarA = h81.a(str);
        if (h81VarA == null || (mediationAdLoadCallback = h81VarA.b) == null) {
            return;
        }
        h81VarA.a = (MediationRewardedAdCallback) mediationAdLoadCallback.onSuccess(h81VarA);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdOpened(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        Log.d("IronSourceMediationAdapter", "IronSource rewarded ad opened for instance ID: " + str);
        h81 h81VarA = h81.a(str);
        if (h81VarA == null || (mediationRewardedAdCallback = h81VarA.a) == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        mediationRewardedAdCallback.onVideoStart();
        mediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdRewarded(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        Log.d("IronSourceMediationAdapter", "IronSource rewarded ad received reward for instance ID: " + str);
        h81 h81VarA = h81.a(str);
        if (h81VarA == null || (mediationRewardedAdCallback = h81VarA.a) == null) {
            return;
        }
        mediationRewardedAdCallback.onVideoComplete();
        mediationRewardedAdCallback.onUserEarnedReward();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public final void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.e("IronSourceMediationAdapter", adError.toString());
        h81 h81VarA = h81.a(str);
        if (h81VarA != null && (mediationRewardedAdCallback = h81VarA.a) != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
        h81.d.remove(str);
    }
}
