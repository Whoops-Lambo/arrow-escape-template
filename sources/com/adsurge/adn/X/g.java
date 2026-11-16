package com.adsurge.adn.X;

import com.adsurge.adn.ads.AdConfig;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class g {
    public static Integer a(String str, AdSurgeAdFormat adSurgeAdFormat) {
        if (com.adsurge.adn.K.b.a("ad_count")) {
            return null;
        }
        return Integer.valueOf(com.adsurge.adn.N.b.a("adco", 1, adSurgeAdFormat, str));
    }

    public static String b(AdConfig adConfig) {
        Map<String, String> map;
        if (com.adsurge.adn.K.b.a("dev_ext_info") || (map = adConfig.extra) == null || map.isEmpty()) {
            return null;
        }
        return new JSONObject(adConfig.extra).toString();
    }

    public static String c(AdConfig adConfig) {
        if (com.adsurge.adn.K.b.a("mediation_adunit_id")) {
            return null;
        }
        return adConfig.mediationAdUnitId;
    }

    public static String d(AdConfig adConfig) {
        if (com.adsurge.adn.K.b.a("display_manager")) {
            return null;
        }
        return adConfig.mediationSource;
    }

    public static String e(AdConfig adConfig) {
        if (com.adsurge.adn.K.b.a("mediation_trace_id")) {
            return null;
        }
        return adConfig.mediationTraceId;
    }

    public static String f(AdConfig adConfig) {
        if (com.adsurge.adn.K.b.a("token")) {
            return null;
        }
        return adConfig.token;
    }

    public static String a(String str) {
        if (com.adsurge.adn.K.b.a(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER)) {
            return null;
        }
        return str;
    }

    public static Integer a(AdSurgeAdFormat adSurgeAdFormat) {
        if (com.adsurge.adn.K.b.a("placement_type")) {
            return null;
        }
        return Integer.valueOf(adSurgeAdFormat.type);
    }

    public static Double a(AdConfig adConfig) {
        if (com.adsurge.adn.K.b.a("bidfloor")) {
            return null;
        }
        return adConfig.bidFloor;
    }
}
