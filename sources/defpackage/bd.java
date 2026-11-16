package defpackage;

import android.os.Build;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class bd implements sr1 {
    public static final bd a = new bd();
    public static final wl0 b = wl0.a(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    public static final wl0 c = wl0.a("versionName");
    public static final wl0 d = wl0.a("appBuildVersion");
    public static final wl0 e = wl0.a("deviceManufacturer");
    public static final wl0 f = wl0.a("currentProcessDetails");
    public static final wl0 g = wl0.a("appProcessDetails");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        u5 u5Var = (u5) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, u5Var.a);
        tr1Var.f(c, u5Var.b);
        tr1Var.f(d, u5Var.c);
        tr1Var.f(e, Build.MANUFACTURER);
        tr1Var.f(f, u5Var.d);
        tr1Var.f(g, u5Var.e);
    }
}
