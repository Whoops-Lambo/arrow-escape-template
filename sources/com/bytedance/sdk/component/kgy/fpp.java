package com.bytedance.sdk.component.kgy;

import android.text.TextUtils;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import defpackage.jc1;
import defpackage.pv1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
class fpp {
    private static boolean kgy;

    public static String kgy(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        int i = th instanceof dg ? ((dg) th).kgy : 0;
        try {
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            jSONObject.put("__code", i);
            jSONObject.put("__msg", (th == null || th.getMessage() == null) ? "" : th.getMessage());
            return jSONObject.toString();
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VqjtZ", "aOs/nAKwYN2FYtJRnBSy", "XOs5sBGuZtWyT8RNgx+zLQ==", 27);
            return jc1.n("{\"code\":", i, ",\"__code\":", i, ",\"__msg\":\"unknown json error\"}");
        }
    }

    public static String kgy(String str, boolean z) {
        String strJ;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1,\"__code\":1,\"__msg\":\"Success\"}";
        }
        if (kgy && !z) {
            strJ = jc1.j(1, 1, str);
        } else {
            strJ = "";
        }
        String strConcat = "{\"code\":1,\"__code\":1,\"__msg\":\"Success\",\"__data\":".concat(String.valueOf(str));
        if (!strJ.isEmpty()) {
            return pv1.w(strConcat, ",", strJ, "}");
        }
        return strConcat.concat("}");
    }

    public static String kgy() {
        return "";
    }

    public static void kgy(boolean z) {
        kgy = z;
    }
}
