package com.adsurge.adn.p037l;

import com.adsurge.adn.R.a;
import com.adsurge.adn.Y0.c;
import com.adsurge.adn.Y0.d;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class b extends a {
    public final String b;
    public final c c;
    public final JSONObject d;
    public final int e;

    @Override // com.adsurge.adn.R.a
    public void a(com.adsurge.adn.H0.a aVar, int i, JSONObject jSONObject) {
        com.adsurge.adn.w1.b.a(6000201, this.c, Integer.valueOf(this.e), Integer.valueOf(i), (d) null);
        com.adsurge.adn.I.a.b(jSONObject.toString(), this.c);
        if (jSONObject.optInt("need_retry") == 1) {
            com.adsurge.adn.p063w.b.a().a(this.b, 1, this.c, this.d);
        }
    }

    public b(String str, c cVar, JSONObject jSONObject, int i) {
        this.b = str;
        this.c = cVar;
        this.d = jSONObject;
        this.e = i;
    }

    @Override // com.adsurge.adn.R.d
    public void a(com.adsurge.adn.H0.a aVar, int i, Exception exc) {
        com.adsurge.adn.p063w.b.a().a(this.b, 1, this.c, this.d);
        com.adsurge.adn.w1.b.a(6000201, this.c, Integer.valueOf(this.e), Integer.valueOf(i), (d) null);
        com.adsurge.adn.I.a.b(exc == null ? "" : exc.getMessage(), this.c);
    }

    @Override // com.adsurge.adn.R.a
    public void a(com.adsurge.adn.H0.a aVar, JSONObject jSONObject) {
        com.adsurge.adn.p063w.b.a().b();
    }
}
