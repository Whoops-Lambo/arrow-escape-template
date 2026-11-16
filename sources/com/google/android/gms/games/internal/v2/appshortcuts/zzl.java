package com.google.android.gms.games.internal.v2.appshortcuts;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class zzl extends zzn {
    @Override // com.google.android.gms.games.internal.v2.appshortcuts.zzn, com.google.android.gms.games.internal.v2.appshortcuts.zzx
    public final void zzb(@Nullable zzg zzgVar) {
        if (zzgVar == null) {
            zzd(new Status(17));
        } else {
            this.zza.trySetResult(zzgVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(zzq zzqVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        Objects.requireNonNull(zzqVar);
    }
}
