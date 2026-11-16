package com.mbridge.msdk.videocommon.entity;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a {
    private String a;
    private String b;

    public static a a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
