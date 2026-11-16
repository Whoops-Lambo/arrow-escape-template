package com.adsurge.adn.R;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends d {
    public static final JSONObject a = new JSONObject();

    public abstract void a(com.adsurge.adn.H0.a aVar, int i, JSONObject jSONObject);

    public abstract void a(com.adsurge.adn.H0.a aVar, JSONObject jSONObject);

    @Override // com.adsurge.adn.G0.b
    public void a(com.adsurge.adn.H0.a aVar, com.adsurge.adn.H0.b bVar) {
        int iB = bVar.b();
        if (iB != 200) {
            a(aVar, iB, (Exception) null);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(bVar.c());
            int iOptInt = jSONObject.optInt("ret", 0);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = a;
            }
            if (iOptInt == 0) {
                a(aVar, jSONObjectOptJSONObject);
            } else {
                a(aVar, iOptInt, jSONObjectOptJSONObject);
            }
        } catch (Exception e) {
            a(aVar, 3001, e);
        }
    }
}
