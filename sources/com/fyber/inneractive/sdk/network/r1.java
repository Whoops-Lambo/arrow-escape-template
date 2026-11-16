package com.fyber.inneractive.sdk.network;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public enum r1 {
    EVENT_TABLE("sdk_event_"),
    ERROR_TABLE("sdk_error_");

    private final String tableName;

    public final String a() {
        return this.tableName;
    }

    r1(String str) {
        this.tableName = str;
    }
}
