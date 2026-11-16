package com.google.android.recaptcha.internal;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zznb implements zzms {
    final int zza;
    final zzpw zzb;

    @Override // com.google.android.recaptcha.internal.zzms
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final boolean zzg() {
        return false;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zznb) obj).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final zzoh zzb(zzoh zzohVar, zzoi zzoiVar) {
        zzmx zzmxVar = (zzmx) zzohVar;
        zzmxVar.zzh((zznd) zzoiVar);
        return zzmxVar;
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final zzon zzc(zzon zzonVar, zzon zzonVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final zzpw zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzms
    public final zzpx zze() {
        return this.zzb.zza();
    }

    public zznb(zzng zzngVar, int i, zzpw zzpwVar, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = zzpwVar;
    }
}
