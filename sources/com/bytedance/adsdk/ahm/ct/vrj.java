package com.bytedance.adsdk.ahm.ct;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class vrj {
    public static com.bytedance.adsdk.ahm.rz.ahm.vs kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        com.bytedance.adsdk.ahm.rz.kgy.uq uqVar = null;
        String strNextString = null;
        com.bytedance.adsdk.ahm.rz.kgy.kgy kgyVarYo = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    kgyVarYo = uq.yo(jsonReader, yoVar);
                    break;
                case "o":
                    uqVar = uq.ahm(jsonReader, yoVar);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "hd":
                    zNextBoolean2 = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (uqVar == null) {
            uqVar = new com.bytedance.adsdk.ahm.rz.kgy.uq(Collections.singletonList(new com.bytedance.adsdk.ahm.yo.kgy(100)));
        }
        return new com.bytedance.adsdk.ahm.rz.ahm.vs(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, kgyVarYo, uqVar, zNextBoolean2);
    }
}
