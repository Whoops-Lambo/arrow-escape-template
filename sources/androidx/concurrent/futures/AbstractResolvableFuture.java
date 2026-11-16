package androidx.concurrent.futures;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import defpackage.h50;
import defpackage.pv1;
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
/* JADX INFO: loaded from: classes3.dex */
@RestrictTo
public abstract class AbstractResolvableFuture<V> implements ListenableFuture {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(AbstractResolvableFuture.class.getName());
    public static final AtomicHelper f;
    public static final Object g;
    public volatile Object a;
    public volatile Listener b;
    public volatile Waiter c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class AtomicHelper {
        public abstract boolean a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2);

        public abstract boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2);

        public abstract void d(Waiter waiter, Waiter waiter2);

        public abstract void e(Waiter waiter, Thread thread);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Cancellation {
        public static final Cancellation c;
        public static final Cancellation d;
        public final boolean a;
        public final Throwable b;

        static {
            if (AbstractResolvableFuture.d) {
                d = null;
                c = null;
            } else {
                d = new Cancellation(null, false);
                c = new Cancellation(null, true);
            }
        }

        public Cancellation(Throwable th, boolean z) {
            this.a = z;
            this.b = th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Failure {
        public final Throwable a;

        static {
            new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
                @Override // java.lang.Throwable
                public synchronized Throwable fillInStackTrace() {
                    return this;
                }
            });
        }

        public Failure(Throwable th) {
            boolean z = AbstractResolvableFuture.d;
            th.getClass();
            this.a = th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class SafeAtomicHelper extends AtomicHelper {
        public final AtomicReferenceFieldUpdater a;
        public final AtomicReferenceFieldUpdater b;
        public final AtomicReferenceFieldUpdater c;
        public final AtomicReferenceFieldUpdater d;
        public final AtomicReferenceFieldUpdater e;

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, listener, listener2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == listener);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, waiter, waiter2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == waiter);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            this.b.lazySet(waiter, waiter2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            this.a.lazySet(waiter, thread);
        }

        public SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class SetFuture<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class SynchronizedHelper extends AtomicHelper {
        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean a(AbstractResolvableFuture abstractResolvableFuture, Listener listener, Listener listener2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.b != listener) {
                        return false;
                    }
                    abstractResolvableFuture.b = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean b(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.a != obj) {
                        return false;
                    }
                    abstractResolvableFuture.a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final boolean c(AbstractResolvableFuture abstractResolvableFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractResolvableFuture) {
                try {
                    if (abstractResolvableFuture.c != waiter) {
                        return false;
                    }
                    abstractResolvableFuture.c = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            waiter.b = waiter2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            waiter.a = thread;
        }
    }

    public static Object g(AbstractResolvableFuture abstractResolvableFuture) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractResolvableFuture.get();
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

    public void c() {
    }

    public final void i(Waiter waiter) {
        waiter.a = null;
        while (true) {
            Waiter waiter2 = this.c;
            if (waiter2 == Waiter.c) {
                return;
            }
            Waiter waiter3 = null;
            while (waiter2 != null) {
                Waiter waiter4 = waiter2.b;
                if (waiter2.a != null) {
                    waiter3 = waiter2;
                } else if (waiter3 != null) {
                    waiter3.b = waiter4;
                    if (waiter3.a == null) {
                    }
                } else if (!f.c(this, waiter2, waiter4)) {
                }
                waiter2 = waiter4;
            }
            return;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Listener {
        public static final Listener d = new Listener(null, null);
        public final Runnable a;
        public final Executor b;
        public Listener c;

        public Listener(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Waiter {
        public static final Waiter c = new Waiter();
        public volatile Thread a;
        public volatile Waiter b;

        public Waiter() {
            AbstractResolvableFuture.f.e(this, Thread.currentThread());
        }
    }

    static {
        AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Waiter.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Listener.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            synchronizedHelper = new SynchronizedHelper();
        }
        f = synchronizedHelper;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void d(AbstractResolvableFuture abstractResolvableFuture) {
        Waiter waiter;
        Listener listener;
        do {
            waiter = abstractResolvableFuture.c;
        } while (!f.c(abstractResolvableFuture, waiter, Waiter.c));
        while (waiter != null) {
            Thread thread = waiter.a;
            if (thread != null) {
                waiter.a = null;
                LockSupport.unpark(thread);
            }
            waiter = waiter.b;
        }
        abstractResolvableFuture.c();
        do {
            listener = abstractResolvableFuture.b;
        } while (!f.a(abstractResolvableFuture, listener, Listener.d));
        Listener listener2 = null;
        while (listener != null) {
            Listener listener3 = listener.c;
            listener.c = listener2;
            listener2 = listener;
            listener = listener3;
        }
        while (listener2 != null) {
            Listener listener4 = listener2.c;
            Runnable runnable = listener2.a;
            if (runnable instanceof SetFuture) {
                throw null;
            }
            e(runnable, listener2.b);
            listener2 = listener4;
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof Cancellation) {
            Throwable th = ((Cancellation) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public final void b(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append(C4664b4.j.e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(C4664b4.j.e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Cancellation cancellation;
        Object obj = this.a;
        if ((obj == null) | (obj instanceof SetFuture)) {
            if (d) {
                cancellation = new Cancellation(new CancellationException("Future.cancel() was called."), z);
            } else {
                cancellation = z ? Cancellation.c : Cancellation.d;
            }
            while (!f.b(this, obj, cancellation)) {
                obj = this.a;
                if (!(obj instanceof SetFuture)) {
                }
            }
            d(this);
            if (obj instanceof SetFuture) {
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        Waiter waiter = Waiter.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if ((obj != null) && (!(obj instanceof SetFuture))) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            Waiter waiter2 = this.c;
            if (waiter2 != waiter) {
                Waiter waiter3 = new Waiter();
                z = true;
                while (true) {
                    AtomicHelper atomicHelper = f;
                    atomicHelper.d(waiter3, waiter2);
                    if (atomicHelper.c(this, waiter2, waiter3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(waiter3);
                        break;
                    }
                    waiter2 = this.c;
                    if (waiter2 == waiter) {
                    }
                }
            }
            return f(this.a);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.a;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof SetFuture))) {
                return f(obj3);
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
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (this.a instanceof SetFuture) {
            return pv1.n("setFuture=[", "null", C4664b4.j.e);
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.a;
        return (!(obj instanceof SetFuture)) & (obj != null);
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.b(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!f.b(this, null, new Failure(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final boolean l() {
        Object obj = this.a;
        return (obj instanceof Cancellation) && ((Cancellation) obj).a;
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof Cancellation) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e2) {
                strH = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                h50.x("PENDING, info=[", strH, sb, C4664b4.j.e);
            } else if (isDone()) {
                b(sb);
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
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        executor.getClass();
        Listener listener = this.b;
        Listener listener2 = Listener.d;
        if (listener != listener2) {
            Listener listener3 = new Listener(runnable, executor);
            do {
                listener3.c = listener;
                if (f.a(this, listener, listener3)) {
                    return;
                } else {
                    listener = this.b;
                }
            } while (listener != listener2);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        Waiter waiter = Waiter.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return f(obj2);
            }
            Waiter waiter2 = this.c;
            if (waiter2 != waiter) {
                Waiter waiter3 = new Waiter();
                do {
                    AtomicHelper atomicHelper = f;
                    atomicHelper.d(waiter3, waiter2);
                    if (atomicHelper.c(this, waiter2, waiter3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(waiter3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return f(obj);
                    }
                    waiter2 = this.c;
                } while (waiter2 != waiter);
            }
            return f(this.a);
        }
        throw new InterruptedException();
    }
}
