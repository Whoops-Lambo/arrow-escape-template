package com.inmobi.media;

import java.io.IOException;
import okio.BufferedSink;

/* JADX INFO: renamed from: com.inmobi.media.g3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C4037g3 extends Wj {
    public final byte[] a;

    public C4037g3(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // com.inmobi.media.Wj
    public final void a(BufferedSink bufferedSink) throws IOException {
        bufferedSink.getClass();
        bufferedSink.write(this.a);
    }

    @Override // com.inmobi.media.Wj
    public final String a() {
        return "application/octet-stream";
    }
}
