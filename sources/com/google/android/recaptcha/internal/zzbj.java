package com.google.android.recaptcha.internal;

import defpackage.dk2;
import defpackage.jc1;
import defpackage.pv1;
import defpackage.uu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    @NotNull
    public final String toString() {
        String strD0 = dk2.d0(String.valueOf(this.zzb / ((long) this.zza)), 10, ' ');
        String strD1 = dk2.d0(String.valueOf(this.zzc), 10, ' ');
        return jc1.o(dk2.d0(String.valueOf(this.zzb), 10, ' '), " us| #Usages: ", pv1.r("avgExecutionTime: ", strD0, " us| maxExecutionTime: ", strD1, " us| totalTime: "), dk2.d0(String.valueOf(this.zza), 5, ' '));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull zzbj zzbjVar) {
        return uu.k(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
