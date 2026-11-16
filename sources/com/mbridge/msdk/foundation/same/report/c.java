package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.ironsource.C4664b4;
import com.ironsource.R6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.singular.sdk.internal.Constants;
import defpackage.q63;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class c {
    private static final String a = "c";

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements com.mbridge.msdk.tracker.h {
        @Override // com.mbridge.msdk.tracker.h
        public JSONObject a(com.mbridge.msdk.tracker.e eVar) {
            if (eVar == null) {
                return null;
            }
            JSONObject jSONObjectH = eVar.h();
            if (jSONObjectH == null) {
                jSONObjectH = new JSONObject();
            }
            try {
                jSONObjectH.put(C4664b4.i.W, eVar.f());
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                int iS = m0.s(contextD);
                if (!jSONObjectH.has("network_type")) {
                    jSONObjectH.put("network_type", iS);
                    jSONObjectH.put("network_str", m0.a(contextD, iS));
                }
                if (!jSONObjectH.has(CmcdConfiguration.KEY_STREAM_TYPE)) {
                    jSONObjectH.put(CmcdConfiguration.KEY_STREAM_TYPE, System.currentTimeMillis());
                }
                String strOptString = jSONObjectH.optString(MBridgeConstans.PROPERTIES_UNIT_ID, "");
                if (!TextUtils.isEmpty(strOptString)) {
                    String str = com.mbridge.msdk.foundation.controller.a.r.get(strOptString);
                    jSONObjectH.put("u_stid", str != null ? str : "");
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && !jSONObjectH.has("b")) {
                    jSONObjectH.put("b", com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g) && !jSONObjectH.has("c")) {
                    jSONObjectH.put("c", com.mbridge.msdk.foundation.same.a.g);
                }
                return jSONObjectH;
            } catch (Exception e) {
                q0.b(c.a, e.getMessage());
                return jSONObjectH;
            }
        }
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            jSONObject.remove(R6.B);
            jSONObject.remove("brand");
            jSONObject.remove("screen_size");
            jSONObject.remove("sub_ip");
            jSONObject.remove("network_type");
            jSONObject.remove("useragent");
            jSONObject.remove(R6.d0);
            jSONObject.remove("language");
            jSONObject.remove("network_str");
            jSONObject.remove("mnc");
            jSONObject.remove("mcc");
            jSONObject.remove("os_version");
            jSONObject.remove("gp_version");
            jSONObject.remove("country_code");
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.d);
            jSONObject.remove(com.mbridge.msdk.foundation.same.net.wrapper.e.e);
            jSONObject.remove("power_rate");
            jSONObject.remove("charging");
            jSONObject.remove("timezone");
        }
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return;
        }
        jSONObject.remove(R6.X0);
        jSONObject.remove("gaid2");
        jSONObject.remove(Constants.DeviceIdentifierKeyspaceKeys.OAID_KEYSPACE_KEY);
        jSONObject.remove("az_aid_info");
    }

    public static com.mbridge.msdk.tracker.f c() {
        return new com.mbridge.msdk.tracker.n();
    }

    public static com.mbridge.msdk.tracker.h d() {
        return new a();
    }

    public static JSONObject b() {
        return com.mbridge.msdk.foundation.same.report.a.a();
    }

    public static boolean a(String str) {
        com.mbridge.msdk.setting.g gVarE = q63.e(com.mbridge.msdk.setting.i.b());
        if (gVarE == null) {
            return true;
        }
        return b.a(gVarE, str);
    }
}
