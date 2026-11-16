package com.vungle.ads.internal.network;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class k extends ResponseBody {
    public final MediaType a;
    public final long b;

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength */
    public final long get$contentLength() {
        return this.b;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType get$contentType() {
        return this.a;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public final BufferedSource get$this_asResponseBody() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    public k(MediaType mediaType, long j) {
        this.a = mediaType;
        this.b = j;
    }
}
