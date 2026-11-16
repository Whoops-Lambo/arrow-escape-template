package io.p071bidmachine.media3.exoplayer.util;

import io.p071bidmachine.media3.exoplayer.analytics.d;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ d b;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    public a(ExecutorService executorService, d dVar) {
        this.a = executorService;
        this.b = dVar;
    }
}
