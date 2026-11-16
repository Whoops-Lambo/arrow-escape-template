package com.ironsource;

import defpackage.sj0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Q5 implements Hf {

    @NotNull
    private final ScheduledExecutorService a;

    public Q5(@NotNull ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // com.ironsource.Hf
    @NotNull
    public Hf.a a(long j, @NotNull Runnable runnable) {
        runnable.getClass();
        return new sj0(this.a.schedule(runnable, j, TimeUnit.MILLISECONDS), 21);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ScheduledFuture scheduledFuture) {
        scheduledFuture.cancel(false);
    }
}
