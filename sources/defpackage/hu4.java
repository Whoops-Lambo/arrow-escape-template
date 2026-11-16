package defpackage;

import com.google.android.gms.internal.ads.zzhdy;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class hu4 extends zzhdy {
    public final ListenableFuture h;

    @Override // com.google.android.gms.internal.ads.zzhcz, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.h.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhcz, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.h.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzhcz, java.util.concurrent.Future
    public final Object get() {
        return this.h.get();
    }

    @Override // com.google.android.gms.internal.ads.zzhcz, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzhcz, java.util.concurrent.Future
    public final boolean isDone() {
        return this.h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhcz
    public final String toString() {
        return this.h.toString();
    }

    public hu4(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.h = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhcz, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.h.get(j, timeUnit);
    }
}
