package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class d51 extends InterstitialAdEventListener implements MediationRewardedAd {
    public x41 a;
    public final MediationAdLoadCallback b;
    public final v41 c;
    public MediationRewardedAdCallback d;
    public final n41 e;

    public abstract void b(x41 x41Var, MediationRewardedAdConfiguration mediationRewardedAdConfiguration);

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onRequestPayloadCreated(byte[] bArr) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been dismissed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
        AdError adErrorJ = at.j(106, "InMobi rewarded ad failed to show.");
        Log.w(InMobiMediationAdapter.TAG, adErrorJ.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorJ);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been shown.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.d.onVideoStart();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi SDK fetched the rewarded ad successfully, but the ad contents still need to be loaded.");
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdImpression(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has logged an impression.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adError = new AdError(p41.c(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage(), "com.inmobi.sdk");
        Log.w(InMobiMediationAdapter.TAG, adError.toString());
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad has been loaded.");
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (mediationAdLoadCallback != null) {
            this.d = (MediationRewardedAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad will be shown.");
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map map) {
        if (this.d != null) {
            Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad credited the user with a reward.");
            this.d.onVideoComplete();
            this.d.onUserEarnedReward();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi rewarded ad left application.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        if (((InMobiInterstitial) this.a.b).isReady()) {
            ((InMobiInterstitial) this.a.b).show();
            return;
        }
        AdError adErrorJ = at.j(105, "InMobi rewarded ad is not yet ready to be shown.");
        Log.w(InMobiMediationAdapter.TAG, adErrorJ.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorJ);
        }
    }

    public d51(MediationAdLoadCallback mediationAdLoadCallback, v41 v41Var, n41 n41Var) {
        this.b = mediationAdLoadCallback;
        this.c = v41Var;
        this.e = n41Var;
    }

    public final void a(Context context, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        long jD = p41.d(mediationRewardedAdConfiguration.getServerParameters());
        this.e.getClass();
        this.a = new x41(new InMobiInterstitial(context, jD, this), 0);
        p41.e();
        p41.a(mediationRewardedAdConfiguration.getMediationExtras());
        String watermark = mediationRewardedAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            x41 x41Var = this.a;
            ((InMobiInterstitial) x41Var.b).setWatermarkData(new WatermarkData(watermark, 0.3f));
        }
        b(this.a, mediationRewardedAdConfiguration);
    }
}
