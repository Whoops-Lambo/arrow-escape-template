package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Player;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public interface LeaderboardScore extends Freezable<LeaderboardScore> {
    public static final int LEADERBOARD_RANK_UNKNOWN = -1;

    @NonNull
    String getDisplayRank();

    void getDisplayRank(@NonNull CharArrayBuffer charArrayBuffer);

    @NonNull
    String getDisplayScore();

    void getDisplayScore(@NonNull CharArrayBuffer charArrayBuffer);

    long getRank();

    long getRawScore();

    @Nullable
    Player getScoreHolder();

    @NonNull
    String getScoreHolderDisplayName();

    void getScoreHolderDisplayName(@NonNull CharArrayBuffer charArrayBuffer);

    @NonNull
    Uri getScoreHolderHiResImageUri();

    @NonNull
    @KeepName
    @Deprecated
    String getScoreHolderHiResImageUrl();

    @NonNull
    Uri getScoreHolderIconImageUri();

    @NonNull
    @KeepName
    @Deprecated
    String getScoreHolderIconImageUrl();

    @NonNull
    String getScoreTag();

    long getTimestampMillis();
}
