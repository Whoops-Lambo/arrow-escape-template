package com.bytedance.adsdk.ugeno.uq;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.noq;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm {
    public static String kgy(String str, JSONObject jSONObject) {
        kgy kgyVarRz;
        kgy.InterfaceC0197kgy interfaceC0197kgyKgy;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (kgyVarRz = noq.kgy().rz()) != null && (interfaceC0197kgyKgy = kgyVarRz.kgy(str.substring(2, str.length() - 1))) != null) {
                    return (String) interfaceC0197kgyKgy.kgy(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static Object kgy(Object obj, JSONObject jSONObject) {
        if (obj == null) {
            return null;
        }
        String strValueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        return (strValueOf.startsWith("${") && strValueOf.endsWith("}")) ? kgy(strValueOf, jSONObject) : obj;
    }
}
