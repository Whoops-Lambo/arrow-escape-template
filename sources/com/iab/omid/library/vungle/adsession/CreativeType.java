package com.iab.omid.library.vungle.adsession;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public enum CreativeType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");

    private final String creativeType;

    @Override // java.lang.Enum
    public String toString() {
        return this.creativeType;
    }

    CreativeType(String str) {
        this.creativeType = str;
    }
}
