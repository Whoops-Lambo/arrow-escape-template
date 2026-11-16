package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class el2 implements p11 {
    public volatile boolean a = false;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();

    @Override // defpackage.p11
    public final synchronized xf1 c(String str) {
        dl2 dl2Var;
        dl2Var = (dl2) this.b.get(str);
        if (dl2Var == null) {
            dl2Var = new dl2(str, this.c, this.a);
            this.b.put(str, dl2Var);
        }
        return dl2Var;
    }
}
