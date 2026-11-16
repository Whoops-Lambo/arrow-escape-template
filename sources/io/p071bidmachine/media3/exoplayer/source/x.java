package io.p071bidmachine.media3.exoplayer.source;

import io.p071bidmachine.media3.common.b;
import io.p071bidmachine.media3.common.p0;
import io.p071bidmachine.media3.common.q0;
import io.p071bidmachine.media3.common.r0;
import io.p071bidmachine.media3.common.y;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class x extends r0 {
    public final y b;

    @Override // io.p071bidmachine.media3.common.r0
    public final p0 f(int i, p0 p0Var, boolean z) {
        p0Var.h(z ? 0 : null, z ? w.e : null, 0, -9223372036854775807L, 0L, b.c, true);
        return p0Var;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final int h() {
        return 1;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final int o() {
        return 1;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final int b(Object obj) {
        return obj == w.e ? 0 : -1;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final Object l(int i) {
        return w.e;
    }

    @Override // io.p071bidmachine.media3.common.r0
    public final q0 m(int i, q0 q0Var, long j) {
        Object obj = q0.p;
        q0Var.b(this.b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        q0Var.j = true;
        return q0Var;
    }

    public x(y yVar) {
        this.b = yVar;
    }
}
