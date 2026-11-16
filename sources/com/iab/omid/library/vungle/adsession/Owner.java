package com.iab.omid.library.vungle.adsession;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public enum Owner {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");

    private final String owner;

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }

    Owner(String str) {
        this.owner = str;
    }
}
