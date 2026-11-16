package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzhea extends zzgys implements Future {
    @Override // com.google.android.gms.internal.ads.zzgys
    public /* bridge */ /* synthetic */ Object c() {
        throw null;
    }

    public abstract Future d();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return d().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return d().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return d().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return d().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return d().get(j, timeUnit);
    }
}
