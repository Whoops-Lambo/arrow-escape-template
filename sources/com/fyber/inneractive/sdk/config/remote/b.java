package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public UnitDisplayType a;
    public Boolean b;
    public Integer c;
    public Integer d;

    public static b a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        int iOptInt = jSONObject.optInt("hide", Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt(ToolBar.REFRESH, Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        bVar.a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        bVar.b = jSONObject.has(CampaignEx.JSON_NATIVE_VIDEO_CLOSE) ? Boolean.valueOf(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, true)) : null;
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        bVar.d = numValueOf;
        bVar.c = iOptInt2 != Integer.MIN_VALUE ? numValueOf2 : null;
        return bVar;
    }
}
