package com.adsurge.adn.p026h0;

import android.text.TextUtils;
import com.adsurge.adn.p011c0.b;
import com.adsurge.adn.p011c0.g;
import com.adsurge.adn.p032j0.c;
import com.adsurge.adn.p032j0.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class j {
    public final Map a = new ConcurrentHashMap();
    public final h b = new h();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements g {
        public final /* synthetic */ k a;

        public a(k kVar) {
            this.a = kVar;
        }

        @Override // com.adsurge.adn.p026h0.g
        public void a(int i, JSONObject jSONObject) {
            if (i == 102 || i == 103) {
                c.a(this.a.a(), this.a.b(), i, jSONObject);
            }
        }

        @Override // com.adsurge.adn.p026h0.g
        public void a(l lVar) {
            com.adsurge.adn.K0.a.a(lVar, this.a);
        }
    }

    public d a(k kVar, String str) {
        g gVarD;
        if (TextUtils.isEmpty(kVar.a()) || TextUtils.isEmpty(str)) {
            return null;
        }
        e.a aVarB = e.b();
        f fVarA = this.b.a(str, new a(kVar));
        if (fVarA == null) {
            return null;
        }
        l lVar = fVarA.c;
        com.adsurge.adn.Y0.c cVar = new com.adsurge.adn.Y0.c();
        cVar.f(kVar.a());
        e.b(2230101, aVarB, cVar);
        if (lVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(lVar.l) && (gVarD = b.e().d()) != null) {
            gVarD.a(cVar);
        }
        if (fVarA.b) {
            b.e().c();
        }
        d dVar = new d(kVar.a(), lVar, fVarA.a, fVarA.b, kVar);
        dVar.a(fVarA.d);
        dVar.a(fVarA.e);
        this.a.put(dVar.a, dVar);
        return dVar;
    }

    public d a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (d) this.a.get(str);
    }
}
