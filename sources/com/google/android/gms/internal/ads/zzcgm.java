package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzcgm implements zzbgl {
    public final com.google.android.gms.ads.internal.util.zzj b;
    public final zzcgj d;
    public final Object a = new Object();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public boolean g = false;
    public final zzcgk c = new zzcgk();

    public final void a(zzcgb zzcgbVar) {
        synchronized (this.a) {
            this.e.add(zzcgbVar);
        }
    }

    public zzcgm(String str, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.d = new zzcgj(str, zzjVar);
        this.b = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zza(boolean z) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        zzcgj zzcgjVar = this.d;
        com.google.android.gms.ads.internal.util.zzj zzjVar = this.b;
        if (z) {
            if (jCurrentTimeMillis - zzjVar.zzm() > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.O1)).longValue()) {
                zzcgjVar.d = -1;
            } else {
                zzcgjVar.d = zzjVar.zzo();
            }
            this.g = true;
            return;
        }
        zzjVar.zzl(jCurrentTimeMillis);
        zzjVar.zzn(zzcgjVar.d);
    }
}
