package com.bytedance.adsdk.ahm.ct;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy {
    public static com.bytedance.adsdk.ahm.rz.kgy.ct kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(jpc.kgy(jsonReader, yoVar));
            }
            jsonReader.endArray();
            gm.kgy(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.ahm.yo.kgy(fpp.ahm(jsonReader, com.bytedance.adsdk.ahm.noq.noq.kgy())));
        }
        return new com.bytedance.adsdk.ahm.rz.kgy.ct(arrayList);
    }

    public static com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> ahm(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ahm.rz.kgy.ct ctVarKgy = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "k":
                    ctVarKgy = kgy(jsonReader, yoVar);
                    break;
                case "x":
                    if (jsonReader.peek() == JsonToken.STRING) {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    } else {
                        ahmVarKgy = uq.kgy(jsonReader, yoVar);
                        break;
                    }
                    break;
                case "y":
                    if (jsonReader.peek() == JsonToken.STRING) {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    } else {
                        ahmVarKgy2 = uq.kgy(jsonReader, yoVar);
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            yoVar.kgy("Lottie doesn't support expressions.");
        }
        if (ctVarKgy != null) {
            return ctVarKgy;
        }
        return new com.bytedance.adsdk.ahm.rz.kgy.gf(ahmVarKgy, ahmVarKgy2);
    }
}
