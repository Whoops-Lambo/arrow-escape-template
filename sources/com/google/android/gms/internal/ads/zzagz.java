package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzagz implements zzahr {
    public final zzahb a;
    public final long b;

    @Override // com.google.android.gms.internal.ads.zzahr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final zzahp a(long j) {
        zzahb zzahbVar = this.a;
        zzaha zzahaVar = zzahbVar.k;
        zzahaVar.getClass();
        String str = zzfq.a;
        long jMax = Math.max(0L, Math.min((((long) zzahbVar.e) * j) / 1000000, zzahbVar.j - 1));
        long[] jArr = zzahaVar.a;
        int iS = zzfq.s(jArr, jMax, false);
        long j2 = iS == -1 ? 0L : jArr[iS];
        long[] jArr2 = zzahaVar.b;
        long j3 = iS != -1 ? jArr2[iS] : 0L;
        int i = zzahbVar.e;
        long j4 = (j2 * 1000000) / ((long) i);
        long j5 = this.b;
        zzahs zzahsVar = new zzahs(j4, j3 + j5);
        if (j4 == j || iS == jArr.length - 1) {
            return new zzahp(zzahsVar, zzahsVar);
        }
        int i2 = iS + 1;
        return new zzahp(zzahsVar, new zzahs((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zza() {
        return this.a.a();
    }

    public zzagz(zzahb zzahbVar, long j) {
        this.a = zzahbVar;
        this.b = j;
    }
}
