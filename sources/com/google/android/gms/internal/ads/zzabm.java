package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class zzabm implements zzabk {
    public final zzabk a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzabm) {
            return this.a.equals(((zzabm) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public zzbg zza() {
        return this.a.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public zzv zzb(int i) {
        return this.a.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public zzv zzc() {
        return this.a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final int zze() {
        return this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final int zzf(int i) {
        return this.a.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final int zzg(int i) {
        return this.a.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final int zzh() {
        return this.a.zzh();
    }

    public zzabm(zzabk zzabkVar) {
        this.a = zzabkVar;
    }
}
