package com.bytedance.sdk.openadsdk.fpz;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.lqi.ct;
import com.ironsource.mediationsdk.metadata.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class rz {
    private static volatile JSONObject kgy;

    public static void kgy(final Throwable th, final String str, final String str2, final String str3, final int i) {
        final JSONObject jSONObjectKgy;
        if (th != null) {
            try {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || (jSONObjectKgy = kgy()) == null || jSONObjectKgy.optInt(a.k, 0) != 1) {
                    return;
                }
                com.bytedance.sdk.openadsdk.dg.uq.kgy("try_catch_monitor", false, new com.bytedance.sdk.openadsdk.dg.ahm() { // from class: com.bytedance.sdk.openadsdk.fpz.rz.1
                    @Override // com.bytedance.sdk.openadsdk.dg.ahm
                    public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArrayOptJSONArray = jSONObjectKgy.optJSONArray("black_list");
                            String strKgy = uq.kgy(th);
                            String strKgy2 = uq.kgy(th, strKgy);
                            if (rz.rz(jSONArrayOptJSONArray, str, str2, str3, strKgy2) || !rz.uq(jSONObjectKgy.optJSONArray("rate_list"), str, str2, str3, strKgy2)) {
                                return null;
                            }
                            int iOptInt = jSONObjectKgy.optInt("stack_lines", 20);
                            jSONObject.putOpt(NotificationCompat.CATEGORY_MESSAGE, th.getMessage());
                            jSONObject.putOpt("type", th.getClass().getSimpleName());
                            jSONObject.putOpt("stack", uq.ahm(strKgy, iOptInt));
                            jSONObject.putOpt("issue_id", strKgy2);
                            jSONObject.putOpt("p_name", str);
                            jSONObject.putOpt("c_name", str2);
                            jSONObject.putOpt("m_name", str3);
                            jSONObject.putOpt("l_num", Integer.valueOf(i));
                            return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("try_catch_monitor").ahm(jSONObject.toString());
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean rz(JSONArray jSONArray, String str, String str2, String str3, String str4) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject != null) {
                                String strOptString = jSONObjectOptJSONObject.optString("issue_id", "");
                                String strOptString2 = jSONObjectOptJSONObject.optString("p", "");
                                String strOptString3 = jSONObjectOptJSONObject.optString("c", "");
                                String strOptString4 = jSONObjectOptJSONObject.optString("m", "");
                                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, str4)) {
                                    return true;
                                }
                                if (!TextUtils.isEmpty(strOptString2) && str.startsWith(strOptString2)) {
                                    return true;
                                }
                                String str5 = str2 + str3;
                                if (TextUtils.isEmpty(strOptString3)) {
                                    continue;
                                } else {
                                    if (str5.startsWith(strOptString3 + strOptString4)) {
                                        return true;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r14v1, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    public static boolean uq(JSONArray jSONArray, String str, String str2, String str3, String str4) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    Integer numValueOf = null;
                    int i = 0;
                    Integer numValueOf2 = null;
                    Integer numValueOf3 = null;
                    ?? Kgy = jSONArray;
                    while (i < Kgy.length()) {
                        try {
                            JSONObject jSONObjectOptJSONObject = Kgy.optJSONObject(i);
                            if (jSONObjectOptJSONObject != null) {
                                String strOptString = jSONObjectOptJSONObject.optString("issue_id", "");
                                String strOptString2 = jSONObjectOptJSONObject.optString("p", "");
                                String strOptString3 = jSONObjectOptJSONObject.optString("c", "");
                                String strOptString4 = jSONObjectOptJSONObject.optString("m", "");
                                int iOptInt = jSONObjectOptJSONObject.optInt("rate", 10000);
                                if (!TextUtils.isEmpty(strOptString)) {
                                    try {
                                        if (TextUtils.equals(strOptString, str4)) {
                                            numValueOf = Integer.valueOf(iOptInt);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                } else if (kgy(strOptString2, str)) {
                                    if (TextUtils.isEmpty(strOptString3) && TextUtils.isEmpty(strOptString4)) {
                                        numValueOf3 = Integer.valueOf(iOptInt);
                                    } else {
                                        try {
                                            if (TextUtils.equals(strOptString3, str2)) {
                                                if (TextUtils.isEmpty(strOptString4)) {
                                                    numValueOf2 = Integer.valueOf(iOptInt);
                                                } else {
                                                    try {
                                                        if (TextUtils.equals(strOptString4, str3)) {
                                                            Kgy = kgy(iOptInt);
                                                            return Kgy;
                                                        }
                                                        continue;
                                                    } catch (Throwable unused2) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        i++;
                        Kgy = Kgy;
                    }
                    if (numValueOf != null) {
                        return kgy(numValueOf.intValue());
                    }
                    if (numValueOf2 != null) {
                        return kgy(numValueOf2.intValue());
                    }
                    if (numValueOf3 != null && !kgy(numValueOf3.intValue())) {
                        return false;
                    }
                }
            } catch (Throwable unused5) {
            }
        }
        return true;
    }

    public static JSONObject kgy() {
        try {
            JSONObject jSONObject = kgy;
            if (jSONObject != null) {
                return jSONObject;
            }
            JSONObject jSONObject2 = (JSONObject) ct.kgy("try_catch_monitor_config", (Object) null, com.bytedance.sdk.openadsdk.lqi.ahm.kgy);
            if (jSONObject2 != null) {
                kgy = jSONObject2;
            }
            return jSONObject2;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean kgy(int i) {
        if (i <= 0) {
            return false;
        }
        if (i >= 10000) {
            return true;
        }
        try {
            return ((int) (Math.random() * 10000.0d)) + 1 <= i;
        } catch (Throwable unused) {
        }
    }

    private static boolean kgy(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str2.startsWith(str)) ? false : true;
    }
}
