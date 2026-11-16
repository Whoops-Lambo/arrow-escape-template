package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C4664b4;
import defpackage.e32;
import defpackage.n30;
import defpackage.pv1;
import defpackage.q63;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class w0 {
    protected final com.applovin.impl.sdk.l a;
    protected final JSONObject b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);

        private final int a;

        public int b() {
            return this.a;
        }

        a(int i) {
            this.a = i;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if ("post_alert".equalsIgnoreCase(str)) {
            return b.POST_ALERT;
        }
        if ("event".equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        defpackage.d.r(n30.y("Invalid type provided: ", str));
        return null;
    }

    public int a(Boolean bool) {
        int i = JsonUtils.getInt(this.b, "destination_state_id", -1);
        if (i > 0) {
            return i;
        }
        if (bool == null) {
            e32.i(pv1.k(i, "Decision needed for state: "));
            return 0;
        }
        boolean zBooleanValue = bool.booleanValue();
        JSONObject jSONObject = this.b;
        return zBooleanValue ? JsonUtils.getInt(jSONObject, "destination_state_id_true", -1) : JsonUtils.getInt(jSONObject, "destination_state_id_false", -1);
    }

    public String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.b, str, (JSONObject) null);
        JSONArray jSONArrayN = q63.n("replacements", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayN.length(); i++) {
            String string = JsonUtils.getObjectAtIndex(jSONArrayN, i, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                String str2 = (String) this.a.B().N().get("app_name");
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.l.a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return com.applovin.impl.sdk.l.a(JsonUtils.getString(jSONObject, C4664b4.i.W, null), arrayList);
    }

    public String e() {
        return JsonUtils.getString(this.b, "type", null);
    }

    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + "}";
    }

    public w0(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = jSONObject;
    }

    public b d() {
        return c(e());
    }

    public a a() {
        return a(b());
    }

    public static w0 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        b bVarC = c(JsonUtils.getString(jSONObject, "type", null));
        if (bVarC == b.ALERT) {
            return new x0(jSONObject, lVar);
        }
        if (bVarC == b.EVENT) {
            return new z0(jSONObject, lVar);
        }
        return new w0(jSONObject, lVar);
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        if ("is_eligible_for_terms_and_privacy_policy_alert".equalsIgnoreCase(str)) {
            return a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT;
        }
        if ("has_terms_of_service_uri".equalsIgnoreCase(str)) {
            return a.HAS_TERMS_OF_SERVICE_URI;
        }
        return a.NONE;
    }

    public int c() {
        return JsonUtils.getInt(this.b, "id", -1);
    }

    public String b() {
        return JsonUtils.getString(this.b, "decision_type", null);
    }
}
