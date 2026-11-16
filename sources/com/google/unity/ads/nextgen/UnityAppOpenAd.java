package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAd;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.unity.ads.PluginUtils;
import defpackage.nj2;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class UnityAppOpenAd extends UnityAdBase<AppOpenAd, UnityAppOpenAdCallback> {
    private final AdWrapper<AppOpenAd> adWrapper;
    private AppOpenAd appOpenAd;
    private final AppOpenAdEventCallback appOpenAdEventCallback;

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityAppOpenAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements AppOpenAdEventCallback {
        final /* synthetic */ UnityAppOpenAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdClicked$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAdClicked();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdDismissedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAdDismissedFullScreenContent();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToShowFullScreenContent$0(FullScreenContentError fullScreenContentError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdImpression$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAdImpression();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPaid$0(AdValue adValue) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShowedFullScreenContent$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAdShowedFullScreenContent();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new c(this, 1));
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new c(this, 2));
            this.this$0.appOpenAd = null;
        }

        public void onAdFailedToShowFullScreenContent(@NonNull FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new b(1, this, fullScreenContentError));
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new c(this, 0));
        }

        public void onAdPaid(@NonNull AdValue adValue) {
            this.this$0.executor.execute(new b(0, this, adValue));
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new c(this, 3));
        }

        public AnonymousClass1(UnityAppOpenAd unityAppOpenAd) {
            Objects.requireNonNull(unityAppOpenAd);
            this.this$0 = unityAppOpenAd;
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityAppOpenAd$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 implements AdLoadCallback<AppOpenAd> {
        final /* synthetic */ UnityAppOpenAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAppOpenAdFailedToLoad(loadAdError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            CallbackT callbackt = this.this$0.callback;
            if (callbackt != 0) {
                ((UnityAppOpenAdCallback) callbackt).onAppOpenAdLoaded();
            }
        }

        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            this.this$0.executor.execute(new b(2, this, loadAdError));
        }

        public void onAdLoaded(@NonNull AppOpenAd appOpenAd) {
            this.this$0.appOpenAd = appOpenAd;
            this.this$0.executor.execute(new d(this, 0));
        }

        public AnonymousClass2(UnityAppOpenAd unityAppOpenAd) {
            Objects.requireNonNull(unityAppOpenAd);
            this.this$0 = unityAppOpenAd;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        this.appOpenAd.show(this.activity);
    }

    @Nullable
    public String getAdUnitId() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return null;
        }
        return appOpenAd.getAdUnitId();
    }

    @VisibleForTesting
    public AppOpenAd getAppOpenAd() {
        return this.appOpenAd;
    }

    public long getPlacementId() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return 0L;
        }
        return appOpenAd.getPlacementId();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd != null) {
            return appOpenAd.getResponseInfo();
        }
        Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
        return null;
    }

    public void load(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new AnonymousClass2(this));
    }

    public void setPlacementId(long j) {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return;
        }
        appOpenAd.setPlacementId(j);
    }

    public void show() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show app open ad before it was ready. Please call loadAd first and wait for a successful onAdLoaded callback.");
            return;
        }
        appOpenAd.setAdEventCallback(this.appOpenAdEventCallback);
        this.appOpenAd.setImmersiveMode(true);
        this.activity.runOnUiThread(new nj2(this, 12));
    }

    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback unityAppOpenAdCallback, AppOpenAd appOpenAd) {
        this(activity, unityAppOpenAdCallback, AdWrapper.forAppOpen(), UnityExecutor.getExecutor());
        this.appOpenAd = appOpenAd;
    }

    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback unityAppOpenAdCallback) {
        this(activity, unityAppOpenAdCallback, AdWrapper.forAppOpen(), UnityExecutor.getExecutor());
    }

    @VisibleForTesting
    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback unityAppOpenAdCallback, AdWrapper<AppOpenAd> adWrapper, Executor executor) {
        super(activity, unityAppOpenAdCallback, executor);
        this.appOpenAdEventCallback = new AnonymousClass1(this);
        this.adWrapper = adWrapper;
    }
}
