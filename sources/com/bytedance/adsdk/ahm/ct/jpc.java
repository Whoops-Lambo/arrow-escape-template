package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
class jpc {
    public static com.bytedance.adsdk.ahm.kgy.ahm.gf kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        boolean z;
        if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        return new com.bytedance.adsdk.ahm.kgy.ahm.gf(yoVar, sx.kgy(jsonReader, yoVar, com.bytedance.adsdk.ahm.noq.noq.kgy(), ft.kgy, z, false));
    }
}
