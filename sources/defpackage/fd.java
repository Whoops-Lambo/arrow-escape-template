package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class fd implements sr1 {
    public static final fd a = new fd();
    public static final wl0 b = wl0.a("eventType");
    public static final wl0 c = wl0.a("sessionData");
    public static final wl0 d = wl0.a("applicationInfo");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        ob2 ob2Var = (ob2) obj;
        tr1 tr1Var = (tr1) obj2;
        ob2Var.getClass();
        tr1Var.f(b, ri0.SESSION_START);
        tr1Var.f(c, ob2Var.a);
        tr1Var.f(d, ob2Var.b);
    }
}
