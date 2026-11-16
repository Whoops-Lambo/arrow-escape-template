package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaue;
import com.google.android.gms.internal.ads.zzauj;
import defpackage.pv1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class zzbg implements zzaue {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    public zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zza(zzauj zzaujVar) {
        String str = this.zza;
        String string = zzaujVar.toString();
        String strP = pv1.p(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length()), "Failed to load URL: ", str, "\n", string);
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strP);
        this.zzb.zza(null);
    }
}
