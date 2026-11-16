package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zb implements sr1 {
    public static final zb a = new zb();
    public static final wl0 b = wl0.a("identifier");
    public static final wl0 c = wl0.a("version");
    public static final wl0 d = wl0.a("displayVersion");
    public static final wl0 e = wl0.a("organization");
    public static final wl0 f = wl0.a("installationUuid");
    public static final wl0 g = wl0.a("developmentPlatform");
    public static final wl0 h = wl0.a("developmentPlatformVersion");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        i00 i00Var = (i00) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, ((zd) i00Var).a);
        zd zdVar = (zd) i00Var;
        tr1Var.f(c, zdVar.b);
        tr1Var.f(d, zdVar.c);
        tr1Var.f(e, null);
        tr1Var.f(f, zdVar.d);
        tr1Var.f(g, zdVar.e);
        tr1Var.f(h, zdVar.f);
    }
}
