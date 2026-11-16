package com.adsurge.adn.p023g0;

import android.text.TextUtils;
import com.adsurge.adn.p026h0.i;
import com.adsurge.adn.p035k0.c;
import com.adsurge.adn.p035k0.h;
import com.adsurge.adn.p064w0.b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class a {
    public final int a;
    public final String b;
    public final JSONObject c;
    public final String d;
    public final JSONObject e;
    public final JSONObject f;
    public final Map g;
    public boolean h = false;

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || this.g == null || jSONObject.length() <= 0 || this.g.size() <= 0) {
            return;
        }
        for (Map.Entry entry : this.g.entrySet()) {
            Object objD = (this.h ? (h) entry.getValue() : ((c) entry.getValue()).a()).d(jSONObject);
            if (objD != null) {
                a((String) entry.getKey(), objD);
            }
        }
        this.h = true;
    }

    public a(i iVar) {
        JSONObject jSONObject;
        this.a = iVar.a;
        this.b = iVar.b;
        if (!TextUtils.isEmpty(iVar.c)) {
            try {
                jSONObject = new JSONObject(iVar.c);
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.c = jSONObject;
        this.d = iVar.e;
        this.e = iVar.f;
        this.f = iVar.g;
        this.g = iVar.d;
    }

    public void a(String str, Object obj) {
        try {
            this.c.putOpt(str, obj);
        } catch (JSONException e) {
            com.adsurge.adn.J0.a.a(e.getMessage(), e);
        }
    }

    public void a(b bVar, com.adsurge.adn.p038l0.i iVar) {
        Map map = this.g;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : this.g.entrySet()) {
            bVar.j().a(iVar, (c) entry.getValue(), this, (String) entry.getKey());
        }
    }
}
