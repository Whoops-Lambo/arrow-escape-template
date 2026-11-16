package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aa1 implements sr1 {
    public final /* synthetic */ int a;

    public /* synthetic */ aa1(int i) {
        this.a = i;
    }

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new tg0("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                tr1 tr1Var = (tr1) obj2;
                tr1Var.f(o02.g, entry.getKey());
                tr1Var.f(o02.h, entry.getValue());
                return;
            default:
                throw new tg0("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
