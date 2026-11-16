package defpackage;

import com.singular.sdk.internal.Constants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jc implements sr1 {
    public static final jc a = new jc();
    public static final wl0 b = wl0.a(Constants.REVENUE_PRODUCT_CATEGORY_KEY);
    public static final wl0 c = wl0.a("symbol");
    public static final wl0 d = wl0.a("file");
    public static final wl0 e = wl0.a("offset");
    public static final wl0 f = wl0.a("importance");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        n00 n00Var = (n00) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.e(b, ((ne) n00Var).a);
        ne neVar = (ne) n00Var;
        tr1Var.f(c, neVar.b);
        tr1Var.f(d, neVar.c);
        tr1Var.e(e, neVar.d);
        tr1Var.c(f, neVar.e);
    }
}
