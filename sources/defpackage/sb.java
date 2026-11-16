package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class sb implements sr1 {
    public static final sb a = new sb();
    public static final wl0 b = wl0.a("pid");
    public static final wl0 c = wl0.a("processName");
    public static final wl0 d = wl0.a("reasonCode");
    public static final wl0 e = wl0.a("importance");
    public static final wl0 f = wl0.a("pss");
    public static final wl0 g = wl0.a("rss");
    public static final wl0 h = wl0.a("timestamp");
    public static final wl0 i = wl0.a("traceFile");
    public static final wl0 j = wl0.a("buildIdMappingForArch");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        b00 b00Var = (b00) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.c(b, ((qd) b00Var).a);
        qd qdVar = (qd) b00Var;
        tr1Var.f(c, qdVar.b);
        tr1Var.c(d, qdVar.c);
        tr1Var.c(e, qdVar.d);
        tr1Var.e(f, qdVar.e);
        tr1Var.e(g, qdVar.f);
        tr1Var.e(h, qdVar.g);
        tr1Var.f(i, qdVar.h);
        tr1Var.f(j, qdVar.i);
    }
}
