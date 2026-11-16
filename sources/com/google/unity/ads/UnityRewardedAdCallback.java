package com.google.unity.ads;

import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface UnityRewardedAdCallback extends UnityPaidEventListener, UnityFullScreenContentCallback {
    void onRewardedAdFailedToLoad(LoadAdError loadAdError);

    void onRewardedAdLoaded();

    void onUserEarnedReward(String str, float f);
}
