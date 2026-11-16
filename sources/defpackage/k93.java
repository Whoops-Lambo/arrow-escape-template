package defpackage;

import android.app.Activity;
import com.ironsource.H8;
import com.ironsource.Zb;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k93 implements l.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Zb b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k93(Zb zb, Object obj, int i) {
        this.a = i;
        this.b = zb;
        this.c = obj;
    }

    @Override // com.ironsource.sdk.controller.l.a
    public final void a(f.a aVar) {
        int i = this.a;
        Object obj = this.c;
        Zb zb = this.b;
        switch (i) {
            case 0:
                Zb.a(zb, (H8) obj, aVar);
                break;
            default:
                Zb.a(zb, (Activity) obj, aVar);
                break;
        }
    }
}
