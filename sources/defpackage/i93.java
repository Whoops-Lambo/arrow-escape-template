package defpackage;

import com.ironsource.Sb;
import com.ironsource.Zb;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.controller.l;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i93 implements l.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i93(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.ironsource.sdk.controller.l.b
    public final void a(Sb sb) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Zb.a((Zb) obj, sb);
                break;
            default:
                ((e) obj).a(sb);
                break;
        }
    }
}
