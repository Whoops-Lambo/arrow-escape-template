package com.adsurge.adn.Y0;

import android.content.Context;
import android.os.SystemClock;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class n extends a {
    @Override // com.adsurge.adn.Y0.a
    public void a(Set set) {
        k.a(this.a).a().a(set);
    }

    @Override // com.adsurge.adn.Y0.a
    public List b() {
        return k.a(this.a).a().b();
    }

    @Override // com.adsurge.adn.Y0.a
    public void c(List list) {
        k.a(this.a).a().a(list);
    }

    public n(Context context) {
        super(context);
    }

    @Override // com.adsurge.adn.Y0.a
    public void d(List list) {
        com.adsurge.adn.H0.b bVar;
        if (!com.adsurge.adn.D0.a.c().d().a()) {
            com.adsurge.adn.J0.a.a("Send stat failed for no available network");
            return;
        }
        JSONObject jSONObjectA = m.a(list);
        if (jSONObjectA == null) {
            return;
        }
        Future futureA = s.a(jSONObjectA);
        if (futureA != null) {
            try {
                bVar = (com.adsurge.adn.H0.b) futureA.get();
            } catch (Throwable th) {
                com.adsurge.adn.J0.a.a("Report stat failed: ", th);
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
        if (d()) {
            a(false);
            return true;
        }
        if (k.a(this.a).a().a() + ((long) this.b.size()) < j.a() && (SystemClock.elapsedRealtime() / 1000) - c() <= j.b()) {
            return false;
        }
        return true;
    }
}
