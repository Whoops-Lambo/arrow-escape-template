package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzaua;
import com.google.android.gms.internal.ads.zzaug;
import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzcha;
import com.ironsource.C4887nc;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbk extends zzaua {
    private final zzcha zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbk(String str, Map map, zzcha zzchaVar) {
        super(0, str, new zzbj(zzchaVar));
        this.zza = zzchaVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzb(str, C4887nc.a, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final /* bridge */ /* synthetic */ void zzs(Object obj) {
        zzatw zzatwVar = (zzatw) obj;
        Map map = zzatwVar.c;
        int i = zzatwVar.a;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzd(map, i);
        byte[] bArr = zzatwVar.b;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.zza.zzc(zzatwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaua
    public final zzaug zzr(zzatw zzatwVar) {
        return new zzaug(zzatwVar, zzaux.a(zzatwVar));
    }
}
