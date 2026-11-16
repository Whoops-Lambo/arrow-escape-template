package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Vb {

    @Nullable
    private AdapterNativeAdViewBinder a;

    @Nullable
    private AdapterNativeAdData b;

    public final void a(@Nullable AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.a = adapterNativeAdViewBinder;
    }

    @Nullable
    public final AdapterNativeAdViewBinder b() {
        return this.a;
    }

    @Nullable
    public final AdapterNativeAdData a() {
        return this.b;
    }

    public final void a(@Nullable AdapterNativeAdData adapterNativeAdData) {
        this.b = adapterNativeAdData;
    }
}
