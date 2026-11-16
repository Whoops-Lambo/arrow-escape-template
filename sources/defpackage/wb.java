package defpackage;

import com.tiktok.appevents.contents.TTContentsEventConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class wb implements sr1 {
    public static final wb a = new wb();
    public static final wl0 b = wl0.a("filename");
    public static final wl0 c = wl0.a(TTContentsEventConstants.Params.EVENT_PROPERTY_CONTENTS);

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        d00 d00Var = (d00) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, ((ud) d00Var).a);
        tr1Var.f(c, ((ud) d00Var).b);
    }
}
