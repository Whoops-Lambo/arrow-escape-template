package com.vungle.ads.internal.downloader;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public enum k {
    CRITICAL(-2147483647),
    HIGHEST(0),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH(1),
    LOWEST(Integer.MAX_VALUE);

    public final int a;

    k(int i) {
        this.a = i;
    }
}
