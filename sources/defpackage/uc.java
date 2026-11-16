package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class uc implements sr1 {
    public static final uc a = new uc();
    public static final wl0 b;

    static {
        v9 v9Var = new v9(1);
        HashMap map = new HashMap();
        map.put(n02.class, v9Var);
        b = new wl0("storageMetrics", Collections.unmodifiableMap(new HashMap(map)));
    }

    @Override // defpackage.og0
    public final void a(Object obj, Object obj2) {
        ((tr1) obj2).f(b, ((iu0) obj).a);
    }
}
