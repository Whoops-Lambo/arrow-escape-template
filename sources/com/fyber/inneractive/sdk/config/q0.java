package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class q0 implements com.fyber.inneractive.sdk.util.b1 {
    public Integer a = null;
    public UnitDisplayType b;
    public Boolean c;
    public Integer d;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, ToolBar.REFRESH, this.a);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "unitDisplayType", this.b);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, this.c);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "hideDelay", this.d);
        return jSONObject;
    }
}
