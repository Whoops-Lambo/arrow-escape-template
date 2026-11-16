package defpackage;

import com.ironsource.R6;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class bc implements sr1 {
    public static final bc a = new bc();
    public static final wl0 b = wl0.a("arch");
    public static final wl0 c = wl0.a(R6.B);
    public static final wl0 d = wl0.a("cores");
    public static final wl0 e = wl0.a("ram");
    public static final wl0 f = wl0.a("diskSpace");
    public static final wl0 g = wl0.a("simulator");
    public static final wl0 h = wl0.a("state");
    public static final wl0 i = wl0.a("manufacturer");
    public static final wl0 j = wl0.a("modelClass");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        j00 j00Var = (j00) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.c(b, ((ce) j00Var).a);
        ce ceVar = (ce) j00Var;
        tr1Var.f(c, ceVar.b);
        tr1Var.c(d, ceVar.c);
        tr1Var.e(e, ceVar.d);
        tr1Var.e(f, ceVar.e);
        tr1Var.b(g, ceVar.f);
        tr1Var.c(h, ceVar.g);
        tr1Var.f(i, ceVar.h);
        tr1Var.f(j, ceVar.i);
    }
}
