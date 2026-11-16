package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfn {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public final synchronized long a() {
        long j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void b(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long jW = zzfq.w(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + jW) / 8589934592L;
                long j4 = (((-1) + j3) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - jW) < Math.abs(j5 - jW) ? j4 : j5;
            }
            return e(zzfq.w(j, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long jW = zzfq.w(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = jW / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= jW ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            return e(zzfq.w(j, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long e(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.b != -9223372036854775807L)) {
                    long jLongValue = this.a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l = (Long) this.d.get();
                        if (l == null) {
                            throw null;
                        }
                        jLongValue = l.longValue();
                    }
                    this.b = jLongValue - j;
                    notifyAll();
                }
                this.c = j;
                j2 = j + this.b;
            }
            return j2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public zzfn() {
        b(0L);
    }
}
