package com.google.android.gms.games;

import android.content.Intent;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface LeaderboardsClient {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class LeaderboardScores implements Releasable {

        @Nullable
        private final Leaderboard zza;
        private final LeaderboardScoreBuffer zzb;

        @Nullable
        public Leaderboard getLeaderboard() {
            return this.zza;
        }

        @NonNull
        public LeaderboardScoreBuffer getScores() {
            return this.zzb;
        }

        @Override // com.google.android.gms.common.api.Releasable
        public void release() {
            this.zzb.release();
        }

        public LeaderboardScores(@Nullable Leaderboard leaderboard, @NonNull LeaderboardScoreBuffer leaderboardScoreBuffer) {
            this.zza = leaderboard;
            this.zzb = leaderboardScoreBuffer;
        }
    }

    @NonNull
    Task<Intent> getAllLeaderboardsIntent();

    @NonNull
    Task<Intent> getLeaderboardIntent(@NonNull String str);

    @NonNull
    Task<Intent> getLeaderboardIntent(@NonNull String str, int i);

    @NonNull
    Task<Intent> getLeaderboardIntent(@NonNull String str, int i, int i2);

    @NonNull
    Task<AnnotatedData<LeaderboardScore>> loadCurrentPlayerLeaderboardScore(@NonNull String str, int i, int i2);

    @NonNull
    Task<AnnotatedData<Leaderboard>> loadLeaderboardMetadata(@NonNull String str, boolean z);

    @NonNull
    Task<AnnotatedData<LeaderboardBuffer>> loadLeaderboardMetadata(boolean z);

    @NonNull
    Task<AnnotatedData<LeaderboardScores>> loadMoreScores(@NonNull LeaderboardScoreBuffer leaderboardScoreBuffer, @IntRange int i, int i2);

    @NonNull
    Task<AnnotatedData<LeaderboardScores>> loadPlayerCenteredScores(@NonNull String str, int i, int i2, @IntRange int i3);

    @NonNull
    Task<AnnotatedData<LeaderboardScores>> loadPlayerCenteredScores(@NonNull String str, int i, int i2, @IntRange int i3, boolean z);

    @NonNull
    Task<AnnotatedData<LeaderboardScores>> loadTopScores(@NonNull String str, int i, int i2, @IntRange int i3);

    @NonNull
    Task<AnnotatedData<LeaderboardScores>> loadTopScores(@NonNull String str, int i, int i2, @IntRange int i3, boolean z);

    void submitScore(@NonNull String str, long j);

    void submitScore(@NonNull String str, long j, @NonNull String str2);

    @NonNull
    Task<ScoreSubmissionData> submitScoreImmediate(@NonNull String str, long j);

    @NonNull
    Task<ScoreSubmissionData> submitScoreImmediate(@NonNull String str, long j, @NonNull String str2);
}
