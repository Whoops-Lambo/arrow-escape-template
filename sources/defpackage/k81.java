package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class k81 implements MediationInterstitialAd, InterstitialAdLoaderListener, InterstitialAdListener {
    public MediationInterstitialAdCallback a;
    public final MediationAdLoadCallback b;
    public InterstitialAd c = null;

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public final void onInterstitialAdClicked(InterstitialAd interstitialAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.a;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public final void onInterstitialAdDismissed(InterstitialAd interstitialAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.a;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        Log.e("IronSourceMediationAdapter", ironSourceError.toString());
        this.b.onFailure(new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN));
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener
    public final void onInterstitialAdLoaded(InterstitialAd interstitialAd) {
        this.c = interstitialAd;
        this.a = (MediationInterstitialAdCallback) this.b.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public final void onInterstitialAdShown(InterstitialAd interstitialAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.a;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdOpened();
        this.a.reportAdImpression();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        if (this.c == null) {
            AdError adErrorD = rd1.d(107, "ad is null");
            Log.e("IronSourceMediationAdapter", adErrorD.toString());
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.a;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdFailedToShow(adErrorD);
                return;
            }
            return;
        }
        try {
            Log.d("IronSourceMediationAdapter", "Showing IronSource interstitial ad");
            this.c.setListener(this);
            this.c.show((Activity) context);
        } catch (ClassCastException unused) {
            AdError adErrorD2 = rd1.d(102, "IronSource requires an Activity context to load ads.");
            Log.e("IronSourceMediationAdapter", adErrorD2.toString());
            MediationInterstitialAdCallback mediationInterstitialAdCallback2 = this.a;
            if (mediationInterstitialAdCallback2 != null) {
                mediationInterstitialAdCallback2.onAdFailedToShow(adErrorD2);
            }
        }
    }

    public k81(MediationAdLoadCallback mediationAdLoadCallback) {
        this.b = mediationAdLoadCallback;
    }

    @Override // com.unity3d.ironsourceads.interstitial.InterstitialAdListener
    public final void onInterstitialAdFailedToShow(InterstitialAd interstitialAd, IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.e("IronSourceMediationAdapter", adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.a;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }
}
