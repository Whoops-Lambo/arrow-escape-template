package defpackage;

import com.mbridge.msdk.config.activity.b;
import com.mbridge.msdk.config.component.base.d;
import com.mbridge.msdk.config.component.status.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r93 implements a {
    public final /* synthetic */ int a;

    public /* synthetic */ r93(int i) {
        this.a = i;
    }

    @Override // com.mbridge.msdk.config.component.status.a
    public final void a(d dVar) {
        switch (this.a) {
            case 0:
                com.mbridge.msdk.system.a.lambda$registerActivityLifecycleListener$3(dVar);
                break;
            default:
                b.a(dVar);
                break;
        }
    }
}
