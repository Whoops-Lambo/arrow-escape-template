package com.google.unity.ads.nextgen;

import androidx.annotation.Nullable;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface UnityPreloadCallback {
    void onAdFailedToPreload(String str, LoadAdError loadAdError);

    void onAdPreloaded(String str, @Nullable ResponseInfo responseInfo);

    void onAdsExhausted(String str);
}
