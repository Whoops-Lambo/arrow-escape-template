package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAdEventCallback;
import com.google.unity.ads.PluginUtils;
import defpackage.nj2;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class UnityInterstitialAd extends UnityAdBase<InterstitialAd, UnityInterstitialAdCallback> {
    private final AdWrapper<InterstitialAd> adWrapper;

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityInterstitialAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements AdLoadCallback<InterstitialAd> {
        final /* synthetic */ UnityInterstitialAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onInterstitialAdFailedToLoad(loadAdError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onInterstitialAdLoaded();
            }
        }

        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            this.this$0.executor.execute(new b(7, this, loadAdError));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            UnityInterstitialAd unityInterstitialAd = this.this$0;
            unityInterstitialAd.ad = interstitialAd;
            unityInterstitialAd.executor.execute(new d(this, 2));
        }

        public AnonymousClass1(UnityInterstitialAd unityInterstitialAd) {
            Objects.requireNonNull(unityInterstitialAd);
            this.this$0 = unityInterstitialAd;
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityInterstitialAd$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 implements InterstitialAdEventCallback {
        final /* synthetic */ UnityInterstitialAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClicked$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onAdClicked();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdDismissedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onAdDismissedFullScreenContent();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToShowFullScreenContent$0(FullScreenContentError fullScreenContentError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdImpression$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onAdImpression();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPaid$0(AdValue adValue) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShowedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onAdShowedFullScreenContent();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAppEvent$0(String str, String str2) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityInterstitialAdCallback) callbackt).onAppEvent(str, str2);
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new g(this, 0));
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new g(this, 3));
            this.this$0.ad = null;
        }

        public void onAdFailedToShowFullScreenContent(@NonNull FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new b(8, this, fullScreenContentError));
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new g(this, 1));
        }

        public void onAdPaid(@NonNull AdValue adValue) {
            this.this$0.executor.execute(new b(9, this, adValue));
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new g(this, 2));
        }

        public void onAppEvent(@NonNull String str, @Nullable String str2) {
            this.this$0.executor.execute(new e(this, str, 5, str2));
        }

        public AnonymousClass2(UnityInterstitialAd unityInterstitialAd) {
            Objects.requireNonNull(unityInterstitialAd);
            this.this$0 = unityInterstitialAd;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        ((InterstitialAd) this.ad).show(this.activity);
    }

    @Nullable
    public String getAdUnitId() {
        AdT adt = this.ad;
        if (adt == 0) {
            return null;
        }
        return ((InterstitialAd) adt).getAdUnitId();
    }

    @VisibleForTesting
    public InterstitialAd getInterstitialAd() {
        return (InterstitialAd) this.ad;
    }

    public long getPlacementId() {
        AdT adt = this.ad;
        if (adt == 0) {
            return 0L;
        }
        return ((InterstitialAd) adt).getPlacementId();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        AdT adt = this.ad;
        if (adt != 0) {
            return ((InterstitialAd) adt).getResponseInfo();
        }
        Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
        return null;
    }

    public void load(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new AnonymousClass1(this));
    }

    public void setPlacementId(long j) {
        AdT adt = this.ad;
        if (adt == 0) {
            return;
        }
        ((InterstitialAd) adt).setPlacementId(j);
    }

    public void show() {
        AdT adt = this.ad;
        if (adt == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to show intertitial ad before it was ready. Please call loadAd first and wait for a successful onAdLoaded callback.");
            return;
        }
        ((InterstitialAd) adt).setAdEventCallback(new AnonymousClass2(this));
        ((InterstitialAd) this.ad).setImmersiveMode(true);
        this.activity.runOnUiThread(new nj2(this, 13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnityInterstitialAd(Activity activity, UnityInterstitialAdCallback unityInterstitialAdCallback, InterstitialAd interstitialAd) {
        this(activity, unityInterstitialAdCallback, AdWrapper.forInterstitial(), UnityExecutor.getExecutor());
        this.ad = interstitialAd;
    }

    public UnityInterstitialAd(Activity activity, UnityInterstitialAdCallback unityInterstitialAdCallback) {
        this(activity, unityInterstitialAdCallback, AdWrapper.forInterstitial(), UnityExecutor.getExecutor());
    }

    @VisibleForTesting
    public UnityInterstitialAd(Activity activity, UnityInterstitialAdCallback unityInterstitialAdCallback, AdWrapper<InterstitialAd> adWrapper, Executor executor) {
        super(activity, unityInterstitialAdCallback, executor);
        this.adWrapper = adWrapper;
    }
}
