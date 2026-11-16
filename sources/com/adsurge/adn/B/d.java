package com.adsurge.adn.B;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public final String a;
        public final com.adsurge.adn.u1.c b;
        public JSONObject c;
        public boolean d;

        public String a(String str) {
            if (!this.d) {
                this.c = d.a(this.a, this.b);
                this.d = true;
            }
            return d.a(this.c, str);
        }

        public a(String str, com.adsurge.adn.u1.c cVar) {
            this.a = str;
            this.b = cVar;
        }

        public static a a(String str, com.adsurge.adn.u1.c cVar) {
            return new a(str, cVar);
        }
    }

    public static String a(JSONObject jSONObject, String str) {
        if (!TextUtils.isEmpty(str) && jSONObject != null && jSONObject.length() != 0) {
            try {
                Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!jSONObject.isNull(next)) {
                        builderBuildUpon.appendQueryParameter(next, jSONObject.optString(next));
                    }
                }
                return builderBuildUpon.build().toString();
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject.isNull(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static String a(String str, String str2, com.adsurge.adn.u1.c cVar) {
        return TextUtils.isEmpty(str2) ? str2 : a(a(str, cVar), str2);
    }

    public static JSONObject a(String str, com.adsurge.adn.u1.c cVar) {
        return b.c().a(str, (JSONObject) null, cVar, (Map) null);
    }
}
