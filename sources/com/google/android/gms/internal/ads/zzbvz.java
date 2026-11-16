package com.google.android.gms.internal.ads;

import com.applovin.sdk.AppLovinEventParameters;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbvz {
    public final List a;
    public final String b;
    public final String c;

    public zzbvz(JSONObject jSONObject) throws JSONException {
        String string;
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbwb.a("clickurl", jSONObject);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbwb.a("imp_urls", jSONObject);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbwb.a("downloaded_imp_urls", jSONObject);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbwb.a("fill_urls", jSONObject);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbwb.a("video_start_urls", jSONObject);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbwb.a("video_complete_urls", jSONObject);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbwb.a("video_reward_urls", jSONObject);
        jSONObject.optString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER);
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            com.google.android.gms.ads.internal.zzt.zzx();
            zzbwb.a("manual_impression_urls", jSONObjectOptJSONObject);
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject2 != null) {
            string = jSONObjectOptJSONObject2.toString();
        } else {
            string = null;
        }
        this.b = string;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLASS_NAME);
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        com.google.android.gms.ads.internal.zzt.zzx();
        zzbwb.a("template_ids", jSONObject);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
