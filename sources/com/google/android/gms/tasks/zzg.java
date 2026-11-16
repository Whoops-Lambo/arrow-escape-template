package com.google.android.gms.tasks;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzg implements Runnable {
    final /* synthetic */ zzh zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzh zzhVar = this.zza;
        synchronized (zzhVar.zzc()) {
            try {
                if (zzhVar.zzd() != null) {
                    zzhVar.zzd().onCanceled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzg(zzh zzhVar) {
        Objects.requireNonNull(zzhVar);
        this.zza = zzhVar;
    }
}
