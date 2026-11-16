package defpackage;

import com.ironsource.A;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ A b;
    public final /* synthetic */ Map c;

    public /* synthetic */ n(A a, Map map, int i) {
        this.a = i;
        this.b = a;
        this.c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Map map = this.c;
        A a = this.b;
        switch (i) {
            case 0:
                A.a(a, map);
                break;
            default:
                A.b(a, map);
                break;
        }
    }
}
