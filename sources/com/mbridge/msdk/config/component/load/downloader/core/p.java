package com.mbridge.msdk.config.component.load.downloader.core;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface p {
    p a(int i);

    p a(com.mbridge.msdk.config.component.load.downloader.f fVar);

    d build();

    p withHttpRetryCounter(int i);

    p withTimeout(long j);
}
