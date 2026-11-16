package com.google.unity.ads.nextgen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface UnityInterstitialAdCallback extends UnityFullScreenContentCallback, UnityPaidEventListener {
    void onAppEvent(@NonNull String str, @Nullable String str2);

    void onInterstitialAdFailedToLoad(LoadAdError loadAdError);

    void onInterstitialAdLoaded();
}
