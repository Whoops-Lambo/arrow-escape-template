package io.p071bidmachine.media3.exoplayer.source;

import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.exoplayer.c1;
import io.p071bidmachine.media3.exoplayer.h0;
import io.p071bidmachine.media3.exoplayer.trackselection.q;
import io.p071bidmachine.media3.exoplayer.upstream.c;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class v implements b0, a0 {
    public final d0 a;
    public final long b;
    public final c c;
    public a d;
    public b0 e;
    public a0 f;
    public long g = -9223372036854775807L;

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final boolean a(h0 h0Var) {
        b0 b0Var = this.e;
        return b0Var != null && b0Var.a(h0Var);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final void b(a0 a0Var, long j) {
        this.f = a0Var;
        b0 b0Var = this.e;
        if (b0Var != null) {
            long j2 = this.g;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            b0Var.b(this, j2);
        }
    }

    public final void c(d0 d0Var) {
        long j = this.g;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        b0 b0VarB = aVar.b(d0Var, this.c, j);
        this.e = b0VarB;
        if (this.f != null) {
            b0VarB.b(this, j);
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final long getBufferedPositionUs() {
        b0 b0Var = this.e;
        int i = x.a;
        return b0Var.getBufferedPositionUs();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final long getNextLoadPositionUs() {
        b0 b0Var = this.e;
        int i = x.a;
        return b0Var.getNextLoadPositionUs();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final i1 getTrackGroups() {
        b0 b0Var = this.e;
        int i = x.a;
        return b0Var.getTrackGroups();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final long i(long j, c1 c1Var) {
        b0 b0Var = this.e;
        int i = x.a;
        return b0Var.i(j, c1Var);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final boolean isLoading() {
        b0 b0Var = this.e;
        return b0Var != null && b0Var.isLoading();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final void j(long j) {
        b0 b0Var = this.e;
        int i = x.a;
        b0Var.j(j);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final long k(q[] qVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.g = -9223372036854775807L;
        b0 b0Var = this.e;
        int i = x.a;
        return b0Var.k(qVarArr, zArr, b1VarArr, zArr2, j);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.a0
    public final void l(b0 b0Var) {
        a0 a0Var = this.f;
        int i = x.a;
        a0Var.l(this);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final void maybeThrowPrepareError() {
        b0 b0Var = this.e;
        if (b0Var != null) {
            b0Var.maybeThrowPrepareError();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.c1
    public final void p(d1 d1Var) {
        a0 a0Var = this.f;
        int i = x.a;
        a0Var.p(this);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final long readDiscontinuity() {
        b0 b0Var = this.e;
        int i = x.a;
        return b0Var.readDiscontinuity();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final void reevaluateBuffer(long j) {
        b0 b0Var = this.e;
        int i = x.a;
        b0Var.reevaluateBuffer(j);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final long seekToUs(long j) {
        b0 b0Var = this.e;
        int i = x.a;
        return b0Var.seekToUs(j);
    }

    public v(d0 d0Var, c cVar, long j) {
        this.a = d0Var;
        this.c = cVar;
        this.b = j;
    }
}
