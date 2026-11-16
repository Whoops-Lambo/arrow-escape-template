package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdd extends zzdb {
    private final MuteThisAdListener zza;

    @Override // com.google.android.gms.ads.internal.client.zzdc
    public final void zze() {
        this.zza.onAdMuted();
    }

    public zzdd(MuteThisAdListener muteThisAdListener) {
        this.zza = muteThisAdListener;
    }
}
