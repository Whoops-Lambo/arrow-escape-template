package com.google.android.gms.games.leaderboard;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.games_v2.zzz;
import defpackage.d;
import defpackage.pv1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@UsedByReflection("GamesGmsClientImpl.java")
public final class LeaderboardVariantEntity implements LeaderboardVariant {
    private final int zza;
    private final int zzb;
    private final boolean zzc;
    private final long zzd;
    private final String zze;
    private final long zzf;
    private final String zzg;
    private final String zzh;
    private final long zzi;
    private final String zzj;
    private final String zzk;
    private final String zzl;

    @Override // com.google.android.gms.common.data.Freezable
    @NonNull
    public final /* bridge */ /* synthetic */ LeaderboardVariant freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public static boolean zze(LeaderboardVariant leaderboardVariant, Object obj) {
        if (!(obj instanceof LeaderboardVariant)) {
            return false;
        }
        if (leaderboardVariant == obj) {
            return true;
        }
        LeaderboardVariant leaderboardVariant2 = (LeaderboardVariant) obj;
        return Objects.equal(Integer.valueOf(leaderboardVariant2.getTimeSpan()), Integer.valueOf(leaderboardVariant.getTimeSpan())) && Objects.equal(Integer.valueOf(leaderboardVariant2.getCollection()), Integer.valueOf(leaderboardVariant.getCollection())) && Objects.equal(Boolean.valueOf(leaderboardVariant2.hasPlayerInfo()), Boolean.valueOf(leaderboardVariant.hasPlayerInfo())) && Objects.equal(Long.valueOf(leaderboardVariant2.getRawPlayerScore()), Long.valueOf(leaderboardVariant.getRawPlayerScore())) && Objects.equal(leaderboardVariant2.getDisplayPlayerScore(), leaderboardVariant.getDisplayPlayerScore()) && Objects.equal(Long.valueOf(leaderboardVariant2.getPlayerRank()), Long.valueOf(leaderboardVariant.getPlayerRank())) && Objects.equal(leaderboardVariant2.getDisplayPlayerRank(), leaderboardVariant.getDisplayPlayerRank()) && Objects.equal(Long.valueOf(leaderboardVariant2.getNumScores()), Long.valueOf(leaderboardVariant.getNumScores())) && Objects.equal(leaderboardVariant2.zza(), leaderboardVariant.zza()) && Objects.equal(leaderboardVariant2.zzc(), leaderboardVariant.zzc()) && Objects.equal(leaderboardVariant2.zzb(), leaderboardVariant.zzb());
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getCollection() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    @NonNull
    public final String getDisplayPlayerRank() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    @NonNull
    public final String getDisplayPlayerScore() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getNumScores() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getPlayerRank() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    @NonNull
    public final String getPlayerScoreTag() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getRawPlayerScore() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getTimeSpan() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final boolean hasPlayerInfo() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    @NonNull
    public final String zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    @NonNull
    public final String zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    @NonNull
    public final String zzc() {
        return this.zzl;
    }

    public LeaderboardVariantEntity(@NonNull LeaderboardVariant leaderboardVariant) {
        this.zza = leaderboardVariant.getTimeSpan();
        this.zzb = leaderboardVariant.getCollection();
        this.zzc = leaderboardVariant.hasPlayerInfo();
        this.zzd = leaderboardVariant.getRawPlayerScore();
        this.zze = leaderboardVariant.getDisplayPlayerScore();
        this.zzf = leaderboardVariant.getPlayerRank();
        this.zzg = leaderboardVariant.getDisplayPlayerRank();
        this.zzh = leaderboardVariant.getPlayerScoreTag();
        this.zzi = leaderboardVariant.getNumScores();
        this.zzj = leaderboardVariant.zza();
        this.zzk = leaderboardVariant.zzb();
        this.zzl = leaderboardVariant.zzc();
    }

    public static int zzd(LeaderboardVariant leaderboardVariant) {
        return Objects.hashCode(Integer.valueOf(leaderboardVariant.getTimeSpan()), Integer.valueOf(leaderboardVariant.getCollection()), Boolean.valueOf(leaderboardVariant.hasPlayerInfo()), Long.valueOf(leaderboardVariant.getRawPlayerScore()), leaderboardVariant.getDisplayPlayerScore(), Long.valueOf(leaderboardVariant.getPlayerRank()), leaderboardVariant.getDisplayPlayerRank(), Long.valueOf(leaderboardVariant.getNumScores()), leaderboardVariant.zza(), leaderboardVariant.zzc(), leaderboardVariant.zzb());
    }

    public static String zzf(LeaderboardVariant leaderboardVariant) {
        String str;
        Object objValueOf;
        String displayPlayerScore;
        Object objValueOf2;
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(leaderboardVariant).add("TimeSpan", zzz.a(leaderboardVariant.getTimeSpan()));
        int collection = leaderboardVariant.getCollection();
        if (collection != -1) {
            if (collection != 0) {
                if (collection != 1) {
                    str = "SOCIAL_1P";
                    if (collection != 2) {
                        if (collection != 3) {
                            if (collection != 4) {
                                d.r(pv1.l(collection, "Unknown leaderboard collection: ", new StringBuilder(String.valueOf(collection).length() + 32)));
                                return null;
                            }
                        } else {
                            str = "FRIENDS";
                        }
                    }
                } else {
                    str = "SOCIAL";
                }
            } else {
                str = "PUBLIC";
            }
        } else {
            str = "UNKNOWN";
        }
        Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add("Collection", str);
        String displayPlayerRank = "none";
        if (!leaderboardVariant.hasPlayerInfo()) {
            objValueOf = "none";
        } else {
            objValueOf = Long.valueOf(leaderboardVariant.getRawPlayerScore());
        }
        Objects.ToStringHelper toStringHelperAdd3 = toStringHelperAdd2.add("RawPlayerScore", objValueOf);
        if (!leaderboardVariant.hasPlayerInfo()) {
            displayPlayerScore = "none";
        } else {
            displayPlayerScore = leaderboardVariant.getDisplayPlayerScore();
        }
        Objects.ToStringHelper toStringHelperAdd4 = toStringHelperAdd3.add("DisplayPlayerScore", displayPlayerScore);
        if (!leaderboardVariant.hasPlayerInfo()) {
            objValueOf2 = "none";
        } else {
            objValueOf2 = Long.valueOf(leaderboardVariant.getPlayerRank());
        }
        Objects.ToStringHelper toStringHelperAdd5 = toStringHelperAdd4.add("PlayerRank", objValueOf2);
        if (leaderboardVariant.hasPlayerInfo()) {
            displayPlayerRank = leaderboardVariant.getDisplayPlayerRank();
        }
        return toStringHelperAdd5.add("DisplayPlayerRank", displayPlayerRank).add("NumScores", Long.valueOf(leaderboardVariant.getNumScores())).add("TopPageNextToken", leaderboardVariant.zza()).add("WindowPageNextToken", leaderboardVariant.zzc()).add("WindowPagePrevToken", leaderboardVariant.zzb()).toString();
    }

    public final boolean equals(@Nullable Object obj) {
        return zze(this, obj);
    }

    public final int hashCode() {
        return zzd(this);
    }

    @NonNull
    public final String toString() {
        return zzf(this);
    }
}
