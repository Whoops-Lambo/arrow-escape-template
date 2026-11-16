package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class kc implements sr1 {
    public static final kc a = new kc();
    public static final wl0 b = wl0.a("processName");
    public static final wl0 c = wl0.a("pid");
    public static final wl0 d = wl0.a("importance");
    public static final wl0 e = wl0.a("defaultProcess");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        q00 q00Var = (q00) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, ((pe) q00Var).a);
        pe peVar = (pe) q00Var;
        tr1Var.c(c, peVar.b);
        tr1Var.c(d, peVar.c);
        tr1Var.b(e, peVar.d);
    }
}
