package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@AdNetworkIdentifier(packageName = h.v)
public class SmaatoCreativeInfo extends CreativeInfo {
    private static final String E = "SmaatoCreativeInfo";
    private static final String Y = "iurl";
    private static final long serialVersionUID = 0;
    private String Z;
    public boolean a;

    public SmaatoCreativeInfo() {
        this.a = false;
    }

    public SmaatoCreativeInfo(String id, String creativeId, BrandSafetyUtils.AdType adType, BrandSafetyEvent.AdFormatType adFormat, String placementId, String adDomain, String iurl, String downstreamStruct, String sdkVersion, String clickUrl) {
        super(adType, h.v, id, creativeId, clickUrl, null, downstreamStruct, sdkVersion);
        this.a = false;
        a(adFormat);
        this.K = placementId;
        this.aX = adDomain;
        this.Z = iurl;
    }

    public String as() {
        return this.Z;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle bundleB = super.b();
        if (!TextUtils.isEmpty(this.Z)) {
            bundleB.putString(Y, this.Z);
        }
        return bundleB;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.Z)) {
            jSONObjectI.put(Y, this.Z);
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.Z = jSONObject.optString(Y, "");
        }
    }
}
