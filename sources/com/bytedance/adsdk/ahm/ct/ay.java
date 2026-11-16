package com.bytedance.adsdk.ahm.ct;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ay {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ahm.ct.ay$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kgy;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ahm.rz.rz.ct.ahm.values().length];
            kgy = iArr;
            try {
                iArr[com.bytedance.adsdk.ahm.rz.rz.ct.ahm.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kgy[com.bytedance.adsdk.ahm.rz.rz.ct.ahm.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.bytedance.adsdk.ahm.rz.rz.ct kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        Float fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Float fValueOf2 = Float.valueOf(1.0f);
        com.bytedance.adsdk.ahm.rz.rz.ct.ahm ahmVar = com.bytedance.adsdk.ahm.rz.rz.ct.ahm.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        com.bytedance.adsdk.ahm.rz.rz.ct.ahm ahmVar2 = ahmVar;
        String strNextString = null;
        com.bytedance.adsdk.ahm.rz.kgy.at atVarKgy = null;
        com.bytedance.adsdk.ahm.rz.kgy.ra raVarNoq = null;
        com.bytedance.adsdk.ahm.rz.kgy.nu nuVarKgy = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy = null;
        com.bytedance.adsdk.ahm.rz.ahm.kgy kgyVarKgy = null;
        ra raVarKgy = null;
        float fNextDouble = 0.0f;
        float fYo = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        long jNextInt = 0;
        long jNextInt2 = -1;
        int iKgy = 0;
        int iKgy2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        float fNextDouble5 = 1.0f;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        com.bytedance.adsdk.ahm.rz.rz.ct.kgy kgyVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parent":
                    jNextInt2 = jsonReader.nextInt();
                    break;
                case "shapes":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.ahm.rz.ahm.rz rzVarKgy = fi.kgy(jsonReader, yoVar);
                        if (rzVarKgy != null) {
                            arrayList2.add(rzVarKgy);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "h":
                    fNextDouble3 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.ahm.noq.noq.kgy()));
                    break;
                case "t":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                nuVarKgy = ahm.kgy(jsonReader, yoVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (strNextName2.equals("d")) {
                            raVarNoq = uq.noq(jsonReader, yoVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "w":
                    fNextDouble2 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.ahm.noq.noq.kgy()));
                    break;
                case "cl":
                    strNextString3 = jsonReader.nextString();
                    break;
                case "ef":
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (strNextName3.equals("nm")) {
                                arrayList3.add(jsonReader.nextString());
                            } else if (strNextName3.equals("ty")) {
                                int iNextInt = jsonReader.nextInt();
                                if (iNextInt == 29) {
                                    kgyVarKgy = ct.kgy(jsonReader, yoVar);
                                } else if (iNextInt == 25) {
                                    raVarKgy = new nu().kgy(jsonReader, yoVar);
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    yoVar.kgy("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ip":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ks":
                    atVarKgy = rz.kgy(jsonReader, yoVar);
                    break;
                case "nm":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "op":
                    fYo = (float) jsonReader.nextDouble();
                    break;
                case "sc":
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case "sh":
                    iKgy2 = (int) (com.bytedance.adsdk.ahm.noq.noq.kgy() * jsonReader.nextInt());
                    break;
                case "sr":
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case "st":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sw":
                    iKgy = (int) (com.bytedance.adsdk.ahm.noq.noq.kgy() * jsonReader.nextInt());
                    break;
                case "tm":
                    ahmVarKgy = uq.kgy(jsonReader, yoVar, false);
                    break;
                case "tt":
                    int iNextInt2 = jsonReader.nextInt();
                    if (iNextInt2 < com.bytedance.adsdk.ahm.rz.rz.ct.ahm.values().length) {
                        ahmVar2 = com.bytedance.adsdk.ahm.rz.rz.ct.ahm.values()[iNextInt2];
                        int i = AnonymousClass1.kgy[ahmVar2.ordinal()];
                        if (i == 1) {
                            yoVar.kgy("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            yoVar.kgy("Unsupported matte type: Luma Inverted");
                        }
                        yoVar.kgy(1);
                        break;
                    } else {
                        yoVar.kgy("Unsupported matte type: ".concat(String.valueOf(iNextInt2)));
                        break;
                    }
                    break;
                case "ty":
                    int iNextInt3 = jsonReader.nextInt();
                    kgyVar = com.bytedance.adsdk.ahm.rz.rz.ct.kgy.UNKNOWN;
                    if (iNextInt3 >= kgyVar.ordinal()) {
                        break;
                    } else {
                        kgyVar = com.bytedance.adsdk.ahm.rz.rz.ct.kgy.values()[iNextInt3];
                        break;
                    }
                    break;
                case "ind":
                    jNextInt = jsonReader.nextInt();
                    break;
                case "refId":
                    strNextString = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(lqi.kgy(jsonReader, yoVar));
                    }
                    yoVar.kgy(arrayList.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            arrayList4.add(new com.bytedance.adsdk.ahm.yo.kgy(yoVar, fValueOf, fValueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(fNextDouble)));
        }
        if (fYo <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fYo = yoVar.yo();
        }
        arrayList4.add(new com.bytedance.adsdk.ahm.yo.kgy(yoVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(fYo)));
        arrayList4.add(new com.bytedance.adsdk.ahm.yo.kgy(yoVar, fValueOf, fValueOf, null, fYo, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            yoVar.kgy("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.ahm.rz.rz.ct(arrayList2, yoVar, strNextString2, jNextInt, kgyVar, jNextInt2, strNextString, arrayList, atVarKgy, iKgy, iKgy2, color, fNextDouble5, fNextDouble4, fNextDouble2, fNextDouble3, raVarNoq, nuVarKgy, arrayList4, ahmVar2, ahmVarKgy, zNextBoolean, kgyVarKgy, raVarKgy);
    }

    public static com.bytedance.adsdk.ahm.rz.rz.ct kgy(com.bytedance.adsdk.ahm.yo yoVar) {
        Rect rectUq = yoVar.uq();
        List list = Collections.EMPTY_LIST;
        return new com.bytedance.adsdk.ahm.rz.rz.ct(list, yoVar, "__container", -1L, com.bytedance.adsdk.ahm.rz.rz.ct.kgy.PRE_COMP, -1L, null, list, new com.bytedance.adsdk.ahm.rz.kgy.at(), 0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectUq.width(), rectUq.height(), null, null, list, com.bytedance.adsdk.ahm.rz.rz.ct.ahm.NONE, null, false, null, null);
    }
}
