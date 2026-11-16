package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class mz0 {
    public final a13 a;
    public final vy0 b;
    public final ww0 c;
    public final vs1 d;
    public final c91 e;
    public final vw f;
    public final Set g;

    public final String toString() {
        return "HttpRequestData(url=" + this.a + ", method=" + this.b + ')';
    }

    public mz0(a13 a13Var, vy0 vy0Var, ww0 ww0Var, vs1 vs1Var, c91 c91Var, vw vwVar) {
        Set setKeySet;
        vy0Var.getClass();
        c91Var.getClass();
        vwVar.getClass();
        this.a = a13Var;
        this.b = vy0Var;
        this.c = ww0Var;
        this.d = vs1Var;
        this.e = c91Var;
        this.f = vwVar;
        Map map = (Map) vwVar.d(iy0.a);
        this.g = (map == null || (setKeySet = map.keySet()) == null) ? kg0.a : setKeySet;
    }
}
