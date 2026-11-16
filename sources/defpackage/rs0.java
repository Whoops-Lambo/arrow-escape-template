package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class rs0 {
    public static e0 a(ListenableFuture listenableFuture, Class cls, w8 w8Var, Executor executor) {
        int i = g0.l;
        e0 e0Var = new e0(listenableFuture, cls, w8Var);
        listenableFuture.addListener(e0Var, u12.p(executor, e0Var));
        return e0Var;
    }

    public static r21 c(Exception exc) {
        r21 r21Var = new r21();
        r21Var.n(exc);
        return r21Var;
    }

    public static s21 d(Object obj) {
        return obj == null ? s21.b : new s21(obj);
    }

    public static p2 f(ListenableFuture listenableFuture, gs0 gs0Var, Executor executor) {
        int i = q2.k;
        p2 p2Var = new p2(listenableFuture, gs0Var);
        listenableFuture.addListener(p2Var, u12.p(executor, p2Var));
        return p2Var;
    }

    public static o2 g(ListenableFuture listenableFuture, w8 w8Var, Executor executor) {
        int i = q2.k;
        executor.getClass();
        o2 o2Var = new o2(listenableFuture, w8Var);
        listenableFuture.addListener(o2Var, u12.p(executor, o2Var));
        return o2Var;
    }

    public static Object b(Future future) {
        Object obj;
        if (future.isDone()) {
            boolean z = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        e32.i(eu.x("Future was expected to be done: %s", future));
        return null;
    }

    public static ListenableFuture e(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        qs0 qs0Var = new qs0();
        qs0Var.h = listenableFuture;
        listenableFuture.addListener(qs0Var, gc0.a);
        return qs0Var;
    }
}
