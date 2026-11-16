package com.iab.omid.library.appodeal.adsession.media;

/* JADX INFO: loaded from: classes9.dex */
public enum Position {
    PREROLL("preroll"),
    MIDROLL("midroll"),
    POSTROLL("postroll"),
    STANDALONE("standalone");

    private final String position;

    @Override // java.lang.Enum
    public String toString() {
        return this.position;
    }

    Position(String str) {
        this.position = str;
    }
}
