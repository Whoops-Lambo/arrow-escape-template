package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class ct {
    public static com.bytedance.adsdk.ahm.rz.ahm.kgy kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        com.bytedance.adsdk.ahm.rz.ahm.kgy kgyVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.ahm.rz.ahm.kgy kgyVarAhm = ahm(jsonReader, yoVar);
                    if (kgyVarAhm != null) {
                        kgyVar = kgyVarAhm;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return kgyVar;
    }

    private static com.bytedance.adsdk.ahm.rz.ahm.kgy ahm(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ahm.rz.ahm.kgy kgyVar = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    if (!strNextName.equals("v")) {
                        if (!strNextName.equals("ty")) {
                            jsonReader.skipValue();
                        } else if (jsonReader.nextInt() == 0) {
                            z = true;
                        }
                    } else if (z) {
                        kgyVar = new com.bytedance.adsdk.ahm.rz.ahm.kgy(uq.kgy(jsonReader, yoVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    jsonReader.endObject();
                    return kgyVar;
                }
            }
        }
    }
}
