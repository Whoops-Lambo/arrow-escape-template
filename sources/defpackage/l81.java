package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l81 implements MediationRewardedAd, RewardedAdLoaderListener, RewardedAdListener {
    public MediationRewardedAdCallback a;
    public final MediationAdLoadCallback b;
    public RewardedAd c = null;

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public final void onRewardedAdClicked(RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public final void onRewardedAdDismissed(RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdClosed();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
    public final void onRewardedAdLoaded(RewardedAd rewardedAd) {
        this.c = rewardedAd;
        this.a = (MediationRewardedAdCallback) this.b.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public final void onRewardedAdShown(RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        this.a.onVideoStart();
        this.a.reportAdImpression();
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public final void onUserEarnedReward(RewardedAd rewardedAd) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onVideoComplete();
        this.a.onUserEarnedReward();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        if (this.c == null) {
            AdError adErrorD = rd1.d(107, "ad is null");
            Log.w("IronSourceMediationAdapter", adErrorD.toString());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adErrorD);
                return;
            }
            return;
        }
        try {
            Log.d("IronSourceMediationAdapter", "Showing IronSource rewarded ad");
            this.c.setListener(this);
            this.c.show((Activity) context);
        } catch (ClassCastException unused) {
            AdError adErrorD2 = rd1.d(102, "IronSource requires an Activity context to load ads.");
            Log.w("IronSourceMediationAdapter", adErrorD2.toString());
            MediationRewardedAdCallback mediationRewardedAdCallback2 = this.a;
            if (mediationRewardedAdCallback2 != null) {
                mediationRewardedAdCallback2.onAdFailedToShow(adErrorD2);
            }
        }
    }

    public l81(MediationAdLoadCallback mediationAdLoadCallback) {
        this.b = mediationAdLoadCallback;
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdListener
    public final void onRewardedAdFailedToShow(RewardedAd rewardedAd, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w("IronSourceMediationAdapter", adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.a;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener
    public final void onRewardedAdLoadFailed(IronSourceError ironSourceError) {
        this.b.onFailure(new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN));
    }
}
