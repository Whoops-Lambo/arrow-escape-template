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
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAd;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.rewarded.ServerSideVerificationOptions;
import com.google.unity.ads.PluginUtils;
import defpackage.nj2;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class UnityRewardedAd extends UnityAdBase<RewardedAd, UnityRewardedAdCallback> {
    private final AdWrapper<RewardedAd> adWrapper;

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements AdLoadCallback<RewardedAd> {
        final /* synthetic */ UnityRewardedAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedAdCallback) callbackt).onRewardedAdFailedToLoad(loadAdError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedAdCallback) callbackt).onRewardedAdLoaded();
            }
        }

        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            this.this$0.executor.execute(new b(13, this, loadAdError));
            this.this$0.ad = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
            UnityRewardedAd unityRewardedAd = this.this$0;
            unityRewardedAd.ad = rewardedAd;
            unityRewardedAd.executor.execute(new d(this, 4));
        }

        public AnonymousClass1(UnityRewardedAd unityRewardedAd) {
            Objects.requireNonNull(unityRewardedAd);
            this.this$0 = unityRewardedAd;
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedAd$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 implements RewardedAdEventCallback {
        final /* synthetic */ UnityRewardedAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClicked$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedAdCallback) callbackt).onAdClicked();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdDismissedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedAdCallback) callbackt).onAdDismissedFullScreenContent();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToShowFullScreenContent$0(FullScreenContentError fullScreenContentError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedAdCallback) callbackt).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdImpression$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedAdCallback) callbackt).onAdImpression();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPaid$0(AdValue adValue) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedAdCallback) callbackt).onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShowedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedAdCallback) callbackt).onAdShowedFullScreenContent();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new i(this, 3));
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new i(this, 2));
            this.this$0.ad = null;
        }

        public void onAdFailedToShowFullScreenContent(@NonNull FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new b(15, this, fullScreenContentError));
            this.this$0.ad = null;
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new i(this, 0));
        }

        public void onAdPaid(@NonNull AdValue adValue) {
            this.this$0.executor.execute(new b(14, this, adValue));
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new i(this, 1));
        }

        public AnonymousClass2(UnityRewardedAd unityRewardedAd) {
            Objects.requireNonNull(unityRewardedAd);
            this.this$0 = unityRewardedAd;
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedAd$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass3 implements OnUserEarnedRewardListener {
        final /* synthetic */ UnityRewardedAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onUserEarnedReward$0(RewardItem rewardItem) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityRewardedAdCallback) callbackt).onUserEarnedReward(rewardItem.getType(), rewardItem.getAmount());
            }
        }

        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
            this.this$0.executor.execute(new b(16, this, rewardItem));
        }

        public AnonymousClass3(UnityRewardedAd unityRewardedAd) {
            Objects.requireNonNull(unityRewardedAd);
            this.this$0 = unityRewardedAd;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        ((RewardedAd) this.ad).show(this.activity, new AnonymousClass3(this));
    }

    @Nullable
    public String getAdUnitId() {
        AdT adt = this.ad;
        if (adt == 0) {
            return null;
        }
        return ((RewardedAd) adt).getAdUnitId();
    }

    public long getPlacementId() {
        AdT adt = this.ad;
        if (adt == 0) {
            return 0L;
        }
        return ((RewardedAd) adt).getPlacementId();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        AdT adt = this.ad;
        if (adt != 0) {
            return ((RewardedAd) adt).getResponseInfo();
        }
        Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
        return null;
    }

    @Nullable
    public RewardItem getRewardItem() {
        AdT adt = this.ad;
        if (adt != 0) {
            return ((RewardedAd) adt).getRewardItem();
        }
        Log.e(PluginUtils.LOGTAG, "Tried to get reward item before it was ready. Unable to get reward item.");
        return null;
    }

    @VisibleForTesting
    public RewardedAd getRewardedAd() {
        return (RewardedAd) this.ad;
    }

    public void load(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new AnonymousClass1(this));
    }

    public void setPlacementId(long j) {
        AdT adt = this.ad;
        if (adt == 0) {
            return;
        }
        ((RewardedAd) adt).setPlacementId(j);
    }

    public void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        AdT adt = this.ad;
        if (adt == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to set server side verification before ad was ready. Returning.");
        } else {
            ((RewardedAd) adt).setServerSideVerificationOptions(serverSideVerificationOptions);
        }
    }

    public void show() {
        AdT adt = this.ad;
        if (adt == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to show rewarded ad before it was ready. Please call load first and wait for a successful onAdLoaded callback.");
            return;
        }
        ((RewardedAd) adt).setAdEventCallback(new AnonymousClass2(this));
        ((RewardedAd) this.ad).setImmersiveMode(true);
        this.activity.runOnUiThread(new nj2(this, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnityRewardedAd(Activity activity, UnityRewardedAdCallback unityRewardedAdCallback, RewardedAd rewardedAd) {
        this(activity, unityRewardedAdCallback, AdWrapper.forRewarded(), UnityExecutor.getExecutor());
        this.ad = rewardedAd;
    }

    public UnityRewardedAd(Activity activity, UnityRewardedAdCallback unityRewardedAdCallback) {
        this(activity, unityRewardedAdCallback, AdWrapper.forRewarded(), UnityExecutor.getExecutor());
    }

    @VisibleForTesting
    public UnityRewardedAd(Activity activity, UnityRewardedAdCallback unityRewardedAdCallback, AdWrapper<RewardedAd> adWrapper, Executor executor) {
        super(activity, unityRewardedAdCallback, executor);
        this.adWrapper = adWrapper;
    }
}
