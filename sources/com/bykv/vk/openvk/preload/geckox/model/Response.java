package com.bykv.vk.openvk.preload.geckox.model;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class Response {
    public ComponentModel data;
    public int status;

    public Response fromJson(String str) {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("status")) {
                this.status = jSONObject.optInt("status");
            }
            if (jSONObject.has("data") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                ComponentModel componentModel = new ComponentModel();
                this.data = componentModel;
                componentModel.fromJson(jSONObjectOptJSONObject);
            }
        } catch (Throwable unused) {
        }
        return this;
    }
}
