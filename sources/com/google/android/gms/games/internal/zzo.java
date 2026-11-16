package com.google.android.gms.games.internal;

import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
final class zzo extends zza {
    private final TaskCompletionSource zza;

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzaj
    public final void zzd(int i, String str) {
        if (i == 0 || i == 3003) {
            this.zza.setResult(null);
        } else {
            GamesStatusUtils.zzb(this.zza, i);
        }
    }

    public zzo(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }
}
