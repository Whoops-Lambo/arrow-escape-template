package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class zzahq implements zzahr {
    public final long a;
    public final zzahp b;

    @Override // com.google.android.gms.internal.ads.zzahr
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final zzahp a(long j) {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zza() {
        return this.a;
    }

    public zzahq(long j, long j2) {
        zzahs zzahsVar;
        this.a = j;
        if (j2 == 0) {
            zzahsVar = zzahs.c;
        } else {
            zzahsVar = new zzahs(0L, j2);
        }
        this.b = new zzahp(zzahsVar, zzahsVar);
    }
}
