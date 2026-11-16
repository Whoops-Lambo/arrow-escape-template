package com.inmobi.media;

import java.io.IOException;
import java.util.HashMap;
import okio.BufferedSink;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class B7 extends Wj {
    public final HashMap a;

    public B7(HashMap map, int i) {
        map.getClass();
        this.a = map;
    }

    @Override // com.inmobi.media.Wj
    public final void a(BufferedSink bufferedSink) throws IOException {
        bufferedSink.getClass();
        bufferedSink.writeUtf8(AbstractC4038g4.a(this.a));
    }

    public B7(HashMap map) {
        map.getClass();
        this.a = map;
    }

    @Override // com.inmobi.media.Wj
    public final String a() {
        return "application/x-www-form-urlencoded";
    }
}
