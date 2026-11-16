package com.iab.omid.library.vungle.adsession.media;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
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
