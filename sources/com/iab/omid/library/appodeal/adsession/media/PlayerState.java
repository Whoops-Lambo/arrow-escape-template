package com.iab.omid.library.appodeal.adsession.media;

import com.singular.sdk.internal.Constants;

/* JADX INFO: loaded from: classes9.dex */
public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL(Constants.NORMAL),
    EXPANDED("expanded"),
    FULLSCREEN("fullscreen");

    private final String playerState;

    @Override // java.lang.Enum
    public String toString() {
        return this.playerState;
    }

    PlayerState(String str) {
        this.playerState = str;
    }
}
