package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class mw {
    public static com.bytedance.adsdk.ahm.rz.ahm.dg kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "it":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.ahm.rz.ahm.rz rzVarKgy = fi.kgy(jsonReader, yoVar);
                        if (rzVarKgy != null) {
                            arrayList.add(rzVarKgy);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.ahm.rz.ahm.dg(strNextString, arrayList, zNextBoolean);
    }
}
