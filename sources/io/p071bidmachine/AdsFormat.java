package io.p071bidmachine;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "3.5.0")
public enum AdsFormat {
    Banner("banner", null),
    Banner_320x50("banner_320x50", Banner),
    Banner_300x250("banner_300x250", Banner),
    Banner_728x90("banner_728x90", Banner),
    Interstitial("interstitial", null),
    InterstitialVideo("interstitial_video", Interstitial),
    InterstitialStatic("interstitial_static", Interstitial),
    Rewarded("rewarded", null),
    RewardedVideo("rewarded_video", Rewarded),
    RewardedStatic("rewarded_static", Rewarded),
    Native("native", null);


    @Nullable
    private final AdsFormat parent;

    @NonNull
    private final String remoteName;

    @NonNull
    public static AdsFormat fromAdFormat(@Nullable AdFormat adFormat) {
        if (adFormat instanceof AdFormat.Native) {
            return Native;
        }
        if (adFormat instanceof AdFormat.Rewarded) {
            AdContentType adContentType = ((AdFormat.Rewarded) adFormat).getAdContentType();
            if (adContentType.equals(AdContentType.Video)) {
                return RewardedVideo;
            }
            return adContentType.equals(AdContentType.Static) ? RewardedStatic : Rewarded;
        }
        if (adFormat instanceof AdFormat.Interstitial) {
            AdContentType adContentType2 = ((AdFormat.Interstitial) adFormat).getAdContentType();
            if (adContentType2.equals(AdContentType.Video)) {
                return InterstitialVideo;
            }
            return adContentType2.equals(AdContentType.Static) ? InterstitialStatic : Interstitial;
        }
        if (!(adFormat instanceof AdFormat.Banner)) {
            return Banner;
        }
        BannerAdSize bannerAdSize = ((AdFormat.Banner) adFormat).getBannerAdSize();
        if (bannerAdSize.equals(BannerAdSize.Leaderboard)) {
            return Banner_728x90;
        }
        if (bannerAdSize.equals(BannerAdSize.MediumRectangle)) {
            return Banner_300x250;
        }
        return bannerAdSize.equals(BannerAdSize.Banner) ? Banner_320x50 : Banner;
    }

    @Nullable
    public AdsFormat getParent() {
        return this.parent;
    }

    @NonNull
    public String getRemoteName() {
        return this.remoteName;
    }

    @NonNull
    public AdFormat toAdFormat(@Nullable AdContentType adContentType) {
        switch (n.a[ordinal()]) {
            case 1:
                return new AdFormat.Native(MediaAssetType.DEFAULT);
            case 2:
                return new AdFormat.Rewarded(AdContentType.Video);
            case 3:
                return new AdFormat.Rewarded(AdContentType.Static);
            case 4:
                if (adContentType == null) {
                    adContentType = AdContentType.All;
                }
                return new AdFormat.Rewarded(adContentType);
            case 5:
                return new AdFormat.Interstitial(AdContentType.Video);
            case 6:
                return new AdFormat.Interstitial(AdContentType.Static);
            case 7:
                if (adContentType == null) {
                    adContentType = AdContentType.All;
                }
                return new AdFormat.Interstitial(adContentType);
            case 8:
                return new AdFormat.Banner(BannerAdSize.Leaderboard);
            case 9:
                return new AdFormat.Banner(BannerAdSize.MediumRectangle);
            case 10:
                return new AdFormat.Banner(BannerAdSize.Banner);
            default:
                return new AdFormat.Banner(BannerAdSize.Undefined);
        }
    }

    AdsFormat(String str, AdsFormat adsFormat) {
        this.remoteName = str;
        this.parent = adsFormat;
    }

    @Nullable
    public static AdsFormat byRemoteName(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            for (AdsFormat adsFormat : values()) {
                if (adsFormat.remoteName.equals(str)) {
                    return adsFormat;
                }
            }
            return null;
        }
        return null;
    }

    @NonNull
    public AdsType getAdsType() {
        return toAdFormat().getAdsType();
    }

    @NonNull
    public AdFormat toAdFormat() {
        return toAdFormat(null);
    }
}
