package com.google.android.gms.games.leaderboard;

import androidx.annotation.NonNull;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class LeaderboardScoreBuffer extends AbstractDataBuffer<LeaderboardScore> {
    private final zza zza;

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @NonNull
    public LeaderboardScore get(int i) {
        return new LeaderboardScoreRef(this.mDataHolder, i);
    }

    public final zza zza() {
        return this.zza;
    }

    public LeaderboardScoreBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
        this.zza = new zza(dataHolder.getMetadata());
    }
}
