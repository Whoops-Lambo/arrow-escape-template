package com.google.unity.ads.nextgen;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAd;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAdPreloader;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.PreloadConfiguration;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class UnityAppOpenAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;
    private final AppOpenAdPreloaderWrapper preloaderWrapper;
    private final ExecutorService service;

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityAppOpenAdPreloader$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements PreloadCallback {
        final /* synthetic */ UnityAppOpenAdPreloader this$0;

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
            this.this$0.service.execute(new e(this, str, 0, loadAdError));
        }

        public void onAdPreloaded(@NonNull String str, ResponseInfo responseInfo) {
            this.this$0.service.execute(new e(this, str, 1, responseInfo));
        }

        public void onAdsExhausted(@NonNull String str) {
            this.this$0.service.execute(new b(3, this, str));
        }

        public AnonymousClass1(UnityAppOpenAdPreloader unityAppOpenAdPreloader) {
            Objects.requireNonNull(unityAppOpenAdPreloader);
            this.this$0 = unityAppOpenAdPreloader;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @VisibleForTesting
    public static class AppOpenAdPreloaderWrapper {
        public boolean destroy(String str) {
            return AppOpenAdPreloader.destroy(str);
        }

        public void destroyAll() {
            AppOpenAdPreloader.destroyAll();
        }

        public PreloadConfiguration getConfiguration(String str) {
            return AppOpenAdPreloader.getConfiguration(str);
        }

        public Map<String, PreloadConfiguration> getConfigurations() {
            return AppOpenAdPreloader.getConfigurations();
        }

        public int getNumAdsAvailable(String str) {
            return AppOpenAdPreloader.getNumAdsAvailable(str);
        }

        public boolean isAdAvailable(String str) {
            return AppOpenAdPreloader.isAdAvailable(str);
        }

        @Nullable
        public ResponseInfo peekAdResponseInfo(String str) {
            return AppOpenAdPreloader.peekAdResponseInfo(str);
        }

        public AppOpenAd pollAd(String str) {
            return AppOpenAdPreloader.pollAd(str);
        }

        public boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallback preloadCallback) {
            return AppOpenAdPreloader.start(str, preloadConfiguration, preloadCallback);
        }
    }

    public UnityAppOpenAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback) {
        this(activity, unityPreloadCallback, new AppOpenAdPreloaderWrapper(), UnityExecutor.getPreloaderExecutor());
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
    public UnityAppOpenAd pollAd(String str, UnityAppOpenAdCallback unityAppOpenAdCallback) {
        AppOpenAd appOpenAdPollAd = this.preloaderWrapper.pollAd(str);
        if (appOpenAdPollAd == null) {
            return null;
        }
        return new UnityAppOpenAd(this.activity, unityAppOpenAdCallback, appOpenAdPollAd);
    }

    public boolean start(String str, PreloadConfiguration preloadConfiguration) {
        return this.preloaderWrapper.start(str, preloadConfiguration, new AnonymousClass1(this));
    }

    @VisibleForTesting
    public UnityAppOpenAdPreloader(Activity activity, UnityPreloadCallback unityPreloadCallback, AppOpenAdPreloaderWrapper appOpenAdPreloaderWrapper, ExecutorService executorService) {
        this.activity = activity;
        this.preloadCallback = unityPreloadCallback;
        this.service = executorService;
        this.preloaderWrapper = appOpenAdPreloaderWrapper;
    }
}
