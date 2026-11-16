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
import com.google.android.libraries.ads.mobile.sdk.rewarded.OnUserEarnedRewardListener;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardItem;
import com.google.android.libraries.ads.mobile.sdk.rewarded.ServerSideVerificationOptions;
import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAdEventCallback;
import com.google.unity.ads.PluginUtils;
import defpackage.nj2;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class UnityRewardedInterstitialAd extends UnityAdBase<RewardedInterstitialAd, UnityRewardedInterstitialAdCallback> {
    private final AdWrapper<RewardedInterstitialAd> adWrapper;

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements AdLoadCallback<RewardedInterstitialAd> {
        final /* synthetic */ UnityRewardedInterstitialAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onRewardedInterstitialAdFailedToLoad(loadAdError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onRewardedInterstitialAdLoaded();
            }
        }

        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            this.this$0.executor.execute(new b(18, this, loadAdError));
            this.this$0.ad = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onAdLoaded(@NonNull RewardedInterstitialAd rewardedInterstitialAd) {
            UnityRewardedInterstitialAd unityRewardedInterstitialAd = this.this$0;
            unityRewardedInterstitialAd.ad = rewardedInterstitialAd;
            unityRewardedInterstitialAd.executor.execute(new d(this, 5));
        }

        public AnonymousClass1(UnityRewardedInterstitialAd unityRewardedInterstitialAd) {
            Objects.requireNonNull(unityRewardedInterstitialAd);
            this.this$0 = unityRewardedInterstitialAd;
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 implements RewardedInterstitialAdEventCallback {
        final /* synthetic */ UnityRewardedInterstitialAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClicked$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onAdClicked();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdDismissedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onAdDismissedFullScreenContent();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToShowFullScreenContent$0(FullScreenContentError fullScreenContentError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdImpression$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onAdImpression();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPaid$0(AdValue adValue) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShowedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onAdShowedFullScreenContent();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new j(this, 3));
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new j(this, 1));
            this.this$0.ad = null;
        }

        public void onAdFailedToShowFullScreenContent(@NonNull FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new b(19, this, fullScreenContentError));
            this.this$0.ad = null;
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new j(this, 2));
        }

        public void onAdPaid(@NonNull AdValue adValue) {
            this.this$0.executor.execute(new b(20, this, adValue));
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new j(this, 0));
        }

        public AnonymousClass2(UnityRewardedInterstitialAd unityRewardedInterstitialAd) {
            Objects.requireNonNull(unityRewardedInterstitialAd);
            this.this$0 = unityRewardedInterstitialAd;
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedInterstitialAd$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass3 implements OnUserEarnedRewardListener {
        final /* synthetic */ UnityRewardedInterstitialAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onUserEarnedReward$0(RewardItem rewardItem) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedInterstitialAdCallback) callbackt).onUserEarnedReward(rewardItem.getType(), rewardItem.getAmount());
            }
        }

        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
            this.this$0.executor.execute(new b(21, this, rewardItem));
        }

        public AnonymousClass3(UnityRewardedInterstitialAd unityRewardedInterstitialAd) {
            Objects.requireNonNull(unityRewardedInterstitialAd);
            this.this$0 = unityRewardedInterstitialAd;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        ((RewardedInterstitialAd) this.ad).show(this.activity, new AnonymousClass3(this));
    }

    @Nullable
    public String getAdUnitId() {
        AdT adt = this.ad;
        if (adt == 0) {
            return null;
        }
        return ((RewardedInterstitialAd) adt).getAdUnitId();
    }

    public long getPlacementId() {
        AdT adt = this.ad;
        if (adt == 0) {
            return 0L;
        }
        return ((RewardedInterstitialAd) adt).getPlacementId();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        AdT adt = this.ad;
        if (adt != 0) {
            return ((RewardedInterstitialAd) adt).getResponseInfo();
        }
        Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
        return null;
    }

    @Nullable
    public RewardItem getRewardItem() {
        AdT adt = this.ad;
        if (adt != 0) {
            return ((RewardedInterstitialAd) adt).getRewardItem();
        }
        Log.e(PluginUtils.LOGTAG, "Tried to get reward item before it was ready. Unable to get reward item.");
        return null;
    }

    @VisibleForTesting
    public RewardedInterstitialAd getRewardedInterstitialAd() {
        return (RewardedInterstitialAd) this.ad;
    }

    public void load(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new AnonymousClass1(this));
    }

    public void setPlacementId(long j) {
        AdT adt = this.ad;
        if (adt == 0) {
            return;
        }
        ((RewardedInterstitialAd) adt).setPlacementId(j);
    }

    public void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        AdT adt = this.ad;
        if (adt == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to set server side verification before ad was ready. Returning.");
        } else {
            ((RewardedInterstitialAd) adt).setServerSideVerificationOptions(serverSideVerificationOptions);
        }
    }

    public void show() {
        AdT adt = this.ad;
        if (adt == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to show rewarded interstitial ad before it was ready. Please call load first and wait for a successful onAdLoaded callback.");
            return;
        }
        ((RewardedInterstitialAd) adt).setAdEventCallback(new AnonymousClass2(this));
        ((RewardedInterstitialAd) this.ad).setImmersiveMode(true);
        this.activity.runOnUiThread(new nj2(this, 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnityRewardedInterstitialAd(Activity activity, UnityRewardedInterstitialAdCallback unityRewardedInterstitialAdCallback, RewardedInterstitialAd rewardedInterstitialAd) {
        this(activity, unityRewardedInterstitialAdCallback, AdWrapper.forRewardedInterstitial(), UnityExecutor.getExecutor());
        this.ad = rewardedInterstitialAd;
    }

    public UnityRewardedInterstitialAd(Activity activity, UnityRewardedInterstitialAdCallback unityRewardedInterstitialAdCallback) {
        this(activity, unityRewardedInterstitialAdCallback, AdWrapper.forRewardedInterstitial(), UnityExecutor.getExecutor());
    }

    @VisibleForTesting
    public UnityRewardedInterstitialAd(Activity activity, UnityRewardedInterstitialAdCallback unityRewardedInterstitialAdCallback, AdWrapper<RewardedInterstitialAd> adWrapper, Executor executor) {
        super(activity, unityRewardedInterstitialAdCallback, executor);
        this.adWrapper = adWrapper;
    }
}
