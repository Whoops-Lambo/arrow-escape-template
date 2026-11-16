package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class n extends IOException {
    public final b a;

    public n(b bVar) {
        super("stream was reset: " + bVar);
        this.a = bVar;
    }
}
