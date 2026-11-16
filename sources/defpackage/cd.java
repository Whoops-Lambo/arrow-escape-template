package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class cd implements sr1 {
    public static final cd a = new cd();
    public static final wl0 b = wl0.a("appId");
    public static final wl0 c = wl0.a("deviceModel");
    public static final wl0 d = wl0.a("sessionSdkVersion");
    public static final wl0 e = wl0.a("osVersion");
    public static final wl0 f = wl0.a("logEnvironment");
    public static final wl0 g = wl0.a("androidAppInfo");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        z7 z7Var = (z7) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, z7Var.a);
        tr1Var.f(c, Build.MODEL);
        tr1Var.f(d, "3.0.8");
        tr1Var.f(e, Build.VERSION.RELEASE);
        tr1Var.f(f, qf1.LOG_ENVIRONMENT_PROD);
        tr1Var.f(g, z7Var.b);
    }
}
