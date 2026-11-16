package com.inmobi.media;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: renamed from: com.inmobi.media.h6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4068h6 implements Closeable {
    public final InputStream[] a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.a) {
            AbstractC4252nn.a(inputStream);
        }
    }

    public C4068h6(InputStream[] inputStreamArr) {
        this.a = inputStreamArr;
    }
}
