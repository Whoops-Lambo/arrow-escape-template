package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbzu extends zzboq {
    public final NativeAd.OnNativeAdLoadedListener a;

    @Override // com.google.android.gms.internal.ads.zzbor
    public final void g0(zzbox zzboxVar) {
        this.a.onNativeAdLoaded(new zzbzp(zzboxVar));
    }

    public zzbzu(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.a = onNativeAdLoadedListener;
    }
}
