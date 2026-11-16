package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class wl {
    public static com.bytedance.adsdk.ahm.rz.ahm.fpp kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.ahm.rz.ahm.fpp.kgy kgyVarKgy = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy2 = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    ahmVarKgy2 = uq.kgy(jsonReader, yoVar, false);
                    break;
                case "m":
                    kgyVarKgy = com.bytedance.adsdk.ahm.rz.ahm.fpp.kgy.kgy(jsonReader.nextInt());
                    break;
                case "o":
                    ahmVarKgy3 = uq.kgy(jsonReader, yoVar, false);
                    break;
                case "s":
                    ahmVarKgy = uq.kgy(jsonReader, yoVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.ahm.rz.ahm.fpp(strNextString, kgyVarKgy, ahmVarKgy, ahmVarKgy2, ahmVarKgy3, zNextBoolean);
    }
}
