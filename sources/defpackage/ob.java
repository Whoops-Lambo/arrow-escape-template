package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ob implements sr1 {
    public static final ob a = new ob();
    public static final wl0 b = wl0.a("eventTimeMs");
    public static final wl0 c = wl0.a("eventCode");
    public static final wl0 d = wl0.a("complianceData");
    public static final wl0 e = wl0.a("eventUptimeMs");
    public static final wl0 f = wl0.a("sourceExtension");
    public static final wl0 g = wl0.a("sourceExtensionJsonProto3");
    public static final wl0 h = wl0.a("timezoneOffsetSeconds");
    public static final wl0 i = wl0.a("networkConnectionInfo");
    public static final wl0 j = wl0.a("experimentIds");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        rf1 rf1Var = (rf1) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.e(b, ((of) rf1Var).a);
        of ofVar = (of) rf1Var;
        tr1Var.f(c, ofVar.b);
        tr1Var.f(d, ofVar.c);
        tr1Var.e(e, ofVar.d);
        tr1Var.f(f, ofVar.e);
        tr1Var.f(g, ofVar.f);
        tr1Var.e(h, ofVar.g);
        tr1Var.f(i, ofVar.h);
        tr1Var.f(j, ofVar.i);
    }
}
