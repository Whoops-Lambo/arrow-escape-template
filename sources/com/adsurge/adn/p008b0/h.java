package com.adsurge.adn.p008b0;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.adsurge.adn.I0.d;
import com.adsurge.adn.Y0.e;
import com.adsurge.adn.Y0.v;
import com.adsurge.adn.Z.a;
import com.adsurge.adn.Z.b;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class h extends b implements d {
    public b a;

    @Override // com.adsurge.adn.p008b0.d
    public boolean a(b bVar) {
        try {
            this.a = bVar;
            JSONObject jSONObjectD = d();
            if (jSONObjectD.length() == 0) {
                a(1, (Throwable) null);
                return true;
            }
            byte[] bArrA = a.a().f().a(jSONObjectD.toString());
            if (bArrA != null && bArrA.length != 0) {
                bVar.j = bArrA;
                File file = new File(a.b(), bVar.g);
                bVar.h = file;
                d.a(file, bArrA);
                return false;
            }
            a(2, (Throwable) null);
            return true;
        } catch (Throwable th) {
            a(0, th);
        }
    }

    @Override // com.adsurge.adn.Z.b
    public JSONObject b() throws JSONException {
        JSONObject jSONObjectB = super.b();
        jSONObjectB.put("thread", this.a.b.getName());
        jSONObjectB.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, this.a.b.getId());
        jSONObjectB.put("crashID", this.a.a);
        jSONObjectB.put("time", this.a.d);
        jSONObjectB.put("type", "Java");
        Throwable cause = this.a.c;
        String name = cause.getClass().getName();
        if (cause.getCause() != null && !name.startsWith("java") && !name.startsWith("android") && !name.startsWith("kotlin")) {
            cause = cause.getCause();
            name = cause.getClass().getName();
        }
        jSONObjectB.put("name", name);
        jSONObjectB.put("reason", cause.getMessage());
        return a(jSONObjectB, this.a.f);
    }

    @Override // com.adsurge.adn.Z.b
    public JSONObject g() throws JSONException {
        JSONObject jSONObjectG = super.g();
        jSONObjectG.put("life", this.a.e);
        return jSONObjectG;
    }

    public final void a(int i, Throwable th) {
        e eVar = new e(a.a().g().b());
        if (th != null) {
            com.adsurge.adn.Y0.d dVar = new com.adsurge.adn.Y0.d();
            dVar.a(CmcdConfiguration.KEY_OBJECT_TYPE, th.getMessage());
            eVar.a(dVar);
        }
        eVar.e(i);
        v.a(eVar);
    }
}
