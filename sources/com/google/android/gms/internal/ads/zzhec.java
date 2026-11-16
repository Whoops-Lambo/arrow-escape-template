package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzhec extends zzhea implements ListenableFuture {
    @Override // com.google.android.gms.internal.ads.zzhea
    public /* bridge */ /* synthetic */ Future d() {
        throw null;
    }

    public abstract ListenableFuture e();

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        e().addListener(runnable, executor);
    }
}
