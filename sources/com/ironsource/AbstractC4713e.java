package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC4713e {
    private final String a = "eventId";
    private final String b = "timestamp";
    private final String c = "InterstitialEvents";
    private final String d = "events";
    private final String e = "events";
    JSONObject f;
    int g;
    private String h;

    public abstract String a();

    public abstract String a(ArrayList<C5> arrayList, JSONObject jSONObject);

    public abstract String c();

    public String b() {
        return TextUtils.isEmpty(this.h) ? a() : this.h;
    }

    public JSONObject a(C5 c5) {
        JSONObject jSONObjectJsonObjectInit;
        try {
            String strA = c5.a();
            if (!TextUtils.isEmpty(strA)) {
                jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(strA);
            } else {
                jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            }
            jSONObjectJsonObjectInit.put("eventId", c5.c());
            jSONObjectJsonObjectInit.put("timestamp", c5.d());
            return jSONObjectJsonObjectInit;
        } catch (JSONException e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    private String a(int i) {
        if (i != 2) {
            return "events";
        }
        return "InterstitialEvents";
    }

    public String a(JSONArray jSONArray) {
        try {
            if (this.f == null) {
                return "";
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(this.f.toString());
            jSONObjectJsonObjectInit.put("timestamp", IronSourceUtils.e());
            jSONObjectJsonObjectInit.put(a(this.g), jSONArray);
            return jSONObjectJsonObjectInit.toString();
        } catch (Exception e) {
            C4950r4.d().a(e);
            return "";
        }
    }

    public void a(String str) {
        this.h = str;
    }
}
