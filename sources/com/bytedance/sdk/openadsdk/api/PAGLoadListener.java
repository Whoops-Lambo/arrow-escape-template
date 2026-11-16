package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.MainThread;
import com.bytedance.sdk.openadsdk.common.yo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface PAGLoadListener<Ad> extends yo {
    @MainThread
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.yo
    @MainThread
    void onError(int i, String str);
}
