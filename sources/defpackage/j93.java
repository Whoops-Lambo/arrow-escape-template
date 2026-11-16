package defpackage;

import com.ironsource.Zb;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j93 implements l.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j93(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.ironsource.sdk.controller.l.a
    public final void a(f.a aVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Zb.a((Zb) obj, aVar);
                break;
            case 1:
                Zb.b((Zb) obj, aVar);
                break;
            default:
                ((e) obj).a(aVar);
                break;
        }
    }
}
