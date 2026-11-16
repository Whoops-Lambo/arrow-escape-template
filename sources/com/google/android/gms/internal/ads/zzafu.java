package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzafu implements zzahr {
    public final zzafx a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    @Override // com.google.android.gms.internal.ads.zzahr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final zzahp a(long j) {
        zzahs zzahsVar = new zzahs(j, zzafw.a(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new zzahp(zzahsVar, zzahsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zza() {
        return this.b;
    }

    public zzafu(zzafx zzafxVar, long j, long j2, long j3, long j4, long j5) {
        this.a = zzafxVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }
}
