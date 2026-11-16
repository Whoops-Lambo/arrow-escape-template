package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    void onAdEnded();

    void onAdStarted();

    void onAdVisible();

    default void onAdClosed(@NotNull Map<String, Object> map) {
        onAdClosed();
    }

    default void onAdEnded(@NotNull Map<String, Object> map) {
        onAdEnded();
    }

    default void onAdStarted(@NotNull Map<String, Object> map) {
        onAdStarted();
    }

    default void onAdVisible(@NotNull Map<String, Object> map) {
        onAdVisible();
    }
}
