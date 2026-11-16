package com.bytedance.sdk.openadsdk.uq.kgy.kgy;

import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.utils.ft;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class twf extends ra<JSONObject> {
    public static twf kgy(String str, boolean z, int i, String str2, ioy ioyVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("track_url", str);
            jSONObject.putOpt("replace_holder", Boolean.valueOf(z));
            jSONObject.putOpt("track_type", Integer.valueOf(i));
            jSONObject.putOpt(CreativeInfo.c, str2);
            if (com.bytedance.sdk.openadsdk.uq.kgy.ra.uq() && ioyVar != null) {
                jSONObject.putOpt("meta", ioyVar.twf(false));
            }
            twf twfVar = new twf(ft.kgy(), jSONObject);
            twfVar.kgy(1);
            return twfVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public twf(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    public String at() {
        JSONObject jSONObjectRz = rz();
        if (jSONObjectRz != null) {
            return jSONObjectRz.optString(CreativeInfo.c);
        }
        return null;
    }

    public JSONObject fi() {
        JSONObject jSONObjectRz = rz();
        if (jSONObjectRz != null) {
            return jSONObjectRz.optJSONObject("meta");
        }
        return null;
    }

    public int gf() {
        JSONObject jSONObjectRz = rz();
        if (jSONObjectRz != null) {
            return jSONObjectRz.optInt("track_type");
        }
        return 0;
    }

    public String nu() {
        JSONObject jSONObjectRz = rz();
        if (jSONObjectRz != null) {
            return jSONObjectRz.optString("track_url");
        }
        return null;
    }

    public boolean ra() {
        JSONObject jSONObjectRz = rz();
        if (jSONObjectRz != null) {
            return jSONObjectRz.optBoolean("replace_holder");
        }
        return false;
    }

    @Override // com.bytedance.kgy.kgy
    public byte[] uq() {
        String string;
        JSONObject jSONObjectRz = rz();
        if (jSONObjectRz != null && (string = jSONObjectRz.toString()) != null) {
            return string.getBytes(StandardCharsets.UTF_8);
        }
        return null;
    }
}
