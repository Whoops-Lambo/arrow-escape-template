package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ec, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4726ec extends K0 {

    @NotNull
    private final InternalNativeAdListener a;

    @Override // com.ironsource.K0
    public void d(@Nullable AdInfo adInfo) {
        this.a.onNativeAdImpression(adInfo);
    }

    public C4726ec(@NotNull InternalNativeAdListener internalNativeAdListener) {
        internalNativeAdListener.getClass();
        this.a = internalNativeAdListener;
    }

    @Override // com.ironsource.K0
    public void a(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder, @Nullable AdInfo adInfo) {
        adapterNativeAdData.getClass();
        adapterNativeAdViewBinder.getClass();
        this.a.onNativeAdLoaded(adInfo, adapterNativeAdData, adapterNativeAdViewBinder);
    }

    @Override // com.ironsource.K0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.K0
    public void a(@NotNull C4870md c4870md, @Nullable AdInfo adInfo) {
        c4870md.getClass();
        this.a.onNativeAdClicked(adInfo);
    }
}
