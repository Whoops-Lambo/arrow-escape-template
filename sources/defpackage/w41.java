package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class w41 extends InterstitialAdEventListener implements MediationInterstitialAd {
    public x41 a;
    public final MediationAdLoadCallback b;
    public final v41 c;
    public MediationInterstitialAdCallback d;
    public final n41 e;

    public abstract void b(x41 x41Var, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration);

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map map) {
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdClicked(InMobiInterstitial inMobiInterstitial, Map map) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad has been clicked.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad has been dismissed.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
        AdError adErrorJ = at.j(106, "InMobi SDK failed to display an interstitial ad.");
        Log.e(InMobiMediationAdapter.TAG, adErrorJ.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorJ);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad has been shown.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi SDK fetched the interstitial ad successfully, but the ad contents still need to be loaded.");
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdImpression(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad has logged an impression.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adError = new AdError(p41.c(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage(), "com.inmobi.sdk");
        Log.e(InMobiMediationAdapter.TAG, adError.toString());
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public final void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad has been loaded.");
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (mediationAdLoadCallback != null) {
            this.d = (MediationInterstitialAdCallback) mediationAdLoadCallback.onSuccess(this);
        }
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad will be shown.");
    }

    @Override // com.inmobi.ads.listeners.InterstitialAdEventListener
    public final void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi interstitial ad has caused the user to leave the application.");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        if (((InMobiInterstitial) this.a.b).isReady()) {
            ((InMobiInterstitial) this.a.b).show();
            return;
        }
        AdError adErrorJ = at.j(105, "InMobi interstitial ad is not yet ready to be shown.");
        Log.w(InMobiMediationAdapter.TAG, adErrorJ.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorJ);
        }
    }

    public w41(MediationAdLoadCallback mediationAdLoadCallback, v41 v41Var, n41 n41Var) {
        this.b = mediationAdLoadCallback;
        this.c = v41Var;
        this.e = n41Var;
    }

    public final void a(Context context, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        long jD = p41.d(mediationInterstitialAdConfiguration.getServerParameters());
        this.e.getClass();
        this.a = new x41(new InMobiInterstitial(context, jD, this), 0);
        p41.e();
        p41.a(mediationInterstitialAdConfiguration.getMediationExtras());
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            x41 x41Var = this.a;
            ((InMobiInterstitial) x41Var.b).setWatermarkData(new WatermarkData(watermark, 0.3f));
        }
        b(this.a, mediationInterstitialAdConfiguration);
    }
}
