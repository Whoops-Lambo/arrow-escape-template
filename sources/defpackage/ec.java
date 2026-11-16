package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ec implements sr1 {
    public static final ec a = new ec();
    public static final wl0 b = wl0.a("baseAddress");
    public static final wl0 c = wl0.a("size");
    public static final wl0 d = wl0.a("name");
    public static final wl0 e = wl0.a("uuid");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        k00 k00Var = (k00) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.e(b, ((ie) k00Var).a);
        ie ieVar = (ie) k00Var;
        tr1Var.e(c, ieVar.b);
        tr1Var.f(d, ieVar.c);
        String str = ieVar.d;
        tr1Var.f(e, str != null ? str.getBytes(b10.a) : null);
    }
}
