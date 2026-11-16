package defpackage;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class lp2 {
    public static final ThreadLocal a = new ThreadLocal();

    public static fi0 a() {
        ThreadLocal threadLocal = a;
        fi0 fi0Var = (fi0) threadLocal.get();
        if (fi0Var != null) {
            return fi0Var;
        }
        gj gjVar = new gj(Thread.currentThread());
        threadLocal.set(gjVar);
        return gjVar;
    }
}
