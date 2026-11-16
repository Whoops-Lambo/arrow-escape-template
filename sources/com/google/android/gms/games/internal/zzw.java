package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
final class zzw extends zza {
    private final TaskCompletionSource zza;

    public zzw(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzaj
    public final void zze(DataHolder dataHolder) {
        boolean z;
        Leaderboard leaderboardFreeze;
        int statusCode = dataHolder.getStatusCode();
        if (statusCode == 3) {
            z = true;
        } else {
            z = false;
        }
        if (statusCode != 0 && !z) {
            GamesStatusUtils.zzb(this.zza, statusCode);
            dataHolder.close();
            return;
        }
        LeaderboardBuffer leaderboardBuffer = new LeaderboardBuffer(dataHolder);
        try {
            if (leaderboardBuffer.getCount() > 0) {
                leaderboardFreeze = leaderboardBuffer.get(0).freeze();
            } else {
                leaderboardFreeze = null;
            }
            leaderboardBuffer.close();
            this.zza.setResult(new AnnotatedData(leaderboardFreeze, z));
        } catch (Throwable th) {
            try {
                leaderboardBuffer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
