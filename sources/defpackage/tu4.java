package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class tu4 implements Executor {
    public static final ld1 f = new ld1(2, tu4.class);
    public final Executor a;
    public final ArrayDeque b = new ArrayDeque();
    public int e = 1;
    public long c = 0;
    public final dp4 d = new dp4(this);

    public tu4(ExecutorService executorService) {
        executorService.getClass();
        this.a = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        ArrayDeque arrayDeque = this.b;
        synchronized (arrayDeque) {
            int i = this.e;
            if (i != 4 && i != 3) {
                long j = this.c;
                a72 a72Var = new a72(this, runnable);
                arrayDeque.add(a72Var);
                this.e = 2;
                try {
                    this.a.execute(this.d);
                    if (this.e == 2) {
                        synchronized (this.b) {
                            try {
                                if (this.c == j && this.e == 2) {
                                    this.e = 3;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    ArrayDeque arrayDeque2 = this.b;
                    synchronized (arrayDeque2) {
                        try {
                            int i2 = this.e;
                            boolean z = false;
                            if ((i2 == 1 || i2 == 2) && arrayDeque2.removeLastOccurrence(a72Var)) {
                                z = true;
                            }
                            if ((th2 instanceof RejectedExecutionException) && !z) {
                                return;
                            } else {
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            arrayDeque.add(runnable);
        }
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 20 + strValueOf.length() + 1);
        rl3.m(iIdentityHashCode, "SequentialExecutor@", "{", strValueOf, sb);
        sb.append("}");
        return sb.toString();
    }
}
