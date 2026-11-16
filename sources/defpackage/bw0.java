package defpackage;

import androidx.datastore.core.MulticastFileObserver;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class bw0 implements ad0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bw0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ad0
    public final void dispose() {
        switch (this.a) {
            case 0:
                cw0 cw0Var = (cw0) this.b;
                cw0Var.c.removeCallbacks((gq2) this.c);
                return;
            default:
                String str = (String) this.b;
                wr0 wr0Var = (wr0) this.c;
                synchronized (MulticastFileObserver.b) {
                    LinkedHashMap linkedHashMap = MulticastFileObserver.c;
                    MulticastFileObserver multicastFileObserver = (MulticastFileObserver) linkedHashMap.get(str);
                    if (multicastFileObserver != null) {
                        multicastFileObserver.a.remove(wr0Var);
                        if (multicastFileObserver.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            multicastFileObserver.stopWatching();
                        }
                    }
                    break;
                }
                return;
        }
    }
}
