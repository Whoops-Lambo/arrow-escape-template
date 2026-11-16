package com.adsurge.adn.p031j;

import android.os.SystemClock;
import com.adsurge.adn.Q.j;
import com.adsurge.adn.V.l;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.w1.b;
import com.adsurge.adn.z1.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class c extends e.c {
    public final com.adsurge.adn.u1.c a;
    public final int b;
    public int c;
    public long d = 0;
    public long e;

    @Override // com.adsurge.adn.z1.e.c
    public void a(long j) {
        j jVarL0 = this.a.l0();
        String strD0 = this.a.D0();
        String strB = jVarL0 == null ? "0" : jVarL0.b();
        String strB2 = this.a.g0() != null ? this.a.g0().b() : "0";
        boolean zM0 = this.a.M0();
        if (this.c != 0) {
            a(6000904, new l().d(strD0).a(this.b).b(strB2).a(zM0).c(strB).b(this.c).a(this.d));
        }
        a(6000905, new l().d(strD0).a(this.b).b(strB2).a(zM0).c(strB).b(j));
    }

    @Override // com.adsurge.adn.z1.e.c
    public void b(long j) {
        this.c++;
        this.d = Math.max(j, this.d);
    }

    @Override // com.adsurge.adn.z1.e.c
    public void c() {
        j jVarL0 = this.a.l0();
        a(6000903, new l().d(this.a.D0()).a(this.b).b(this.a.g0() == null ? "0" : this.a.g0().b()).a(this.a.M0()).c(jVarL0 != null ? jVarL0.b() : "0"));
    }

    public c(com.adsurge.adn.u1.c cVar, int i) {
        this.a = cVar;
        this.b = i;
    }

    @Override // com.adsurge.adn.C1.a, com.adsurge.adn.C1.c
    public void h() {
        String strB;
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.e);
        j jVarL0 = this.a.l0();
        l lVar = new l();
        String strB2 = "0";
        if (this.a.g0() == null) {
            strB = "0";
        } else {
            strB = this.a.g0().b();
        }
        l lVarA = lVar.b(strB).a(this.a.M0());
        if (jVarL0 != null) {
            strB2 = jVarL0.b();
        }
        a(6000902, lVarA.c(strB2).a(this.b).c(iElapsedRealtime));
    }

    @Override // com.adsurge.adn.C1.a, com.adsurge.adn.C1.c
    public void a(int i, Exception exc) {
        j jVarL0 = this.a.l0();
        a(6000901, Integer.valueOf(i), new l().d(this.a.D0()).a(this.b).b(this.a.g0() == null ? "0" : this.a.g0().b()).a(this.a.M0()).c(jVarL0 != null ? jVarL0.b() : "0"));
    }

    @Override // com.adsurge.adn.C1.c
    public void a() {
        this.e = SystemClock.elapsedRealtime();
        j jVarL0 = this.a.l0();
        j[] jVarArrD0 = this.a.d0();
        String strB = "0";
        l lVarC = new l().d(this.a.D0()).a(this.b).b(this.a.g0() == null ? "0" : this.a.g0().b()).a(this.a.M0()).c(jVarL0 == null ? "0" : jVarL0.b());
        if (jVarL0 != null || (jVarArrD0 != null && jVarArrD0.length != 0)) {
            strB = jVarArrD0[0].b();
        }
        a(6000900, lVarC.a(strB));
    }

    public final void a(int i, d dVar) {
        b.a(i, com.adsurge.adn.Y0.c.a(this.a), Integer.valueOf(this.a.M0() ? 3 : this.a.H0()), dVar);
    }

    public final void a(int i, Integer num, d dVar) {
        b.b(i, com.adsurge.adn.Y0.c.a(this.a), Integer.valueOf(this.a.M0() ? 3 : this.a.H0()), num, dVar);
    }
}
