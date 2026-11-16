package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAd;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.unity.ads.PluginUtils;
import defpackage.jc1;
import defpackage.kz2;
import defpackage.lz2;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class UnityBannerAd {
    private View adView;
    private final AdWrapper<BannerAd> adWrapper;
    private BannerAd bannerAd;

    @Nullable
    private FrameLayout bannerLayout;
    private final UnityBannerAdCallback callback;
    private final Executor executor;
    protected boolean hidden;
    private int horizontalOffset;
    private boolean isDestroyed;
    private View.OnLayoutChangeListener layoutChangeListener;
    private int positionCode;
    protected Activity unityPlayerActivity;
    private int verticalOffset;

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityBannerAd$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass1 implements AdLoadCallback<BannerAd> {
        final /* synthetic */ UnityBannerAd this$0;

        /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityBannerAd$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        public class C03111 implements BannerAdEventCallback {
            final /* synthetic */ AnonymousClass1 this$1;

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onAdClicked$0() {
                if (this.this$1.this$0.callback != null) {
                    this.this$1.this$0.callback.onAdClicked();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onAdDismissedFullScreenContent$0() {
                if (this.this$1.this$0.callback != null) {
                    this.this$1.this$0.callback.onAdClosed();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onAdImpression$0() {
                if (this.this$1.this$0.callback != null) {
                    this.this$1.this$0.callback.onAdImpression();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onAdPaid$0(AdValue adValue) {
                if (this.this$1.this$0.callback != null) {
                    this.this$1.this$0.callback.onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onAdShowedFullScreenContent$0() {
                if (this.this$1.this$0.callback != null) {
                    this.this$1.this$0.callback.onAdOpened();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onAppEvent$0(String str, String str2) {
                if (this.this$1.this$0.callback != null) {
                    this.this$1.this$0.callback.onAppEvent(str, str2);
                }
            }

            public void onAdClicked() {
                this.this$1.this$0.executor.execute(new f(this, 0));
            }

            public void onAdDismissedFullScreenContent() {
                this.this$1.this$0.executor.execute(new f(this, 3));
            }

            public void onAdImpression() {
                this.this$1.this$0.executor.execute(new f(this, 1));
            }

            public void onAdPaid(@NonNull AdValue adValue) {
                this.this$1.this$0.executor.execute(new b(5, this, adValue));
            }

            public void onAdShowedFullScreenContent() {
                this.this$1.this$0.executor.execute(new f(this, 2));
            }

            public void onAppEvent(@NonNull String str, @Nullable String str2) {
                this.this$1.this$0.executor.execute(new e(this, str, 2, str2));
            }

            public C03111(AnonymousClass1 anonymousClass1) {
                Objects.requireNonNull(anonymousClass1);
                this.this$1 = anonymousClass1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdFailedToLoad(loadAdError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdLoaded$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdLoaded();
            }
        }

        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            this.this$0.executor.execute(new b(4, this, loadAdError));
        }

        public void onAdLoaded(@NonNull BannerAd bannerAd) {
            if (this.this$0.isDestroyed) {
                bannerAd.destroy();
                return;
            }
            this.this$0.bannerAd = bannerAd;
            UnityBannerAd unityBannerAd = this.this$0;
            if (!unityBannerAd.hidden) {
                unityBannerAd.show();
            }
            this.this$0.executor.execute(new d(this, 1));
            bannerAd.setAdEventCallback(new C03111(this));
        }

        public AnonymousClass1(UnityBannerAd unityBannerAd) {
            Objects.requireNonNull(unityBannerAd);
            this.this$0 = unityBannerAd;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Insets {
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;
    }

    public void create(int i, int i2) {
        this.positionCode = -1;
        this.horizontalOffset = i;
        this.verticalOffset = i2;
        this.hidden = false;
    }

    public void destroy() {
        this.isDestroyed = true;
        this.unityPlayerActivity.runOnUiThread(new kz2(this, 1));
        this.unityPlayerActivity.getWindow().getDecorView().getRootView().removeOnLayoutChangeListener(this.layoutChangeListener);
        this.layoutChangeListener = null;
    }

    public void load(BannerAdRequest bannerAdRequest) {
        this.isDestroyed = false;
        this.adWrapper.load(bannerAdRequest, new AnonymousClass1(this));
        setLayoutChangeListener();
    }

    private Insets getSafeInsets() {
        Window window;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        Insets insets = new Insets();
        if (Build.VERSION.SDK_INT < 28 || (window = this.unityPlayerActivity.getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            return insets;
        }
        insets.top = displayCutout.getSafeInsetTop();
        insets.left = displayCutout.getSafeInsetLeft();
        insets.bottom = displayCutout.getSafeInsetBottom();
        insets.right = displayCutout.getSafeInsetRight();
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$destroy$0() {
        FrameLayout frameLayout = this.bannerLayout;
        if (frameLayout != null) {
            View view = this.adView;
            if (view != null) {
                frameLayout.removeView(view);
                this.adView = null;
            }
            if (this.bannerLayout.getParent() != null) {
                ((ViewGroup) this.bannerLayout.getParent()).removeView(this.bannerLayout);
            }
            this.bannerLayout = null;
        }
        BannerAd bannerAd = this.bannerAd;
        if (bannerAd != null) {
            bannerAd.destroy();
            this.bannerAd = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$getHeightInPixels$0() throws Exception {
        return Integer.valueOf(this.bannerAd.getAdSize().getHeightInPixels(this.unityPlayerActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$getWidthInPixels$0() throws Exception {
        return Integer.valueOf(this.bannerAd.getAdSize().getWidthInPixels(this.unityPlayerActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hide$0() {
        FrameLayout frameLayout = this.bannerLayout;
        if (frameLayout == null || frameLayout.getParent() == null) {
            return;
        }
        ((ViewGroup) this.bannerLayout.getParent()).removeView(this.bannerLayout);
        this.hidden = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$0() {
        if (this.bannerAd == null) {
            Log.w(PluginUtils.LOGTAG, "Tried to show banner before ad was ready.");
            return;
        }
        if (this.bannerLayout == null) {
            this.bannerLayout = new FrameLayout(this.unityPlayerActivity);
        }
        if (this.bannerLayout.getParent() == null) {
            this.unityPlayerActivity.addContentView(this.bannerLayout, new ViewGroup.LayoutParams(-1, -1));
        }
        this.adView = this.bannerAd.getView(this.unityPlayerActivity);
        this.bannerLayout.removeAllViews();
        this.bannerLayout.addView(this.adView);
        this.adView.setVisibility(0);
        updatePosition();
        this.hidden = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePosition() {
        if (this.adView == null || this.hidden) {
            return;
        }
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.2
            final /* synthetic */ UnityBannerAd this$0;

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.adView.setLayoutParams(this.this$0.getLayoutParams());
            }

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }
        });
    }

    @Nullable
    public String getAdUnitId() {
        BannerAd bannerAd = this.bannerAd;
        if (bannerAd == null) {
            return null;
        }
        return bannerAd.getAdUnitId();
    }

    public float getHeightInPixels() {
        if (this.bannerAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get height of a null banner ad.");
            return -1.0f;
        }
        FutureTask futureTask = new FutureTask(new lz2(this, 1));
        this.unityPlayerActivity.runOnUiThread(futureTask);
        try {
            return ((Integer) futureTask.get()).intValue();
        } catch (InterruptedException | ExecutionException e) {
            jc1.x("Failed to get ad view height: ", e.getLocalizedMessage(), PluginUtils.LOGTAG);
            return -1.0f;
        }
    }

    public FrameLayout.LayoutParams getLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = PluginUtils.getLayoutGravityForPositionCode(this.positionCode);
        Insets safeInsets = getSafeInsets();
        int i = safeInsets.left;
        int i2 = safeInsets.top;
        layoutParams.bottomMargin = safeInsets.bottom;
        layoutParams.rightMargin = safeInsets.right;
        int i3 = this.positionCode;
        if (i3 != -1) {
            layoutParams.leftMargin = i;
            if (i3 != 0 && i3 != 2 && i3 != 3) {
                return layoutParams;
            }
            layoutParams.topMargin = i2;
            return layoutParams;
        }
        int iConvertDpToPixel = (int) PluginUtils.convertDpToPixel(this.horizontalOffset);
        if (iConvertDpToPixel >= i) {
            i = iConvertDpToPixel;
        }
        int iConvertDpToPixel2 = (int) PluginUtils.convertDpToPixel(this.verticalOffset);
        if (iConvertDpToPixel2 >= i2) {
            i2 = iConvertDpToPixel2;
        }
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        return layoutParams;
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        BannerAd bannerAd = this.bannerAd;
        if (bannerAd != null) {
            return bannerAd.getResponseInfo();
        }
        Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
        return null;
    }

    public float getWidthInPixels() {
        if (this.bannerAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get width of a null banner ad.");
            return -1.0f;
        }
        FutureTask futureTask = new FutureTask(new lz2(this, 0));
        this.unityPlayerActivity.runOnUiThread(futureTask);
        try {
            return ((Integer) futureTask.get()).intValue();
        } catch (InterruptedException | ExecutionException e) {
            jc1.x("Failed to get ad view width: ", e.getLocalizedMessage(), PluginUtils.LOGTAG);
            return -1.0f;
        }
    }

    public void hide() {
        this.unityPlayerActivity.runOnUiThread(new kz2(this, 2));
    }

    public boolean isCollapsible() {
        BannerAd bannerAd = this.bannerAd;
        if (bannerAd == null) {
            return false;
        }
        return bannerAd.isCollapsible();
    }

    public void setLayoutChangeListener() {
        if (this.layoutChangeListener != null) {
            return;
        }
        this.layoutChangeListener = new View.OnLayoutChangeListener(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.5
            final /* synthetic */ UnityBannerAd this$0;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i3 == i7 && i4 == i8 && i2 == i6) {
                    return;
                }
                UnityBannerAd unityBannerAd = this.this$0;
                if (unityBannerAd.hidden) {
                    return;
                }
                unityBannerAd.updatePosition();
            }

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }
        };
        this.unityPlayerActivity.getWindow().getDecorView().getRootView().addOnLayoutChangeListener(this.layoutChangeListener);
    }

    public void setPosition(final int i) {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.3
            final /* synthetic */ UnityBannerAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.positionCode = i;
                this.this$0.updatePosition();
            }
        });
    }

    public void show() {
        this.unityPlayerActivity.runOnUiThread(new kz2(this, 0));
    }

    public UnityBannerAd(Activity activity, UnityBannerAdCallback unityBannerAdCallback, AdWrapper<BannerAd> adWrapper, Executor executor) {
        this.isDestroyed = false;
        this.unityPlayerActivity = activity;
        this.callback = unityBannerAdCallback;
        this.adWrapper = adWrapper;
        this.executor = executor;
    }

    public void create(int i) {
        this.horizontalOffset = 0;
        this.verticalOffset = 0;
        this.positionCode = i;
        this.hidden = false;
    }

    public void setPosition(final int i, final int i2) {
        this.unityPlayerActivity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityBannerAd.4
            final /* synthetic */ UnityBannerAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.positionCode = -1;
                this.this$0.horizontalOffset = i;
                this.this$0.verticalOffset = i2;
                this.this$0.updatePosition();
            }
        });
    }

    public UnityBannerAd(Activity activity, UnityBannerAdCallback unityBannerAdCallback, AdWrapper<BannerAd> adWrapper) {
        this(activity, unityBannerAdCallback, adWrapper, UnityExecutor.getExecutor());
    }

    public UnityBannerAd(Activity activity, UnityBannerAdCallback unityBannerAdCallback) {
        this(activity, unityBannerAdCallback, AdWrapper.forBanner(), UnityExecutor.getExecutor());
    }
}
