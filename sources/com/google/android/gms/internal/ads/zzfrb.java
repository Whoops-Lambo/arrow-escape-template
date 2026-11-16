package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfrb implements zzdlo, zzdes, zzdls {
    public final zzfrt a;
    public final zzfrj b;

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlo
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdes
    public final void n(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbll.d.c()).booleanValue()) {
            String string = zzeVar.zza().toString();
            zzfrj zzfrjVar = this.b;
            zzfrjVar.zzk(string);
            zzfrjVar.zzd(false);
            this.a.a(zzfrjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zza() {
        if (((Boolean) zzbll.d.c()).booleanValue()) {
            zzfrj zzfrjVar = this.b;
            zzfrjVar.zzd(true);
            this.a.a(zzfrjVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlo
    public final void zzh() {
        if (((Boolean) zzbll.d.c()).booleanValue()) {
            this.b.zza();
        }
    }

    public zzfrb(Context context, zzfrt zzfrtVar) {
        this.a = zzfrtVar;
        this.b = zzfrj.b(context, 13);
    }
}
