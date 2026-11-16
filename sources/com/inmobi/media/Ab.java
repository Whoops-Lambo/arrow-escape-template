package com.inmobi.media;

import java.io.IOException;
import okio.BufferedSink;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Ab extends Wj {
    public final JSONObject a;

    public Ab(JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = jSONObject;
    }

    @Override // com.inmobi.media.Wj
    public final void a(BufferedSink bufferedSink) throws IOException {
        bufferedSink.getClass();
        String string = this.a.toString();
        string.getClass();
        bufferedSink.writeUtf8(string);
    }

    @Override // com.inmobi.media.Wj
    public final String a() {
        return com.ironsource.G5.M;
    }
}
