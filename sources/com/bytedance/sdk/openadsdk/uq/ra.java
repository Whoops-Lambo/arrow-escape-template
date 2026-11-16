package com.bytedance.sdk.openadsdk.uq;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ra {
    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject ahm(ioy ioyVar, String str, int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("error_msg", str);
            }
            int i2 = 1;
            jSONObject2.put("ad_show_order", i + 1);
            jSONObject2.put("interaction_method", ioyVar.znm());
            jSONObject2.put("real_interaction_method", ioyVar.naw());
            jSONObject2.put("give_up_reward", ioyVar.xh() ? 1 : 2);
            if (!ioyVar.gbb()) {
                i2 = 2;
            }
            jSONObject2.put("has_reward", i2);
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject2.put(next, jSONObject.get(next));
                    } catch (JSONException e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "eO8hmQG9asymX9lTiR2BJlriNI8Grg==", "WfskmQeMaMCjRcVYpgKvJg==", 140);
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "eO8hmQG9asymX9lTiR2BJlriNI8Grg==", "WfskmQeMaMCjRcVYpgKvJg==", 145);
        }
        return jSONObject2;
    }

    public static void kgy(String str, boolean z, boolean z2, ioy ioyVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("has_close_invoke", z ? 1 : 2);
            jSONObject.put("has_show_invoke", z2 ? 1 : 2);
            kgy(ioyVar, str, ioyVar != null ? ioyVar.ct() : null, null, jSONObject);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "eO8hmQG9asymX9lTiR2BJlriNI8Grg==", "Ses9mhGoWs+PXfhPrx2vO14=", 203);
        }
    }

    public static void kgy(ioy ioyVar, String str, String str2, String str3) {
        kgy(ioyVar, str, str2, str3, null);
    }

    public static void kgy(ioy ioyVar, String str, String str2, String str3, JSONObject jSONObject) {
        kgy(ioyVar, str, str2, str3, jSONObject, 0);
    }

    public static void kgy(final ioy ioyVar, String str, String str2, final String str3, final JSONObject jSONObject, final int i) {
        if (ioyVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        rz.kgy(System.currentTimeMillis(), ioyVar, str2, str, new com.bytedance.sdk.openadsdk.dg.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.uq.ra.1
            @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
            public JSONObject ahm() {
                if (jSONObject == null) {
                    return super.ahm();
                }
                long jUm = ioyVar.um();
                if (jUm < 0) {
                    long jGf = ioyVar.gf();
                    if (jGf > 0) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - jGf;
                        if (jElapsedRealtime > 0) {
                            jUm = jElapsedRealtime;
                        }
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", jUm);
                    return jSONObject2;
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "eO8hmQG9asymX9lTiR2BJlriNI8Gri2W", "XOs5sBuoQ9SPRA==", 94);
                    com.bytedance.sdk.component.utils.sx.rz(e.getMessage(), new Object[0]);
                    return jSONObject2;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
            public JSONObject kgy() {
                return ra.ahm(ioyVar, str3, i, jSONObject);
            }
        });
    }

    public static void kgy(ioy ioyVar, String str, int i) {
        kgy(ioyVar, CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equals(str) ? "close_listen_empty" : "show_listen_empty", ioyVar != null ? ioyVar.ct() : null, null, null, i);
    }
}
