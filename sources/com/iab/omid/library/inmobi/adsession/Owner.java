package com.iab.omid.library.inmobi.adsession;

/* JADX INFO: loaded from: classes8.dex */
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
