package defpackage;

import com.safedk.android.internal.SafeDKWebAppInterface;
import com.tiktok.appevents.edp.TTEDPEventConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class hc implements sr1 {
    public static final hc a = new hc();
    public static final wl0 b = wl0.a("name");
    public static final wl0 c = wl0.a(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE);
    public static final wl0 d = wl0.a(SafeDKWebAppInterface.j);

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        m00 m00Var = (m00) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, ((ke) m00Var).a);
        ke keVar = (ke) m00Var;
        tr1Var.f(c, keVar.b);
        tr1Var.e(d, keVar.c);
    }
}
