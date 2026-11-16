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
import com.google.android.gms.ads.appopen.AppOpenAd;
import defpackage.jz2;
import defpackage.ok2;
import defpackage.ov1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class UnityAppOpenAd {
    private final Activity activity;
    AppOpenAd appOpenAd;
    private final UnityAppOpenAdCallback callback;
    private final OnPaidEventListener onPaidEventListener = new AnonymousClass1(this);
    private final FullScreenContentCallback fullScreenContentCallback = new AnonymousClass2(this);

    /* JADX INFO: renamed from: com.google.unity.ads.UnityAppOpenAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements OnPaidEventListener {
        final /* synthetic */ UnityAppOpenAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPaidEvent$0(AdValue adValue) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(AdValue adValue) {
            this.this$0.runOnNewThread(new b(3, this, adValue));
        }

        public AnonymousClass1(UnityAppOpenAd unityAppOpenAd) {
            Objects.requireNonNull(unityAppOpenAd);
            this.this$0 = unityAppOpenAd;
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityAppOpenAd$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 extends FullScreenContentCallback {
        final /* synthetic */ UnityAppOpenAd this$0;

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
            this.this$0.runOnNewThread(new d(this, 3));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            this.this$0.runOnNewThread(new d(this, 2));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            this.this$0.runOnNewThread(new b(4, this, adError));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            this.this$0.runOnNewThread(new d(this, 0));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            this.this$0.runOnNewThread(new d(this, 1));
        }

        public AnonymousClass2(UnityAppOpenAd unityAppOpenAd) {
            Objects.requireNonNull(unityAppOpenAd);
            this.this$0 = unityAppOpenAd;
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.UnityAppOpenAd$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass3 extends AppOpenAd.AppOpenAdLoadCallback {
        final /* synthetic */ UnityAppOpenAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAppOpenAdFailedToLoad(loadAdError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAppOpenAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            this.this$0.runOnNewThread(new b(5, this, loadAdError));
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull AppOpenAd appOpenAd) {
            UnityAppOpenAd unityAppOpenAd = this.this$0;
            unityAppOpenAd.appOpenAd = appOpenAd;
            appOpenAd.setOnPaidEventListener(unityAppOpenAd.onPaidEventListener);
            UnityAppOpenAd unityAppOpenAd2 = this.this$0;
            unityAppOpenAd2.appOpenAd.setFullScreenContentCallback(unityAppOpenAd2.fullScreenContentCallback);
            this.this$0.runOnNewThread(new c(this, 1));
        }

        public AnonymousClass3(UnityAppOpenAd unityAppOpenAd) {
            Objects.requireNonNull(unityAppOpenAd);
            this.this$0 = unityAppOpenAd;
        }
    }

    public void destroy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadAd$0(String str, AdRequest adRequest) {
        AppOpenAd.load(this.activity, str, adRequest, new AnonymousClass3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pollAd$0(LoadAdError loadAdError) {
        UnityAppOpenAdCallback unityAppOpenAdCallback = this.callback;
        if (unityAppOpenAdCallback != null) {
            unityAppOpenAdCallback.onAppOpenAdFailedToLoad(loadAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$pollAd$1() {
        this.appOpenAd.setOnPaidEventListener(this.onPaidEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAppOpenAd$0() {
        this.appOpenAd.setOnPaidEventListener(this.onPaidEventListener);
        this.appOpenAd.setFullScreenContentCallback(this.fullScreenContentCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        this.appOpenAd.setImmersiveMode(true);
        this.appOpenAd.show(this.activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnNewThread(Runnable runnable) {
        new Thread(runnable).start();
    }

    @Nullable
    public String getAdUnitId() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return null;
        }
        return appOpenAd.getAdUnitId();
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

    public boolean isAdAvailable(@NonNull String str) {
        return AppOpenAd.isAdAvailable(this.activity, str);
    }

    public void loadAd(String str, AdRequest adRequest) {
        this.activity.runOnUiThread(new ov1(7, this, str, adRequest));
    }

    public void pollAd(@NonNull String str) {
        AppOpenAd appOpenAdPollAd = AppOpenAd.pollAd(this.activity, str);
        this.appOpenAd = appOpenAdPollAd;
        if (appOpenAdPollAd != null) {
            this.activity.runOnUiThread(new jz2(this, 2));
            this.appOpenAd.setFullScreenContentCallback(this.fullScreenContentCallback);
        } else {
            Log.e(PluginUtils.LOGTAG, "Failed to obtain an App Open Ad from the preloader.");
            new Thread(new ok2(7, this, new LoadAdError(0, "Failed to obtain an App Open Ad from the preloader.", MobileAds.ERROR_DOMAIN, null, null))).start();
        }
    }

    public void setAppOpenAd(AppOpenAd appOpenAd) {
        this.appOpenAd = appOpenAd;
        this.activity.runOnUiThread(new jz2(this, 1));
    }

    public void setPlacementId(long j) {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return;
        }
        appOpenAd.setPlacementId(j);
    }

    public void show() {
        if (this.appOpenAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show app open ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new jz2(this, 0));
        }
    }

    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback unityAppOpenAdCallback) {
        this.activity = activity;
        this.callback = unityAppOpenAdCallback;
    }
}
