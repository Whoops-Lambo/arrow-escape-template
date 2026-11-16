package com.applovin.mediation.nativeAds;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class MaxNativeAdListener {
    public void onNativeAdClicked(@NonNull MaxAd maxAd) {
    }

    public void onNativeAdExpired(@NonNull MaxAd maxAd) {
    }

    public void onNativeAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
    }

    public void onNativeAdLoaded(@Nullable MaxNativeAdView maxNativeAdView, @NonNull MaxAd maxAd) {
    }
}
