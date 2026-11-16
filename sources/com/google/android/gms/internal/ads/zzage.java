package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class zzage implements zzahr {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    @Override // com.google.android.gms.internal.ads.zzahr
    public zzahp a(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1) {
            zzahs zzahsVar = new zzahs(0L, j3);
            return new zzahp(zzahsVar, zzahsVar);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i);
        zzahs zzahsVar2 = new zzahs(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new zzahp(zzahsVar2, new zzahs((Math.max(0L, j5 - j3) * 8000000) / ((long) i), j5));
            }
        }
        return new zzahp(zzahsVar2, zzahsVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public long zza() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final boolean zzb() {
        return this.d != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final boolean zzm() {
        return this.g;
    }

    public zzage(long j, long j2, int i, int i2, boolean z) {
        long jMax;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            jMax = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            jMax = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
        this.f = jMax;
    }
}
