package com.google.unity.ads;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import defpackage.r71;
import defpackage.tk0;
import defpackage.x3;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class Interstitial {
    private final Activity activity;
    private final UnityInterstitialAdCallback callback;
    private InterstitialAd interstitialAd;
    private final FullScreenContentCallback fullScreenContentCallback = new AnonymousClass1(this);
    private final OnPaidEventListener onPaidEventListener = new AnonymousClass2(this);

    /* JADX INFO: renamed from: com.google.unity.ads.Interstitial$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 extends FullScreenContentCallback {
        final /* synthetic */ Interstitial this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClicked$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdClicked();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdDismissedFullScreenContent$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdDismissedFullScreenContent();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToShowFullScreenContent$0(AdError adError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdFailedToShowFullScreenContent(adError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdImpression$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdImpression();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShowedFullScreenContent$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdShowedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            new Thread(new a(this, 1)).start();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            new Thread(new a(this, 0)).start();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            new Thread(new b(0, this, adError)).start();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            new Thread(new a(this, 2)).start();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            new Thread(new a(this, 3)).start();
        }

        public AnonymousClass1(Interstitial interstitial) {
            Objects.requireNonNull(interstitial);
            this.this$0 = interstitial;
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.Interstitial$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 implements OnPaidEventListener {
        final /* synthetic */ Interstitial this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPaidEvent$0(AdValue adValue) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(AdValue adValue) {
            new Thread(new b(1, this, adValue)).start();
        }

        public AnonymousClass2(Interstitial interstitial) {
            Objects.requireNonNull(interstitial);
            this.this$0 = interstitial;
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.Interstitial$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass3 extends InterstitialAdLoadCallback {
        final /* synthetic */ Interstitial this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onInterstitialAdFailedToLoad(loadAdError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onInterstitialAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            new Thread(new b(2, this, loadAdError)).start();
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            this.this$0.interstitialAd = interstitialAd;
            this.this$0.interstitialAd.setOnPaidEventListener(this.this$0.onPaidEventListener);
            this.this$0.interstitialAd.setFullScreenContentCallback(this.this$0.fullScreenContentCallback);
            new Thread(new c(this, 0)).start();
        }

        public AnonymousClass3(Interstitial interstitial) {
            Objects.requireNonNull(interstitial);
            this.this$0 = interstitial;
        }
    }

    public void destroy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAd$0(String str, AdRequest adRequest) {
        InterstitialAd.load(this.activity, str, adRequest, new AnonymousClass3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pollAd$0(LoadAdError loadAdError) {
        UnityInterstitialAdCallback unityInterstitialAdCallback = this.callback;
        if (unityInterstitialAdCallback != null) {
            unityInterstitialAdCallback.onInterstitialAdFailedToLoad(loadAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pollAd$1() {
        this.interstitialAd.setOnPaidEventListener(this.onPaidEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setInterstitialAd$0() {
        this.interstitialAd.setOnPaidEventListener(this.onPaidEventListener);
        this.interstitialAd.setFullScreenContentCallback(this.fullScreenContentCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        this.interstitialAd.setImmersiveMode(true);
        this.interstitialAd.show(this.activity);
    }

    @Nullable
    public String getAdUnitId() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            return null;
        }
        return interstitialAd.getAdUnitId();
    }

    public long getPlacementId() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            return 0L;
        }
        return interstitialAd.getPlacementId();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            return interstitialAd.getResponseInfo();
        }
        Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
        return null;
    }

    public boolean isAdAvailable(@NonNull String str) {
        return InterstitialAd.isAdAvailable(this.activity, str);
    }

    public void loadAd(String str, AdRequest adRequest) {
        this.activity.runOnUiThread(new x3(16, this, str, adRequest));
    }

    public void pollAd(@NonNull String str) {
        InterstitialAd interstitialAdPollAd = InterstitialAd.pollAd(this.activity, str);
        this.interstitialAd = interstitialAdPollAd;
        if (interstitialAdPollAd == null) {
            Log.e(PluginUtils.LOGTAG, "Failed to obtain an Interstitial Ad from the preloader.");
            new Thread(new tk0(20, this, new LoadAdError(0, "Failed to obtain an Interstitial Ad from the preloader.", MobileAds.ERROR_DOMAIN, null, null))).start();
        } else {
            this.activity.runOnUiThread(new r71(this, 2));
            this.interstitialAd.setFullScreenContentCallback(this.fullScreenContentCallback);
            UnityInterstitialAdCallback unityInterstitialAdCallback = this.callback;
            if (unityInterstitialAdCallback != null) {
                unityInterstitialAdCallback.onInterstitialAdLoaded();
            }
        }
    }

    public void setInterstitialAd(InterstitialAd interstitialAd) {
        this.interstitialAd = interstitialAd;
        this.activity.runOnUiThread(new r71(this, 1));
    }

    public void setPlacementId(long j) {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.setPlacementId(j);
    }

    public void show() {
        if (this.interstitialAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show interstitial ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new r71(this, 0));
        }
    }

    public Interstitial(Activity activity, UnityInterstitialAdCallback unityInterstitialAdCallback) {
        this.activity = activity;
        this.callback = unityInterstitialAdCallback;
    }
}
