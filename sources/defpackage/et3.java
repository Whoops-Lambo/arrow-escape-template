package defpackage;

import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzfq;
import io.p071bidmachine.media3.extractor.ogg.b;
import io.p071bidmachine.media3.extractor.ogg.g;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class et3 implements zzahr {
    public final /* synthetic */ b a;

    @Override // com.google.android.gms.internal.ads.zzahr
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final zzahp a(long j) {
        b bVar = this.a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) ((g) bVar.l).e) * j) / 1000000);
        long j2 = bVar.b;
        long j3 = bVar.a;
        long jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(bVar.d)).longValue() + j3;
        String str = zzfq.a;
        zzahs zzahsVar = new zzahs(j, Math.max(j3, Math.min(jLongValue - 30000, j2 - 1)));
        return new zzahp(zzahsVar, zzahsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final long zza() {
        b bVar = this.a;
        g gVar = (g) bVar.l;
        return (bVar.d * 1000000) / ((long) gVar.e);
    }
}
