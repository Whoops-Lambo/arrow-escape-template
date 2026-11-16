package com.iab.omid.library.vungle.adsession.media;

import com.singular.sdk.internal.Constants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
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
