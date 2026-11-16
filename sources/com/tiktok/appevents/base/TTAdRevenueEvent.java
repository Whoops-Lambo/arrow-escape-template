package com.tiktok.appevents.base;

import com.singular.sdk.internal.Constants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class TTAdRevenueEvent extends TTBaseEvent {
    public static TTBaseEvent.Builder newBuilder(JSONObject jSONObject) {
        TTBaseEvent.Builder builder = new TTBaseEvent.Builder(EventName.IMPRESSION_LEVEL_AD_REVENUE.toString());
        builder.addProperty(Constants.ADMON_REVENUE, jSONObject);
        return builder;
    }

    public TTAdRevenueEvent(String str, JSONObject jSONObject, String str2) {
        super(str, jSONObject, str2);
    }

    public static TTBaseEvent.Builder newBuilder(JSONObject jSONObject, String str) {
        TTBaseEvent.Builder builder = new TTBaseEvent.Builder(EventName.IMPRESSION_LEVEL_AD_REVENUE.toString(), str);
        builder.addProperty(Constants.ADMON_REVENUE, jSONObject);
        return builder;
    }
}
