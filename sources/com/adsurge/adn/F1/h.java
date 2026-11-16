package com.adsurge.adn.F1;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.adsurge.adn.E1.p;
import com.adsurge.adn.x1.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class h extends a {
    @Override // com.adsurge.adn.F1.g
    public f a(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.adsurge.adn.w1.b.b(100292, (com.adsurge.adn.Y0.c) null, (Integer) 3, new com.adsurge.adn.Y0.d().a(NotificationCompat.CATEGORY_MESSAGE, str));
            return new f(-1, "Invalid message");
        }
        if (!"GDTJsBridge".equals(jSONObject.optString("gdtJB"))) {
            com.adsurge.adn.w1.b.b(100292, (com.adsurge.adn.Y0.c) null, (Integer) 4, new com.adsurge.adn.Y0.d().a(NotificationCompat.CATEGORY_MESSAGE, str));
            return new f(-1, "Unsupported protocol");
        }
        String strOptString = jSONObject.optString(NotificationCompat.CATEGORY_SERVICE);
        String strOptString2 = jSONObject.optString("action");
        String strOptString3 = jSONObject.optString("params");
        String strOptString4 = jSONObject.optString("callbackId");
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!TextUtils.isEmpty(strOptString3)) {
                jSONObject2 = new JSONObject(strOptString3);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return b(new d(strOptString, strOptString2, strOptString4, jSONObject2));
    }

    public final f b(d dVar) {
        if (dVar == null) {
            return new f(null);
        }
        if (!"template".equals(dVar.e())) {
            this.b.a(dVar.e());
            a(new e(dVar, e.a.HANDLER_NOT_FOUND_EXCEPTION, "Unsupported service!", 0));
            return new f(1000, "Unsupported service");
        }
        if ("multiAction".equals(dVar.a())) {
            a(TextUtils.isEmpty(dVar.c()) ? dVar.d().toString() : dVar.c(), dVar.f());
        } else {
            a(dVar);
        }
        return new f(null);
    }

    public final void c(d dVar) {
        if (dVar == null || TextUtils.isEmpty(dVar.a())) {
            a(new String[0]);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", dVar.a());
            a(jSONObject.toString());
        } catch (JSONException e) {
            a(new String[0]);
            e.getMessage();
        }
    }

    public h(p pVar) {
        super(pVar);
    }

    @Override // com.adsurge.adn.F1.g
    public void b(String str) {
        d dVarA;
        Uri uri = Uri.parse(str);
        if (r.b(uri)) {
            try {
                dVarA = a(uri);
            } catch (Throwable unused) {
                dVarA = null;
            }
            c(dVarA);
            b(dVarA);
        }
    }

    public final void a(d dVar) {
        this.c.a(dVar.a());
        a(new e(dVar, e.a.HANDLER_NOT_FOUND_EXCEPTION, "Unsupported action!", 0));
    }

    public final void a(String str, long j) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                long j2 = j;
                a(new d("", jSONObject.optString("action"), jSONObject.optString("callbackId"), jSONObject.optJSONObject("params"), j2));
                i++;
                j = j2;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
