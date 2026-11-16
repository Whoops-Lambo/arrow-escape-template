package com.bytedance.adsdk.ahm.ct;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class vg {
    public static com.bytedance.adsdk.ahm.rz.ahm.nu kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> twfVarAhm = null;
        com.bytedance.adsdk.ahm.rz.kgy.noq noqVarRz = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "p":
                    twfVarAhm = kgy.ahm(jsonReader, yoVar);
                    break;
                case "r":
                    ahmVarKgy = uq.kgy(jsonReader, yoVar);
                    break;
                case "s":
                    noqVarRz = uq.rz(jsonReader, yoVar);
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
        return new com.bytedance.adsdk.ahm.rz.ahm.nu(strNextString, twfVarAhm, noqVarRz, ahmVarKgy, zNextBoolean);
    }
}
