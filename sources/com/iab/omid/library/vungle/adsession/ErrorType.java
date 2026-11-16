package com.iab.omid.library.vungle.adsession;

import com.ironsource.C4664b4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public enum ErrorType {
    GENERIC("generic"),
    VIDEO("video"),
    MEDIA(C4664b4.i.I0);

    private final String errorType;

    @Override // java.lang.Enum
    public String toString() {
        return this.errorType;
    }

    ErrorType(String str) {
        this.errorType = str;
    }
}
