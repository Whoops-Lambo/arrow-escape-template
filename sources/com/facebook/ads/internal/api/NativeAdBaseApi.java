package com.facebook.ads.internal.api;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.NativeAdBase;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
public interface NativeAdBaseApi {
    NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase);

    void destroy();

    void downloadMedia();

    @Nullable
    String getAdBodyText();

    @Nullable
    String getAdCallToAction();

    @Nullable
    NativeAdImageApi getAdChoicesIcon();

    @Nullable
    String getAdChoicesImageUrl();

    @Nullable
    String getAdChoicesLinkUrl();

    @Nullable
    String getAdChoicesText();

    @Nullable
    NativeAdImageApi getAdCoverImage();

    @Nullable
    String getAdHeadline();

    @Nullable
    NativeAdImageApi getAdIcon();

    @Nullable
    String getAdLinkDescription();

    @Nullable
    String getAdSocialContext();

    @Nullable
    @Deprecated
    NativeAdRatingApi getAdStarRating();

    @Nullable
    String getAdTranslation();

    @Nullable
    String getAdUntrimmedBodyText();

    @Nullable
    String getAdvertiserName();

    float getAspectRatio();

    @Nullable
    String getId();

    String getPlacementId();

    @Nullable
    Drawable getPreloadedIconViewDrawable();

    @Nullable
    String getPromotedTranslation();

    @Nullable
    String getSponsoredTranslation();

    boolean hasCallToAction();

    boolean isAdInvalidated();

    boolean isAdLoaded();

    void loadAd();

    void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig);

    void onCtaBroadcast();

    void setExtraHints(ExtraHints extraHints);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void unregisterView();
}
