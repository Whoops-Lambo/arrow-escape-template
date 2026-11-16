package com.google.android.gms.internal.play_billing;

import com.ironsource.C4664b4;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.a44;
import defpackage.h50;
import defpackage.i84;
import defpackage.m44;
import defpackage.n44;
import defpackage.pv1;
import defpackage.uu;
import defpackage.w34;
import defpackage.x34;
import defpackage.z34;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzcm<V> extends n44 {
    public static void j(zzcm zzcmVar) {
        a44 a44Var = null;
        while (true) {
            zzcmVar.getClass();
            for (m44 m44VarQ = n44.g.Q(zzcmVar); m44VarQ != null; m44VarQ = m44VarQ.b) {
                Thread thread = m44VarQ.a;
                if (thread != null) {
                    m44VarQ.a = null;
                    LockSupport.unpark(thread);
                }
            }
            zzcmVar.f();
            a44 a44Var2 = a44Var;
            a44 a44VarP = n44.g.P(zzcmVar);
            a44 a44Var3 = a44Var2;
            while (a44VarP != null) {
                a44 a44Var4 = a44VarP.c;
                a44VarP.c = a44Var3;
                a44Var3 = a44VarP;
                a44VarP = a44Var4;
            }
            while (a44Var3 != null) {
                Runnable runnable = a44Var3.a;
                a44 a44Var5 = a44Var3.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof x34) {
                    x34 x34Var = (x34) runnable;
                    zzcmVar = x34Var.a;
                    if (zzcmVar.a == x34Var) {
                        if (n44.g.V(zzcmVar, x34Var, h(x34Var.b))) {
                            a44Var = a44Var5;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = a44Var3.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                a44Var3 = a44Var5;
            }
            return;
        }
    }

    public String e() {
        throw null;
    }

    public void f() {
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof w34) {
            Throwable th = ((w34) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof z34) {
            throw new ExecutionException(((z34) obj).a);
        }
        if (obj == n44.d) {
            return null;
        }
        return obj;
    }

    public static boolean g(Object obj) {
        return !(obj instanceof x34);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(zzdc zzdcVar) {
        Object obj;
        Throwable thB;
        if (zzdcVar instanceof i84) {
            Object w34Var = ((zzcm) zzdcVar).a;
            if (w34Var instanceof w34) {
                w34 w34Var2 = (w34) w34Var;
                if (w34Var2.a) {
                    Throwable th = w34Var2.b;
                    w34Var = th != null ? new w34(th, false) : w34.d;
                }
            }
            Objects.requireNonNull(w34Var);
            return w34Var;
        }
        if ((zzdcVar instanceof zzdi) && (thB = ((zzdi) zzdcVar).b()) != null) {
            return new z34(thB);
        }
        boolean zIsCancelled = zzdcVar.isCancelled();
        boolean z = true;
        if ((!n44.f) && zIsCancelled) {
            w34 w34Var3 = w34.d;
            Objects.requireNonNull(w34Var3);
            return w34Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = zzdcVar.get();
                        break;
                    } catch (Error | Exception e) {
                        e = e;
                        return new z34(e);
                    } catch (CancellationException e2) {
                        return !zIsCancelled ? new z34(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzdcVar)), e2)) : new w34(e2, false);
                    } catch (ExecutionException e3) {
                        return zIsCancelled ? new w34(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzdcVar)), e3), false) : new z34(e3.getCause());
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error e4) {
                e = e4;
                return new z34(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (zIsCancelled) {
            return new w34(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzdcVar))), false);
        }
        return obj == null ? n44.d : obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdc
    public final void a(Runnable runnable, Executor executor) {
        a44 a44Var;
        a44 a44Var2 = a44.d;
        if (executor == null) {
            defpackage.d.w("Executor was null.");
            return;
        }
        if (!isDone() && (a44Var = this.b) != a44Var2) {
            a44 a44Var3 = new a44(runnable, executor);
            do {
                a44Var3.c = a44Var;
                if (n44.g.U(this, a44Var, a44Var3)) {
                    return;
                } else {
                    a44Var = this.b;
                }
            } while (a44Var != a44Var2);
        }
        k(runnable, executor);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdi
    public final Throwable b() {
        if (!(this instanceof i84)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof z34) {
            return ((z34) obj).a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        w34 w34Var;
        Object obj = this.a;
        if (!(obj instanceof x34) && !(obj == null)) {
            return false;
        }
        if (n44.f) {
            w34Var = new w34(new CancellationException("Future.cancel() was called."), z);
        } else {
            w34Var = z ? w34.c : w34.d;
            Objects.requireNonNull(w34Var);
        }
        boolean z2 = false;
        while (true) {
            if (n44.g.V(this, obj, w34Var)) {
                j(this);
                if (obj instanceof x34) {
                    zzdc zzdcVar = ((x34) obj).b;
                    if (zzdcVar instanceof i84) {
                        this = (zzcm) zzdcVar;
                        obj = this.a;
                        if ((obj == null) | (obj instanceof x34)) {
                            z2 = true;
                        }
                    } else {
                        zzdcVar.cancel(z);
                    }
                }
                return true;
            }
            obj = this.a;
            if (g(obj)) {
                return z2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        m44 m44Var = m44.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && g(obj)) {
            return d(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            m44 m44Var2 = this.c;
            if (m44Var2 != m44Var) {
                m44 m44Var3 = new m44();
                while (true) {
                    uu uuVar = n44.g;
                    uuVar.R(m44Var3, m44Var2);
                    if (uuVar.W(this, m44Var2, m44Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                c(m44Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && g(obj2)) {
                                return d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        c(m44Var3);
                        break;
                    }
                    long j4 = j3;
                    m44Var2 = this.c;
                    if (m44Var2 != m44Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return d(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if ((obj4 != null) && g(obj4)) {
                return d(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j2) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == j2 || nanos2 > 1000;
            if (jConvert > j2) {
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

    public final void i(StringBuilder sb) {
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
                } catch (ExecutionException e) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e.getCause());
                    sb.append(C4664b4.j.e);
                    return;
                } catch (Exception e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    sb.append(" thrown from get()]");
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
        if (v == null) {
            sb.append("null");
        } else if (v == this) {
            sb.append("this future");
        } else {
            sb.append(v.getClass().getName());
            sb.append(UserDetailsUtils.UserDetailsLiterals.AT);
            sb.append(Integer.toHexString(System.identityHashCode(v)));
        }
        sb.append(C4664b4.j.e);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof w34;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.a;
        return (obj != null) & g(obj);
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.a instanceof w34) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof x34) {
                sb.append(", setFuture=[");
                zzdc zzdcVar = ((x34) obj).b;
                try {
                    if (zzdcVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(zzdcVar);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append(C4664b4.j.e);
            } else {
                try {
                    strConcat = e();
                    if (strConcat == null || strConcat.isEmpty()) {
                        strConcat = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    h50.x(", info=[", strConcat, sb, C4664b4.j.e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                i(sb);
            }
        }
        sb.append(C4664b4.j.e);
        return sb.toString();
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            n44.e.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", pv1.o("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        m44 m44Var = m44.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & g(obj2)) {
                return d(obj2);
            }
            m44 m44Var2 = this.c;
            if (m44Var2 != m44Var) {
                m44 m44Var3 = new m44();
                do {
                    uu uuVar = n44.g;
                    uuVar.R(m44Var3, m44Var2);
                    if (uuVar.W(this, m44Var2, m44Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                c(m44Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & g(obj)));
                        return d(obj);
                    }
                    m44Var2 = this.c;
                } while (m44Var2 != m44Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return d(obj3);
        }
        throw new InterruptedException();
    }
}
