package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class bh3 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static synchronized void a(zg3 zg3Var) {
        try {
            eb3 eb3Var = (eb3) a.remove(zg3Var.xh());
            if (eb3Var != null) {
                eb3Var.b = true;
            }
            zg3Var.noq();
            zg3Var.xh();
        } catch (Throwable th) {
            throw th;
        }
    }
}
