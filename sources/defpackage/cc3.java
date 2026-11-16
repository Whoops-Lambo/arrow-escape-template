package defpackage;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.c;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class cc3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractAdapter b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;

    public /* synthetic */ cc3(AbstractAdapter abstractAdapter, String str, List list, int i) {
        this.a = i;
        this.b = abstractAdapter;
        this.c = str;
        this.d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.d;
        String str = this.c;
        AbstractAdapter abstractAdapter = this.b;
        switch (i) {
            case 0:
                c.a(abstractAdapter, str, list);
                break;
            default:
                c.b(abstractAdapter, str, list);
                break;
        }
    }
}
