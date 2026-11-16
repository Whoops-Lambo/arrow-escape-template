package com.facebook.appevents;

import defpackage.dt1;
import defpackage.n8;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class w {
    public static final Set b;
    public static final Set c;
    public static final Map d;
    public final LinkedHashMap a = new LinkedHashMap();

    static {
        Set setQ0 = n8.q0(new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"});
        b = setQ0;
        Set setQ1 = n8.q0(new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"});
        c = setQ1;
        Map mapSingletonMap = Collections.singletonMap(x.a, new dt1(setQ0, setQ1));
        mapSingletonMap.getClass();
        d = mapSingletonMap;
    }

    public final void a(x xVar, String str, Object obj) {
        LinkedHashMap linkedHashMap = this.a;
        xVar.getClass();
        str.getClass();
        obj.getClass();
        try {
            HashSet hashSet = f.f;
            io.p071bidmachine.media3.common.audio.c.C(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                throw new com.facebook.u(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2)));
            }
            if (!linkedHashMap.containsKey(xVar)) {
                linkedHashMap.put(xVar, new LinkedHashMap());
            }
            Map map = (Map) linkedHashMap.get(xVar);
            if (map != null) {
                map.put(str, obj);
            }
        } catch (Exception unused) {
        }
    }
}
