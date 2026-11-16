package com.ironsource.mediationsdk.adunit.adapter.listener;

import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface NetworkInitializationListener {
    void onInitFailed(int i, @Nullable String str);

    void onInitSuccess();

    default void onInitFailed(int i, @Nullable String str, Map<String, Object> map) {
        onInitFailed(i, str);
    }

    default void onInitSuccess(Map<String, Object> map) {
        onInitSuccess();
    }
}
