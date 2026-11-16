package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.uy3;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfur {
    public final long a;
    public final long b;
    public final Clock f;
    public final zzfuy g;
    public long h;
    public long d = 5;
    public long e = 0;
    public final Random i = new Random();
    public long c = 0;

    public final synchronized void a() {
        this.h = this.a;
        this.c = 0L;
        this.e = 0L;
    }

    public final synchronized long b() {
        long j;
        long j2;
        double d = this.h;
        double d2 = 0.2d * d;
        j = (long) (d + d2);
        j2 = (long) (d - d2);
        return j2 + ((long) (this.i.nextDouble() * ((j - j2) + 1)));
    }

    public final synchronized void c() {
        long jB = b();
        Clock clock = this.f;
        this.e = clock.currentTimeMillis() + jB;
        double d = this.h;
        long j = this.b;
        this.h = Math.min((long) (d + d), j);
        this.c++;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.M)).booleanValue()) {
            this.g.e(clock.currentTimeMillis(), this.c, this.h, this.d, j);
        }
    }

    public final synchronized boolean d() {
        uy3 uy3Var = zzbjr.N;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).intValue() < 0) {
            return false;
        }
        return this.c > Math.max(this.d, (long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(uy3Var)).intValue()) && this.h >= this.b;
    }

    public zzfur(long j, long j2, Clock clock, zzfuy zzfuyVar) {
        this.a = j;
        this.b = j2;
        this.g = zzfuyVar;
        this.f = clock;
        a();
    }
}
