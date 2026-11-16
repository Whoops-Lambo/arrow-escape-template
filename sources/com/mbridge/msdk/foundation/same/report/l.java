package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.ironsource.C4664b4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class l {
    private final Map<String, String> a;
    private final String b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class b {
        private final Map<String, String> a = new HashMap();
        private final String b;

        public l a() {
            return new l(this);
        }

        public b(String str) {
            this.b = str;
        }
    }

    private void a(Map<String, String> map, JSONObject jSONObject) {
        if (map == null || map.isEmpty() || jSONObject == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, a(map.get(str)));
            }
        } catch (Exception e) {
            q0.b("SameCommonReporter", e.getMessage());
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(this.b)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4664b4.i.W, this.b);
            a(this.a, jSONObject);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th) {
            q0.b("SameCommonReporter", th.getMessage());
        }
    }

    private l(b bVar) {
        this.b = bVar.b;
        this.a = bVar.a;
    }

    private String a(String str) {
        try {
            return URLEncoder.encode(str, G5.O);
        } catch (Exception unused) {
            return str;
        }
    }
}
