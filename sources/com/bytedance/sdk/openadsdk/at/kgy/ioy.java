package com.bytedance.sdk.openadsdk.at.kgy;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.mw;
import com.ironsource.C4664b4;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ioy extends com.bytedance.sdk.component.kgy.um<JSONObject, JSONObject> {
    public static final HashSet<String> kgy = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));
    private com.bytedance.sdk.openadsdk.core.model.ioy ahm;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.component.kgy.uq
    public JSONObject kgy(String str, JSONObject jSONObject, com.bytedance.sdk.component.kgy.ct ctVar) throws Exception {
        String strAu;
        com.bytedance.sdk.openadsdk.core.model.ioy ioyVar = this.ahm;
        if (ioyVar == null || (strAu = ioyVar.au()) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1166163208:
                if (str.equals("getStorageItem")) {
                    b = 0;
                }
                break;
            case 541948222:
                if (str.equals("removeAllStorage")) {
                    b = 1;
                }
                break;
            case 1357067884:
                if (str.equals("setStorageItem")) {
                    b = 2;
                }
                break;
            case 1498706186:
                if (str.equals("removeStorageItem")) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
                String strOptString = jSONObject.optString(C4664b4.i.W);
                if (TextUtils.isEmpty(strOptString) || !mw.kgy().ahm(strAu, strOptString)) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "1");
                    return jSONObject2;
                }
                jSONObject2.put("value", mw.kgy().kgy(strAu, strOptString));
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "0");
                return jSONObject2;
            case 1:
                mw.kgy().kgy(strAu);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "0");
                return jSONObject2;
            case 2:
                String strOptString2 = jSONObject.optString(C4664b4.i.W);
                String strOptString3 = jSONObject.optString("value");
                if (strOptString2 == null) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "1");
                    return jSONObject2;
                }
                mw.kgy().kgy(strAu, strOptString2, strOptString3);
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "0");
                return jSONObject2;
            case 3:
                String strOptString4 = jSONObject.optString(C4664b4.i.W);
                if (TextUtils.isEmpty(strOptString4)) {
                    jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, "1");
                    return jSONObject2;
                }
                jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, mw.kgy().rz(strAu, strOptString4) ? "0" : "1");
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }

    public ioy(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        this.ahm = ioyVar;
    }

    public static void kgy(com.bytedance.sdk.component.kgy.vs vsVar, com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        vsVar.kgy(kgy, new ioy(ioyVar));
    }
}
