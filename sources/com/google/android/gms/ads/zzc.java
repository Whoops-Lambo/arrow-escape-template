package com.google.android.gms.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@VisibleForTesting
public final class zzc {
    public static AdSize zza(int i, int i2, String str) {
        return new AdSize(i, i2, str);
    }

    public static AdSize zzb(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.zzd(true);
        adSize.zze(i2);
        return adSize;
    }

    public static AdSize zzc(int i, int i2) {
        AdSize adSize = new AdSize(i, i2);
        adSize.zzh(true);
        adSize.zzj(i2);
        return adSize;
    }

    public static boolean zzd(AdSize adSize) {
        return adSize.zzg();
    }

    public static int zze(AdSize adSize) {
        return adSize.zzi();
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.zza();
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.zzc();
    }

    public static int zzh(AdSize adSize) {
        return adSize.zzf();
    }

    public static boolean zzi(AdSize adSize) {
        return adSize.zzb();
    }
}
