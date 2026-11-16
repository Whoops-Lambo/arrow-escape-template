package com.google.unity.ads.nativead;

import com.google.android.gms.ads.LoadAdError;
import com.google.unity.ads.UnityFullScreenContentCallback;
import com.google.unity.ads.UnityPaidEventListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface UnityNativeTemplateAdCallback extends UnityPaidEventListener, UnityFullScreenContentCallback {
    void onNativeAdFailedToLoad(LoadAdError loadAdError);

    void onNativeAdLoaded();
}
