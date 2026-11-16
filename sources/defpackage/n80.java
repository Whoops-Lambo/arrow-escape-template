package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class n80 extends ki0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final n80 j;
    public static final long k;

    @Override // defpackage.ki0, defpackage.fi0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void v0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            ki0.g.set(this, null);
            ki0.h.set(this, null);
            notifyAll();
        }
    }

    static {
        Long l;
        n80 n80Var = new n80();
        j = n80Var;
        n80Var.W(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        k = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.ki0
    public final void b0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.b0(runnable);
    }

    @Override // defpackage.ki0, defpackage.ab0
    public final ad0 g(long j2, gq2 gq2Var, sy syVar) {
        long j3 = 0;
        if (j2 > 0) {
            j3 = j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2;
        }
        if (j3 >= 4611686018427387903L) {
            return dr1.a;
        }
        long jNanoTime = System.nanoTime();
        hi0 hi0Var = new hi0(j3 + jNanoTime, gq2Var);
        u0(jNanoTime, hi0Var);
        return hi0Var;
    }

    @Override // defpackage.ki0
    public final Thread r0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(j.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lp2.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    v0();
                    if (s0()) {
                        return;
                    }
                    r0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jX = X();
                    if (jX == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = k + jNanoTime;
                        }
                        long j3 = j2 - jNanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            v0();
                            if (s0()) {
                                return;
                            }
                            r0();
                            return;
                        }
                        if (jX > j3) {
                            jX = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (jX > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            v0();
                            if (s0()) {
                                return;
                            }
                            r0();
                            return;
                        }
                        LockSupport.parkNanos(this, jX);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            v0();
            if (!s0()) {
                r0();
            }
            throw th;
        }
    }

    @Override // defpackage.ki0
    public final void t0(long j2, ii0 ii0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.uy
    public final String toString() {
        return "DefaultExecutor";
    }
}
