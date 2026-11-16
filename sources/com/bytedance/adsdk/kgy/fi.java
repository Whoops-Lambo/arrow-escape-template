package com.bytedance.adsdk.kgy;

import android.text.TextUtils;
import com.singular.sdk.internal.UserDetailsUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class fi implements dg {
    @Override // com.bytedance.adsdk.kgy.dg
    public Object kgy(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            try {
                StringBuilder sb = new StringBuilder();
                for (Object obj : objArr) {
                    if (obj != null) {
                        if (sb.length() > 0) {
                            sb.append(UserDetailsUtils.UserDetailsLiterals.DOT);
                        }
                        sb.append(obj);
                    }
                }
                return kgy(jSONObject, sb.toString());
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private Object kgy(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return com.bytedance.adsdk.kgy.ahm.kgy.kgy(str).kgy(jSONObject);
        } catch (Throwable unused) {
            return null;
        }
    }
}
