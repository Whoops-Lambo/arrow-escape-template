package com.google.firebase.auth;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class PlayGamesAuthProvider {

    @NonNull
    public static final String PLAY_GAMES_SIGN_IN_METHOD = "playgames.google.com";

    @NonNull
    public static final String PROVIDER_ID = "playgames.google.com";

    @NonNull
    public static AuthCredential getCredential(@NonNull String str) {
        return new PlayGamesAuthCredential(str);
    }

    private PlayGamesAuthProvider() {
    }
}
