package com.adsurge.adn.p008b0;

import com.adsurge.adn.Z.b;
import com.adsurge.adn.Z.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class f extends b {
    public g a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            new j().a(this.a);
        }
    }

    public void a(g gVar) {
        try {
            this.a = gVar;
            byte[] bArrA = com.adsurge.adn.Z.a.a().f().a(d().toString());
            if (bArrA != null && bArrA.length != 0) {
                c.a().post(new a(new b(bArrA)));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.adsurge.adn.Z.b
    public JSONObject b() throws JSONException {
        JSONObject jSONObjectB = super.b();
        jSONObjectB.put("type", "Native");
        jSONObjectB.put("thread", this.a.f());
        jSONObjectB.put("crashID", this.a.a());
        jSONObjectB.put("time", this.a.d());
        jSONObjectB.put("name", this.a.b());
        jSONObjectB.put("reason", this.a.c());
        JSONArray jSONArray = new JSONArray();
        for (String str : this.a.e()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("symbol_name", str);
            jSONArray.put(jSONObject);
        }
        jSONObjectB.put("stacktrace", jSONArray);
        return jSONObjectB;
    }
}
