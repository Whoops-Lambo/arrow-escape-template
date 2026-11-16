package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.stats.PlayerStatsBuffer;
import com.google.android.gms.games.stats.PlayerStatsEntity;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class zzab extends zza {
    private final TaskCompletionSource zza;

    public zzab(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzaj
    public final void zzq(DataHolder dataHolder) {
        PlayerStatsEntity playerStatsEntity;
        int statusCode = dataHolder.getStatusCode();
        if (statusCode != 0 && statusCode != 3) {
            GamesStatusUtils.zzb(this.zza, statusCode);
            dataHolder.close();
            return;
        }
        PlayerStatsBuffer playerStatsBuffer = new PlayerStatsBuffer(dataHolder);
        try {
            boolean z = false;
            if (playerStatsBuffer.getCount() > 0) {
                playerStatsEntity = new PlayerStatsEntity(playerStatsBuffer.get(0));
            } else {
                playerStatsEntity = null;
            }
            playerStatsBuffer.close();
            if (statusCode == 3) {
                z = true;
            }
            this.zza.setResult(new AnnotatedData(playerStatsEntity, z));
        } catch (Throwable th) {
            try {
                playerStatsBuffer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
