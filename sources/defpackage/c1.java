package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import com.singular.sdk.internal.UserDetailsUtils;
import java.util.Locale;
import java.util.Objects;
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
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 implements ListenableFuture {
    public static final boolean d;
    public static final ld1 e;
    public static final l7 f;
    public static final Object g;
    public volatile Object a;
    public volatile q0 b;
    public volatile b1 c;

    public static void f(c1 c1Var, boolean z) {
        q0 q0Var = null;
        while (true) {
            for (b1 b1VarM = f.m(c1Var); b1VarM != null; b1VarM = b1VarM.b) {
                Thread thread = b1VarM.a;
                if (thread != null) {
                    b1VarM.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                c1Var.j();
                z = false;
            }
            c1Var.d();
            q0 q0Var2 = q0Var;
            q0 q0VarL = f.l(c1Var);
            q0 q0Var3 = q0Var2;
            while (q0VarL != null) {
                q0 q0Var4 = q0VarL.c;
                q0VarL.c = q0Var3;
                q0Var3 = q0VarL;
                q0VarL = q0Var4;
            }
            while (q0Var3 != null) {
                q0Var = q0Var3.c;
                Runnable runnable = q0Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof s0) {
                    s0 s0Var = (s0) runnable;
                    c1Var = s0Var.a;
                    if (c1Var.a == s0Var) {
                        if (f.c(c1Var, s0Var, i(s0Var.b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = q0Var3.b;
                    Objects.requireNonNull(executor);
                    g(runnable, executor);
                }
                q0Var3 = q0Var;
            }
            return;
        }
    }

    public void d() {
    }

    public void j() {
    }

    public final void l(b1 b1Var) {
        b1Var.a = null;
        while (true) {
            b1 b1Var2 = this.c;
            if (b1Var2 == b1.c) {
                return;
            }
            b1 b1Var3 = null;
            while (b1Var2 != null) {
                b1 b1Var4 = b1Var2.b;
                if (b1Var2.a != null) {
                    b1Var3 = b1Var2;
                } else if (b1Var3 != null) {
                    b1Var3.b = b1Var4;
                    if (b1Var3.a == null) {
                    }
                } else if (!f.d(this, b1Var2, b1Var4)) {
                }
                b1Var2 = b1Var4;
            }
            return;
        }
    }

    static {
        boolean z;
        Throwable th;
        l7 t0Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new ld1(0, c1.class);
        Throwable th2 = null;
        try {
            t0Var = new a1();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                t0Var = new r0(AtomicReferenceFieldUpdater.newUpdater(b1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(b1.class, b1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(c1.class, b1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(c1.class, q0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(c1.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th2 = e3;
                t0Var = new t0();
            }
        }
        f = t0Var;
        if (th2 != null) {
            ld1 ld1Var = e;
            Logger loggerA = ld1Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            ld1Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        g = new Object();
    }

    public static Object h(Object obj) throws ExecutionException {
        if (obj instanceof n0) {
            Throwable th = ((n0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof p0) {
            throw new ExecutionException(((p0) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object i(ListenableFuture listenableFuture) {
        Object obj;
        Throwable thP;
        if (listenableFuture instanceof u0) {
            Object n0Var = ((c1) listenableFuture).a;
            if (n0Var instanceof n0) {
                n0 n0Var2 = (n0) n0Var;
                if (n0Var2.a) {
                    n0Var = n0Var2.b != null ? new n0(n0Var2.b, false) : n0.d;
                }
            }
            Objects.requireNonNull(n0Var);
            return n0Var;
        }
        if ((listenableFuture instanceof c1) && (thP = ((c1) listenableFuture).p()) != null) {
            return new p0(thP);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!d) && zIsCancelled) {
            n0 n0Var3 = n0.d;
            Objects.requireNonNull(n0Var3);
            return n0Var3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error | Exception e2) {
                        e = e2;
                        return new p0(e);
                    } catch (CancellationException e3) {
                        if (zIsCancelled) {
                            return new n0(e3, false);
                        }
                        return new p0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e3));
                    } catch (ExecutionException e4) {
                        if (!zIsCancelled) {
                            return new p0(e4.getCause());
                        }
                        return new n0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e4), false);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e5) {
                e = e5;
                return new p0(e);
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? g : obj;
        }
        return new n0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        q0 q0Var;
        q0 q0Var2 = q0.d;
        fs1.k(executor, "Executor was null.");
        if (!isDone() && (q0Var = this.b) != q0Var2) {
            q0 q0Var3 = new q0(runnable, executor);
            do {
                q0Var3.c = q0Var;
                if (f.b(this, q0Var, q0Var3)) {
                    return;
                } else {
                    q0Var = this.b;
                }
            } while (q0Var != q0Var2);
        }
        g(runnable, executor);
    }

    public final void c(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append(C4664b4.j.e);
                    return;
                } catch (Exception e3) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e3.getClass());
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
        e(sb, obj);
        sb.append(C4664b4.j.e);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        n0 n0Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof s0)) {
            return false;
        }
        if (d) {
            n0Var = new n0(new CancellationException("Future.cancel() was called."), z);
        } else {
            n0Var = z ? n0.c : n0.d;
            Objects.requireNonNull(n0Var);
        }
        boolean z2 = false;
        while (true) {
            if (f.c(this, obj, n0Var)) {
                f(this, z);
                if (obj instanceof s0) {
                    ListenableFuture listenableFuture = ((s0) obj).b;
                    if (listenableFuture instanceof u0) {
                        this = (c1) listenableFuture;
                        obj = this.a;
                        if ((obj == null) | (obj instanceof s0)) {
                            z2 = true;
                        }
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = this.a;
            if (!(obj instanceof s0)) {
                return z2;
            }
        }
    }

    public final void e(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append(UserDetailsUtils.UserDetailsLiterals.AT);
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        b1 b1Var = b1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof s0))) {
            return h(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            b1 b1Var2 = this.c;
            if (b1Var2 != b1Var) {
                b1 b1Var3 = new b1();
                z = true;
                while (true) {
                    l7 l7Var = f;
                    l7Var.s(b1Var3, b1Var2);
                    if (l7Var.d(this, b1Var2, b1Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                l(b1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof s0))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        l(b1Var3);
                        break;
                    }
                    long j4 = j3;
                    b1Var2 = this.c;
                    if (b1Var2 != b1Var) {
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.a;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof s0))) {
                return h(obj4);
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
        StringBuilder sbO = h50.o(j, "Waited ", " ");
        sbO.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbO.toString();
        if (nanos + 1000 < j2) {
            String strConcat = string3.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z2) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(h50.i(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof n0;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.a;
        return (!(obj instanceof s0)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String k() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean m(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.c(this, null, obj)) {
            return false;
        }
        f(this, false);
        return true;
    }

    public boolean n(Throwable th) {
        th.getClass();
        if (!f.c(this, null, new p0(th))) {
            return false;
        }
        f(this, false);
        return true;
    }

    public final Throwable p() {
        if (!(this instanceof u0)) {
            return null;
        }
        Object obj = this.a;
        if (obj instanceof p0) {
            return ((p0) obj).a;
        }
        return null;
    }

    public final boolean q() {
        Object obj = this.a;
        return (obj instanceof n0) && ((n0) obj).a;
    }

    public String toString() {
        String strK;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            c(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.a;
            if (obj instanceof s0) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((s0) obj).b;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append(C4664b4.j.e);
            } else {
                try {
                    strK = k();
                    if (h00.s(strK)) {
                        strK = null;
                    }
                } catch (Exception | StackOverflowError e4) {
                    strK = "Exception thrown from implementation: " + e4.getClass();
                }
                if (strK != null) {
                    h50.x(", info=[", strK, sb, C4664b4.j.e);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                c(sb);
            }
        }
        sb.append(C4664b4.j.e);
        return sb.toString();
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean o(ListenableFuture listenableFuture) {
        p0 p0Var;
        listenableFuture.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (f.c(this, null, i(listenableFuture))) {
                    f(this, false);
                    return true;
                }
            } else {
                s0 s0Var = new s0(this, listenableFuture);
                if (f.c(this, null, s0Var)) {
                    try {
                        listenableFuture.addListener(s0Var, gc0.a);
                        return true;
                    } catch (Throwable th) {
                        try {
                            p0Var = new p0(th);
                        } catch (Error | Exception unused) {
                            p0Var = p0.b;
                        }
                        f.c(this, s0Var, p0Var);
                        return true;
                    }
                }
                obj = this.a;
                if (obj instanceof n0) {
                    listenableFuture.cancel(((n0) obj).a);
                }
            }
        } else if (obj instanceof n0) {
            listenableFuture.cancel(((n0) obj).a);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        b1 b1Var = b1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof s0))) {
                return h(obj2);
            }
            b1 b1Var2 = this.c;
            if (b1Var2 != b1Var) {
                b1 b1Var3 = new b1();
                do {
                    l7 l7Var = f;
                    l7Var.s(b1Var3, b1Var2);
                    if (l7Var.d(this, b1Var2, b1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                l(b1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof s0))));
                        return h(obj);
                    }
                    b1Var2 = this.c;
                } while (b1Var2 != b1Var);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        throw new InterruptedException();
    }
}
