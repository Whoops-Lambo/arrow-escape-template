package com.iab.omid.library.bytedance2.adsession;

/* JADX INFO: loaded from: classes8.dex */
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
