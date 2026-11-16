package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
class fpz {
    public static com.bytedance.adsdk.ahm.rz.ahm.gf kgy(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.ahm.rz.ahm.gf.kgy kgyVarKgy = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    kgyVarKgy = com.bytedance.adsdk.ahm.rz.ahm.gf.kgy.kgy(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.ahm.rz.ahm.gf(strNextString, kgyVarKgy, zNextBoolean);
    }
}
