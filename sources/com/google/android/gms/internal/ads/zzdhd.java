package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.o44;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzdhd extends zzdka {
    public final ScheduledExecutorService b;
    public final Clock c;
    public final zzeaw d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public ScheduledFuture j;
    public ScheduledFuture k;

    public final synchronized void l0(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
        sb.append("In scheduleRefresh: ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.i) {
                long j = this.g;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.g = millis;
                return;
            }
            long jElapsedRealtime = this.c.elapsedRealtime();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.of)).booleanValue();
            long j2 = this.e;
            if (zBooleanValue) {
                if (jElapsedRealtime >= j2 || j2 - jElapsedRealtime > millis) {
                    o0(millis);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.Lf)).booleanValue()) {
                        zzeav zzeavVarA = this.d.a();
                        zzeavVarA.b("action", "rtnc");
                        zzeavVarA.e();
                    }
                }
            } else if (jElapsedRealtime > j2 || j2 - jElapsedRealtime > millis) {
                o0(millis);
            }
        }
    }

    public final synchronized void n0(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 28);
        sb.append("In scheduleShowRefreshedAd: ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.i) {
                long j = this.h;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.h = millis;
                return;
            }
            long jElapsedRealtime = this.c.elapsedRealtime();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.of)).booleanValue();
            long j2 = this.f;
            if (zBooleanValue) {
                if (jElapsedRealtime == j2) {
                    com.google.android.gms.ads.internal.util.zze.zza("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j3 = this.f;
                if (jElapsedRealtime >= j3 || j3 - jElapsedRealtime > millis) {
                    p0(millis);
                }
            } else if (jElapsedRealtime > j2 || j2 - jElapsedRealtime > millis) {
                p0(millis);
            }
        }
    }

    public final synchronized void o0(long j) {
        try {
            ScheduledFuture scheduledFuture = this.j;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.j.cancel(false);
            }
            this.e = this.c.elapsedRealtime() + j;
            this.j = this.b.schedule(new o44(this, 1), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void p0(long j) {
        try {
            ScheduledFuture scheduledFuture = this.k;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.k.cancel(false);
            }
            this.f = this.c.elapsedRealtime() + j;
            this.k = this.b.schedule(new o44(this, 2), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        this.i = false;
        o0(0L);
    }

    public zzdhd(ScheduledExecutorService scheduledExecutorService, Clock clock, zzeaw zzeawVar) {
        super(Collections.EMPTY_SET);
        this.e = -1L;
        this.f = -1L;
        this.g = -1L;
        this.h = -1L;
        this.i = false;
        this.b = scheduledExecutorService;
        this.c = clock;
        this.d = zzeawVar;
    }
}
