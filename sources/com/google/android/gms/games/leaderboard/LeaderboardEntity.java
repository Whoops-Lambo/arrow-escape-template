package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardEntity implements Leaderboard {
    private final String zza;
    private final String zzb;
    private final Uri zzc;
    private final int zzd;
    private final ArrayList zze;
    private final String zzf;

    @Override // com.google.android.gms.common.data.Freezable
    @NonNull
    public final /* bridge */ /* synthetic */ Leaderboard freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    @NonNull
    public final Game zza() {
        throw null;
    }

    public static boolean zzc(Leaderboard leaderboard, Object obj) {
        if (!(obj instanceof Leaderboard)) {
            return false;
        }
        if (leaderboard == obj) {
            return true;
        }
        Leaderboard leaderboard2 = (Leaderboard) obj;
        return Objects.equal(leaderboard2.getLeaderboardId(), leaderboard.getLeaderboardId()) && Objects.equal(leaderboard2.getDisplayName(), leaderboard.getDisplayName()) && Objects.equal(leaderboard2.getIconImageUri(), leaderboard.getIconImageUri()) && Objects.equal(Integer.valueOf(leaderboard2.getScoreOrder()), Integer.valueOf(leaderboard.getScoreOrder())) && Objects.equal(leaderboard2.getVariants(), leaderboard.getVariants());
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final void getDisplayName(@NonNull CharArrayBuffer charArrayBuffer) {
        DataUtils.copyStringToBuffer(this.zzb, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    @NonNull
    public final Uri getIconImageUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    @NonNull
    public String getIconImageUrl() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    @NonNull
    public final String getLeaderboardId() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final int getScoreOrder() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    @NonNull
    public final ArrayList<LeaderboardVariant> getVariants() {
        return new ArrayList<>(this.zze);
    }

    public LeaderboardEntity(@NonNull Leaderboard leaderboard) {
        this.zza = leaderboard.getLeaderboardId();
        this.zzb = leaderboard.getDisplayName();
        this.zzc = leaderboard.getIconImageUri();
        this.zzf = leaderboard.getIconImageUrl();
        this.zzd = leaderboard.getScoreOrder();
        Game gameZza = leaderboard.zza();
        if (gameZza != null) {
            new GameEntity(gameZza);
        }
        ArrayList<LeaderboardVariant> variants = leaderboard.getVariants();
        int size = variants.size();
        this.zze = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.zze.add((LeaderboardVariantEntity) variants.get(i).freeze());
        }
    }

    public static int zzb(Leaderboard leaderboard) {
        return Objects.hashCode(leaderboard.getLeaderboardId(), leaderboard.getDisplayName(), leaderboard.getIconImageUri(), Integer.valueOf(leaderboard.getScoreOrder()), leaderboard.getVariants());
    }

    public static String zzd(Leaderboard leaderboard) {
        return Objects.toStringHelper(leaderboard).add("LeaderboardId", leaderboard.getLeaderboardId()).add("DisplayName", leaderboard.getDisplayName()).add("IconImageUri", leaderboard.getIconImageUri()).add("IconImageUrl", leaderboard.getIconImageUrl()).add("ScoreOrder", Integer.valueOf(leaderboard.getScoreOrder())).add("Variants", leaderboard.getVariants()).toString();
    }

    public final boolean equals(@Nullable Object obj) {
        return zzc(this, obj);
    }

    public final int hashCode() {
        return zzb(this);
    }

    @NonNull
    public final String toString() {
        return zzd(this);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    @NonNull
    public final String getDisplayName() {
        return this.zzb;
    }
}
