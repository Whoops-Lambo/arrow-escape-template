package defpackage;

import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.c;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class dc3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdapterBaseInterface b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ dc3(AdapterBaseInterface adapterBaseInterface, String str, List list, int i) {
        this.a = i;
        this.b = adapterBaseInterface;
        this.c = str;
        this.d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.d;
        String str = this.c;
        AdapterBaseInterface adapterBaseInterface = this.b;
        switch (i) {
            case 0:
                c.a(adapterBaseInterface, str, list);
                break;
            default:
                c.b(adapterBaseInterface, str, list);
                break;
        }
    }
}
