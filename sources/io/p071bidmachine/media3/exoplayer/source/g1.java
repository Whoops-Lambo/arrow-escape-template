package io.p071bidmachine.media3.exoplayer.source;

import com.facebook.internal.j0;
import io.p071bidmachine.media3.decoder.e;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class g1 implements b1 {
    public final b1 a;
    public final long b;

    @Override // io.p071bidmachine.media3.exoplayer.source.b1
    public final int g(j0 j0Var, e eVar, int i) {
        int iG = this.a.g(j0Var, eVar, i);
        if (iG == -4) {
            eVar.g += this.b;
        }
        return iG;
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b1
    public final boolean isReady() {
        return this.a.isReady();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b1
    public final void maybeThrowError() {
        this.a.maybeThrowError();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.b1
    public final int skipData(long j) {
        return this.a.skipData(j - this.b);
    }

    public g1(b1 b1Var, long j) {
        this.a = b1Var;
        this.b = j;
    }
}
