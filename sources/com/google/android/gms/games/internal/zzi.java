package com.google.android.gms.games.internal;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzi {
    public static final zzi zza = new zzi(new zzh(null));
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzi.class == obj.getClass()) {
            zzi zziVar = (zzi) obj;
            if (this.zzb == zziVar.zzb && this.zzc == zziVar.zzc && this.zzd == zziVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public static zzh zzd() {
        return new zzh(null);
    }

    public final int hashCode() {
        return ((((this.zzb ? 1 : 0) * 31) + (this.zzc ? 1 : 0)) * 31) + (this.zzd ? 1 : 0);
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    private zzi(zzh zzhVar) {
        this.zzb = zzhVar.zze();
        this.zzc = zzhVar.zzf();
        this.zzd = zzhVar.zzg();
    }

    public /* synthetic */ zzi(zzh zzhVar, byte[] bArr) {
        this(zzhVar);
    }
}
