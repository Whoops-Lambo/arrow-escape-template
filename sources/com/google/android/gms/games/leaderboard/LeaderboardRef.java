package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class LeaderboardRef extends DataBufferRef implements Leaderboard {
    private final int zza;
    private final Game zzb;

    @Override // com.google.android.gms.common.data.Freezable
    @NonNull
    public final /* synthetic */ Leaderboard freeze() {
        return new LeaderboardEntity(this);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    @NonNull
    public final String getDisplayName() {
        return getString("name");
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    @NonNull
    public final Uri getIconImageUri() {
        return parseUri("board_icon_image_uri");
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    @NonNull
    public String getIconImageUrl() {
        return getString("board_icon_image_url");
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    @NonNull
    public final String getLeaderboardId() {
        return getString("external_leaderboard_id");
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final int getScoreOrder() {
        return getInteger("score_order");
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    @NonNull
    public final ArrayList<LeaderboardVariant> getVariants() {
        int i = this.zza;
        ArrayList<LeaderboardVariant> arrayList = new ArrayList<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new zzb(this.mDataHolder, this.mDataRow + i2));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    @NonNull
    public final Game zza() {
        return this.zzb;
    }

    public LeaderboardRef(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.zza = i2;
        this.zzb = new GameRef(dataHolder, i);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(@Nullable Object obj) {
        return LeaderboardEntity.zzc(this, obj);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return LeaderboardEntity.zzb(this);
    }

    @NonNull
    public final String toString() {
        return LeaderboardEntity.zzd(this);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final void getDisplayName(@NonNull CharArrayBuffer charArrayBuffer) {
        copyToBuffer("name", charArrayBuffer);
    }
}
