package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fc implements sr1 {
    public static final fc a = new fc();
    public static final wl0 b = wl0.a("threads");
    public static final wl0 c = wl0.a("exception");
    public static final wl0 d = wl0.a("appExitInfo");
    public static final wl0 e = wl0.a("profilingManagerInfo");
    public static final wl0 f = wl0.a("signal");
    public static final wl0 g = wl0.a("binaries");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        p00 p00Var = (p00) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, ((he) p00Var).a);
        he heVar = (he) p00Var;
        tr1Var.f(c, heVar.b);
        tr1Var.f(d, heVar.c);
        tr1Var.f(e, heVar.d);
        tr1Var.f(f, heVar.e);
        tr1Var.f(g, heVar.f);
    }
}
