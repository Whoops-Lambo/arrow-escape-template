package com.bytedance.adsdk.ugeno.kgy;

import android.text.TextUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.singular.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dr0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class uq {
    public static rz kgy(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        rz rzVar = new rz();
        rzVar.ahm(com.bytedance.adsdk.ugeno.fi.rz.kgy(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("delay"), jSONObject2), 0L));
        rzVar.rz(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("name"), jSONObject2));
        rzVar.ahm(com.bytedance.adsdk.ugeno.fi.rz.kgy(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("playState"), jSONObject2), 1));
        rzVar.kgy(Math.max(com.bytedance.adsdk.ugeno.fi.rz.kgy(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("duration"), jSONObject2), 0L), 0L));
        rzVar.kgy(com.bytedance.adsdk.ugeno.fi.rz.kgy(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("playCount"), jSONObject2), 1));
        rzVar.kgy(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("playDirection"), jSONObject2));
        rzVar.kgy(rz(jSONObject.optString("transformOrigin"), jSONObject2));
        rzVar.ahm(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONObject.optString("timingFunction", "linear"), jSONObject2));
        rzVar.kgy(jSONObject.optJSONObject("effect"));
        rzVar.kgy(kgy(jSONObject.optJSONArray("keyframes"), jSONObject2));
        return rzVar;
    }

    public static Interpolator ahm(String str) {
        switch (str.hashCode()) {
            case -1965072618:
                if (str.equals("ease_in")) {
                    return new AccelerateInterpolator();
                }
                break;
            case -1102672091:
                str.equals("linear");
                break;
            case -787702915:
                if (str.equals("ease_out")) {
                    return new DecelerateInterpolator();
                }
                break;
            case 1065009829:
                if (str.equals("ease_in_out")) {
                    return new AccelerateDecelerateInterpolator();
                }
                break;
        }
        return new LinearInterpolator();
    }

    public static rz.kgy rz(String str, JSONObject jSONObject) {
        JSONArray jSONArrayKgy;
        if (TextUtils.isEmpty(str) || (jSONArrayKgy = com.bytedance.adsdk.ugeno.fi.ahm.kgy(jSONObject, str, null)) == null || jSONArrayKgy.length() != 2) {
            return null;
        }
        rz.kgy kgyVar = new rz.kgy();
        kgyVar.kgy = com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONArrayKgy.optString(0), jSONObject);
        kgyVar.ahm = com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONArrayKgy.optString(1), jSONObject);
        return kgyVar;
    }

    private static String uq(String str, JSONObject jSONObject) {
        String strKgy = com.bytedance.adsdk.ugeno.uq.ahm.kgy(str, jSONObject);
        if (rz(strKgy)) {
            return Arrays.toString(ahm(strKgy, jSONObject));
        }
        return com.bytedance.adsdk.ugeno.uq.ahm.kgy(strKgy, jSONObject);
    }

    public static boolean rz(String str) {
        JSONArray jSONArrayKgy = com.bytedance.adsdk.ugeno.fi.ahm.kgy(str, (JSONArray) null);
        return jSONArrayKgy != null && jSONArrayKgy.length() > 0;
    }

    public static float[] ahm(String str, JSONObject jSONObject) {
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        JSONArray jSONArrayKgy = com.bytedance.adsdk.ugeno.fi.ahm.kgy(jSONObject, str, null);
        if (jSONArrayKgy != null && jSONArrayKgy.length() == 2) {
            fArr[0] = (float) com.bytedance.adsdk.ugeno.fi.rz.kgy(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONArrayKgy.optString(0), jSONObject), 0.0d);
            fArr[1] = (float) com.bytedance.adsdk.ugeno.fi.rz.kgy(com.bytedance.adsdk.ugeno.uq.ahm.kgy(jSONArrayKgy.optString(1), jSONObject), 0.0d);
        }
        return fArr;
    }

    public static List<rz> kgy(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(kgy(jSONObjectOptJSONObject, jSONObject));
                }
            }
            return arrayList;
        } catch (JSONException e) {
            dr0.m(e);
            return null;
        }
    }

    public static int kgy(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return Integer.MIN_VALUE;
        }
        return i - 1;
    }

    public static Map<String, TreeMap<Float, String>> kgy(JSONArray jSONArray, JSONObject jSONObject) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("offset");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, "offset")) {
                        TreeMap treeMap = (TreeMap) map.get(next);
                        if (treeMap == null) {
                            treeMap = new TreeMap();
                            map.put(next, treeMap);
                        }
                        treeMap.put(Float.valueOf(fOptDouble), uq(jSONObjectOptJSONObject.optString(next), jSONObject));
                    }
                }
            }
        }
        return map;
    }

    public static int kgy(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1408024454) {
            return str.equals("alternate") ? 2 : 1;
        }
        if (iHashCode != -1039745817) {
            return 1;
        }
        str.equals(Constants.NORMAL);
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int kgy(String str, int i) {
        int i2 = i / 2;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "bottom":
                case "right":
                    return i;
                case "center":
                    break;
                case "top":
                case "left":
                    return 0;
                default:
                    if (str.endsWith("%")) {
                        try {
                            return (int) ((i * Float.parseFloat(str.substring(0, str.length() - 1))) / 100.0f);
                        } catch (NumberFormatException unused) {
                        }
                        break;
                    } else {
                        try {
                            return Integer.parseInt(str);
                        } catch (NumberFormatException unused2) {
                            return i2;
                        }
                    }
                    break;
            }
        }
        return i2;
    }
}
