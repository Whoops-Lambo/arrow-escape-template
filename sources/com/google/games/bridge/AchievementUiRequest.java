package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.games.PlayGames;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class AchievementUiRequest extends SimpleUiRequest {
    private static final String TAG = "AchievementUiRequest";

    @Override // com.google.games.bridge.SimpleUiRequest
    public Task<Intent> getIntent(Activity activity) {
        return PlayGames.getAchievementsClient(activity).getAchievementsIntent();
    }
}
