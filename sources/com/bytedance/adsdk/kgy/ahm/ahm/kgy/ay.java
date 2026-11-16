package com.bytedance.adsdk.kgy.ahm.ahm.kgy;

import android.text.TextUtils;
import com.ironsource.C4664b4;
import defpackage.nj;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class ay implements com.bytedance.adsdk.kgy.ahm.ahm.kgy {
    private final String kgy;

    private Object kgy(String[] strArr, int i, JSONObject jSONObject) {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i < strArr.length && jSONObject != null) {
            String str = strArr[i];
            int iIndexOf = str.indexOf(C4664b4.j.d);
            int iIndexOf2 = str.indexOf(C4664b4.j.e);
            if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf > iIndexOf2) {
                objOpt = jSONObject.opt(str);
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i2 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i2) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            if (i == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return kgy(strArr, i + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return kgy(strArr, i + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public String ahm() {
        return this.kgy;
    }

    public String toString() {
        return nj.q(new StringBuilder("VariableNode [literals="), this.kgy, C4664b4.j.e);
    }

    public ay(String str) {
        this.kgy = str;
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public com.bytedance.adsdk.kgy.ahm.uq.ct kgy() {
        return com.bytedance.adsdk.kgy.ahm.uq.noq.VARIABLE;
    }

    public Object kgy(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return kgy(str.split("\\."), 0, jSONObject);
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public Object kgy(Map<String, JSONObject> map) {
        Object objKgy;
        if (map == null || map.size() <= 0 || (objKgy = kgy(this.kgy, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objKgy;
    }
}
