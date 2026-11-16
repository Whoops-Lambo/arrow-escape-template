package defpackage;

import com.google.android.gms.internal.ads.zzage;
import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzahs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xr3 extends zzage implements ds3 {
    public final long h;
    public final long i;

    @Override // defpackage.ds3
    public final long b(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / ((long) this.e);
    }

    @Override // defpackage.ds3
    public final long zzj() {
        return this.i;
    }

    @Override // defpackage.ds3
    public final int zzk() {
        return this.e;
    }

    public xr3(long j, long j2, int i, int i2, boolean z, long j3) {
        super(j, j2, i, i2, z);
        this.h = j3;
        this.i = j == -1 ? -1L : j;
    }

    @Override // com.google.android.gms.internal.ads.zzage, com.google.android.gms.internal.ads.zzahr
    public final zzahp a(long j) {
        long j2 = this.h;
        if (j2 != -9223372036854775807L && j >= j2) {
            long j3 = this.i;
            if (j3 != -1) {
                long j4 = this.c;
                long j5 = this.b;
                zzahs zzahsVar = new zzahs(Math.max(0L, j2 - ((Math.max(0L, (j4 + j5) - j5) * 8000000) / ((long) this.e))), Math.max(j5, j3 - j4));
                return new zzahp(zzahsVar, zzahsVar);
            }
        }
        return super.a(j);
    }

    @Override // com.google.android.gms.internal.ads.zzage, com.google.android.gms.internal.ads.zzahr
    public final long zza() {
        long j = this.h;
        if (j != -9223372036854775807L) {
            return j;
        }
        return this.f;
    }
}
