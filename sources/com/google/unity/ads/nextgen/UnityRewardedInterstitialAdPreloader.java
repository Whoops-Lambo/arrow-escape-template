package com.google.unity.ads.nextgen;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.rewardedinterstitial.RewardedInterstitialAdPreloader;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class UnityRewardedInterstitialAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;
    private final RewardedInterstitialAdPreloaderWrapper preloaderWrapper;
    private final ExecutorService service;

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityRewardedInterstitialAdPreloader$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements PreloadCallback {
        final /* synthetic */ UnityRewardedInterstitialAdPreloader this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToPreload$0(String str, LoadAdError loadAdError) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdFailedToPreload(str, loadAdError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPreloaded$0(String str, ResponseInfo responseInfo) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdPreloaded(str, responseInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdsExhausted$0(String str) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdsExhausted(str);
            }
        }

        public void onAdFailedToPreload(@NonNull String str, @NonNull LoadAdError loadAdError) {
            this.this$0.service.execute(new e(this, str, 10, loadAdError));
        }

        public void onAdPreloaded(@NonNull String str, ResponseInfo responseInfo) {
            this.this$0.service.execute(new e(this, str, 11, responseInfo));
        }

        public void onAdsExhausted(@NonNull String str) {
            this.this$0.service.execute(new b(22, this, str));
        }

        public AnonymousClass1(UnityRewardedInterstitialAdPreloader unityRewardedInterstitialAdPreloader) {
            Objects.requireNonNull(unityRewardedInterstitialAdPreloader);
            this.this$0 = unityRewardedInterstitialAdPreloader;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @VisibleForTesting
    public static class RewardedInterstitialAdPreloaderWrapper {
        public boolean destroy(String str) {
            return RewardedInterstitialAdPreloader.destroy(str);
        }

        public void destroyAll() {
            RewardedInterstitialAdPreloader.destroyAll();
        }

        public PreloadConfiguration getConfiguration(String str) {
            return RewardedInterstitialAdPreloader.getConfiguration(str);
        }

        public Map<String, PreloadConfiguration> getConfigurations() {
            return RewardedInterstitialAdPreloader.getConfigurations();
        }

        public int getNumAdsAvailable(String str) {
            return RewardedInterstitialAdPreloader.getNumAdsAvailable(str);
        }

        public boolean isAdAvailable(String str) {
            return RewardedInterstitialAdPreloader.isAdAvailable(str);
        }

        public RewardedInterstitialAd pollAd(String str) {
            return RewardedInterstitialAdPreloader.pollAd(str);
        }

        public boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallback preloadCallback) {
            return RewardedInterstitialAdPreloader.start(str, preloadConfiguration, preloadCallback);
        }
    }

    public UnityRewardedInterstitialAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback) {
        this(activity, unityPreloadCallback, new RewardedInterstitialAdPreloaderWrapper(), UnityExecutor.getPreloaderExecutor());
    }

    public void destroy(String str) {
        this.preloaderWrapper.destroy(str);
    }

    public void destroyAll() {
        this.preloaderWrapper.destroyAll();
    }

    @Nullable
    public PreloadConfiguration getConfiguration(String str) {
        return this.preloaderWrapper.getConfiguration(str);
    }

    public Map<String, PreloadConfiguration> getConfigurations() {
        return this.preloaderWrapper.getConfigurations();
    }

    public int getNumAdsAvailable(String str) {
        return this.preloaderWrapper.getNumAdsAvailable(str);
    }

    public boolean isAdAvailable(String str) {
        return this.preloaderWrapper.isAdAvailable(str);
    }

    @Nullable
    public UnityRewardedInterstitialAd pollAd(String str, UnityRewardedInterstitialAdCallback unityRewardedInterstitialAdCallback) {
        RewardedInterstitialAd rewardedInterstitialAdPollAd = this.preloaderWrapper.pollAd(str);
        if (rewardedInterstitialAdPollAd == null) {
            return null;
        }
        return new UnityRewardedInterstitialAd(this.activity, unityRewardedInterstitialAdCallback, rewardedInterstitialAdPollAd);
    }

    public boolean start(String str, PreloadConfiguration preloadConfiguration) {
        return this.preloaderWrapper.start(str, preloadConfiguration, new AnonymousClass1(this));
    }

    @VisibleForTesting
    public UnityRewardedInterstitialAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback, RewardedInterstitialAdPreloaderWrapper rewardedInterstitialAdPreloaderWrapper, ExecutorService executorService) {
        this.activity = activity;
        this.preloadCallback = unityPreloadCallback;
        this.service = executorService;
        this.preloaderWrapper = rewardedInterstitialAdPreloaderWrapper;
    }
}
