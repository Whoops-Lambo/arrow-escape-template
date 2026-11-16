package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface PAGLoadCallback<Ad> {
    @MainThread
    void onAdLoaded(Ad ad);

    @MainThread
    void onError(@NonNull PAGErrorModel pAGErrorModel);
}
