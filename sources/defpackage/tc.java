package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class tc implements sr1 {
    public static final tc a = new tc();
    public static final wl0 b;
    public static final wl0 c;
    public static final wl0 d;
    public static final wl0 e;

    static {
        v9 v9Var = new v9(1);
        HashMap map = new HashMap();
        map.put(n02.class, v9Var);
        b = new wl0("window", Collections.unmodifiableMap(new HashMap(map)));
        v9 v9Var2 = new v9(2);
        HashMap map2 = new HashMap();
        map2.put(n02.class, v9Var2);
        c = new wl0("logSourceMetrics", Collections.unmodifiableMap(new HashMap(map2)));
        v9 v9Var3 = new v9(3);
        HashMap map3 = new HashMap();
        map3.put(n02.class, v9Var3);
        d = new wl0("globalMetrics", Collections.unmodifiableMap(new HashMap(map3)));
        v9 v9Var4 = new v9(4);
        HashMap map4 = new HashMap();
        map4.put(n02.class, v9Var4);
        e = new wl0("appNamespace", Collections.unmodifiableMap(new HashMap(map4)));
    }

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        js jsVar = (js) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.f(b, jsVar.a);
        tr1Var.f(c, jsVar.b);
        tr1Var.f(d, jsVar.c);
        tr1Var.f(e, jsVar.d);
    }
}
