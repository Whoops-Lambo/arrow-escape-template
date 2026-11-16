package io.p071bidmachine.media3.exoplayer.source;

import defpackage.d31;
import io.p071bidmachine.media3.exoplayer.h0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class m implements d1 {
    public final d1 a;
    public final d31 b;

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final boolean a(h0 h0Var) {
        return this.a.a(h0Var);
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final long getBufferedPositionUs() {
        return this.a.getBufferedPositionUs();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final long getNextLoadPositionUs() {
        return this.a.getNextLoadPositionUs();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // io.p071bidmachine.media3.exoplayer.source.d1
    public final void reevaluateBuffer(long j) {
        this.a.reevaluateBuffer(j);
    }

    public m(d1 d1Var, List list) {
        this.a = d1Var;
        this.b = d31.A(list);
    }
}
