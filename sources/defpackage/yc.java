package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class yc implements sr1 {
    public static final yc a = new yc();
    public static final wl0 b;
    public static final wl0 c;

    static {
        v9 v9Var = new v9(1);
        HashMap map = new HashMap();
        map.put(n02.class, v9Var);
        b = new wl0("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map)));
        v9 v9Var2 = new v9(2);
        HashMap map2 = new HashMap();
        map2.put(n02.class, v9Var2);
        c = new wl0("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        ij2 ij2Var = (ij2) obj;
        tr1 tr1Var = (tr1) obj2;
        tr1Var.e(b, ij2Var.a);
        tr1Var.e(c, ij2Var.b);
    }
}
