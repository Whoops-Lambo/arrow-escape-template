package com.google.unity.ads.nextgen;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAd;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdPreloader;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class UnityBannerAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;
    private final BannerAdPreloaderWrapper preloaderWrapper;
    private final ExecutorService service;

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityBannerAdPreloader$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements PreloadCallback {
        final /* synthetic */ UnityBannerAdPreloader this$0;

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
            this.this$0.service.execute(new e(this, str, 3, loadAdError));
        }

        public void onAdPreloaded(@NonNull String str, ResponseInfo responseInfo) {
            this.this$0.service.execute(new e(this, str, 4, responseInfo));
        }

        public void onAdsExhausted(@NonNull String str) {
            this.this$0.service.execute(new b(6, this, str));
        }

        public AnonymousClass1(UnityBannerAdPreloader unityBannerAdPreloader) {
            Objects.requireNonNull(unityBannerAdPreloader);
            this.this$0 = unityBannerAdPreloader;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @VisibleForTesting
    public static class BannerAdPreloaderWrapper {
        public boolean destroy(String str) {
            return BannerAdPreloader.destroy(str);
        }

        public PreloadConfiguration getConfiguration(String str) {
            return BannerAdPreloader.getConfiguration(str);
        }

        public Map<String, PreloadConfiguration> getConfigurations() {
            return BannerAdPreloader.getConfigurations();
        }

        public int getNumAdsAvailable(String str) {
            return BannerAdPreloader.getNumAdsAvailable(str);
        }

        public boolean isAdAvailable(String str) {
            return BannerAdPreloader.isAdAvailable(str);
        }

        public BannerAd pollAd(String str) {
            return BannerAdPreloader.pollAd(str);
        }

        public boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallback preloadCallback) {
            return BannerAdPreloader.start(str, preloadConfiguration, preloadCallback);
        }
    }

    public UnityBannerAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback) {
        this(activity, unityPreloadCallback, new BannerAdPreloaderWrapper(), UnityExecutor.getPreloaderExecutor());
    }

    public void destroy(String str) {
        this.preloaderWrapper.destroy(str);
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
    public UnityBannerAd pollAd(String str, UnityBannerAdCallback unityBannerAdCallback) {
        final BannerAd bannerAdPollAd = this.preloaderWrapper.pollAd(str);
        if (bannerAdPollAd == null) {
            return null;
        }
        return new UnityBannerAd(this.activity, unityBannerAdCallback, new AdWrapper(new AdWrapper.AdLoader<BannerAd>(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAdPreloader.2
            {
                Objects.requireNonNull(this);
            }

            @Override // com.google.unity.ads.nextgen.AdWrapper.AdLoader
            public void load(AdRequest adRequest, AdLoadCallback<BannerAd> adLoadCallback) {
                adLoadCallback.onAdLoaded(bannerAdPollAd);
            }
        }));
    }

    public boolean start(String str, PreloadConfiguration preloadConfiguration) {
        return this.preloaderWrapper.start(str, preloadConfiguration, new AnonymousClass1(this));
    }

    @VisibleForTesting
    public UnityBannerAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback, BannerAdPreloaderWrapper bannerAdPreloaderWrapper, ExecutorService executorService) {
        this.activity = activity;
        this.preloadCallback = unityPreloadCallback;
        this.service = executorService;
        this.preloaderWrapper = bannerAdPreloaderWrapper;
    }
}
