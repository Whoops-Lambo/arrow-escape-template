package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class nu {
    private com.bytedance.adsdk.ahm.rz.kgy.ahm ahm;
    private com.bytedance.adsdk.ahm.rz.kgy.ahm ct;
    private com.bytedance.adsdk.ahm.rz.kgy.kgy kgy;
    private com.bytedance.adsdk.ahm.rz.kgy.ahm rz;
    private com.bytedance.adsdk.ahm.rz.kgy.ahm uq;

    private void ahm(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("v")) {
                if (!strNextName.equals("nm")) {
                    jsonReader.skipValue();
                } else {
                    strNextString = jsonReader.nextString();
                }
            } else {
                strNextString.getClass();
                switch (strNextString) {
                    case "Distance":
                        this.uq = uq.kgy(jsonReader, yoVar);
                        break;
                    case "Opacity":
                        this.ahm = uq.kgy(jsonReader, yoVar, false);
                        break;
                    case "Direction":
                        this.rz = uq.kgy(jsonReader, yoVar, false);
                        break;
                    case "Shadow Color":
                        this.kgy = uq.yo(jsonReader, yoVar);
                        break;
                    case "Softness":
                        this.ct = uq.kgy(jsonReader, yoVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
        }
        jsonReader.endObject();
    }

    public ra kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar2;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar3;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("ef")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ahm(jsonReader, yoVar);
                }
                jsonReader.endArray();
            }
        }
        com.bytedance.adsdk.ahm.rz.kgy.kgy kgyVar = this.kgy;
        if (kgyVar != null && (ahmVar = this.ahm) != null && (ahmVar2 = this.rz) != null && (ahmVar3 = this.uq) != null && (ahmVar4 = this.ct) != null) {
            return new ra(kgyVar, ahmVar, ahmVar2, ahmVar3, ahmVar4);
        }
        return null;
    }
}
