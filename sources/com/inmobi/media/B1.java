package com.inmobi.media;

import android.content.Context;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class B1 {
    public static void a(Context context, LinkedHashMap linkedHashMap) {
        context.getClass();
        linkedHashMap.getClass();
        ConcurrentHashMap concurrentHashMap = Db.b;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Db dbA = Cb.a(applicationContext, "app_activity_counts");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap2.isEmpty()) {
            dbA.a("activity_counts");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            C1 c1 = (C1) entry2.getKey();
            jSONArray.put(new JSONObject().put(BrandSafetyEvent.ad, c1.a).put("format", c1.b).put("count", ((Number) entry2.getValue()).intValue()));
        }
        dbA.a("activity_counts", jSONArray.toString(), false);
    }
}
