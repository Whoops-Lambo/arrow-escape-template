package com.bytedance.adsdk.ahm.ct;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class rz {
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean ahm(com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar) {
        if (ahmVar != null) {
            return ahmVar.ahm() && ((Float) ((com.bytedance.adsdk.ahm.yo.kgy) ahmVar.rz().get(0)).kgy).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    public static com.bytedance.adsdk.ahm.rz.kgy.at kgy(JsonReader jsonReader, com.bytedance.adsdk.ahm.yo yoVar) throws IOException {
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy;
        com.bytedance.adsdk.ahm.yo yoVar2 = yoVar;
        Float fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar = null;
        com.bytedance.adsdk.ahm.rz.kgy.ct ctVarKgy = null;
        com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> twfVarAhm = null;
        com.bytedance.adsdk.ahm.rz.kgy.yo yoVarUq = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy2 = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy3 = null;
        com.bytedance.adsdk.ahm.rz.kgy.uq uqVarAhm = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy4 = null;
        com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVarKgy5 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("k")) {
                            ctVarKgy = kgy.kgy(jsonReader, yoVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    yoVar2 = yoVar;
                    break;
                case "o":
                    uqVarAhm = uq.ahm(jsonReader, yoVar);
                    yoVar2 = yoVar;
                    break;
                case "p":
                    twfVarAhm = kgy.ahm(jsonReader, yoVar);
                    yoVar2 = yoVar;
                    break;
                case "r":
                    ahmVarKgy = uq.kgy(jsonReader, yoVar2, false);
                    if (ahmVarKgy.rz().isEmpty()) {
                        if (((com.bytedance.adsdk.ahm.yo.kgy) ahmVarKgy.rz().get(0)).kgy == 0) {
                            ahmVar = ahmVarKgy;
                            yoVar2 = yoVar;
                        } else {
                            ahmVarKgy.rz().set(0, new com.bytedance.adsdk.ahm.yo.kgy(yoVar, fValueOf, fValueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(yoVar.yo())));
                        }
                        break;
                    } else {
                        ahmVarKgy.rz().add(new com.bytedance.adsdk.ahm.yo.kgy(yoVar2, fValueOf, fValueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(yoVar2.yo())));
                    }
                    yoVar2 = yoVar;
                    ahmVar = ahmVarKgy;
                    break;
                case "s":
                    yoVarUq = uq.uq(jsonReader, yoVar);
                    break;
                case "eo":
                    ahmVarKgy5 = uq.kgy(jsonReader, yoVar2, false);
                    break;
                case "rz":
                    yoVar2.kgy("Lottie doesn't support 3D layers.");
                    ahmVarKgy = uq.kgy(jsonReader, yoVar2, false);
                    if (ahmVarKgy.rz().isEmpty()) {
                        if (((com.bytedance.adsdk.ahm.yo.kgy) ahmVarKgy.rz().get(0)).kgy == 0) {
                            ahmVar = ahmVarKgy;
                            yoVar2 = yoVar;
                        } else {
                            ahmVarKgy.rz().set(0, new com.bytedance.adsdk.ahm.yo.kgy(yoVar, fValueOf, fValueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(yoVar.yo())));
                        }
                        break;
                    } else {
                        ahmVarKgy.rz().add(new com.bytedance.adsdk.ahm.yo.kgy(yoVar2, fValueOf, fValueOf, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.valueOf(yoVar2.yo())));
                    }
                    yoVar2 = yoVar;
                    ahmVar = ahmVarKgy;
                    break;
                case "sa":
                    ahmVarKgy3 = uq.kgy(jsonReader, yoVar2, false);
                    break;
                case "sk":
                    ahmVarKgy2 = uq.kgy(jsonReader, yoVar2, false);
                    break;
                case "so":
                    ahmVarKgy4 = uq.kgy(jsonReader, yoVar2, false);
                    break;
                default:
                    jsonReader.skipValue();
                    yoVar2 = yoVar;
                    break;
            }
        }
        if (z) {
            jsonReader.endObject();
        }
        return new com.bytedance.adsdk.ahm.rz.kgy.at(kgy(ctVarKgy) ? null : ctVarKgy, kgy(twfVarAhm) ? null : twfVarAhm, kgy(yoVarUq) ? null : yoVarUq, kgy(ahmVar) ? null : ahmVar, uqVarAhm, ahmVarKgy4, ahmVarKgy5, ahm(ahmVarKgy2) ? null : ahmVarKgy2, rz(ahmVarKgy3) ? null : ahmVarKgy3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean rz(com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar) {
        if (ahmVar != null) {
            return ahmVar.ahm() && ((Float) ((com.bytedance.adsdk.ahm.yo.kgy) ahmVar.rz().get(0)).kgy).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    private static boolean kgy(com.bytedance.adsdk.ahm.rz.kgy.ct ctVar) {
        if (ctVar != null) {
            return ctVar.ahm() && ctVar.rz().get(0).kgy.equals(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return true;
    }

    private static boolean kgy(com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> twfVar) {
        if (twfVar != null) {
            return !(twfVar instanceof com.bytedance.adsdk.ahm.rz.kgy.gf) && twfVar.ahm() && twfVar.rz().get(0).kgy.equals(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean kgy(com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar) {
        if (ahmVar != null) {
            return ahmVar.ahm() && ((Float) ((com.bytedance.adsdk.ahm.yo.kgy) ahmVar.rz().get(0)).kgy).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean kgy(com.bytedance.adsdk.ahm.rz.kgy.yo yoVar) {
        if (yoVar != null) {
            return yoVar.ahm() && ((com.bytedance.adsdk.ahm.yo.rz) ((com.bytedance.adsdk.ahm.yo.kgy) yoVar.rz().get(0)).kgy).ahm(1.0f, 1.0f);
        }
        return true;
    }
}
