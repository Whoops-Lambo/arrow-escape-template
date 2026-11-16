package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
class zzn extends zzw {
    protected final TaskCompletionSource zza;

    public void zzb(@Nullable zzg zzgVar) {
        zzd(new Status(10));
    }

    public void zzc(@Nullable Intent intent) {
        zzd(new Status(10));
    }

    @Override // com.google.android.gms.games.internal.v2.appshortcuts.zzx
    public final void zzd(Status status) {
        this.zza.trySetException(ApiExceptionUtil.fromStatus(status));
    }

    public zzn(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
