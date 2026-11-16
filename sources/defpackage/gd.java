package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gd implements sr1 {
    public static final gd a = new gd();
    public static final wl0 b = wl0.a("sessionId");
    public static final wl0 c = wl0.a("firstSessionId");
    public static final wl0 d = wl0.a("sessionIndex");
    public static final wl0 e = wl0.a("eventTimestampUs");
    public static final wl0 f = wl0.a("dataCollectionStatus");
    public static final wl0 g = wl0.a("firebaseInstallationId");
    public static final wl0 h = wl0.a("firebaseAuthenticationToken");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        vb2 vb2Var = (vb2) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, vb2Var.a);
        tr1Var.f(c, vb2Var.b);
        tr1Var.c(d, vb2Var.c);
        tr1Var.e(e, vb2Var.d);
        tr1Var.f(f, vb2Var.e);
        tr1Var.f(g, vb2Var.f);
        tr1Var.f(h, vb2Var.g);
    }
}
