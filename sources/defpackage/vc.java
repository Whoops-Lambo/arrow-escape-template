package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vc implements sr1 {
    public static final vc a = new vc();
    public static final wl0 b;
    public static final wl0 c;

    static {
        v9 v9Var = new v9(1);
        HashMap map = new HashMap();
        map.put(n02.class, v9Var);
        b = new wl0("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(map)));
        v9 v9Var2 = new v9(3);
        HashMap map2 = new HashMap();
        map2.put(n02.class, v9Var2);
        c = new wl0("reason", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        tf1 tf1Var = (tf1) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.e(b, tf1Var.a);
        tr1Var.f(c, tf1Var.b);
    }
}
