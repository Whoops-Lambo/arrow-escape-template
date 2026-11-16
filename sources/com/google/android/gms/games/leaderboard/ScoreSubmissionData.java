package com.google.android.gms.games.leaderboard;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.games_v2.zzz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class ScoreSubmissionData {
    private String zza;
    private String zzb;
    private int zzc;
    private SparseArray zzd = new SparseArray();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Result {

        @NonNull
        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;

        @NonNull
        public final String scoreTag;

        public Result(long j, @NonNull String str, @NonNull String str2, boolean z) {
            this.rawScore = j;
            this.formattedScore = str;
            this.scoreTag = str2;
            this.newBest = z;
        }

        @NonNull
        public String toString() {
            return Objects.toStringHelper(this).add("RawScore", Long.valueOf(this.rawScore)).add("FormattedScore", this.formattedScore).add("ScoreTag", this.scoreTag).add("NewBest", Boolean.valueOf(this.newBest)).toString();
        }
    }

    @NonNull
    public String getLeaderboardId() {
        return this.zza;
    }

    @NonNull
    public String getPlayerId() {
        return this.zzb;
    }

    @NonNull
    public Result getScoreResult(int i) {
        return (Result) this.zzd.get(i);
    }

    public ScoreSubmissionData(@NonNull DataHolder dataHolder) {
        boolean z;
        this.zzc = dataHolder.getStatusCode();
        int count = dataHolder.getCount();
        if (count == 3) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        int i = 0;
        while (i < count) {
            int windowIndex = dataHolder.getWindowIndex(i);
            if (i == 0) {
                this.zza = dataHolder.getString("leaderboardId", 0, windowIndex);
                this.zzb = dataHolder.getString("playerId", 0, windowIndex);
                i = 0;
            }
            if (dataHolder.getBoolean("hasResult", i, windowIndex)) {
                this.zzd.put(dataHolder.getInteger("timeSpan", i, windowIndex), new Result(dataHolder.getLong("rawScore", i, windowIndex), dataHolder.getString("formattedScore", i, windowIndex), dataHolder.getString("scoreTag", i, windowIndex), dataHolder.getBoolean("newBest", i, windowIndex)));
            }
            i++;
        }
    }

    @NonNull
    public String toString() {
        String string;
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("PlayerId", this.zzb).add("StatusCode", Integer.valueOf(this.zzc));
        for (int i = 0; i < 3; i++) {
            Result result = (Result) this.zzd.get(i);
            toStringHelperAdd.add("TimesSpan", zzz.a(i));
            if (result == null) {
                string = "null";
            } else {
                string = result.toString();
            }
            toStringHelperAdd.add("Result", string);
        }
        return toStringHelperAdd.toString();
    }
}
