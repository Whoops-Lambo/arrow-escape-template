package com.adsurge.adn.Y0;

import android.content.Context;
import android.os.SystemClock;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class r extends a {
    @Override // com.adsurge.adn.Y0.a
    public void a(Set set) {
        k.a(this.a).b().a(set);
    }

    @Override // com.adsurge.adn.Y0.a
    public List b() {
        return k.a(this.a).b().b();
    }

    @Override // com.adsurge.adn.Y0.a
    public void c(List list) {
        k.a(this.a).b().a(list);
    }

    public r(Context context) {
        super(context);
    }

    @Override // com.adsurge.adn.Y0.a
    public void d(List list) {
        com.adsurge.adn.H0.b bVar;
        if (!com.adsurge.adn.D0.a.c().d().a()) {
            com.adsurge.adn.J0.a.a("Send stat failed for no available network");
            return;
        }
        JSONObject jSONObjectA = q.a(list);
        if (jSONObjectA == null) {
            return;
        }
        Future futureB = s.b(jSONObjectA);
        if (futureB != null) {
            try {
                bVar = (com.adsurge.adn.H0.b) futureB.get();
            } catch (Exception e) {
                com.adsurge.adn.J0.a.a("Report stat failed: ", e);
                a(list);
                return;
            }
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.b() == 200) {
            b(list);
        } else {
            a(list);
        }
    }

    @Override // com.adsurge.adn.Y0.a
    public boolean e() {
        if (!j.j()) {
            return false;
        }
        if (j.i()) {
            return true;
        }
        if (k.a(this.a).b().a() + ((long) this.b.size()) < j.d() && (SystemClock.elapsedRealtime() / 1000) - c() <= j.e()) {
            return false;
        }
        return true;
    }
}
