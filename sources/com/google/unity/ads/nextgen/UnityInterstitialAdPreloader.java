package com.google.unity.ads.nextgen;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAdPreloader;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class UnityInterstitialAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;
    private final InterstitialAdPreloaderWrapper preloaderWrapper;
    private final ExecutorService service;

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityInterstitialAdPreloader$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements PreloadCallback {
        final /* synthetic */ UnityInterstitialAdPreloader this$0;

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
            this.this$0.service.execute(new e(this, str, 6, loadAdError));
        }

        public void onAdPreloaded(@NonNull String str, ResponseInfo responseInfo) {
            this.this$0.service.execute(new e(this, str, 7, responseInfo));
        }

        public void onAdsExhausted(@NonNull String str) {
            this.this$0.service.execute(new b(10, this, str));
        }

        public AnonymousClass1(UnityInterstitialAdPreloader unityInterstitialAdPreloader) {
            Objects.requireNonNull(unityInterstitialAdPreloader);
            this.this$0 = unityInterstitialAdPreloader;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @VisibleForTesting
    public static class InterstitialAdPreloaderWrapper {
        public boolean destroy(String str) {
            return InterstitialAdPreloader.destroy(str);
        }

        public void destroyAll() {
            InterstitialAdPreloader.destroyAll();
        }

        public PreloadConfiguration getConfiguration(String str) {
            return InterstitialAdPreloader.getConfiguration(str);
        }

        public Map<String, PreloadConfiguration> getConfigurations() {
            return InterstitialAdPreloader.getConfigurations();
        }

        public int getNumAdsAvailable(String str) {
            return InterstitialAdPreloader.getNumAdsAvailable(str);
        }

        public boolean isAdAvailable(String str) {
            return InterstitialAdPreloader.isAdAvailable(str);
        }

        @Nullable
        public ResponseInfo peekAdResponseInfo(String str) {
            return InterstitialAdPreloader.peekAdResponseInfo(str);
        }

        public InterstitialAd pollAd(String str) {
            return InterstitialAdPreloader.pollAd(str);
        }

        public boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallback preloadCallback) {
            return InterstitialAdPreloader.start(str, preloadConfiguration, preloadCallback);
        }
    }

    public UnityInterstitialAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback) {
        this(activity, unityPreloadCallback, new InterstitialAdPreloaderWrapper(), UnityExecutor.getPreloaderExecutor());
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
    public ResponseInfo peekAdResponseInfo(String str) {
        return this.preloaderWrapper.peekAdResponseInfo(str);
    }

    @Nullable
    public UnityInterstitialAd pollAd(String str, UnityInterstitialAdCallback unityInterstitialAdCallback) {
        InterstitialAd interstitialAdPollAd = this.preloaderWrapper.pollAd(str);
        if (interstitialAdPollAd == null) {
            return null;
        }
        return new UnityInterstitialAd(this.activity, unityInterstitialAdCallback, interstitialAdPollAd);
    }

    public boolean start(String str, PreloadConfiguration preloadConfiguration) {
        return this.preloaderWrapper.start(str, preloadConfiguration, new AnonymousClass1(this));
    }

    @VisibleForTesting
    public UnityInterstitialAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback, InterstitialAdPreloaderWrapper interstitialAdPreloaderWrapper, ExecutorService executorService) {
        this.activity = activity;
        this.preloadCallback = unityPreloadCallback;
        this.service = executorService;
        this.preloaderWrapper = interstitialAdPreloaderWrapper;
    }
}
