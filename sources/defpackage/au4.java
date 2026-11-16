package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class au4 extends kt4 {
    public static final u12 j;
    public static final ld1 k = new ld1(2, au4.class);
    public volatile Set h;
    public volatile int i;

    static {
        Throwable th;
        u12 zt4Var;
        try {
            zt4Var = new yt4();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zt4Var = new zt4();
        }
        Throwable th3 = th;
        j = zt4Var;
        if (th3 != null) {
            k.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
