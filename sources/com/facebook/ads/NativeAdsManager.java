package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import com.facebook.infer.annotation.Nullsafe;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
public class NativeAdsManager {
    private final NativeAdsManagerApi mNativeAdsManagerApi;

    @Nullable
    private NativeAd.NativeOptions mNativeOptions;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    public interface Listener {
        void onAdError(AdError adError);

        void onAdsLoaded();
    }

    public void disableAutoRefresh() {
        this.mNativeAdsManagerApi.disableAutoRefresh();
    }

    public int getUniqueNativeAdCount() {
        return this.mNativeAdsManagerApi.getUniqueNativeAdCount();
    }

    public boolean isLoaded() {
        return this.mNativeAdsManagerApi.isLoaded();
    }

    public void loadAds() {
        this.mNativeAdsManagerApi.loadAds();
    }

    @Nullable
    public NativeAd nextNativeAd() {
        return this.mNativeAdsManagerApi.nextNativeAd();
    }

    public void setExtraHints(String str) {
        this.mNativeAdsManagerApi.setExtraHints(str);
    }

    public void setListener(Listener listener) {
        this.mNativeAdsManagerApi.setListener(listener);
    }

    public NativeAdsManager(Context context, String str, int i) {
        boolean z;
        Preconditions.checkNotNull(context, "Context can not be null");
        if (i > -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkIsTrue(z, "Number of requested ads should be not be negative");
        this.mNativeAdsManagerApi = DynamicLoaderFactory.makeLoader(context).createNativeAdsManagerApi(context, str, i);
    }

    public void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.mNativeAdsManagerApi.loadAds(mediaCacheFlag);
    }

    @Nullable
    public NativeAd nextNativeAd(NativeAdListener nativeAdListener) {
        return this.mNativeAdsManagerApi.nextNativeAd(nativeAdListener);
    }

    public NativeAdsManager(Context context, String str, int i, @Nullable NativeAd.NativeOptions nativeOptions) {
        this(context, str, i);
        this.mNativeOptions = nativeOptions;
        this.mNativeAdsManagerApi.setNativeOption(nativeOptions);
    }
}
