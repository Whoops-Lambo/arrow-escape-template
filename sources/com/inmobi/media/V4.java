package com.inmobi.media;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class V4 extends RequestBody {
    public final /* synthetic */ Wj a;

    public V4(Wj wj) {
        this.a = wj;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType get$contentType() {
        return MediaType.parse(this.a.a());
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        bufferedSink.getClass();
        this.a.a(bufferedSink);
    }
}
