package io.p071bidmachine.media3.exoplayer.dash.manifest;

import com.facebook.login.i;
import defpackage.ki;
import io.p071bidmachine.media3.common.n;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class p extends n {
    public final i j;
    public final i k;
    public final long l;

    public p(j jVar, long j, long j2, long j3, long j4, long j5, List list, long j6, i iVar, i iVar2, long j7, long j8) {
        super(jVar, j, j2, j3, j5, list, j6, j7, j8);
        this.j = iVar;
        this.k = iVar2;
        this.l = j4;
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.manifest.s
    public final j a(m mVar) {
        i iVar = this.j;
        if (iVar == null) {
            return this.a;
        }
        n nVar = mVar.a;
        return new j(iVar.a(0L, 0L, nVar.a, nVar.j), 0L, -1L);
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.manifest.n
    public final long d(long j) {
        List list = this.f;
        if (list != null) {
            return list.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = ki.a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // io.p071bidmachine.media3.exoplayer.dash.manifest.n
    public final j h(k kVar, long j) {
        List list = this.f;
        long j2 = this.d;
        long j3 = list != null ? ((q) list.get((int) (j - j2))).a : (j - j2) * this.e;
        n nVar = kVar.a;
        return new j(this.k.a(j, j3, nVar.a, nVar.j), 0L, -1L);
    }
}
