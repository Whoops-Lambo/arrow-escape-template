package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vw {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final Map c() {
        return this.a;
    }

    public final Object a(fa faVar, sr0 sr0Var) {
        faVar.getClass();
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(faVar);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = sr0Var.invoke();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(faVar, objInvoke);
        if (objPutIfAbsent != null) {
            objInvoke = objPutIfAbsent;
        }
        objInvoke.getClass();
        return objInvoke;
    }

    public final Object b(fa faVar) {
        faVar.getClass();
        Object obj = c().get(faVar);
        if (obj != null) {
            return obj;
        }
        vq2.v(faVar, "No instance for key ");
        return null;
    }

    public final Object d(fa faVar) {
        faVar.getClass();
        return c().get(faVar);
    }

    public final void e(fa faVar, Object obj) {
        faVar.getClass();
        obj.getClass();
        c().put(faVar, obj);
    }
}
