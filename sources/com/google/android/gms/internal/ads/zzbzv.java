package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbzv extends zzbot {
    public final NativeAd.UnconfirmedClickListener a;

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zze(String str) {
        this.a.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzf() {
        this.a.onUnconfirmedClickCancelled();
    }

    public zzbzv(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.a = unconfirmedClickListener;
    }
}
