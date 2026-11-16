package defpackage;

import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzfq;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class nv3 implements zzahr {
    public final mv3 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    @Override // com.google.android.gms.internal.ads.zzahr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final zzahp a(long j) {
        long j2 = this.b;
        mv3 mv3Var = this.a;
        long j3 = (((long) mv3Var.b) * j) / (j2 * 1000000);
        String str = zzfq.a;
        long j4 = this.d - 1;
        long jMax = Math.max(0L, Math.min(j3, j4));
        long j5 = mv3Var.c;
        long jC = c(jMax);
        long j6 = this.c;
        zzahs zzahsVar = new zzahs(jC, (jMax * j5) + j6);
        if (jC >= j || jMax == j4) {
            return new zzahp(zzahsVar, zzahsVar);
        }
        long j7 = jMax + 1;
        return new zzahp(zzahsVar, new zzahs(c(j7), (j5 * j7) + j6));
    }

    public final long c(long j) {
        return zzfq.w(j * ((long) this.b), 1000000L, this.a.b, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zza() {
        return this.e;
    }

    public nv3(mv3 mv3Var, int i, long j, long j2) {
        this.a = mv3Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) mv3Var.c);
        this.d = j3;
        this.e = c(j3);
    }
}
