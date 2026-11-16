package defpackage;

import com.google.android.gms.internal.ads.zzafy;
import com.google.android.gms.internal.ads.zzafz;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzagv;
import com.google.android.gms.internal.ads.zzagw;
import com.google.android.gms.internal.ads.zzahb;
import com.google.android.gms.internal.ads.zzey;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pq3 implements zzafz {
    public final zzahb a;
    public final int b;
    public final zzagv c = new zzagv();

    public /* synthetic */ pq3(zzahb zzahbVar, int i) {
        this.a = zzahbVar;
        this.b = i;
    }

    public final long a(zzagp zzagpVar) {
        zzagv zzagvVar;
        zzahb zzahbVar;
        int iG;
        while (true) {
            long jZzm = zzagpVar.zzm();
            long jZzo = zzagpVar.zzo() - 6;
            zzagvVar = this.c;
            zzahbVar = this.a;
            if (jZzm >= jZzo) {
                break;
            }
            long jZzm2 = zzagpVar.zzm();
            zzey zzeyVar = new zzey(17);
            int i = 0;
            zzagpVar.f(0, 2, zzeyVar.a);
            char cR = zzeyVar.r(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.b;
            if (cR != i2) {
                zzagpVar.zzl();
                zzagpVar.b((int) (jZzm2 - zzagpVar.zzn()));
            } else {
                byte[] bArr = zzeyVar.a;
                while (i < 15 && (iG = zzagpVar.g(2 + i, 15 - i, bArr)) != -1) {
                    i += iG;
                }
                zzeyVar.C(i + 2);
                zzagpVar.zzl();
                zzagpVar.b((int) (jZzm2 - zzagpVar.zzn()));
                if (zzagw.a(zzeyVar, zzahbVar, i2, zzagvVar)) {
                    break;
                }
            }
            zzagpVar.b(1);
        }
        if (zzagpVar.zzm() >= zzagpVar.zzo() - 6) {
            zzagpVar.b((int) (zzagpVar.zzo() - zzagpVar.zzm()));
            return zzahbVar.j;
        }
        return zzagvVar.a;
    }

    @Override // com.google.android.gms.internal.ads.zzafz
    public final zzafy g(zzagp zzagpVar, long j) {
        long jZzn = zzagpVar.zzn();
        long jA = a(zzagpVar);
        long jZzm = zzagpVar.zzm();
        zzagpVar.b(Math.max(6, this.a.c));
        long jA2 = a(zzagpVar);
        long jZzm2 = zzagpVar.zzm();
        if (jA <= j && jA2 > j) {
            return new zzafy(0, -9223372036854775807L, jZzm);
        }
        if (jA2 <= j) {
            return new zzafy(-2, jA2, jZzm2);
        }
        return new zzafy(-1, jA, jZzn);
    }
}
