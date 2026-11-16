package com.mbridge.msdk.config.component.load.downloader.utils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static int a(long j, long j2) {
        if (j == 0 || j2 == 0) {
            return 0;
        }
        if (j == j2) {
            return 100;
        }
        return (int) (((j2 * 1.0d) / (j * 1.0d)) * 100.0d);
    }
}
