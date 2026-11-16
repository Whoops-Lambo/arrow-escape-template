package com.safedk.android.analytics.brandsafety.creatives.infos;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.AdNetworkIdentifier;
import com.safedk.android.utils.h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@AdNetworkIdentifier(packageName = h.p)
public class FyberCreativeInfo extends CreativeInfo {
    private static final String Y = "FyberCreativeInfo";
    private static final String aa = "alternative_click_url";
    private static final List<String> ac = Arrays.asList("www.serveroute.com/log_string", "column=", "line=", "ad_exchange=inneractive&mraid_version=");
    private static final long serialVersionUID = 0;
    private String ag;
    private String b_;

    public FyberCreativeInfo() {
    }

    public FyberCreativeInfo(String id, String creativeId, String campaignId, String clickUrl, String videoUrl, BrandSafetyEvent.AdFormatType adFormat, BrandSafetyUtils.AdType adType, String spotId, String sdkVersion, String adNetwork, String adDomain, String alternativeClickUrl, String eventId) {
        super(adType, h.p, id, creativeId, clickUrl, videoUrl, "", sdkVersion);
        this.K = spotId;
        Logger.d(Y, "FyberCreativeInfo ctor started");
        a(adFormat);
        this.b_ = campaignId;
        this.ar = adNetwork;
        this.aX = adDomain;
        this.ag = alternativeClickUrl;
        h(eventId);
    }

    public String as() {
        return this.b_;
    }

    public String at() {
        return this.ag;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public boolean a() {
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public Bundle b() {
        Bundle bundleB = super.b();
        if (!TextUtils.isEmpty(this.b_)) {
            bundleB.putString(CreativeInfo.D, this.b_);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            bundleB.putString(aa, this.ag);
        }
        return bundleB;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0016 A[SYNTHETIC] */
    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo
    public void b(List<String> list) {
        boolean z;
        Logger.d(Y, "classifyPrefetchUrl started, urlList=", list);
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strD = D(it.next());
                if (!TextUtils.isEmpty(strD)) {
                    if (b(strD)) {
                        y(strD);
                    } else {
                        if (v(strD) && !strD.equals(M())) {
                            x(strD);
                        } else {
                            z = false;
                        }
                        if (!z) {
                            Logger.d(Y, "classifyPrefetchUrl url is unclassified and will be dropped : ", strD);
                        }
                    }
                    z = true;
                    if (!z) {
                        Logger.d(Y, "classifyPrefetchUrl url is unclassified and will be dropped : ", strD);
                    }
                }
            }
        }
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObjectI = super.i();
        if (!TextUtils.isEmpty(this.b_)) {
            jSONObjectI.put("campaignId", this.b_);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            jSONObjectI.put("alternativeClickUrl", this.ag);
        }
        return jSONObjectI;
    }

    @Override // com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo, com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            super.a(jSONObject);
            this.b_ = jSONObject.optString("campaignId", "");
            this.ag = jSONObject.optString("alternativeClickUrl", "");
        }
    }
}
