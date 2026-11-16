package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4664b4;
import defpackage.jc1;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class CallbackToFutureAdapter {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Completer<T> {
        public Object a;
        public SafeFuture b;
        public ResolvableFuture c;
        public boolean d;

        public final void a(Object obj) {
            this.d = true;
            SafeFuture safeFuture = this.b;
            if (safeFuture == null || !safeFuture.b.j(obj)) {
                return;
            }
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public final void b() {
            this.d = true;
            SafeFuture safeFuture = this.b;
            if (safeFuture == null || !safeFuture.b.cancel(true)) {
                return;
            }
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public final void c(Throwable th) {
            this.d = true;
            SafeFuture safeFuture = this.b;
            if (safeFuture == null || !safeFuture.b.k(th)) {
                return;
            }
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public final void finalize() {
            ResolvableFuture resolvableFuture;
            SafeFuture safeFuture = this.b;
            if (safeFuture != null) {
                AbstractResolvableFuture abstractResolvableFuture = safeFuture.b;
                if (!abstractResolvableFuture.isDone()) {
                    abstractResolvableFuture.k(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
                }
            }
            if (this.d || (resolvableFuture = this.c) == null) {
                return;
            }
            resolvableFuture.j(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Resolver<T> {
        Object b(Completer completer);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class SafeFuture<T> implements ListenableFuture {
        public final WeakReference a;
        public final AbstractResolvableFuture b = new AbstractResolvableFuture<T>() { // from class: androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.1
            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public final String h() {
                Completer completer = (Completer) SafeFuture.this.a.get();
                return completer == null ? "Completer object has been garbage collected, future will fail soon" : jc1.p(new StringBuilder("tag=["), completer.a, C4664b4.j.e);
            }
        };

        @Override // com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            this.b.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            Completer completer = (Completer) this.a.get();
            boolean zCancel = this.b.cancel(z);
            if (zCancel && completer != null) {
                completer.a = null;
                completer.b = null;
                completer.c.j(null);
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            return this.b.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.b.a instanceof AbstractResolvableFuture.Cancellation;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.b.isDone();
        }

        public final String toString() {
            return this.b.toString();
        }

        public SafeFuture(Completer completer) {
            this.a = new WeakReference(completer);
        }

        @Override // java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return this.b.get(j, timeUnit);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class FutureGarbageCollectedException extends Throwable {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }

        public FutureGarbageCollectedException(String str) {
            super(str);
        }
    }

    public static ListenableFuture a(Resolver resolver) {
        Completer completer = new Completer();
        completer.c = new ResolvableFuture();
        SafeFuture safeFuture = new SafeFuture(completer);
        completer.b = safeFuture;
        completer.a = resolver.getClass();
        try {
            Object objB = resolver.b(completer);
            if (objB == null) {
                return safeFuture;
            }
            completer.a = objB;
            return safeFuture;
        } catch (Exception e) {
            safeFuture.b.k(e);
            return safeFuture;
        }
    }
}
