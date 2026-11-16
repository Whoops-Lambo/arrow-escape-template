package com.bytedance.sdk.component.adexpress.dynamic.uq;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.singular.sdk.internal.UserDetailsUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz {
    private JSONObject ahm;
    private HashMap<String, Object> kgy = new HashMap<>();

    public boolean ahm(String str) {
        return this.kgy.containsKey(str);
    }

    public void kgy() {
        Iterator<String> itKeys = this.ahm.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = this.ahm.opt(next);
            int i = 0;
            if (TextUtils.equals("image", next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (i < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                                    this.kgy.put(next + UserDetailsUtils.UserDetailsLiterals.DOT + i + UserDetailsUtils.UserDetailsLiterals.DOT + next2, objOpt2);
                                }
                            }
                            i++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof String) {
                    try {
                        JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit((String) objOpt);
                        Iterator<String> itKeys3 = jSONObjectJsonObjectInit.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            Object objOpt3 = jSONObjectJsonObjectInit.opt(next3);
                            if ((objOpt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i2 = 0; i2 < ((JSONArray) objOpt3).length(); i2++) {
                                    this.kgy.put(next + UserDetailsUtils.UserDetailsLiterals.DOT + next3 + UserDetailsUtils.UserDetailsLiterals.DOT + i2, ((JSONArray) objOpt3).opt(i2));
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt3).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    Object objOpt4 = ((JSONObject) objOpt3).opt(next4);
                                    this.kgy.put(next + UserDetailsUtils.UserDetailsLiterals.DOT + next3 + UserDetailsUtils.UserDetailsLiterals.DOT + next4, objOpt4);
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                kgy(next, next3, objOpt3);
                            } else {
                                this.kgy.put(next + UserDetailsUtils.UserDetailsLiterals.DOT + next3, objOpt3);
                            }
                        }
                    } catch (JSONException e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX60nX+sh", "f/cjlA61auSST9ZJhQel", "S+8/hgauStWFS8NUmhQ=", 79);
                    }
                }
            } else if (objOpt instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    Object objOpt5 = jSONObject.opt(next5);
                    this.kgy.put(next + UserDetailsUtils.UserDetailsLiterals.DOT + next5, objOpt5);
                }
            } else {
                this.kgy.put(next, objOpt);
                if (objOpt instanceof String) {
                    this.kgy.put(next, objOpt);
                }
            }
        }
    }

    public rz(JSONObject jSONObject) {
        this.ahm = jSONObject;
    }

    public Object kgy(String str) {
        if (this.kgy.containsKey(str)) {
            return this.kgy.get(str);
        }
        return null;
    }

    private void kgy(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if ((objOpt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (i < jSONArray.length()) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                            this.kgy.put(str + UserDetailsUtils.UserDetailsLiterals.DOT + str2 + UserDetailsUtils.UserDetailsLiterals.DOT + next + UserDetailsUtils.UserDetailsLiterals.DOT + i + UserDetailsUtils.UserDetailsLiterals.DOT + next2, objOpt2);
                        }
                        i++;
                    }
                }
            } else {
                this.kgy.put(str + UserDetailsUtils.UserDetailsLiterals.DOT + str2 + UserDetailsUtils.UserDetailsLiterals.DOT + next, objOpt);
            }
        }
    }
}
