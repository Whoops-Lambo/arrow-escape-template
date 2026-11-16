package defpackage;

import com.mbridge.msdk.foundation.entity.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ic implements sr1 {
    public static final ic a = new ic();
    public static final wl0 b = wl0.a("name");
    public static final wl0 c = wl0.a("importance");
    public static final wl0 d = wl0.a(b.JSON_KEY_FRAME_ADS);

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        o00 o00Var = (o00) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, ((le) o00Var).a);
        le leVar = (le) o00Var;
        tr1Var.c(c, leVar.b);
        tr1Var.f(d, leVar.c);
    }
}
