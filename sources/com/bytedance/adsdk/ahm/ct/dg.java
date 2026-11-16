package com.bytedance.adsdk.ahm.ct;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class dg {
    public static com.bytedance.adsdk.ahm.rz.ahm.ct kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        com.bytedance.adsdk.ahm.rz.kgy.uq uqVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        com.bytedance.adsdk.ahm.rz.ahm.yo yoVar2 = null;
        com.bytedance.adsdk.ahm.rz.kgy.rz rzVarKgy = null;
        com.bytedance.adsdk.ahm.rz.kgy.noq noqVarRz = null;
        com.bytedance.adsdk.ahm.rz.kgy.noq noqVarRz2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int iNextInt = -1;
            switch (strNextName) {
                case "e":
                    noqVarRz2 = uq.rz(jsonReader, yoVar);
                    break;
                case "g":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("k")) {
                            rzVarKgy = uq.kgy(jsonReader, yoVar, iNextInt);
                        } else if (strNextName2.equals("p")) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "o":
                    uqVar = uq.ahm(jsonReader, yoVar);
                    break;
                case "r":
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case "s":
                    noqVarRz = uq.rz(jsonReader, yoVar);
                    break;
                case "t":
                    yoVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.ahm.rz.ahm.yo.LINEAR : com.bytedance.adsdk.ahm.rz.ahm.yo.RADIAL;
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
        if (uqVar == null) {
            uqVar = new com.bytedance.adsdk.ahm.rz.kgy.uq(Collections.singletonList(new com.bytedance.adsdk.ahm.yo.kgy(100)));
        }
        return new com.bytedance.adsdk.ahm.rz.ahm.ct(strNextString, yoVar2, fillType, rzVarKgy, uqVar, noqVarRz, noqVarRz2, null, null, zNextBoolean);
    }
}
