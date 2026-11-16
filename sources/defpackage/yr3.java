package defpackage;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzfq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yr3 implements ds3 {
    public final long[] a;
    public final long[] b;
    public final long c;

    public static Pair c(long j, long[] jArr, long[] jArr2) {
        int iS = zzfq.s(jArr, j, true);
        long j2 = jArr[iS];
        long j3 = jArr2[iS];
        int i = iS + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final zzahp a(long j) {
        String str = zzfq.a;
        Pair pairC = c(zzfq.t(Math.max(0L, Math.min(j, this.c))), this.b, this.a);
        zzahs zzahsVar = new zzahs(zzfq.u(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue());
        return new zzahp(zzahsVar, zzahsVar);
    }

    @Override // defpackage.ds3
    public final long b(long j) {
        return zzfq.u(((Long) c(j, this.a, this.b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zza() {
        return this.c;
    }

    @Override // defpackage.ds3
    public final long zzj() {
        return -1L;
    }

    public yr3(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? zzfq.u(jArr2[jArr2.length - 1]) : j;
    }

    @Override // defpackage.ds3
    public final int zzk() {
        return -2147483647;
    }
}
