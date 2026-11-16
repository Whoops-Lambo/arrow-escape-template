package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class lqi {
    public static com.bytedance.adsdk.ahm.rz.ahm.fi kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ahm.rz.ahm.fi.kgy kgyVar = null;
        com.bytedance.adsdk.ahm.rz.kgy.fi fiVarCt = null;
        com.bytedance.adsdk.ahm.rz.kgy.uq uqVarAhm = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "o":
                    uqVarAhm = uq.ahm(jsonReader, yoVar);
                    break;
                case "pt":
                    fiVarCt = uq.ct(jsonReader, yoVar);
                    break;
                case "inv":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mode":
                    String strNextString = jsonReader.nextString();
                    strNextString.getClass();
                    switch (strNextString) {
                        case "a":
                            kgyVar = com.bytedance.adsdk.ahm.rz.ahm.fi.kgy.MASK_MODE_ADD;
                            break;
                        case "i":
                            yoVar.kgy("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            kgyVar = com.bytedance.adsdk.ahm.rz.ahm.fi.kgy.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            kgyVar = com.bytedance.adsdk.ahm.rz.ahm.fi.kgy.MASK_MODE_NONE;
                            break;
                        case "s":
                            kgyVar = com.bytedance.adsdk.ahm.rz.ahm.fi.kgy.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            kgyVar = com.bytedance.adsdk.ahm.rz.ahm.fi.kgy.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.ahm.rz.ahm.fi(kgyVar, fiVarCt, uqVarAhm, zNextBoolean);
    }
}
