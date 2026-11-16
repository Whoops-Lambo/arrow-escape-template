package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.vg4;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcvx implements zzbgl {
    public final ScheduledExecutorService a;
    public final Clock b;
    public ScheduledFuture c;
    public long d = -1;
    public long e = -1;
    public vg4 f = null;
    public boolean g = false;

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zza(boolean z) {
        ScheduledFuture scheduledFuture;
        if (z) {
            synchronized (this) {
                try {
                    if (this.g) {
                        if (this.e > 0 && (scheduledFuture = this.c) != null && scheduledFuture.isCancelled()) {
                            this.c = this.a.schedule(this.f, this.e, TimeUnit.MILLISECONDS);
                        }
                        this.g = false;
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this) {
            try {
                if (this.g) {
                    return;
                }
                ScheduledFuture scheduledFuture2 = this.c;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.e = -1L;
                } else {
                    this.c.cancel(true);
                    this.e = this.d - this.b.elapsedRealtime();
                }
                this.g = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public zzcvx(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.a = scheduledExecutorService;
        this.b = clock;
        com.google.android.gms.ads.internal.zzt.zzg().b(this);
    }
}
