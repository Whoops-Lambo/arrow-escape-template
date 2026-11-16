package com.vungle.ads.internal.network;

import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class i extends ForwardingSource {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, BufferedSource bufferedSource) {
        super(bufferedSource);
        this.a = jVar;
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        try {
            return super.read(buffer, j);
        } catch (IOException e) {
            this.a.a(e);
            throw e;
        }
    }
}
