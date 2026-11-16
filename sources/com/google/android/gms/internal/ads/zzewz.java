package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzewz implements zzfdt {
    public final com.google.android.gms.ads.internal.client.zzx a;
    public final boolean b;

    @Override // com.google.android.gms.internal.ads.zzfdt
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.H6)).booleanValue()) {
            bundle.putBoolean("app_switched", this.b);
        }
        com.google.android.gms.ads.internal.client.zzx zzxVar = this.a;
        if (zzxVar != null) {
            int i = zzxVar.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", CmcdData.STREAM_TYPE_LIVE);
            }
        }
    }

    public zzewz(com.google.android.gms.ads.internal.client.zzx zzxVar, boolean z) {
        this.a = zzxVar;
        this.b = z;
    }
}
