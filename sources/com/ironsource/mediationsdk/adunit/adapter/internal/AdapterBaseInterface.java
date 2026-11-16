package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface AdapterBaseInterface {
    @NotNull
    String getAdapterVersion();

    @Nullable
    String getNetworkSDKVersion();

    void init(@NotNull AdData adData, @NotNull Context context, @Nullable NetworkInitializationListener networkInitializationListener);
}
