package com.mbridge.msdk.foundation.download.resource.stream;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface DownloadFileOutputStream {
    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j) throws IllegalAccessException, IOException;

    void setLength(long j) throws IllegalAccessException, IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
