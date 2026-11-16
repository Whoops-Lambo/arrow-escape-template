package com.bytedance.adsdk.ahm.ct;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class uf {
    public static com.bytedance.adsdk.ahm.rz.ahm.ra kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar, int i) throws IOException {
        boolean zNextBoolean = false;
        boolean z = i == 3;
        String strNextString = null;
        com.bytedance.adsdk.ahm.rz.ahm.ra.kgy kgyVarKgy = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy = null;
        com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> twfVarAhm = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy2 = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy3 = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy4 = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy5 = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy6 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                    break;
                case "p":
                    twfVarAhm = kgy.ahm(jsonReader, yoVar);
                    break;
                case "r":
                    ahmVarKgy2 = uq.kgy(jsonReader, yoVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    ahmVarKgy3 = uq.kgy(jsonReader, yoVar);
                    break;
                case "is":
                    ahmVarKgy5 = uq.kgy(jsonReader, yoVar, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    ahmVarKgy4 = uq.kgy(jsonReader, yoVar);
                    break;
                case "os":
                    ahmVarKgy6 = uq.kgy(jsonReader, yoVar, false);
                    break;
                case "pt":
                    ahmVarKgy = uq.kgy(jsonReader, yoVar, false);
                    break;
                case "sy":
                    kgyVarKgy = com.bytedance.adsdk.ahm.rz.ahm.ra.kgy.kgy(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.ahm.rz.ahm.ra(strNextString, kgyVarKgy, ahmVarKgy, twfVarAhm, ahmVarKgy2, ahmVarKgy3, ahmVarKgy4, ahmVarKgy5, ahmVarKgy6, zNextBoolean, z);
    }
}
