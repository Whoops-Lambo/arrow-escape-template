package defpackage;

import com.mbridge.msdk.foundation.entity.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gc implements sr1 {
    public static final gc a = new gc();
    public static final wl0 b = wl0.a("type");
    public static final wl0 c = wl0.a("reason");
    public static final wl0 d = wl0.a(b.JSON_KEY_FRAME_ADS);
    public static final wl0 e = wl0.a("causedBy");
    public static final wl0 f = wl0.a("overflowCount");

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        l00 l00Var = (l00) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, ((je) l00Var).a);
        je jeVar = (je) l00Var;
        tr1Var.f(c, jeVar.b);
        tr1Var.f(d, jeVar.c);
        tr1Var.f(e, jeVar.d);
        tr1Var.c(f, jeVar.e);
    }
}
