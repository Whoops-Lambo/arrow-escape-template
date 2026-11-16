package com.bytedance.adsdk.ahm.ct;

import android.util.JsonReader;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
class xh {
    /* JADX WARN: Code duplicated, block: B:54:0x00dd A[PHI: r17
  0x00dd: PHI (r17v12 int) = 
  (r17v1 int)
  (r17v2 int)
  (r17v3 int)
  (r17v4 int)
  (r17v5 int)
  (r17v6 int)
  (r17v7 int)
  (r17v8 int)
  (r17v9 int)
  (r17v10 int)
  (r17v11 int)
  (r17v13 int)
 binds: [B:53:0x00db, B:49:0x00cf, B:45:0x00c2, B:41:0x00b7, B:37:0x00ac, B:33:0x009f, B:29:0x0092, B:25:0x0085, B:21:0x0075, B:17:0x0065, B:13:0x0055, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    public static com.bytedance.adsdk.ahm.rz.ahm.noq kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        int i;
        byte b;
        com.bytedance.adsdk.ahm.rz.kgy.rz rzVar;
        com.bytedance.adsdk.ahm.rz.kgy.noq noqVar;
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        com.bytedance.adsdk.ahm.rz.ahm.yo yoVar2 = null;
        com.bytedance.adsdk.ahm.rz.kgy.rz rzVarKgy = null;
        com.bytedance.adsdk.ahm.rz.kgy.noq noqVarRz = null;
        com.bytedance.adsdk.ahm.rz.kgy.noq noqVarRz2 = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy = null;
        com.bytedance.adsdk.ahm.rz.ahm.um.kgy kgyVar = null;
        com.bytedance.adsdk.ahm.rz.ahm.um.ahm ahmVar = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar2 = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.ahm.rz.kgy.uq uqVarAhm = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            String str = strNextString;
            com.bytedance.adsdk.ahm.rz.kgy.uq uqVar = uqVarAhm;
            com.bytedance.adsdk.ahm.rz.ahm.yo yoVar3 = yoVar2;
            switch (strNextName.hashCode()) {
                case 100:
                    i = 1;
                    if (!strNextName.equals("d")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 101:
                    i = 1;
                    if (!strNextName.equals(Constants.RequestBody.EXTRA_ATTRIBUTES_KEY)) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 103:
                    i = 1;
                    if (!strNextName.equals("g")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 111:
                    i = 1;
                    if (!strNextName.equals("o")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case INVALID_INDEX_URL_VALUE:
                    i = 1;
                    if (!strNextName.equals("s")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 116:
                    i = 1;
                    if (!strNextName.equals("t")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    i = 1;
                    if (!strNextName.equals("w")) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case 3324:
                    i = 1;
                    if (!strNextName.equals("hd")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 3447:
                    i = 1;
                    if (!strNextName.equals("lc")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 3454:
                    i = 1;
                    if (!strNextName.equals("lj")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 3487:
                    i = 1;
                    if (!strNextName.equals("ml")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case 3519:
                    i = 1;
                    if (!strNextName.equals("nm")) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                default:
                    b = -1;
                    i = 1;
                    break;
            }
            switch (b) {
                case 0:
                    jsonReader = jsonReader;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy2 = null;
                        String strNextString2 = null;
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.ahm.rz.kgy.rz rzVar2 = rzVarKgy;
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            com.bytedance.adsdk.ahm.rz.kgy.noq noqVar2 = noqVarRz;
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                ahmVarKgy2 = uq.kgy(jsonReader, yoVar);
                            } else {
                                jsonReader.skipValue();
                            }
                            rzVarKgy = rzVar2;
                            noqVarRz = noqVar2;
                        }
                        rzVarKgy = rzVarKgy;
                        noqVarRz = noqVarRz;
                        jsonReader.endObject();
                        if (strNextString2.equals("o")) {
                            ahmVar2 = ahmVarKgy2;
                        } else if (strNextString2.equals("d") || strNextString2.equals("g")) {
                            yoVar.kgy(true);
                            arrayList.add(ahmVarKgy2);
                        }
                    }
                    rzVar = rzVarKgy;
                    noqVar = noqVarRz;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    strNextString = str;
                    uqVarAhm = uqVar;
                    rzVarKgy = rzVar;
                    yoVar2 = yoVar3;
                    noqVarRz = noqVar;
                    break;
                case 1:
                    noqVarRz2 = uq.rz(jsonReader, yoVar);
                    strNextString = str;
                    uqVarAhm = uqVar;
                    yoVar2 = yoVar3;
                    break;
                case 2:
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("k")) {
                            rzVarKgy = uq.kgy(jsonReader, yoVar, iNextInt);
                        } else if (strNextName3.equals("p")) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strNextString = str;
                    uqVarAhm = uqVar;
                    yoVar2 = yoVar3;
                    break;
                case 3:
                    uqVarAhm = uq.ahm(jsonReader, yoVar);
                    strNextString = str;
                    yoVar2 = yoVar3;
                    break;
                case 4:
                    noqVarRz = uq.rz(jsonReader, yoVar);
                    strNextString = str;
                    uqVarAhm = uqVar;
                    yoVar2 = yoVar3;
                    break;
                case 5:
                    yoVar2 = jsonReader.nextInt() == i ? com.bytedance.adsdk.ahm.rz.ahm.yo.LINEAR : com.bytedance.adsdk.ahm.rz.ahm.yo.RADIAL;
                    strNextString = str;
                    uqVarAhm = uqVar;
                    break;
                case 6:
                    ahmVarKgy = uq.kgy(jsonReader, yoVar);
                    strNextString = str;
                    uqVarAhm = uqVar;
                    yoVar2 = yoVar3;
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    strNextString = str;
                    uqVarAhm = uqVar;
                    yoVar2 = yoVar3;
                    break;
                case 8:
                    kgyVar = com.bytedance.adsdk.ahm.rz.ahm.um.kgy.values()[jsonReader.nextInt() - 1];
                    strNextString = str;
                    uqVarAhm = uqVar;
                    yoVar2 = yoVar3;
                    break;
                case 9:
                    ahmVar = com.bytedance.adsdk.ahm.rz.ahm.um.ahm.values()[jsonReader.nextInt() - 1];
                    strNextString = str;
                    uqVarAhm = uqVar;
                    yoVar2 = yoVar3;
                    break;
                case 10:
                    fNextDouble = (float) jsonReader.nextDouble();
                    strNextString = str;
                    uqVarAhm = uqVar;
                    yoVar2 = yoVar3;
                    break;
                case 11:
                    strNextString = jsonReader.nextString();
                    uqVarAhm = uqVar;
                    yoVar2 = yoVar3;
                    break;
                default:
                    jsonReader.skipValue();
                    rzVar = rzVarKgy;
                    noqVar = noqVarRz;
                    strNextString = str;
                    uqVarAhm = uqVar;
                    rzVarKgy = rzVar;
                    yoVar2 = yoVar3;
                    noqVarRz = noqVar;
                    break;
            }
        }
        com.bytedance.adsdk.ahm.rz.kgy.uq uqVar2 = uqVarAhm;
        return new com.bytedance.adsdk.ahm.rz.ahm.noq(strNextString, yoVar2, rzVarKgy, uqVar2 == null ? new com.bytedance.adsdk.ahm.rz.kgy.uq(Collections.singletonList(new com.bytedance.adsdk.ahm.yo.kgy(100))) : uqVar2, noqVarRz, noqVarRz2, ahmVarKgy, kgyVar, ahmVar, fNextDouble, arrayList, ahmVar2, zNextBoolean);
    }
}
