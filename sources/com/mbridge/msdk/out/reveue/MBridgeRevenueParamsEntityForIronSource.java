package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import defpackage.pv1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class MBridgeRevenueParamsEntityForIronSource extends MBridgeRevenueParamsEntity {
    public void setIronSourceImpressionDataString(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setMediationUnitId(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strN = pv1.n("{", str2, "}");
        try {
            setSourceData(strN, strN);
            JSONObject jSONObjectJsonObjectInit = MintegralNetworkBridge.jsonObjectInit(strN);
            setNetworkName(jSONObjectJsonObjectInit.optString("adNetwork", ""));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instanceName", jSONObjectJsonObjectInit.optString("instanceName", ""));
            jSONObject.put("instanceId", jSONObjectJsonObjectInit.optString("instanceId", ""));
            setNetworkInfo(jSONObject);
            setAdType(jSONObjectJsonObjectInit.optString("adUnit", ""));
            setRevenue(jSONObjectJsonObjectInit.optString("revenue", ""));
            setPrecision(jSONObjectJsonObjectInit.optString("precision", ""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MBridgeRevenueParamsEntityForIronSource(String str, String str2) {
        super(str, str2);
        setMediationName("IronSource");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }
}
