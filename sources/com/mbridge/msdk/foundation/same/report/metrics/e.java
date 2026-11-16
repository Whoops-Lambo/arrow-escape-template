package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class e {
    private Map<String, String> a = new HashMap();

    public Object b(String str) {
        return this.a.get(str);
    }

    public void c(String str) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.remove(str);
    }

    public void a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            try {
                if (obj instanceof String) {
                    if (!TextUtils.isEmpty((String) obj)) {
                        this.a.put(str, (String) obj);
                    }
                } else {
                    this.a.put(str, obj + "");
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean a(String str) {
        return this.a.containsKey(str);
    }

    public Map<String, String> a() {
        return this.a;
    }

    public void a(e eVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (eVar == null || (map = eVar.a) == null || (map2 = this.a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.a.putAll(map);
    }
}
