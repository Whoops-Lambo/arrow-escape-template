package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zq0 extends sq0 {
    public final ListenableFuture i;

    @Override // defpackage.c1, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.i.addListener(runnable, executor);
    }

    @Override // defpackage.c1, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.i.cancel(z);
    }

    @Override // defpackage.c1, java.util.concurrent.Future
    public final Object get() {
        return this.i.get();
    }

    @Override // defpackage.c1, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.i.isCancelled();
    }

    @Override // defpackage.c1, java.util.concurrent.Future
    public final boolean isDone() {
        return this.i.isDone();
    }

    @Override // defpackage.c1
    public final String toString() {
        return this.i.toString();
    }

    public zq0(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.i = listenableFuture;
    }

    @Override // defpackage.c1, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.i.get(j, timeUnit);
    }
}
