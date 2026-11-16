package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class qb implements sr1 {
    public static final qb a = new qb();
    public static final wl0 b = wl0.a("networkType");
    public static final wl0 c = wl0.a("mobileSubtype");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        kq1 kq1Var = (kq1) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, ((rf) kq1Var).a);
        tr1Var.f(c, ((rf) kq1Var).b);
    }
}
