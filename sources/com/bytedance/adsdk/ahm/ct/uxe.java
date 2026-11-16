package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class uxe implements gbb<com.bytedance.adsdk.ahm.yo.rz> {
    public static final uxe kgy = new uxe();

    private uxe() {
    }

    @Override // com.bytedance.adsdk.ahm.ct.gbb
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ahm.yo.rz ahm(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.ahm.yo.rz((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }
}
