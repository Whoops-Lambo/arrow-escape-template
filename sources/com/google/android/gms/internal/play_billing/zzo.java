package com.google.android.gms.internal.play_billing;

import com.ironsource.C4664b4;
import defpackage.f05;
import defpackage.h50;
import defpackage.lj4;
import defpackage.m15;
import defpackage.mb4;
import defpackage.n25;
import defpackage.pv1;
import defpackage.qr4;
import defpackage.wz2;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class zzo implements zzdc {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(zzo.class.getName());
    public static final wz2 f;
    public static final Object g;
    public volatile Object a;
    public volatile qr4 b;
    public volatile n25 c;

    public final void f(n25 n25Var) {
        n25Var.a = null;
        while (true) {
            n25 n25Var2 = this.c;
            if (n25Var2 != n25.c) {
                n25 n25Var3 = null;
                while (n25Var2 != null) {
                    n25 n25Var4 = n25Var2.b;
                    if (n25Var2.a != null) {
                        n25Var3 = n25Var2;
                    } else if (n25Var3 != null) {
                        n25Var3.b = n25Var4;
                        if (n25Var3.a == null) {
                        }
                    } else if (!f.i0(this, n25Var2, n25Var4)) {
                    }
                    n25Var2 = n25Var4;
                }
                return;
            }
            return;
        }
    }

    static {
        wz2 m15Var;
        try {
            m15Var = new f05(AtomicReferenceFieldUpdater.newUpdater(n25.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(n25.class, n25.class, "b"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, n25.class, "c"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, qr4.class, "b"), AtomicReferenceFieldUpdater.newUpdater(zzo.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            m15Var = new m15();
        }
        Throwable th2 = th;
        f = m15Var;
        if (th2 != null) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    public static void c(zzo zzoVar) {
        n25 n25Var;
        wz2 wz2Var;
        qr4 qr4Var;
        qr4 qr4Var2;
        qr4 qr4Var3;
        do {
            n25Var = zzoVar.c;
            wz2Var = f;
        } while (!wz2Var.i0(zzoVar, n25Var, n25.c));
        while (true) {
            qr4Var = null;
            if (n25Var == null) {
                break;
            }
            Thread thread = n25Var.a;
            if (thread != null) {
                n25Var.a = null;
                LockSupport.unpark(thread);
            }
            n25Var = n25Var.b;
        }
        do {
            qr4Var2 = zzoVar.b;
        } while (!wz2Var.g0(zzoVar, qr4Var2, qr4.d));
        while (true) {
            qr4Var3 = qr4Var;
            qr4Var = qr4Var2;
            if (qr4Var == null) {
                break;
            }
            qr4Var2 = qr4Var.c;
            qr4Var.c = qr4Var3;
        }
        while (qr4Var3 != null) {
            Runnable runnable = qr4Var3.a;
            qr4 qr4Var4 = qr4Var3.c;
            e(runnable, qr4Var3.b);
            qr4Var3 = qr4Var4;
        }
    }

    public static final Object g(Object obj) throws ExecutionException {
        if (obj instanceof mb4) {
            Throwable th = ((mb4) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof lj4) {
            throw new ExecutionException(((lj4) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (this instanceof ScheduledFuture) {
            return pv1.m(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        mb4 mb4Var;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            mb4Var = new mb4(new CancellationException("Future.cancel() was called."));
        } else {
            mb4Var = z ? mb4.b : mb4.c;
        }
        if (!f.h0(this, obj, mb4Var)) {
            return false;
        }
        c(this);
        return true;
    }

    public final void d(StringBuilder sb) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e3) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e3.getCause());
                    sb.append(C4664b4.j.e);
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        sb.append(v == this ? "this future" : String.valueOf(v));
        sb.append(C4664b4.j.e);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof mb4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof mb4) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                strConcat = b();
            } catch (RuntimeException e2) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e2.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                h50.x("PENDING, info=[", strConcat, sb, C4664b4.j.e);
            } else if (isDone()) {
                d(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(C4664b4.j.e);
        return sb.toString();
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", pv1.o("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdc
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        qr4 qr4Var = this.b;
        qr4 qr4Var2 = qr4.d;
        if (qr4Var != qr4Var2) {
            qr4 qr4Var3 = new qr4(runnable, executor);
            do {
                qr4Var3.c = qr4Var;
                if (f.g0(this, qr4Var, qr4Var3)) {
                    return;
                } else {
                    qr4Var = this.b;
                }
            } while (qr4Var != qr4Var2);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long jNanoTime;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.a;
            if (obj != null) {
                return g(obj);
            }
            if (nanos > 0) {
                jNanoTime = System.nanoTime() + nanos;
            } else {
                jNanoTime = 0;
            }
            if (nanos >= 1000) {
                n25 n25Var = this.c;
                n25 n25Var2 = n25.c;
                if (n25Var != n25Var2) {
                    n25 n25Var3 = new n25();
                    while (true) {
                        wz2 wz2Var = f;
                        wz2Var.c0(n25Var3, n25Var);
                        if (wz2Var.i0(this, n25Var, n25Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.a;
                                    if (obj2 != null) {
                                        return g(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    f(n25Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(n25Var3);
                            break;
                        }
                        n25Var = this.c;
                        if (n25Var == n25Var2) {
                        }
                    }
                }
                return g(this.a);
            }
            while (nanos > 0) {
                Object obj3 = this.a;
                if (obj3 != null) {
                    return g(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j2 = -nanos;
                long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(jConvert);
                boolean z = true;
                if (jConvert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(h50.i(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return g(obj2);
            }
            n25 n25Var = this.c;
            n25 n25Var2 = n25.c;
            if (n25Var != n25Var2) {
                n25 n25Var3 = new n25();
                do {
                    wz2 wz2Var = f;
                    wz2Var.c0(n25Var3, n25Var);
                    if (wz2Var.i0(this, n25Var, n25Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                f(n25Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    n25Var = this.c;
                } while (n25Var != n25Var2);
            }
            return g(this.a);
        }
        throw new InterruptedException();
    }
}
