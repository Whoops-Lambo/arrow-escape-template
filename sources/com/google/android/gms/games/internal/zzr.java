package com.google.android.gms.games.internal;

import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
final class zzr extends zza {
    private final TaskCompletionSource zza;

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzaj
    public final void zzp(int i, String str) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (i == 0) {
            taskCompletionSource.setResult(str);
        } else {
            GamesStatusUtils.zzb(taskCompletionSource, i);
        }
    }

    public zzr(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
