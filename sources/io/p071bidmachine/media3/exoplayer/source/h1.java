package io.p071bidmachine.media3.exoplayer.source;

import io.p071bidmachine.media3.exoplayer.c1;
import io.p071bidmachine.media3.exoplayer.g0;
import io.p071bidmachine.media3.exoplayer.h0;
import io.p071bidmachine.media3.exoplayer.trackselection.q;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class h1 implements b0, a0 {
    public final b0 a;
    public final long b;
    public a0 c;

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final long k(q[] qVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j) {
        b1[] b1VarArr2 = new b1[b1VarArr.length];
        int i = 0;
        while (true) {
            b1 b1Var = null;
            if (i >= b1VarArr.length) {
                break;
            }
            g1 g1Var = (g1) b1VarArr[i];
            if (g1Var != null) {
                b1Var = g1Var.a;
            }
            b1VarArr2[i] = b1Var;
            i++;
        }
        b0 b0Var = this.a;
        long j2 = this.b;
        long jK = b0Var.k(qVarArr, zArr, b1VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < b1VarArr.length; i2++) {
            b1 b1Var2 = b1VarArr2[i2];
            if (b1Var2 == null) {
                b1VarArr[i2] = null;
            } else {
                b1 b1Var3 = b1VarArr[i2];
                if (b1Var3 == null || ((g1) b1Var3).a != b1Var2) {
                    b1VarArr[i2] = new g1(b1Var2, j2);
                }
            }
        }
        return jK + j2;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final boolean a(h0 h0Var) {
        g0 g0Var = new g0();
        long j = h0Var.a;
        g0Var.b = h0Var.b;
        g0Var.c = h0Var.c;
        g0Var.a = j - this.b;
        return this.a.a(new h0(g0Var));
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final void b(a0 a0Var, long j) {
        this.c = a0Var;
        this.a.b(this, j - this.b);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.a.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.b;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.a.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.b;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final i1 getTrackGroups() {
        return this.a.getTrackGroups();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final long i(long j, c1 c1Var) {
        long j2 = this.b;
        return this.a.i(j - j2, c1Var) + j2;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final void j(long j) {
        this.a.j(j - this.b);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.a0
    public final void l(b0 b0Var) {
        a0 a0Var = this.c;
        a0Var.getClass();
        a0Var.l(this);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final void maybeThrowPrepareError() {
        this.a.maybeThrowPrepareError();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.c1
    public final void p(d1 d1Var) {
        a0 a0Var = this.c;
        a0Var.getClass();
        a0Var.p(this);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final long readDiscontinuity() {
        long discontinuity = this.a.readDiscontinuity();
        if (discontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return discontinuity + this.b;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final void reevaluateBuffer(long j) {
        this.a.reevaluateBuffer(j - this.b);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b0
    public final long seekToUs(long j) {
        long j2 = this.b;
        return this.a.seekToUs(j - j2) + j2;
    }

    public h1(b0 b0Var, long j) {
        this.a = b0Var;
        this.b = j;
    }
}
