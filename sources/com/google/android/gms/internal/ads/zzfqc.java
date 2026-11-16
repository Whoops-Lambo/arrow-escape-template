package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.singular.sdk.internal.UserDetailsUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfqc implements ListenableFuture {
    public final Object a;
    public final String b;
    public final ListenableFuture c;

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.c.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c.isDone();
    }

    public zzfqc(ListenableFuture listenableFuture, Object obj, String str) {
        this.a = obj;
        this.b = str;
        this.c = listenableFuture;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb.append(str);
        sb.append(UserDetailsUtils.UserDetailsLiterals.AT);
        sb.append(iIdentityHashCode);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.c.get(j, timeUnit);
    }
}
