package com.google.unity.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface UnityPreloadCallback {
    void onAdFailedToPreload(String str, AdError adError);

    void onAdPreloaded(String str, @Nullable ResponseInfo responseInfo);

    void onAdsExhausted(String str);
}
