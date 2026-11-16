package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class zzei extends zzaz {
    final /* synthetic */ zzek zza;

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        zzek zzekVar = this.zza;
        zzekVar.zzE().zza(zzekVar.zzz());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        zzek zzekVar = this.zza;
        zzekVar.zzE().zza(zzekVar.zzz());
        super.onAdLoaded();
    }

    public zzei(zzek zzekVar) {
        Objects.requireNonNull(zzekVar);
        this.zza = zzekVar;
    }
}
