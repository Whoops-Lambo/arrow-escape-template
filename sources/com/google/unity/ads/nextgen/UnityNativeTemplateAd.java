package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.banner.AdSize;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoader;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoaderCallback;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdRequest;
import com.google.unity.ads.PluginUtils;
import com.google.unity.ads.nativead.UnityNativeTemplateStyle;
import com.unity3d.services.UnityAdsConstants;
import defpackage.jc1;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class UnityNativeTemplateAd {
    private final Activity activity;
    private final NativeAdLoaderWrapper adLoaderWrapper;
    private AdSize adSize;
    private final UnityNativeTemplateAdCallback callback;
    private final Executor executor;
    protected boolean hidden;
    private int horizontalOffset;
    private View.OnLayoutChangeListener layoutChangeListener;
    private NativeAd nativeAd;
    private int positionCode;
    private TemplateView templateView;
    private int verticalOffset;

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityNativeTemplateAd$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass2 implements NativeAdLoaderCallback {
        final /* synthetic */ UnityNativeTemplateAd this$0;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdFailedToLoad$0(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onNativeAdFailedToLoad(loadAdError);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNativeAdLoaded$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onNativeAdLoaded();
            }
        }

        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            this.this$0.executor.execute(new b(11, this, loadAdError));
        }

        public void onNativeAdLoaded(@NonNull NativeAd nativeAd) {
            this.this$0.nativeAd = nativeAd;
            this.this$0.executor.execute(new d(this, 3));
            UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
            unityNativeTemplateAd.setAdEventsListener(unityNativeTemplateAd.nativeAd);
        }

        public AnonymousClass2(UnityNativeTemplateAd unityNativeTemplateAd) {
            Objects.requireNonNull(unityNativeTemplateAd);
            this.this$0 = unityNativeTemplateAd;
        }
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.UnityNativeTemplateAd$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class AnonymousClass3 implements NativeAdEventCallback {
        final /* synthetic */ UnityNativeTemplateAd this$0;

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
        public /* synthetic */ void lambda$onAdImpression$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdImpression();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdPaid$0(AdValue adValue) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onPaidEvent(Util.getAdValuePrecisionType(adValue.getPrecisionType()), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAdShowedFullScreenContent$0() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdShowedFullScreenContent();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new h(this, 3));
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new h(this, 1));
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new h(this, 2));
        }

        public void onAdPaid(@NonNull AdValue adValue) {
            this.this$0.executor.execute(new b(12, this, adValue));
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new h(this, 0));
        }

        public AnonymousClass3(UnityNativeTemplateAd unityNativeTemplateAd) {
            Objects.requireNonNull(unityNativeTemplateAd);
            this.this$0 = unityNativeTemplateAd;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class Insets {
        int top = 0;
        int bottom = 0;
        int left = 0;
        int right = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface NativeAdLoaderWrapper {
        void load(NativeAdRequest nativeAdRequest, NativeAdLoaderCallback nativeAdLoaderCallback);
    }

    private Insets getInsets() {
        Insets insets = new Insets();
        if (Build.VERSION.SDK_INT >= 28 && this.activity.getWindow() != null && this.activity.getWindow().getDecorView().getRootWindowInsets() != null && this.activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout() != null) {
            DisplayCutout displayCutout = this.activity.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout();
            insets.top = displayCutout.getSafeInsetTop();
            insets.left = displayCutout.getSafeInsetLeft();
            insets.bottom = displayCutout.getSafeInsetBottom();
            insets.right = displayCutout.getSafeInsetRight();
        }
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeTemplateView(int i, UnityNativeTemplateStyle unityNativeTemplateStyle) {
        TemplateView templateView = (TemplateView) LayoutInflater.from(this.activity).inflate(i, (ViewGroup) null);
        this.templateView = templateView;
        templateView.setStyles(unityNativeTemplateStyle.asNativeTemplateStyle());
        this.templateView.setNativeAd(this.nativeAd);
    }

    private void removeTemplateView() {
        if (this.templateView != null) {
            this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.15
                final /* synthetic */ UnityNativeTemplateAd this$0;

                @Override // java.lang.Runnable
                public void run() {
                    ViewParent parent = this.this$0.templateView.getParent();
                    if (parent instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.removeView(this.this$0.templateView);
                        ViewParent parent2 = viewGroup.getParent();
                        if (parent2 instanceof ViewGroup) {
                            ((ViewGroup) parent2).removeView(viewGroup);
                        }
                    }
                }

                {
                    Objects.requireNonNull(this);
                    this.this$0 = this;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdEventsListener(NativeAd nativeAd) {
        nativeAd.setAdEventCallback(new AnonymousClass3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePosition() {
        if (this.templateView == null) {
            return;
        }
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.14
            final /* synthetic */ UnityNativeTemplateAd this$0;

            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = this.this$0.getLayoutParams();
                if (this.this$0.adSize != null) {
                    layoutParams.height = this.this$0.adSize.getHeight();
                    layoutParams.width = this.this$0.adSize.getWidth();
                }
                this.this$0.templateView.setLayoutParams(layoutParams);
            }

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }
        });
    }

    public void destroy() {
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.12
            final /* synthetic */ UnityNativeTemplateAd this$0;

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.templateView != null) {
                    this.this$0.templateView.destroyNativeAd();
                    ViewParent parent = this.this$0.templateView.getParent();
                    if (parent instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.removeView(this.this$0.templateView);
                        ViewParent parent2 = viewGroup.getParent();
                        if (parent2 instanceof ViewGroup) {
                            ((ViewGroup) parent2).removeView(viewGroup);
                        }
                    }
                }
                if (this.this$0.layoutChangeListener != null) {
                    this.this$0.activity.getWindow().getDecorView().getRootView().removeOnLayoutChangeListener(this.this$0.layoutChangeListener);
                    this.this$0.layoutChangeListener = null;
                }
            }

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }
        });
    }

    public float getHeightInPixels() {
        TemplateView templateView = this.templateView;
        return templateView == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : templateView.getHeight();
    }

    public FrameLayout.LayoutParams getLayoutParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = PluginUtils.getLayoutGravityForPositionCode(this.positionCode);
        Insets insets = getInsets();
        int i = insets.left;
        int i2 = insets.top;
        layoutParams.bottomMargin = insets.bottom;
        layoutParams.rightMargin = insets.right;
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

    public long getPlacementId() {
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd == null) {
            return 0L;
        }
        return nativeAd.getPlacementId();
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd == null) {
            return null;
        }
        try {
            return nativeAd.getResponseInfo();
        } catch (RuntimeException e) {
            jc1.x("Unable to check native response info: ", e.getLocalizedMessage(), PluginUtils.LOGTAG);
            return null;
        }
    }

    public float getWidthInPixels() {
        TemplateView templateView = this.templateView;
        return templateView == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : templateView.getWidth();
    }

    public void hide() {
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.11
            final /* synthetic */ UnityNativeTemplateAd this$0;

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.templateView == null) {
                    return;
                }
                UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                unityNativeTemplateAd.hidden = true;
                unityNativeTemplateAd.templateView.setVisibility(8);
            }

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }
        });
    }

    public void loadAd(NativeAdRequest nativeAdRequest) {
        this.adLoaderWrapper.load(nativeAdRequest, new AnonymousClass2(this));
    }

    public void setLayoutChangeListener() {
        if (this.layoutChangeListener != null) {
            return;
        }
        this.layoutChangeListener = new View.OnLayoutChangeListener(this) { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.13
            final /* synthetic */ UnityNativeTemplateAd this$0;

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i == i5 && i3 == i7 && i4 == i8 && i2 == i6) {
                    return;
                }
                UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                if (unityNativeTemplateAd.hidden) {
                    return;
                }
                unityNativeTemplateAd.updatePosition();
            }

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }
        };
        this.activity.getWindow().getDecorView().getRootView().addOnLayoutChangeListener(this.layoutChangeListener);
    }

    public void setPlacementId(long j) {
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd == null) {
            return;
        }
        nativeAd.setPlacementId(j);
    }

    public void setPosition(final int i, final int i2) {
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.5
            final /* synthetic */ UnityNativeTemplateAd this$0;

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

    public void setPositionCode(final int i) {
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.4
            final /* synthetic */ UnityNativeTemplateAd this$0;

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
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.10
            final /* synthetic */ UnityNativeTemplateAd this$0;

            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.templateView == null) {
                    return;
                }
                UnityNativeTemplateAd unityNativeTemplateAd = this.this$0;
                unityNativeTemplateAd.hidden = false;
                unityNativeTemplateAd.templateView.setVisibility(0);
                this.this$0.updatePosition();
            }

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }
        });
    }

    @VisibleForTesting
    public UnityNativeTemplateAd(Activity activity, UnityNativeTemplateAdCallback unityNativeTemplateAdCallback, NativeAdLoaderWrapper nativeAdLoaderWrapper, Executor executor) {
        this.activity = activity;
        this.callback = unityNativeTemplateAdCallback;
        this.adLoaderWrapper = nativeAdLoaderWrapper;
        this.executor = executor;
        this.hidden = false;
        this.horizontalOffset = 0;
        this.verticalOffset = 0;
    }

    public void renderCustomSizeAtPosition(final UnityNativeTemplateStyle unityNativeTemplateStyle, final AdSize adSize, int i, int i2) {
        removeTemplateView();
        this.positionCode = -1;
        this.horizontalOffset = i;
        this.verticalOffset = i2;
        this.adSize = adSize;
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.8
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.initializeTemplateView(unityNativeTemplateStyle.getTemplateType().resourceId(), unityNativeTemplateStyle);
                FrameLayout frameLayout = new FrameLayout(this.this$0.activity);
                FrameLayout.LayoutParams layoutParams = this.this$0.getLayoutParams();
                layoutParams.height = adSize.getHeight();
                layoutParams.width = adSize.getWidth();
                frameLayout.addView(this.this$0.templateView, layoutParams);
                this.this$0.activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                this.this$0.setLayoutChangeListener();
            }
        });
    }

    public void renderCustomSizeAtPositionCode(final UnityNativeTemplateStyle unityNativeTemplateStyle, final AdSize adSize, int i) {
        removeTemplateView();
        this.positionCode = i;
        this.adSize = adSize;
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.9
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.initializeTemplateView(unityNativeTemplateStyle.getTemplateType().resourceId(), unityNativeTemplateStyle);
                FrameLayout frameLayout = new FrameLayout(this.this$0.activity);
                FrameLayout.LayoutParams layoutParams = this.this$0.getLayoutParams();
                layoutParams.height = adSize.getHeight();
                layoutParams.width = adSize.getWidth();
                frameLayout.addView(this.this$0.templateView, layoutParams);
                this.this$0.activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                this.this$0.setLayoutChangeListener();
            }
        });
    }

    public void renderDefaultSizeAtPosition(final UnityNativeTemplateStyle unityNativeTemplateStyle, int i, int i2) {
        removeTemplateView();
        this.positionCode = -1;
        this.horizontalOffset = i;
        this.verticalOffset = i2;
        this.adSize = null;
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.6
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.initializeTemplateView(unityNativeTemplateStyle.getTemplateType().resourceId(), unityNativeTemplateStyle);
                FrameLayout frameLayout = new FrameLayout(this.this$0.activity);
                frameLayout.addView(this.this$0.templateView, this.this$0.getLayoutParams());
                this.this$0.activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                this.this$0.setLayoutChangeListener();
            }
        });
    }

    public void renderDefaultSizeAtPositionCode(final UnityNativeTemplateStyle unityNativeTemplateStyle, int i) {
        removeTemplateView();
        this.positionCode = i;
        this.adSize = null;
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.7
            final /* synthetic */ UnityNativeTemplateAd this$0;

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.initializeTemplateView(unityNativeTemplateStyle.getTemplateType().resourceId(), unityNativeTemplateStyle);
                FrameLayout frameLayout = new FrameLayout(this.this$0.activity);
                frameLayout.addView(this.this$0.templateView, this.this$0.getLayoutParams());
                this.this$0.activity.addContentView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                this.this$0.setLayoutChangeListener();
            }
        });
    }

    @VisibleForTesting
    public UnityNativeTemplateAd(Activity activity, UnityNativeTemplateAdCallback unityNativeTemplateAdCallback, NativeAdLoaderWrapper nativeAdLoaderWrapper) {
        this(activity, unityNativeTemplateAdCallback, nativeAdLoaderWrapper, UnityExecutor.getExecutor());
    }

    public UnityNativeTemplateAd(Activity activity, UnityNativeTemplateAdCallback unityNativeTemplateAdCallback) {
        this(activity, unityNativeTemplateAdCallback, new NativeAdLoaderWrapper() { // from class: com.google.unity.ads.nextgen.UnityNativeTemplateAd.1
            @Override // com.google.unity.ads.nextgen.UnityNativeTemplateAd.NativeAdLoaderWrapper
            public void load(NativeAdRequest nativeAdRequest, NativeAdLoaderCallback nativeAdLoaderCallback) {
                NativeAdLoader.load(nativeAdRequest, nativeAdLoaderCallback);
            }
        }, UnityExecutor.getExecutor());
    }
}
