package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public interface AdapterAdFullScreenInterface<Listener extends AdapterAdListener> {
    void destroyAd(@NotNull AdData adData);

    boolean isAdAvailable(@NotNull AdData adData);

    void loadAd(@NotNull AdData adData, @NotNull Context context, @NotNull Listener listener);

    void showAd(@NotNull AdData adData, @NotNull Activity activity, @NotNull Listener listener);
}
