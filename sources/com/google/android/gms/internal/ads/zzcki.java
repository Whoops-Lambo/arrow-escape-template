package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcki extends zzcke {
    @Override // com.google.android.gms.internal.ads.zzcke
    public final void o() {
    }

    @Override // com.google.android.gms.internal.ads.zzcke
    public final boolean f(String str) {
        String strZzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        zzcir zzcirVar = (zzcir) this.c.get();
        if (zzcirVar != null && strZzg != null) {
            zzcirVar.R(strZzg, this);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzi("VideoStreamNoopCache is doing nothing.");
        p(str, strZzg, "noop", "Noop cache is a noop.");
        return false;
    }
}
