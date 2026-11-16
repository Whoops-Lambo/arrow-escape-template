package com.fyber.inneractive.sdk.external;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public enum InneractiveMediationName {
    ADMOB("admob"),
    DFP(InneractiveMediationNameConsts.DFP),
    FYBER("fyber"),
    OTHER("other");

    final String key;

    public String getKey() {
        return this.key;
    }

    InneractiveMediationName(String str) {
        this.key = str;
    }
}
