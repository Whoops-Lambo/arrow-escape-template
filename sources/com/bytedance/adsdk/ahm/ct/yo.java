package com.bytedance.adsdk.ahm.ct;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class yo implements gbb<Integer> {
    public static final yo kgy = new yo();

    private yo() {
    }

    @Override // com.bytedance.adsdk.ahm.ct.gbb
    /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
    public Integer ahm(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        double dNextDouble;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.beginArray();
        }
        double dNextDouble2 = jsonReader.nextDouble();
        double dNextDouble3 = jsonReader.nextDouble();
        double dNextDouble4 = jsonReader.nextDouble();
        if (jsonReader.peek() == JsonToken.NUMBER) {
            dNextDouble = jsonReader.nextDouble();
        } else {
            dNextDouble = 1.0d;
        }
        if (z) {
            jsonReader.endArray();
        }
        if (dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d && dNextDouble4 <= 1.0d) {
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            dNextDouble4 *= 255.0d;
            if (dNextDouble <= 1.0d) {
                dNextDouble *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3, (int) dNextDouble4));
    }
}
