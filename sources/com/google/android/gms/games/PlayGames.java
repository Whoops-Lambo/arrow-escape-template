package com.google.android.gms.games;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.games_v2.zzad;
import com.google.android.gms.internal.games_v2.zzaq;
import com.google.android.gms.internal.games_v2.zzay;
import com.google.android.gms.internal.games_v2.zzbw;
import com.google.android.gms.internal.games_v2.zzcj;
import com.google.android.gms.internal.games_v2.zzcq;
import com.google.android.gms.internal.games_v2.zzcv;
import com.google.android.gms.internal.games_v2.zzdq;
import com.google.android.gms.internal.games_v2.zzdt;
import com.google.android.gms.internal.games_v2.zzem;
import com.google.android.gms.internal.games_v2.zzer;
import com.google.android.gms.internal.games_v2.zzfk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@ShowFirstParty
@RequiresApi
@zzad
public final class PlayGames {
    private PlayGames() {
    }

    @NonNull
    @zzad
    public static AchievementsClient getAchievementsClient(@NonNull Activity activity) {
        zzbw.b();
        return new zzcj(zzaq.a(zzbw.c()));
    }

    @NonNull
    @zzad
    public static EventsClient getEventsClient(@NonNull Activity activity) {
        zzbw.b();
        return new zzcq(zzaq.a(zzbw.c()));
    }

    @NonNull
    @zzad
    public static GamesSignInClient getGamesSignInClient(@NonNull Activity activity) {
        zzbw.b();
        return new zzcv(zzay.a(zzbw.c()), zzaq.a(zzbw.c()));
    }

    @NonNull
    @zzad
    public static LeaderboardsClient getLeaderboardsClient(@NonNull Activity activity) {
        zzbw.b();
        return new zzdq(zzaq.a(zzbw.c()));
    }

    @NonNull
    @zzad
    public static PlayerStatsClient getPlayerStatsClient(@NonNull Activity activity) {
        zzbw.b();
        return new zzdt(zzaq.a(zzbw.c()));
    }

    @NonNull
    @zzad
    public static PlayersClient getPlayersClient(@NonNull Activity activity) {
        zzbw.b();
        return new zzem(zzaq.a(zzbw.c()));
    }

    @NonNull
    @zzad
    public static RecallClient getRecallClient(@NonNull Activity activity) {
        zzbw.b();
        return new zzer(activity, zzay.a(zzbw.c()));
    }

    @NonNull
    @zzad
    public static SnapshotsClient getSnapshotsClient(@NonNull Activity activity) {
        zzbw.b();
        return new zzfk(zzaq.a(zzbw.c()));
    }
}
