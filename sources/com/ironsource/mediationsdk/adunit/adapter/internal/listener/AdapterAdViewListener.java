package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface AdapterAdViewListener extends AdapterAdListener {
    void onAdLeftApplication();

    void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams);

    void onAdScreenDismissed();

    void onAdScreenPresented();

    default void onAdLeftApplication(Map<String, Object> map) {
        onAdLeftApplication();
    }

    default void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        onAdLoadSuccess(view, layoutParams);
    }

    default void onAdScreenDismissed(Map<String, Object> map) {
        onAdScreenDismissed();
    }

    default void onAdScreenPresented(Map<String, Object> map) {
        onAdScreenPresented();
    }
}
