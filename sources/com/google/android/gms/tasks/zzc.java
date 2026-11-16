package com.google.android.gms.tasks;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, Task task) {
        this.zza = task;
        Objects.requireNonNull(zzdVar);
        this.zzb = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task task = this.zza;
        boolean zIsCanceled = task.isCanceled();
        zzd zzdVar = this.zzb;
        if (zIsCanceled) {
            zzdVar.zzd().zze();
            return;
        }
        try {
            this.zzb.zzd().zza(zzdVar.zzc().then(task));
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            zzd zzdVar2 = this.zzb;
            if (!z) {
                zzdVar2.zzd().zzc(e);
            } else {
                zzdVar2.zzd().zzc((Exception) e.getCause());
            }
        } catch (Exception e2) {
            this.zzb.zzd().zzc(e2);
        }
    }
}
