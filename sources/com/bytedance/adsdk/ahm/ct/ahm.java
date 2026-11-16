package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ahm {
    private static com.bytedance.adsdk.ahm.rz.kgy.nu ahm(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ahm.rz.kgy.kgy kgyVarYo = null;
        com.bytedance.adsdk.ahm.rz.kgy.kgy kgyVarYo2 = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "t":
                    ahmVarKgy2 = uq.kgy(jsonReader, yoVar);
                    break;
                case "fc":
                    kgyVarYo = uq.yo(jsonReader, yoVar);
                    break;
                case "sc":
                    kgyVarYo2 = uq.yo(jsonReader, yoVar);
                    break;
                case "sw":
                    ahmVarKgy = uq.kgy(jsonReader, yoVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.ahm.rz.kgy.nu(kgyVarYo, kgyVarYo2, ahmVarKgy, ahmVarKgy2);
    }

    public static com.bytedance.adsdk.ahm.rz.kgy.nu kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ahm.rz.kgy.nu nuVarAhm = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("a")) {
                jsonReader.skipValue();
            } else {
                nuVarAhm = ahm(jsonReader, yoVar);
            }
        }
        jsonReader.endObject();
        if (nuVarAhm == null) {
            return new com.bytedance.adsdk.ahm.rz.kgy.nu(null, null, null, null);
        }
        return nuVarAhm;
    }
}
