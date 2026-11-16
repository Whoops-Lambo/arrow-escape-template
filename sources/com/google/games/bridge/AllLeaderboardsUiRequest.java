package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.games.PlayGames;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class AllLeaderboardsUiRequest extends SimpleUiRequest {
    private static final String TAG = "AllLeaderboardsUiRequest";

    @Override // com.google.games.bridge.SimpleUiRequest
    public Task<Intent> getIntent(Activity activity) {
        return PlayGames.getLeaderboardsClient(activity).getAllLeaderboardsIntent();
    }
}
