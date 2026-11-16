package defpackage;

import com.google.android.gms.internal.ads.zzahl;
import com.google.android.gms.internal.ads.zzalk;
import com.google.android.gms.internal.ads.zzfq;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fs3 {
    public final zzahl a;
    public final long b;
    public final int c;
    public final int d;

    public final long a() {
        int i;
        long j = this.b;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        zzahl zzahlVar = this.a;
        long j2 = j * ((long) zzahlVar.g);
        int i2 = this.c;
        if (i2 != -1 && (i = this.d) != -1) {
            j2 -= (long) (i2 + i);
        }
        if (j2 > 0) {
            return zzfq.v(zzahlVar.d, j2 - 1);
        }
        return -9223372036854775807L;
    }

    public fs3(zzahl zzahlVar, long j, long j2, long[] jArr, zzalk zzalkVar, int i, int i2) {
        zzahl zzahlVar2 = new zzahl();
        zzahlVar2.a = zzahlVar.a;
        zzahlVar2.b = zzahlVar.b;
        zzahlVar2.c = zzahlVar.c;
        zzahlVar2.d = zzahlVar.d;
        zzahlVar2.e = zzahlVar.e;
        zzahlVar2.f = zzahlVar.f;
        zzahlVar2.g = zzahlVar.g;
        this.a = zzahlVar2;
        this.b = j;
        this.c = i;
        this.d = i2;
    }
}
