package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class lz0 implements uy0 {
    public final jy2 a = new jy2();
    public vy0 b = vy0.b;
    public final tw0 c = new tw0(3);
    public Object d = bg0.a;
    public nl2 e = tb5.a();
    public final vw f = new vw();

    @Override // defpackage.uy0
    public final tw0 a() {
        return this.c;
    }

    public final void b(ns2 ns2Var) {
        vw vwVar = this.f;
        if (ns2Var != null) {
            vwVar.e(r42.a, ns2Var);
            return;
        }
        fa faVar = r42.a;
        vwVar.getClass();
        faVar.getClass();
        vwVar.c().remove(faVar);
    }

    public final void c(v01 v01Var) {
        ((Map) this.f.a(iy0.a, new v2(26))).put(u01.a, v01Var);
    }

    public final void d(vy0 vy0Var) {
        vy0Var.getClass();
        this.b = vy0Var;
    }

    public final void e(lz0 lz0Var) {
        lz0Var.getClass();
        this.b = lz0Var.b;
        this.d = lz0Var.d;
        vw vwVar = lz0Var.f;
        b((ns2) vwVar.d(r42.a));
        jy2 jy2Var = lz0Var.a;
        jy2 jy2Var2 = this.a;
        ns1.z(jy2Var2, jy2Var);
        List list = jy2Var2.h;
        list.getClass();
        jy2Var2.h = list;
        vk3.b(this.c, lz0Var.c);
        vw vwVar2 = this.f;
        vwVar2.getClass();
        for (fa faVar : du.z0(vwVar.c().keySet())) {
            faVar.getClass();
            vwVar2.e(faVar, vwVar.b(faVar));
        }
    }
}
