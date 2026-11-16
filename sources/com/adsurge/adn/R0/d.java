package com.adsurge.adn.R0;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public interface d {
    InputStream a();

    int available();

    int b();

    byte c();

    void close();

    int read(byte[] bArr, int i, int i2);

    void reset();

    long skip(long j);
}
