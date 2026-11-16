package com.google.android.gms.games.leaderboard;

import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class LeaderboardBuffer extends EntityBuffer<Leaderboard> {
    @Override // com.google.android.gms.common.data.EntityBuffer
    @NonNull
    public final /* bridge */ /* synthetic */ Leaderboard getEntry(int i, int i2) {
        return new LeaderboardRef(this.mDataHolder, i, i2);
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    @NonNull
    public final String getPrimaryDataMarkerColumn() {
        return "external_leaderboard_id";
    }

    public LeaderboardBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
    }
}
