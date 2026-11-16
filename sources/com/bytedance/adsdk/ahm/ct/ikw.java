package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ikw {
    public static com.bytedance.adsdk.ahm.rz.ahm.twf kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "r":
                    ahmVarKgy = uq.kgy(jsonReader, yoVar, true);
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
        if (zNextBoolean) {
            return null;
        }
        return new com.bytedance.adsdk.ahm.rz.ahm.twf(strNextString, ahmVarKgy);
    }
}
