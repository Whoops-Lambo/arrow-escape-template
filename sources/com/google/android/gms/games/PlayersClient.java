package com.google.android.gms.games;

import android.content.Intent;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface PlayersClient {

    @NonNull
    public static final String EXTRA_PLAYER_SEARCH_RESULTS = "player_search_results";

    @NonNull
    Task<Intent> getCompareProfileIntent(@NonNull Player player);

    @NonNull
    Task<Intent> getCompareProfileIntent(@NonNull String str);

    @NonNull
    Task<Intent> getCompareProfileIntentWithAlternativeNameHints(@NonNull String str, @Nullable String str2, @Nullable String str3);

    @NonNull
    Task<Player> getCurrentPlayer();

    @NonNull
    Task<AnnotatedData<Player>> getCurrentPlayer(boolean z);

    @NonNull
    Task<String> getCurrentPlayerId();

    @NonNull
    Task<Intent> getPlayerSearchIntent();

    @NonNull
    Task<AnnotatedData<PlayerBuffer>> loadFriends(@IntRange int i, boolean z);

    @NonNull
    Task<AnnotatedData<PlayerBuffer>> loadMoreFriends(@IntRange int i);

    @NonNull
    @Deprecated
    Task<AnnotatedData<PlayerBuffer>> loadMoreRecentlyPlayedWithPlayers(@IntRange int i);

    @NonNull
    Task<AnnotatedData<Player>> loadPlayer(@NonNull String str);

    @NonNull
    Task<AnnotatedData<Player>> loadPlayer(@NonNull String str, boolean z);

    @NonNull
    @Deprecated
    Task<AnnotatedData<PlayerBuffer>> loadRecentlyPlayedWithPlayers(@IntRange int i, boolean z);
}
