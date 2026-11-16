package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class z63 implements MediationInterstitialAd, InterstitialAdListener {
    public final MediationAdLoadCallback a;
    public final w63 b;
    public InterstitialAd c;
    public MediationInterstitialAdCallback d;

    public abstract String a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration);

    public abstract void b(AdConfig adConfig, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration);

    public z63(MediationAdLoadCallback mediationAdLoadCallback, w63 w63Var) {
        mediationAdLoadCallback.getClass();
        w63Var.getClass();
        this.a = mediationAdLoadCallback;
        this.b = w63Var;
    }

    public final void c(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        mediationInterstitialAdConfiguration.getClass();
        Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        mediationExtras.getClass();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        serverParameters.getClass();
        String string = serverParameters.getString("appid");
        MediationAdLoadCallback mediationAdLoadCallback = this.a;
        if (string != null && string.length() != 0) {
            String string2 = serverParameters.getString("placementID");
            if (string2 != null && string2.length() != 0) {
                Context context = mediationInterstitialAdConfiguration.getContext();
                context.getClass();
                y63.c.a(string, context, new t63(this, mediationExtras, mediationInterstitialAdConfiguration, context, string2, 2));
                return;
            } else {
                AdError adError = new AdError(101, "Failed to load interstitial ad from Liftoff Monetize. Missing or Invalid Placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
                Log.w(VungleMediationAdapter.TAG, adError.toString());
                mediationAdLoadCallback.onFailure(adError);
                return;
            }
        }
        AdError adError2 = new AdError(101, "Failed to load interstitial ad from Liftoff Monetize. Missing or invalid App ID.", VungleMediationAdapter.ERROR_DOMAIN);
        Log.w(VungleMediationAdapter.TAG, adError2.toString());
        mediationAdLoadCallback.onFailure(adError2);
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        baseAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null && mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
        baseAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null && mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        baseAd.getClass();
        vungleError.getClass();
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        adError.getClass();
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.a.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        baseAd.getClass();
        vungleError.getClass();
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        adError.getClass();
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null && mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
        baseAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null && mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
        baseAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null && mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        baseAd.getClass();
        this.d = (MediationInterstitialAdCallback) this.a.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
        baseAd.getClass();
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.d;
        if (mediationInterstitialAdCallback != null && mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        context.getClass();
        InterstitialAd interstitialAd = this.c;
        if (interstitialAd != null) {
            if (interstitialAd != null) {
                interstitialAd.play(context);
                return;
            } else {
                s71.D("interstitialAd");
                throw null;
            }
        }
        s71.D("interstitialAd");
        throw null;
    }
}
