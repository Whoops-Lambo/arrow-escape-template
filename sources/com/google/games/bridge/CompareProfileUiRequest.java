package com.google.games.bridge;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.games.PlayGames;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class CompareProfileUiRequest extends SimpleUiRequest {
    private static final String TAG = "CompareProfileUiRequest";
    private String currentPlayerInGameName;
    private String otherPlayerInGameName;
    private String playerId;

    public CompareProfileUiRequest(String str, String str2, String str3) {
        this.playerId = str;
        this.otherPlayerInGameName = str2;
        this.currentPlayerInGameName = str3;
    }

    @Override // com.google.games.bridge.SimpleUiRequest
    public Task<Intent> getIntent(Activity activity) {
        return PlayGames.getPlayersClient(activity).getCompareProfileIntentWithAlternativeNameHints(this.playerId, this.otherPlayerInGameName, this.currentPlayerInGameName);
    }
}
