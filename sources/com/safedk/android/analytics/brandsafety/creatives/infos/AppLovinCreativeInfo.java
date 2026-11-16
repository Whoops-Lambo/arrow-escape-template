package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@AdNetworkIdentifier(packageName = h.a)
public class AppLovinCreativeInfo extends CreativeInfo {
    private static final String E = "is_js_tag_ad";
    private static final String a = "AppLovinCreativeInfo";
    private static final long serialVersionUID = 0;
    private boolean Y;

    public AppLovinCreativeInfo() {
        this.Y = false;
    }

    public AppLovinCreativeInfo(BrandSafetyUtils.AdType adType, String id, String creativeId, String clickUrl, String videoUrl, BrandSafetyEvent.AdFormatType adFormatType, String placementId, String sdkVersion, String downstreamStruct, String dspName, String eventId, String appPackageName, boolean isPlayable, boolean isJsTagAd) {
        super(adType, h.a, id, creativeId, clickUrl, videoUrl, downstreamStruct, sdkVersion);
        this.Y = false;
        this.K = placementId;
        a(adFormatType);
        this.ar = dspName;
        this.W = isPlayable;
        if (p() == null && appPackageName != null) {
            q(appPackageName);
        }
        h(eventId);
        this.Y = isJsTagAd;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean a() {
        return TextUtils.isEmpty(N()) || TextUtils.isEmpty(M());
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle bundleB = super.b();
        if (this.Y) {
            bundleB.putBoolean(E, true);
            Logger.d(a, E, " field is ", Boolean.valueOf(this.Y));
        }
        return bundleB;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        jSONObjectI.put("isJsTagAd", this.Y);
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.Y = jSONObject.optBoolean("isJsTagAd", false);
        }
    }
}
