package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
class ftg {
    public static com.bytedance.adsdk.ahm.rz.ahm.um kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        int i;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        com.bytedance.adsdk.ahm.rz.kgy.uq uqVar = null;
        String strNextString = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar = null;
        com.bytedance.adsdk.ahm.rz.kgy.kgy kgyVarYo = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy = null;
        com.bytedance.adsdk.ahm.rz.ahm.um.kgy kgyVar = null;
        com.bytedance.adsdk.ahm.rz.ahm.um.ahm ahmVar2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i2 = 1;
            switch (strNextName) {
                case "c":
                    kgyVarYo = uq.yo(jsonReader, yoVar);
                    continue;
                    break;
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy2 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                ahmVarKgy2 = uq.kgy(jsonReader, yoVar);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        strNextString2.getClass();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                i = 1;
                                yoVar.kgy(true);
                                arrayList.add(ahmVarKgy2);
                                i2 = i;
                                break;
                            case "o":
                                ahmVar = ahmVarKgy2;
                                i2 = 1;
                                break;
                            default:
                                i = 1;
                                i2 = i;
                                break;
                        }
                    }
                    int i3 = i2;
                    jsonReader.endArray();
                    if (arrayList.size() != i3) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                    }
                    break;
                case "o":
                    uqVar = uq.ahm(jsonReader, yoVar);
                    continue;
                    break;
                case "w":
                    ahmVarKgy = uq.kgy(jsonReader, yoVar);
                    continue;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    continue;
                    break;
                case "lc":
                    kgyVar = com.bytedance.adsdk.ahm.rz.ahm.um.kgy.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "lj":
                    ahmVar2 = com.bytedance.adsdk.ahm.rz.ahm.um.ahm.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (uqVar == null) {
            uqVar = new com.bytedance.adsdk.ahm.rz.kgy.uq(Collections.singletonList(new com.bytedance.adsdk.ahm.yo.kgy(100)));
        }
        return new com.bytedance.adsdk.ahm.rz.ahm.um(strNextString, ahmVar, arrayList, kgyVarYo, uqVar, ahmVarKgy, kgyVar, ahmVar2, fNextDouble, zNextBoolean);
    }
}
