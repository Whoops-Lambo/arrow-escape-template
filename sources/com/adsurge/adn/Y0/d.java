package com.adsurge.adn.Y0;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class d {
    public JSONObject a;

    public d() {
        this(new JSONObject());
    }

    public String toString() {
        return this.a.toString();
    }

    public d a(String str, Object obj) {
        if (com.adsurge.adn.K.b.a(str) || TextUtils.isEmpty(str)) {
            return this;
        }
        try {
            this.a.putOpt(str, obj);
            return this;
        } catch (JSONException e) {
            e.printStackTrace();
            return this;
        }
    }

    public d(JSONObject jSONObject) {
        this.a = jSONObject;
    }
}
