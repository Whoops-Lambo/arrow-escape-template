package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import defpackage.h50;
import defpackage.nj;
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
/* JADX INFO: loaded from: classes5.dex */
@RestrictTo
public abstract class AbstractFuture<V> implements ListenableFuture {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(AbstractFuture.class.getName());
    public static final AtomicHelper f;
    public static final Object g;
    public volatile Object a;
    public volatile Listener b;
    public volatile Waiter c;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class AtomicHelper {
        public abstract boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2);

        public abstract boolean b(AbstractFuture abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2);

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
            if (AbstractFuture.d) {
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
    public static final class SafeAtomicHelper extends AtomicHelper {
        public final AtomicReferenceFieldUpdater a;
        public final AtomicReferenceFieldUpdater b;
        public final AtomicReferenceFieldUpdater c;
        public final AtomicReferenceFieldUpdater d;
        public final AtomicReferenceFieldUpdater e;

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, listener, listener2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == listener);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, waiter, waiter2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == waiter);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            this.b.lazySet(waiter, waiter2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
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
        public final SettableFuture a;
        public final ListenableFuture b;

        @Override // java.lang.Runnable
        public final void run() {
            if (this.a.a != this) {
                return;
            }
            if (AbstractFuture.f.b(this.a, this, AbstractFuture.f(this.b))) {
                AbstractFuture.c(this.a);
            }
        }

        public SetFuture(SettableFuture settableFuture, ListenableFuture listenableFuture) {
            this.a = settableFuture;
            this.b = listenableFuture;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class SynchronizedHelper extends AtomicHelper {
        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean a(AbstractFuture abstractFuture, Listener listener, Listener listener2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.b != listener) {
                        return false;
                    }
                    abstractFuture.b = listener2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean b(AbstractFuture abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.a != obj) {
                        return false;
                    }
                    abstractFuture.a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final boolean c(AbstractFuture abstractFuture, Waiter waiter, Waiter waiter2) {
            synchronized (abstractFuture) {
                try {
                    if (abstractFuture.c != waiter) {
                        return false;
                    }
                    abstractFuture.c = waiter2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void d(Waiter waiter, Waiter waiter2) {
            waiter.b = waiter2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.AtomicHelper
        public final void e(Waiter waiter, Thread thread) {
            waiter.a = thread;
        }
    }

    public static void c(AbstractFuture abstractFuture) {
        Listener listener;
        Listener listener2;
        Listener listener3 = null;
        while (true) {
            Waiter waiter = abstractFuture.c;
            if (f.c(abstractFuture, waiter, Waiter.c)) {
                while (waiter != null) {
                    Thread thread = waiter.a;
                    if (thread != null) {
                        waiter.a = null;
                        LockSupport.unpark(thread);
                    }
                    waiter = waiter.b;
                }
                do {
                    listener = abstractFuture.b;
                } while (!f.a(abstractFuture, listener, Listener.d));
                while (true) {
                    listener2 = listener3;
                    listener3 = listener;
                    if (listener3 == null) {
                        break;
                    }
                    listener = listener3.c;
                    listener3.c = listener2;
                }
                while (listener2 != null) {
                    listener3 = listener2.c;
                    Runnable runnable = listener2.a;
                    if (runnable instanceof SetFuture) {
                        SetFuture setFuture = (SetFuture) runnable;
                        abstractFuture = setFuture.a;
                        if (abstractFuture.a == setFuture) {
                            if (f.b(abstractFuture, setFuture, f(setFuture.b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, listener2.b);
                    }
                    listener2 = listener3;
                }
                return;
            }
        }
    }

    public final void h(Waiter waiter) {
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
    public static final class Failure {
        public static final Failure b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.work.impl.utils.futures.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        public final Throwable a;

        public Failure(Throwable th) {
            boolean z = AbstractFuture.d;
            th.getClass();
            this.a = th;
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
            AbstractFuture.f.e(this, Thread.currentThread());
        }
    }

    static {
        AtomicHelper synchronizedHelper;
        try {
            synchronizedHelper = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
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

    public static Object e(Object obj) throws ExecutionException {
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

    public static Object f(ListenableFuture listenableFuture) {
        Object obj;
        if (listenableFuture instanceof AbstractFuture) {
            Object obj2 = ((AbstractFuture) listenableFuture).a;
            if (!(obj2 instanceof Cancellation)) {
                return obj2;
            }
            Cancellation cancellation = (Cancellation) obj2;
            if (cancellation.a) {
                return cancellation.b != null ? new Cancellation(cancellation.b, false) : Cancellation.d;
            }
            return obj2;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!d) && zIsCancelled) {
            return Cancellation.d;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (CancellationException e2) {
                    if (zIsCancelled) {
                        return new Cancellation(e2, false);
                    }
                    return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
                } catch (ExecutionException e3) {
                    return new Failure(e3.getCause());
                } catch (Throwable th) {
                    return new Failure(th);
                }
            } catch (InterruptedException unused) {
                z2 = z;
            } catch (Throwable th2) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? g : obj;
    }

    public final void b(StringBuilder sb) {
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
    public final boolean cancel(boolean z) {
        Cancellation cancellation;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof SetFuture)) {
            return false;
        }
        if (d) {
            cancellation = new Cancellation(new CancellationException("Future.cancel() was called."), z);
        } else {
            cancellation = z ? Cancellation.c : Cancellation.d;
        }
        boolean z2 = false;
        while (true) {
            if (f.b(this, obj, cancellation)) {
                c(this);
                if (!(obj instanceof SetFuture)) {
                    break;
                }
                ListenableFuture listenableFuture = ((SetFuture) obj).b;
                if (!(listenableFuture instanceof AbstractFuture)) {
                    listenableFuture.cancel(z);
                    break;
                }
                this = (AbstractFuture) listenableFuture;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof SetFuture)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof SetFuture)) {
                    return z2;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.a;
        if (obj instanceof SetFuture) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ListenableFuture listenableFuture = ((SetFuture) obj).b;
            return nj.q(sb, listenableFuture == this ? "this future" : String.valueOf(listenableFuture), C4664b4.j.e);
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
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
            return e(obj);
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
                                h(waiter3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if ((obj2 != null) && (!(obj2 instanceof SetFuture))) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(waiter3);
                        break;
                    }
                    waiter2 = this.c;
                    if (waiter2 == waiter) {
                    }
                }
            }
            return e(this.a);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.a;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof SetFuture))) {
                return e(obj3);
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.a;
        return (!(obj instanceof SetFuture)) & (obj != null);
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof Cancellation) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e2) {
                strG = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                h50.x("PENDING, info=[", strG, sb, C4664b4.j.e);
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(C4664b4.j.e);
        return sb.toString();
    }

    public static void d(Runnable runnable, Executor executor) {
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
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        Waiter waiter = Waiter.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof SetFuture))) {
                return e(obj2);
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
                                h(waiter3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof SetFuture))));
                        return e(obj);
                    }
                    waiter2 = this.c;
                } while (waiter2 != waiter);
            }
            return e(this.a);
        }
        throw new InterruptedException();
    }
}
