package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
final class zzs extends zza {
    private final TaskCompletionSource zza;

    public zzs(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzaj
    public final void zzc(DataHolder dataHolder) {
        boolean z;
        int statusCode = dataHolder.getStatusCode();
        if (statusCode == 3) {
            z = true;
        } else {
            z = false;
        }
        if (statusCode != 0 && !z) {
            GamesStatusUtils.zzb(this.zza, statusCode);
            dataHolder.close();
        } else {
            this.zza.setResult(new AnnotatedData(new EventBuffer(dataHolder), z));
        }
    }
}
