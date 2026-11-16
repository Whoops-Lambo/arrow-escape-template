package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Future {
    public static final String b = "b";
    public final Future a;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Future future = this.a;
        if (future != null) {
            return future.cancel(z);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Future future = this.a;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Future future = this.a;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    public b(Future future) {
        this.a = future;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        try {
            Future future = this.a;
            if (future == null) {
                return null;
            }
            return future.get(j, timeUnit);
        } catch (InterruptedException unused) {
            boolean z = u.a;
            String str = b;
            str.getClass();
            t.c(str, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            boolean z2 = u.a;
            String str2 = b;
            str2.getClass();
            t.a(str2, "error on execution", e);
            return null;
        } catch (TimeoutException e2) {
            boolean z3 = u.a;
            String str3 = b;
            str3.getClass();
            t.a(str3, "error on timeout", e2);
            t.c(str3, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            Future future = this.a;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            boolean z = u.a;
            String str = b;
            str.getClass();
            t.c(str, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            boolean z2 = u.a;
            String str2 = b;
            str2.getClass();
            t.a(str2, "error on execution", e);
            return null;
        }
    }
}
