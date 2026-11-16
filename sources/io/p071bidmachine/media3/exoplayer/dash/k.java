package io.p071bidmachine.media3.exoplayer.dash;

import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.exoplayer.dash.manifest.b;
import io.p071bidmachine.media3.exoplayer.dash.manifest.m;
import io.p071bidmachine.media3.exoplayer.source.chunk.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class k {
    public final d a;
    public final m b;
    public final b c;
    public final j d;
    public final long e;
    public final long f;

    public final k a(long j, m mVar) throws io.p071bidmachine.media3.exoplayer.source.b {
        long jK;
        long jK2;
        j jVarB = this.b.b();
        j jVarB2 = mVar.b();
        if (jVarB == null) {
            return new k(j, mVar, this.c, this.a, this.f, jVarB);
        }
        if (!jVarB.w()) {
            return new k(j, mVar, this.c, this.a, this.f, jVarB2);
        }
        long jM = jVarB.m(j);
        if (jM == 0) {
            return new k(j, mVar, this.c, this.a, this.f, jVarB2);
        }
        a.j(jVarB2);
        long jR = jVarB.r();
        long timeUs = jVarB.getTimeUs(jR);
        long j2 = jM + jR;
        long j3 = j2 - 1;
        long jC = jVarB.c(j3, j) + jVarB.getTimeUs(j3);
        long jR2 = jVarB2.r();
        long timeUs2 = jVarB2.getTimeUs(jR2);
        long j4 = this.f;
        if (jC != timeUs2) {
            if (jC < timeUs2) {
                throw new io.p071bidmachine.media3.exoplayer.source.b();
            }
            if (timeUs2 < timeUs) {
                jK2 = j4 - (jVarB2.k(timeUs, j) - jR);
            } else {
                jK = jVarB.k(timeUs2, j) - jR2;
            }
            return new k(j, mVar, this.c, this.a, jK2, jVarB2);
        }
        jK = j2 - jR2;
        jK2 = jK + j4;
        return new k(j, mVar, this.c, this.a, jK2, jVarB2);
    }

    public final long b(long j) {
        j jVar = this.d;
        a.j(jVar);
        return jVar.e(this.e, j) + this.f;
    }

    public final long d() {
        j jVar = this.d;
        a.j(jVar);
        return jVar.m(this.e);
    }

    public final long f(long j) {
        j jVar = this.d;
        a.j(jVar);
        return jVar.getTimeUs(j - this.f);
    }

    public final boolean g(long j, long j2) {
        j jVar = this.d;
        a.j(jVar);
        return jVar.w() || j2 == -9223372036854775807L || e(j) <= j2;
    }

    public k(long j, m mVar, b bVar, d dVar, long j2, j jVar) {
        this.e = j;
        this.b = mVar;
        this.c = bVar;
        this.f = j2;
        this.a = dVar;
        this.d = jVar;
    }

    public final long c(long j) {
        long jB = b(j);
        j jVar = this.d;
        a.j(jVar);
        return (jVar.x(this.e, j) + jB) - 1;
    }

    public final long e(long j) {
        long jF = f(j);
        j jVar = this.d;
        a.j(jVar);
        return jVar.c(j - this.f, this.e) + jF;
    }
}
