package com.google.android.gms.internal.ads;

import defpackage.bd4;
import defpackage.ci4;
import defpackage.o24;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzfpz implements zzbgl {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final HashMap c = new HashMap();
    public boolean d = false;

    public final synchronized void a(long j, Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (!this.d) {
                    com.google.android.gms.ads.internal.zzt.zzg().b(this);
                    this.d = true;
                }
                ci4 ci4Var = new ci4(this, runnable, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + j);
                ScheduledFuture<?> scheduledFutureSchedule = this.a.schedule(new bd4(ci4Var, 14), j, timeUnit);
                ci4Var.c = scheduledFutureSchedule;
                this.c.put(scheduledFutureSchedule, ci4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zza(boolean z) {
        if (z) {
            this.b.execute(new bd4(this, 15));
        }
    }

    public zzfpz(ScheduledExecutorService scheduledExecutorService, o24 o24Var) {
        this.a = scheduledExecutorService;
        this.b = o24Var;
    }
}
