package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import com.ironsource.Fc;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class MBridgeRevenueParamsEntityForTradPlus extends MBridgeRevenueParamsEntity {
    public void setTradPlusAdInfo(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String strReplace = str.replace("\"", "\\\"").replace("----------------------\n", "{\"").replaceAll("(?<!\"):(?!\")", "\":\"").replace("\n", "\",\"");
                JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(strReplace.endsWith("\"") ? strReplace.concat("}").replace(",\"}", "}") : strReplace.concat("\"}"));
                setAdType(jSONObjectJsonObjectInit.optInt("placementAdType") + "");
                setMediationUnitId(jSONObjectJsonObjectInit.optString("tpAdUnitId"));
                setNetworkName(jSONObjectJsonObjectInit.optString(Fc.a));
                setBidType(Boolean.valueOf(jSONObjectJsonObjectInit.optBoolean("isBiddingNetwork", false)));
                setRevenue(jSONObjectJsonObjectInit.optString("ecpm", ""));
                setPrecision(jSONObjectJsonObjectInit.optString("ecpmPrecision", ""));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("instanceName", jSONObjectJsonObjectInit.optString(Fc.a, ""));
                jSONObject.put("instanceId", jSONObjectJsonObjectInit.optString("adSourceId", ""));
                setNetworkInfo(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        setSourceData(str, str);
    }

    public MBridgeRevenueParamsEntityForTradPlus(String str, String str2) {
        super(str, str2);
        setMediationName("TradPlus");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }
}
