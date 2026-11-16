package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfvh {
    public final Object a;
    public final long b;
    public final Clock c;
    public final long d;
    public final double e;
    public final int f;

    public final long a() {
        return this.d - (this.c.currentTimeMillis() - this.b);
    }

    public zzfvh(Object obj, Clock clock, double d, int i) {
        if (clock != null) {
            this.a = obj;
            this.c = clock;
            this.b = clock.currentTimeMillis();
            this.d = Math.min(Math.max(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjr.g0)).longValue() * 1000, 10000L), 21600000L);
            this.e = d;
            this.f = i;
            return;
        }
        defpackage.d.r("Clock cannot be null.");
        throw null;
    }
}
