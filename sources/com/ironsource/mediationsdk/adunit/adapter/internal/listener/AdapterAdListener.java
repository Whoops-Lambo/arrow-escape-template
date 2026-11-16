package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface AdapterAdListener {
    void onAdClicked();

    void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i, String str);

    void onAdLoadSuccess();

    void onAdOpened();

    void onAdShowFailed(int i, String str);

    default void onAdClicked(@NotNull Map<String, Object> map) {
        onAdClicked();
    }

    default void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i, String str, @NotNull Map<String, Object> map) {
        onAdLoadFailed(adapterErrorType, i, str);
    }

    default void onAdLoadSuccess(@NotNull Map<String, Object> map) {
        onAdLoadSuccess();
    }

    default void onAdOpened(@NotNull Map<String, Object> map) {
        onAdOpened();
    }

    default void onAdShowFailed(int i, String str, @NotNull Map<String, Object> map) {
        onAdShowFailed(i, str);
    }
}
