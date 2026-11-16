package defpackage;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C4664b4;
import com.ironsource.R6;
import com.safedk.android.analytics.brandsafety.FileUploadManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hb implements sr1 {
    public static final hb a = new hb();
    public static final wl0 b = wl0.a("sdkVersion");
    public static final wl0 c = wl0.a(R6.B);
    public static final wl0 d = wl0.a("hardware");
    public static final wl0 e = wl0.a(C4664b4.i.G);
    public static final wl0 f = wl0.a(AppLovinEventTypes.USER_VIEWED_PRODUCT);
    public static final wl0 g = wl0.a("osBuild");
    public static final wl0 h = wl0.a("manufacturer");
    public static final wl0 i = wl0.a(FileUploadManager.c);
    public static final wl0 j = wl0.a("locale");
    public static final wl0 k = wl0.a("country");
    public static final wl0 l = wl0.a("mccMnc");
    public static final wl0 m = wl0.a("applicationBuild");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        d6 d6Var = (d6) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, ((hd) d6Var).a);
        hd hdVar = (hd) d6Var;
        tr1Var.f(c, hdVar.b);
        tr1Var.f(d, hdVar.c);
        tr1Var.f(e, hdVar.d);
        tr1Var.f(f, hdVar.e);
        tr1Var.f(g, hdVar.f);
        tr1Var.f(h, hdVar.g);
        tr1Var.f(i, hdVar.h);
        tr1Var.f(j, hdVar.i);
        tr1Var.f(k, hdVar.j);
        tr1Var.f(l, hdVar.k);
        tr1Var.f(m, hdVar.l);
    }
}
