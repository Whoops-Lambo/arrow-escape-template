package com.bytedance.adsdk.ahm.ct;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ioy {
    private static Map<String, Object> ahm(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("lel")) {
                map.put("lel", rz(jsonReader));
            } else if (strNextName.equals("lottie_back")) {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("hd")) {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        Object objRemove = map.remove("lottie_back");
        if (objRemove instanceof JSONObject) {
            Object obj = map.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(objRemove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(objRemove);
                map.put("lel", jSONArray);
            }
        }
        return map;
    }

    public static com.bytedance.adsdk.ahm.yo kgy(JsonReader jsonReader) throws IOException {
        float f;
        float fKgy = com.bytedance.adsdk.ahm.noq.noq.kgy();
        LongSparseArray<com.bytedance.adsdk.ahm.rz.rz.ct> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.ahm.rz.uq> sparseArray = new SparseArray<>();
        com.bytedance.adsdk.ahm.yo.rz rzVar = new com.bytedance.adsdk.ahm.yo.rz();
        com.bytedance.adsdk.ahm.yo.kgy kgyVar = new com.bytedance.adsdk.ahm.yo.kgy();
        com.bytedance.adsdk.ahm.yo.ahm ahmVar = new com.bytedance.adsdk.ahm.yo.ahm();
        com.bytedance.adsdk.ahm.yo yoVar = new com.bytedance.adsdk.ahm.yo();
        jsonReader.beginObject();
        float fNextDouble = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float fNextDouble2 = 0.0f;
        String strNextString = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        float fNextDouble3 = 0.0f;
        while (jsonReader.hasNext()) {
            float f2 = fNextDouble;
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b = -1;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    f = fNextDouble3;
                    if (strNextName.equals("assets")) {
                        b = 0;
                    }
                    break;
                case -1109732030:
                    f = fNextDouble3;
                    if (strNextName.equals("layers")) {
                        b = 1;
                    }
                    break;
                case -865448777:
                    f = fNextDouble3;
                    if (strNextName.equals("globalEvent")) {
                        b = 2;
                    }
                    break;
                case 104:
                    f = fNextDouble3;
                    if (strNextName.equals(CmcdData.STREAMING_FORMAT_HLS)) {
                        b = 3;
                    }
                    break;
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    f = fNextDouble3;
                    if (strNextName.equals("v")) {
                        b = 4;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    f = fNextDouble3;
                    if (strNextName.equals("w")) {
                        b = 5;
                    }
                    break;
                case 3208:
                    f = fNextDouble3;
                    if (strNextName.equals(CmcdConfiguration.KEY_DEADLINE)) {
                        b = 6;
                    }
                    break;
                case 3276:
                    f = fNextDouble3;
                    if (strNextName.equals("fr")) {
                        b = 7;
                    }
                    break;
                case 3292:
                    f = fNextDouble3;
                    if (strNextName.equals("gc")) {
                        b = 8;
                    }
                    break;
                case 3367:
                    f = fNextDouble3;
                    if (strNextName.equals("ip")) {
                        b = 9;
                    }
                    break;
                case 3553:
                    f = fNextDouble3;
                    if (strNextName.equals("op")) {
                        b = 10;
                    }
                    break;
                case 94623709:
                    f = fNextDouble3;
                    if (strNextName.equals("chars")) {
                        b = 11;
                    }
                    break;
                case 97615364:
                    f = fNextDouble3;
                    if (strNextName.equals("fonts")) {
                        b = 12;
                    }
                    break;
                case 110364485:
                    f = fNextDouble3;
                    if (strNextName.equals("timer")) {
                        b = 13;
                    }
                    break;
                case 839250809:
                    f = fNextDouble3;
                    if (strNextName.equals("markers")) {
                        b = 14;
                    }
                    break;
                default:
                    f = fNextDouble3;
                    break;
            }
            switch (b) {
                case 0:
                    kgy(jsonReader, yoVar, map, map2);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 1:
                    kgy(jsonReader, yoVar, arrayList, longSparseArray);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 2:
                    kgy(jsonReader, ahmVar);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 3:
                    iNextInt = jsonReader.nextInt();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 4:
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.ahm.noq.noq.kgy(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        yoVar.kgy("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 5:
                    iNextInt2 = jsonReader.nextInt();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 7:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 8:
                    kgy(jsonReader, kgyVar);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 9:
                    fNextDouble = (float) jsonReader.nextDouble();
                    fNextDouble3 = f;
                    break;
                case 10:
                    fNextDouble3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    fNextDouble = f2;
                    break;
                case 11:
                    kgy(jsonReader, yoVar, sparseArray);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 12:
                    kgy(jsonReader, map3);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 13:
                    kgy(jsonReader, rzVar);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                case 14:
                    kgy(jsonReader, arrayList2);
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
                default:
                    jsonReader.skipValue();
                    fNextDouble = f2;
                    fNextDouble3 = f;
                    break;
            }
        }
        jsonReader.endObject();
        yoVar.kgy(new Rect(0, 0, (int) (iNextInt2 * fKgy), (int) (iNextInt * fKgy)), fNextDouble, fNextDouble3, fNextDouble2, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, rzVar, strNextString, kgyVar, ahmVar);
        return yoVar;
    }

    private static JSONArray rz(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3324) {
                        if (iHashCode == 116753 && strNextName.equals("vid")) {
                            try {
                                jSONObject.put("vid", jsonReader.nextString());
                            } catch (JSONException unused) {
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("hd")) {
                        jSONObject.put("hd", jsonReader.nextInt());
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    private static List<com.bytedance.adsdk.ahm.ra.kgy> uq(JsonReader jsonReader) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                com.bytedance.adsdk.ahm.ra.kgy kgyVar = new com.bytedance.adsdk.ahm.ra.kgy();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 99) {
                        if (iHashCode != 102) {
                            if (iHashCode != 108) {
                                if (iHashCode != 115) {
                                    if (iHashCode != 3153) {
                                        if (iHashCode != 3449) {
                                            if (iHashCode == 96670 && strNextName.equals("ali")) {
                                                kgyVar.yo = jsonReader.nextString();
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                        } else if (strNextName.equals("le")) {
                                            kgyVar.ahm = jsonReader.nextInt();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName.equals(CmcdConfiguration.KEY_BUFFER_STARVATION)) {
                                        kgyVar.noq = jsonReader.nextInt();
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals("s")) {
                                    kgyVar.ct = jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals(CmcdData.STREAM_TYPE_LIVE)) {
                                kgyVar.kgy = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                            kgyVar.uq = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("c")) {
                        kgyVar.rz = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                arrayList.add(kgyVar);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void ahm(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo.kgy kgyVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 3276) {
                        if (iHashCode == 107027 && strNextName.equals("lel")) {
                            kgyVar.yo = rz(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("fr")) {
                        kgyVar.ct = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("el")) {
                    kgyVar.noq = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
        }
    }

    private static void kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo.ahm ahmVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 107027) {
                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                            ahmVar.ahm = new int[][]{new int[]{-1, -1}};
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                jsonReader.beginArray();
                                for (int i = 0; i < 2; i++) {
                                    if (jsonReader.hasNext()) {
                                        ahmVar.ahm[0][i] = jsonReader.nextInt();
                                    }
                                }
                                jsonReader.endArray();
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("lel")) {
                        ahmVar.rz = rz(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("el")) {
                    ahmVar.kgy = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo.kgy kgyVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3139) {
                    if (iHashCode != 3232) {
                        if (iHashCode != 3571) {
                            if (iHashCode != 3666) {
                                if (iHashCode == 98713 && strNextName.equals("cpf")) {
                                    ahm(jsonReader, kgyVar);
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("se")) {
                                kgyVar.kgy = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals(Constants.REVENUE_PRODUCT_CATEGORY_KEY)) {
                            kgyVar.uq = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("ee")) {
                        kgyVar.rz = ahm(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("be")) {
                    kgyVar.ahm = ahm(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo.rz rzVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3123) {
                    if (iHashCode != 3239) {
                        if (iHashCode != 3355) {
                            if (iHashCode != 3418) {
                                if (iHashCode != 3704) {
                                    if (iHashCode != 107027) {
                                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                                            rzVar.ct = new int[]{-1, -1};
                                            jsonReader.beginArray();
                                            for (int i = 0; i < 2; i++) {
                                                if (jsonReader.hasNext()) {
                                                    rzVar.ct[i] = jsonReader.nextInt();
                                                }
                                            }
                                            jsonReader.endArray();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName.equals("lel")) {
                                        rzVar.yo = rz(jsonReader);
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals("tl")) {
                                    rzVar.rz = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("ke")) {
                                rzVar.kgy = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("id")) {
                            rzVar.ahm = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("el")) {
                        rzVar.noq = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("at")) {
                    rzVar.uq = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar, List<com.bytedance.adsdk.ahm.rz.rz.ct> list, LongSparseArray<com.bytedance.adsdk.ahm.rz.rz.ct> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.ahm.rz.rz.ct ctVarKgy = ay.kgy(jsonReader, yoVar);
            ctVarKgy.nu();
            com.bytedance.adsdk.ahm.rz.rz.ct.kgy kgyVar = com.bytedance.adsdk.ahm.rz.rz.ct.kgy.PRE_COMP;
            list.add(ctVarKgy);
            longSparseArray.put(ctVarKgy.ct(), ctVarKgy);
        }
        jsonReader.endArray();
    }

    private static void kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar, Map<String, List<com.bytedance.adsdk.ahm.rz.rz.ct>> map, Map<String, com.bytedance.adsdk.ahm.ra> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            String strNextString4 = null;
            List<com.bytedance.adsdk.ahm.ra.kgy> listUq = null;
            String strNextString5 = null;
            int[][] iArr = null;
            JSONArray jSONArrayRz = null;
            int iNextInt = 0;
            int iNextInt2 = 0;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.ahm.rz.rz.ct ctVarKgy = ay.kgy(jsonReader, yoVar);
                            longSparseArray.put(ctVarKgy.ct(), ctVarKgy);
                            arrayList.add(ctVarKgy);
                        }
                        jsonReader.endArray();
                        break;
                    case "h":
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case "p":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "u":
                        strNextString3 = jsonReader.nextString();
                        break;
                    case "w":
                        iNextInt = jsonReader.nextInt();
                        break;
                    case "el":
                        strNextString5 = jsonReader.nextString();
                        break;
                    case "id":
                        strNextString = jsonReader.nextString();
                        break;
                    case "tc":
                        jsonReader.beginArray();
                        listUq = uq(jsonReader);
                        jsonReader.endArray();
                        break;
                    case "lel":
                        jSONArrayRz = rz(jsonReader);
                        break;
                    case "rel":
                        strNextString4 = jsonReader.nextString();
                        break;
                    case "inel":
                        iArr = new int[][]{new int[]{-1, -1}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i = 0; i < 2; i++) {
                                if (jsonReader.hasNext()) {
                                    iArr[0][i] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                com.bytedance.adsdk.ahm.ra raVar = new com.bytedance.adsdk.ahm.ra(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3, strNextString4, listUq, strNextString5, iArr, jSONArrayRz);
                map2.put(raVar.fi(), raVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void kgy(JsonReader jsonReader, Map<String, com.bytedance.adsdk.ahm.rz.rz> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.ahm.rz.rz rzVarKgy = kus.kgy(jsonReader);
                    map.put(rzVarKgy.ahm(), rzVarKgy);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar, SparseArray<com.bytedance.adsdk.ahm.rz.uq> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.ahm.rz.uq uqVarKgy = twf.kgy(jsonReader, yoVar);
            sparseArray.put(uqVarKgy.hashCode(), uqVarKgy);
        }
        jsonReader.endArray();
    }

    private static void kgy(JsonReader jsonReader, List<com.bytedance.adsdk.ahm.rz.noq> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.ahm.rz.noq(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
