package defpackage;

import com.ironsource.C4664b4;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class mc implements sr1 {
    public static final mc a = new mc();
    public static final wl0 b = wl0.a("timestamp");
    public static final wl0 c = wl0.a("type");
    public static final wl0 d = wl0.a("app");
    public static final wl0 e = wl0.a(C4664b4.i.G);
    public static final wl0 f = wl0.a(CreativeInfo.f);
    public static final wl0 g = wl0.a("rollouts");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        x00 x00Var = (x00) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.e(b, ((ee) x00Var).a);
        ee eeVar = (ee) x00Var;
        tr1Var.f(c, eeVar.b);
        tr1Var.f(d, eeVar.c);
        tr1Var.f(e, eeVar.d);
        tr1Var.f(f, eeVar.e);
        tr1Var.f(g, eeVar.f);
    }
}
