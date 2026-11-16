package com.adsurge.adn.p059u;

import android.text.TextUtils;
import android.util.Pair;
import com.adsurge.adn.E0.c;
import com.adsurge.adn.I0.e;
import com.adsurge.adn.I0.f;
import com.adsurge.adn.K.b;
import com.adsurge.adn.N.d;
import com.adsurge.adn.X.AbstractC1628a;
import com.adsurge.adn.X.g;
import com.adsurge.adn.X.i;
import com.adsurge.adn.X.j;
import com.adsurge.adn.X.k;
import com.adsurge.adn.X.o;
import com.adsurge.adn.X.r;
import com.adsurge.adn.ads.AdConfig;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.ironsource.C4664b4;
import com.ironsource.R6;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class h {
    public static volatile JSONObject b;
    public static volatile JSONObject c;
    public final e a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public boolean a = true;
        public boolean b = true;
        public int c = -1;
        public boolean d = true;
        public boolean e = true;
        public boolean f = true;
        public boolean g = true;
        public boolean h = true;
        public boolean i = true;
        public AdConfig j = null;
        public AdSurgeAdFormat k = null;
        public String l = null;
        public JSONArray m = null;
        public boolean n = false;
    }

    public static JSONObject a(a aVar) {
        Integer numValueOf;
        if (b.a("device_info")) {
            return null;
        }
        e eVar = new e(d());
        com.adsurge.adn.O.b bVarC = com.adsurge.adn.J.a.d().c();
        com.adsurge.adn.O.a aVarB = com.adsurge.adn.J.a.d().b();
        c cVarE = bVarC != null ? bVarC.e() : null;
        String strG = bVarC != null ? bVarC.g() : null;
        if (strG != null) {
            numValueOf = Integer.valueOf(TextUtils.equals("p", strG) ? 1 : 2);
        } else {
            numValueOf = null;
        }
        e eVarA = !b.a("region_code") ? eVar.a("region_code", o.z()) : eVar;
        Integer numValueOf2 = cVarE != null ? Integer.valueOf(cVarE.b()) : null;
        if (!b.a("connection_type")) {
            eVarA = eVarA.a("connection_type", numValueOf2);
        }
        String strA = r.a();
        if (!b.a("cell_network_type")) {
            eVarA = eVarA.a("cell_network_type", strA);
        }
        String strF = bVarC != null ? bVarC.f() : null;
        if (!b.a(R6.R0)) {
            eVarA = eVarA.a(R6.R0, strF);
        }
        Long lX = o.x();
        if (!b.a("memory_size_bytes")) {
            eVarA = eVarA.a("memory_size_bytes", lX);
        }
        if (!b.a(C4664b4.i.n)) {
            eVarA = eVarA.a(C4664b4.i.n, numValueOf);
        }
        Boolean boolJ = o.J();
        if (!b.a("is_airplane_mode")) {
            eVarA = eVarA.a("is_airplane_mode", boolJ);
        }
        Float fC = o.c();
        if (!b.a("battery_remaining_pct")) {
            eVarA = eVarA.a("battery_remaining_pct", fC);
        }
        Boolean boolL = o.L();
        if (!b.a("is_dark_mode")) {
            eVarA = eVarA.a("is_dark_mode", boolL);
        }
        Float fC2 = o.C();
        if (!b.a("font_size")) {
            eVarA = eVarA.a("font_size", fC2);
        }
        Boolean boolK = o.K();
        if (!b.a("is_charging")) {
            eVarA = eVarA.a("is_charging", boolK);
        }
        Boolean boolP = o.P();
        if (!b.a("is_screen_off")) {
            eVarA = eVarA.a("is_screen_off", boolP);
        }
        Integer numB = aVar.i ? o.B() : null;
        if (!b.a("support_feature")) {
            eVarA = eVarA.a("support_feature", numB);
        }
        Boolean boolN = o.N();
        if (!b.a("is_low_power_mode")) {
            eVarA = eVarA.a("is_low_power_mode", boolN);
        }
        Integer numD = o.D();
        if (!b.a("screen_bright")) {
            eVarA = eVarA.a("screen_bright", numD);
        }
        Long lF = aVarB != null ? aVarB.f() : null;
        if (!b.a("app_running_time")) {
            eVarA.a("app_running_time", lF);
        }
        String strS = o.s();
        if (!TextUtils.isEmpty(strS) && !b.a("local_t")) {
            eVar.a("local_t", strS);
        }
        if (aVar.n) {
            String strA2 = com.adsurge.adn.P.a.b().a();
            if (!b.a("turing_device_token")) {
                eVar.a("turing_device_token", strA2);
            }
        }
        JSONArray jSONArray = aVar.m;
        if (jSONArray != null && jSONArray.length() > 0) {
            JSONArray jSONArray2 = aVar.m;
            if (!b.a("unique_info")) {
                eVar.a("unique_info", jSONArray2);
            }
        }
        com.adsurge.adn.p059u.a aVarC = com.adsurge.adn.p059u.a.c();
        e eVarA2 = !b.a("gp_installed") ? eVar.a("gp_installed", aVarC.b()) : eVar;
        int iD = aVarC.d();
        if (!b.a("third_store_installed")) {
            eVarA2.a("third_store_installed", iD);
        }
        return eVar.a();
    }

    public static JSONObject b(AdConfig adConfig, AdSurgeAdFormat adSurgeAdFormat, String str) {
        if (b.a("imp_info") || adSurgeAdFormat == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Integer numA = g.a(str, adSurgeAdFormat);
        e eVar = new e();
        String strA = g.a(str);
        if (!b.a(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER)) {
            eVar = eVar.a(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, strA);
        }
        if (!b.a("ad_count")) {
            eVar = eVar.a("ad_count", numA);
        }
        Integer numA2 = g.a(adSurgeAdFormat);
        if (!b.a("placement_type")) {
            eVar = eVar.a("placement_type", numA2);
        }
        if (adConfig != null) {
            String strB = g.b(adConfig);
            e eVarA = !b.a("token") ? eVar.a("token", g.f(adConfig)) : eVar;
            if (!b.a("dev_ext_info")) {
                eVarA = eVarA.a("dev_ext_info", strB);
            }
            String strD = g.d(adConfig);
            if (!b.a("display_manager")) {
                eVarA = eVarA.a("display_manager", strD);
            }
            String strC = g.c(adConfig);
            if (!b.a("mediation_adunit_id")) {
                eVarA = eVarA.a("mediation_adunit_id", strC);
            }
            String strE = g.e(adConfig);
            if (!b.a("mediation_trace_id")) {
                eVarA = eVarA.a("mediation_trace_id", strE);
            }
            Double dA = g.a(adConfig);
            if (!b.a("bidfloor")) {
                eVarA.a("bidfloor", dA);
            }
        }
        return eVar.a();
    }

    public static JSONObject c() {
        Integer num;
        Integer num2;
        if (b.a("device_info")) {
            return null;
        }
        Pair pairO = o.o();
        if (pairO == null || o.a.equals(pairO)) {
            num = null;
            num2 = null;
        } else {
            boolean z = ((Integer) pairO.first).intValue() > ((Integer) pairO.second).intValue();
            num2 = (Integer) (z ? pairO.first : pairO.second);
            num = (Integer) (z ? pairO.second : pairO.first);
        }
        com.adsurge.adn.O.b bVarC = com.adsurge.adn.J.a.d().c();
        Float fA = bVarC.a();
        e eVar = new e();
        String strM = o.m();
        if (!b.a("user_agent")) {
            eVar = eVar.a("user_agent", strM);
        }
        String strT = o.t();
        if (!b.a("manufacturer")) {
            eVar = eVar.a("manufacturer", strT);
        }
        String strF = o.f();
        if (!b.a("brand")) {
            eVar = eVar.a("brand", strF);
        }
        String strR = o.r();
        if (!b.a("language")) {
            eVar = eVar.a("language", strR);
        }
        String strE = o.E();
        if (!b.a("time_zone")) {
            eVar = eVar.a("time_zone", strE);
        }
        Integer numI = o.I();
        if (!b.a("utc_raw_offset")) {
            eVar = eVar.a("utc_raw_offset", numI);
        }
        Integer numV = o.v();
        if (!b.a("os_type")) {
            eVar = eVar.a("os_type", numV);
        }
        String strW = o.w();
        if (!b.a("os_version")) {
            eVar = eVar.a("os_version", strW);
        }
        Integer numP = o.p();
        if (!b.a("device_type")) {
            eVar = eVar.a("device_type", numP);
        }
        Integer numA = o.a();
        if (!b.a("android_api_level")) {
            eVar = eVar.a("android_api_level", numA);
        }
        String strU = o.u();
        if (!b.a(R6.B)) {
            eVar = eVar.a(R6.B, strU);
        }
        String strG = o.g();
        if (!b.a("build_fingerprint")) {
            eVar = eVar.a("build_fingerprint", strG);
        }
        String strH = o.h();
        if (!b.a("build_product")) {
            eVar = eVar.a("build_product", strH);
        }
        Long lG = o.G();
        if (!b.a("update_time")) {
            eVar = eVar.a("update_time", lG);
        }
        if (!b.a("screen_width")) {
            eVar = eVar.a("screen_width", num);
        }
        if (!b.a("screen_height")) {
            eVar = eVar.a("screen_height", num2);
        }
        Boolean boolQ = o.Q();
        if (!b.a("is_support_h265")) {
            eVar = eVar.a("is_support_h265", boolQ);
        }
        Long lI = o.i();
        if (!b.a("remain_disk_size")) {
            eVar = eVar.a("remain_disk_size", lI);
        }
        Long l = o.l();
        if (!b.a("disk_size_bytes")) {
            eVar = eVar.a("disk_size_bytes", l);
        }
        Integer numB = bVarC.b();
        if (!b.a("dpi")) {
            eVar = eVar.a("dpi", numB);
        }
        Double dValueOf = fA != null ? Double.valueOf(fA.doubleValue()) : null;
        if (!b.a("scale")) {
            eVar = eVar.a("scale", dValueOf);
        }
        String strQ = o.q();
        if (!b.a("kernel_version")) {
            eVar = eVar.a("kernel_version", strQ);
        }
        Integer numN = o.n();
        if (!b.a("cpu_num")) {
            eVar = eVar.a("cpu_num", numN);
        }
        String strA = o.A();
        if (!b.a("rom_version")) {
            eVar = eVar.a("rom_version", strA);
        }
        Integer numE = com.adsurge.adn.J.a.d().b().e();
        if (!b.a("app_open_cnt")) {
            eVar = eVar.a("app_open_cnt", numE);
        }
        Long lK = o.k();
        if (!b.a("boot_time")) {
            eVar = eVar.a("boot_time", lK);
        }
        String strJ = o.j();
        if (!b.a("boot_id")) {
            eVar = eVar.a("boot_id", strJ);
        }
        return eVar.a();
    }

    public static h e() {
        a aVar = new a();
        aVar.a = false;
        return new h(aVar).c("user_action_batch", com.adsurge.adn.p025h.c.b().a());
    }

    public static h f() {
        a aVar = new a();
        aVar.b = false;
        aVar.g = false;
        return new h(aVar);
    }

    public static h g() {
        return new h(new a());
    }

    public static h h() {
        return new h(new a());
    }

    public static h i() {
        a aVar = new a();
        aVar.a = false;
        aVar.g = false;
        aVar.f = false;
        aVar.d = false;
        h hVar = new h(aVar);
        com.adsurge.adn.Y0.e eVar = new com.adsurge.adn.Y0.e(6001402, d.b().a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(eVar.c());
        e eVar2 = hVar.a;
        String string = jSONArray.toString();
        if (!b.a("events")) {
            eVar2.a("events", string);
        }
        e eVar3 = hVar.a;
        if (!b.a("report_stage")) {
            eVar3.a("report_stage", 1);
        }
        return hVar;
    }

    public static JSONObject j() {
        Integer num = null;
        if (b.a("authority_info")) {
            return null;
        }
        e eVar = new e();
        com.adsurge.adn.K.c cVarC = com.adsurge.adn.K.c.c();
        String strD = cVarC.d();
        if (!b.a("iabtcf_tcstr")) {
            eVar.a("iabtcf_tcstr", strD);
        }
        String strB = cVarC.b();
        if (!b.a("gpp_str")) {
            eVar.a("gpp_str", strB);
        }
        Integer numC = b.f().c();
        if (!b.a("manual_config")) {
            eVar.a("manual_config", numC);
        }
        Integer numA = cVarC.a();
        if (numA != null && numA.intValue() > 0) {
            num = numA;
        }
        if (!b.a("iabtcf_gdpr_applies")) {
            eVar.a("iabtcf_gdpr_applies", num);
        }
        Integer numD = b.f().d();
        if (!b.a("manual_config_setting")) {
            eVar.a("manual_config_setting", numD);
        }
        Integer numB = com.adsurge.adn.K.a.e().b();
        if (!b.a("adsurge_consent")) {
            eVar.a("adsurge_consent", numB);
        }
        return eVar.a();
    }

    public static JSONObject l() {
        if (b.a("user_info")) {
            return null;
        }
        e eVar = new e();
        String strA = AbstractC1628a.a();
        if (!b.a(R6.X0)) {
            eVar = eVar.a(R6.X0, strA);
        }
        String strA2 = k.a();
        if (!b.a("app_set_id")) {
            eVar = eVar.a("app_set_id", strA2);
        }
        String strA3 = i.a();
        if (!b.a("android_id")) {
            eVar = eVar.a("android_id", strA3);
        }
        return eVar.a();
    }

    public static JSONObject m() {
        JSONObject jSONObject = c;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectB = b();
        c = jSONObjectB;
        return jSONObjectB;
    }

    public static JSONObject n() {
        JSONObject jSONObject = b;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectC = c();
        b = jSONObjectC;
        return jSONObjectC;
    }

    public JSONObject k() {
        JSONObject jSONObjectA = f.a(this.a.a());
        jSONObjectA.toString();
        return jSONObjectA;
    }

    public h(a aVar) {
        Long lValueOf;
        JSONObject jSONObjectB;
        JSONObject jSONObjectL;
        JSONObject jSONObjectA;
        JSONObject jSONObjectA2;
        JSONObject jSONObjectJ;
        Integer numValueOf;
        e eVar = new e();
        this.a = eVar;
        if (aVar.b) {
            lValueOf = Long.valueOf(d.b().a());
        } else {
            lValueOf = null;
        }
        if (!b.a("req_time_stamp")) {
            eVar.a("req_time_stamp", lValueOf);
        }
        if (aVar.h) {
            jSONObjectB = b(aVar.j, aVar.k, aVar.l);
        } else {
            jSONObjectB = null;
        }
        if (!b.a("imp_info")) {
            eVar.a("imp_info", jSONObjectB);
        }
        if (aVar.g) {
            jSONObjectL = l();
        } else {
            jSONObjectL = null;
        }
        if (!b.a("user_info")) {
            eVar.a("user_info", jSONObjectL);
        }
        if (aVar.f) {
            jSONObjectA = a(aVar);
        } else {
            jSONObjectA = null;
        }
        if (!b.a("device_info")) {
            eVar.a("device_info", jSONObjectA);
        }
        if (aVar.e) {
            jSONObjectA2 = a();
        } else {
            jSONObjectA2 = null;
        }
        if (!b.a("app_info")) {
            eVar.a("app_info", jSONObjectA2);
        }
        if (aVar.d) {
            jSONObjectJ = j();
        } else {
            jSONObjectJ = null;
        }
        if (!b.a("authority_info")) {
            eVar.a("authority_info", jSONObjectJ);
        }
        int i = aVar.c;
        if (i < 0) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(i);
        }
        if (!b.a("get_data_type")) {
            eVar.a("get_data_type", numValueOf);
        }
        JSONObject jSONObjectA3 = aVar.a ? com.adsurge.adn.N.a.b().a() : null;
        if (!b.a("city_info")) {
            eVar.a("city_info", jSONObjectA3);
        }
    }

    public static JSONObject d() {
        JSONObject jSONObjectA = f.a(n());
        if (jSONObjectA != null) {
            return jSONObjectA;
        }
        return new JSONObject();
    }

    public static JSONObject b() {
        if (b.a("app_info")) {
            return null;
        }
        e eVar = new e();
        String strA = j.a();
        if (!b.a(MBridgeConstans.APP_ID)) {
            eVar = eVar.a(MBridgeConstans.APP_ID, strA);
        }
        String strB = com.adsurge.adn.J.a.d().b().b();
        if (!b.a("app_name")) {
            eVar = eVar.a("app_name", strB);
        }
        String strC = j.c();
        if (!b.a("bundle_name")) {
            eVar = eVar.a("bundle_name", strC);
        }
        String strB2 = j.b();
        if (!b.a("app_version")) {
            eVar = eVar.a("app_version", strB2);
        }
        String strD = j.d();
        if (!b.a("sdk_version")) {
            eVar = eVar.a("sdk_version", strD);
        }
        Integer numH = com.adsurge.adn.J.a.d().b().h();
        if (!b.a("target_sdk_version")) {
            eVar = eVar.a("target_sdk_version", numH);
        }
        String strA2 = com.adsurge.adn.D0.a.c().e().a();
        if (!b.a("session_id")) {
            eVar = eVar.a("session_id", strA2);
        }
        return eVar.a();
    }

    public static h b(String str, Object obj) {
        h hVarA = a(str, obj);
        e eVar = hVarA.a;
        String strG = com.adsurge.adn.J.a.d().b().g();
        if (!b.a("session_id")) {
            eVar.a("session_id", strG);
        }
        return hVarA;
    }

    public h(AdConfig adConfig, AdSurgeAdFormat adSurgeAdFormat, String str, int i) {
        e eVar = new e();
        this.a = eVar;
        long jA = d.b().a();
        if (!b.a("req_time_stamp")) {
            eVar.a("req_time_stamp", jA);
        }
        JSONObject jSONObjectB = b(adConfig, adSurgeAdFormat, str);
        if (!b.a("imp_info")) {
            eVar.a("imp_info", jSONObjectB);
        }
        JSONObject jSONObjectL = l();
        if (!b.a("user_info")) {
            eVar.a("user_info", jSONObjectL);
        }
        JSONObject jSONObjectA = a(new a());
        if (!b.a("device_info")) {
            eVar.a("device_info", jSONObjectA);
        }
        JSONObject jSONObjectA2 = a();
        if (!b.a("app_info")) {
            eVar.a("app_info", jSONObjectA2);
        }
        JSONObject jSONObjectJ = j();
        if (!b.a("authority_info")) {
            eVar.a("authority_info", jSONObjectJ);
        }
        if (!b.a("get_data_type")) {
            eVar.a("get_data_type", i);
        }
        JSONObject jSONObjectA3 = com.adsurge.adn.N.a.b().a();
        if (b.a("city_info")) {
            return;
        }
        eVar.a("city_info", jSONObjectA3);
    }

    public static JSONObject a() {
        if (b.a("app_info")) {
            return null;
        }
        JSONObject jSONObjectA = f.a(m());
        if (jSONObjectA == null) {
            jSONObjectA = new JSONObject();
        }
        e eVar = new e(jSONObjectA);
        Integer numE = j.e();
        if (!b.a("support_feature")) {
            eVar = eVar.a("support_feature", numE);
        }
        return eVar.a();
    }

    public static h a(AdConfig adConfig, AdSurgeAdFormat adSurgeAdFormat, String str) {
        if (adConfig != null && !TextUtils.isEmpty(adConfig.token)) {
            a aVar = new a();
            aVar.e = false;
            aVar.f = false;
            aVar.c = 4;
            aVar.j = adConfig;
            aVar.k = adSurgeAdFormat;
            aVar.l = str;
            return new h(aVar);
        }
        return new h(adConfig, adSurgeAdFormat, str, 1).c("user_action_batch", com.adsurge.adn.p025h.c.b().a());
    }

    public static h a(boolean z) {
        a aVar = new a();
        aVar.b = false;
        aVar.g = false;
        aVar.a = false;
        aVar.i = false;
        aVar.f = b.f().b();
        return new h(aVar).c("is_retry", Boolean.valueOf(z));
    }

    public static h a(JSONObject jSONObject) {
        h hVar = new h(new a());
        e eVar = hVar.a;
        if (!b.a("omni_channel_comp_info")) {
            eVar.a("omni_channel_comp_info", jSONObject);
        }
        return hVar;
    }

    public static h a(String str, Object obj) {
        h hVar = new h(new a());
        e eVar = hVar.a;
        if (!b.a(str)) {
            eVar.a(str, obj);
        }
        return hVar;
    }

    public static h a(com.adsurge.adn.u1.c cVar, Object obj, String str) {
        a aVar = new a();
        aVar.e = false;
        aVar.f = false;
        aVar.g = false;
        h hVar = new h(aVar);
        e eVarA = hVar.a;
        if (!b.a("score")) {
            eVarA = eVarA.a("score", obj);
        }
        String strH = cVar.h();
        if (!b.a("trace_id")) {
            eVarA = eVarA.a("trace_id", strH);
        }
        String strD = cVar.d();
        if (!b.a("cid")) {
            eVarA = eVarA.a("cid", strD);
        }
        if (!b.a("material_url")) {
            eVarA.a("material_url", str);
        }
        return hVar;
    }

    public static h a(List list) {
        a aVar = new a();
        aVar.b = false;
        aVar.d = false;
        aVar.a = false;
        aVar.h = false;
        aVar.i = false;
        aVar.m = o.a(list);
        aVar.n = true;
        return new h(aVar);
    }

    public static h a(com.adsurge.adn.u1.c cVar, String str, JSONArray jSONArray, String str2) {
        h hVar = new h(new a());
        e eVarA = hVar.a;
        if (!b.a("feeling")) {
            eVarA = eVarA.a("feeling", str);
        }
        if (!b.a("reasons")) {
            eVarA = eVarA.a("reasons", jSONArray);
        }
        String strH = cVar.h();
        if (!b.a("trace_id")) {
            eVarA = eVarA.a("trace_id", strH);
        }
        String strD = cVar.d();
        if (!b.a("cid")) {
            eVarA = eVarA.a("cid", strD);
        }
        String strJ = cVar.j();
        if (!b.a("tid")) {
            eVarA = eVarA.a("tid", strJ);
        }
        if (!b.a("material_url")) {
            eVarA.a("material_url", str2);
        }
        return hVar;
    }

    public final h c(String str, Object obj) {
        e eVar = this.a;
        if (!b.a(str)) {
            eVar.a(str, obj);
        }
        return this;
    }
}
