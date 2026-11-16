package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class pb implements sr1 {
    public static final pb a = new pb();
    public static final wl0 b = wl0.a("requestTimeMs");
    public static final wl0 c = wl0.a("requestUptimeMs");
    public static final wl0 d = wl0.a("clientInfo");
    public static final wl0 e = wl0.a("logSource");
    public static final wl0 f = wl0.a("logSourceName");
    public static final wl0 g = wl0.a("logEvent");
    public static final wl0 h = wl0.a("qosTier");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        vf1 vf1Var = (vf1) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.e(b, ((pf) vf1Var).a);
        pf pfVar = (pf) vf1Var;
        tr1Var.e(c, pfVar.b);
        tr1Var.f(d, pfVar.c);
        tr1Var.f(e, pfVar.d);
        tr1Var.f(f, pfVar.e);
        tr1Var.f(g, pfVar.f);
        tr1Var.f(h, i12.a);
    }
}
